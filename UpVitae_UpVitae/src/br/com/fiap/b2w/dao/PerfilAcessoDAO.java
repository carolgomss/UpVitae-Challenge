package br.com.fiap.b2w.dao;

import br.com.fiap.b2w.model.Perfil;
import br.com.fiap.b2w.model.TipoPerfilAcesso;

/**Classe responsavel para manusear os perfis de acesso
* @author UpVitae
* @version 2.0
*/
public class PerfilAcessoDAO {

	 /**Método para cadastrar todos os perfis de acessos habilitados
	 * @param perfil Perfil - Perfil do usuário cadastrado
	 */
	public void cadastrarPerfilTodosAcessosHabilitados(Perfil perfil) {
        for(TipoPerfilAcesso tipoPerfilAcesso : TipoPerfilAcesso.values()){
        	cadastrarPerfilAcesso(perfil, tipoPerfilAcesso, true);
        }
	}

	 /**Método para cadastrar determinado perfil de acesso
	 * @param perfil Perfil - Perfil do usuário cadastrado
	 * @param habilitado boolean - valor que indica se o perfil de acesso deve ser cadastrado habilitado ou desabilitado
	 */
	public void cadastrarPerfilAcesso(Perfil perfil, TipoPerfilAcesso tipoPerfilAcesso, boolean habilitado) {
		SQLConnect connect = new SQLConnect();
    	String query = String.format("INSERT INTO perfilAcesso(nome, habilitado, idPerfil) VALUES (%s, %s, %s)", tipoPerfilAcesso.toString(), habilitado, perfil.getIdPerfil());    	
    	connect.executeUpdate(query);
    	connect.closeConnection();
	}

}