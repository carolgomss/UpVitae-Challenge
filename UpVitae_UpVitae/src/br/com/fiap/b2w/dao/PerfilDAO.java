package br.com.fiap.b2w.dao;

import br.com.fiap.b2w.model.*;

/**Classe responsavel para manusear os perfis de acesso
* @author UpVitae
* @version 2.0
*/
public class PerfilDAO {

	 /**Método para cadastrar um perfil
	 * @param perfil Perfil - Perfil devidamente preenchido
	 */

    public void cadastrar(Perfil perfil) {
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("INSERT INTO perfil(dataNascimento, nome, CPF, email, telefone) VALUES (%s, %s, %s, %s, %s)", perfil.getDataNascimento(), perfil.getNome(), perfil.getCPF(), perfil.getEmail(),perfil.getTelefone());
    	connect.executeUpdate(query);
    	connect.closeConnection();
    }

	 /**Método para remover um perfil
	 * @param perfil Perfil - Perfil pre cadastrado
	 */
    public void remover(Perfil perfil){
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("DELETE FROM perfil WHERE id_perfil = %s", perfil.getIdPerfil());
    	connect.executeUpdate(query);
    	connect.closeConnection();
    }

	 /**Método para alterar um Perfl já existente
	 * @param perfilNovo Perfil - Novos dados do perfil
	 * @param perfilAntigo Perfil - Perfil antigo que será atualizado
	 */
    public Perfil alterar(Perfil perfilNovo, Perfil perfilAntigo){
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("UPDATE perfil SET dataNascimento = %s, nome = %s, CPF = %s, email = %s, telefone = %s WHERE id_perfil = %s", perfilNovo.getDataNascimento(), perfilNovo.getNome(), perfilNovo.getCPF(), perfilNovo.getEmail(), perfilNovo.getTelefone(), perfilAntigo.getIdPerfil());
    	connect.executeQuery(query);
    	connect.closeConnection();
    	perfilNovo.setIdPerfil(perfilAntigo.getIdPerfil());
        return perfilNovo;
    }
   
}