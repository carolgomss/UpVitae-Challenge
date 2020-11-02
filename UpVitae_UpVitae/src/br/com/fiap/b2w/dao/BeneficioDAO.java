package br.com.fiap.b2w.dao;
import br.com.fiap.b2w.model.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**Classe responsavel para manusear os beneficios do sistema
* @author UpVitae
* @version 2.0
*/

public class BeneficioDAO {

	 /**Método para cadastro de beneficios da empresa 
	 * @param beneficio Beneficio - Beneficio para ser entregue ao perfil do usuário ( ex: Cupom, Curso e Etc )
	 */
	
    public void cadastrar(final Beneficio beneficio) {
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("INSERT INTO beneficio(titulo, descricao) VALUES (%s, %s)", beneficio.getTitulo(), beneficio.getDescricao());
    	connect.executeUpdate(query);
    	connect.closeConnection();
    }

	 /**Método para remover um beneficio
	 * @param beneficio Beneficio - Beneficio pre cadastrado
	 */
    public void remover(final Beneficio beneficio) {
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("DELETE FROM beneficio WHERE id_beneficio = %s", beneficio.getIdBeneficio());
    	connect.executeUpdate(query);
    	connect.closeConnection();
    }

	 /**Método para listar todos os beneficios cadastrados
	 * @return lista de beneficios cadastrados
	 */
    public List<Beneficio> listar(){
    	List<Beneficio> beneficios = new ArrayList<Beneficio>();
    	SQLConnect connect = new SQLConnect();
    	String query = "SELECT id_beneficio, custo, titulo, descricao FROM beneficio";
    	ResultSet rs = connect.executeQuery(query);
    	
    	try {
			while(rs.next()) {
				Beneficio beneficio = new Beneficio();
				beneficio.setIdBeneficio(rs.getInt("idBeneficio"));
				beneficio.setCusto(rs.getInt("custo"));	
				beneficio.setTitulo(rs.getString("titulo"));
				beneficio.setDescricao(rs.getString("descricao"));
				beneficios.add(beneficio);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return beneficios;
    }

	 /**Método para alterar um beneficio já existente
	 * @param beneficioNovo Beneficio - Novos dados do beneficio
	 * @param beneficioAntigo Beneficio - Beneficio antigo que será atualizado
	 */
    public Beneficio alterar(Beneficio beneficioNovo, Beneficio beneficioAntigo){
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("UPDATE beneficio SET custo = %s, titulo = %s, descricao = %s WHERE id_beneficio = %s", beneficioNovo.getCusto(), beneficioNovo.getTitulo(), beneficioNovo.getDescricao(), beneficioAntigo.getIdBeneficio());
    	connect.executeQuery(query);
    	connect.closeConnection();
    	
    	beneficioNovo.setIdBeneficio(beneficioAntigo.getIdBeneficio());
    	return beneficioNovo;
    }

}