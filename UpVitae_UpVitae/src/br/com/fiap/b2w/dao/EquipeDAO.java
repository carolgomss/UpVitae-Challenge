package br.com.fiap.b2w.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import br.com.fiap.b2w.model.Equipe;
import br.com.fiap.b2w.model.Perfil;

/**Classe responsavel para manusear as areas do sistema
* @author UpVitae
* @version 2.0
*/

public class EquipeDAO {

	 /**Método para cadastro de equipe da empresa 
	 * @param equipe Equipe - Equipe de atuacao do funcionario.
	 */
	public void cadastrar(Equipe equipe){
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("INSERT INTO equipe(titulo, dataCriacao) VALUES (%s, %s)", equipe.getTitulo(), equipe.getDataCriacao());
    	connect.executeUpdate(query);
    	connect.closeConnection();
    }

	 /**Método para associar perfil de funcionario a uma equipe previamente cadastrada
	 * @param equipe Equipe - Equipe pre cadastrada para associacao de colaborador
	 * @param perfil Perfil - Perfil do usuário a ser associado a area
	 */
    public void associar(Equipe equipe, Perfil perfil){
    	SQLConnect connect = new SQLConnect();
    	ResultSet rs = connect.executeQuery(String.format("SELECT id FROM perfil_equipe WHERE id_perfil = %s AND id_equipe = %s", perfil.getIdPerfil(), equipe.getIdEquipe()));
    	try {
			if (!rs.next()) {
				connect.executeQuery(String.format("INSERT INTO perfil_equipe(id_perfil, id_equipe) VALUES(%s,%s)", perfil.getIdPerfil(), equipe.getIdEquipe()));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
       	connect.closeConnection();
    }
    
	 /**Método para associar perfis des funcionarios a uma equipe previamente cadastrada
	 * @param equipe Equipe - Equipe pre cadastrada para associacao de colaborador
	 * @param perfis List<Perfil> - Perfis dos usuários a serem associado a equipe
	 */
	public void associar(Equipe equipe, List<Perfil> perfis){
		for (final Perfil perfil : perfis) {
			associar(equipe, perfil);
		}
	}
	
	 /**Método para remover uma equipe
	 * @param equipe Equipe - Equipe pre cadastrada
	 */
    public void remover(Equipe equipe) {
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("DELETE FROM equipe WHERE id_equipe = %s", equipe.getIdEquipe());
    	connect.executeUpdate(query);
    	connect.closeConnection();
    }
}
