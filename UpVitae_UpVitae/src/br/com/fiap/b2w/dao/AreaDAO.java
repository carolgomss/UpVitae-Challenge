package br.com.fiap.b2w.dao;

import java.util.List;

/**Classe para objetos do tipo Area, onde serão contidos, valores e métodos para o mesmo.
* @author TechUp Projects
* @version 2.0
* @since Release 02 da aplicação
*/

import br.com.fiap.b2w.model.Area;
import br.com.fiap.b2w.model.Perfil;

/**Classe responsavel para manusear as areas do sistema
* @author UpVitae
* @version 2.0
*/

public class AreaDAO {
	
	 /**Método para cadastro de areas da empresa 
	 * @param area Area - Area de atuacao do funcionario.
	 */
	
	public void cadastrar(Area area){
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("INSERT INTO area(nome) VALUES (%s)", area.getNome());
    	connect.executeUpdate(query);
    	connect.closeConnection();
    }

	 /**Método para associar perfil de funcionario a area previamente cadastrada conforme cargo e setor de trabalho
	 * @param perfil Perfil - Perfil do usuário a ser associado a area
	 * @param area Area - Area pre cadastrada para associacao de colaborador
	 */
    public void associar(Perfil perfil, Area area){
		SQLConnect connect = new SQLConnect();
    	connect.executeQuery(String.format("UPDATE perfil SET id_area = %s WHERE id_perfil = %s", area.getIdArea(), perfil.getIdPerfil()));
       	connect.closeConnection();
    }

	 /**Método para associar uma lista de perfis de funcionarios a area previamente cadastrada conforme cargo e setor de trabalho
	 * @param perfils List<Perfil> - Perfis dos usuários a serem associado a area
	 * @param area Area - Area pre cadastrada para associacao de colaborador
	 */
    public void associar(final List<Perfil> perfis, final Area area) {
        for (final Perfil perfil : perfis) {
        	this.associar(perfil, area);
        }
    }

	 /**Método para remover uma area
	 * @param area Area - Area pre cadastrada
	 */
    public void remover(Area area) {
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("DELETE FROM area WHERE id_area = %s", area.getIdArea());
    	connect.executeUpdate(query);
    	connect.closeConnection();
    }

	 /**Método para atualizar uma area
	 * @param area Area - Area pre cadastrada
	 * @param nome String - Nome da area para ser atualizado
	 */
    public void atualizar(Area area, String nome){
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("UPDATE area SET nome = %s WHERE id_area = %s", nome, area.getIdArea());
    	connect.executeQuery(query);
    	connect.closeConnection();
    }
}