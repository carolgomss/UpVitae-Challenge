package br.com.fiap.b2w.bo;

import br.com.fiap.b2w.dao.PerfilAcessoDAO;
import br.com.fiap.b2w.exception.PerfilAcessoException;
import br.com.fiap.b2w.model.Perfil;
import br.com.fiap.b2w.model.TipoPerfilAcesso;

/**Classe responsavel para manusear os perfis de acesso
* @author UpVitae
* @version 2.0
*/
public class PerfilAcessoBO {
	
	private PerfilAcessoDAO perfilAcessoDAO = null;
	
	public PerfilAcessoBO() {
		this.perfilAcessoDAO = new PerfilAcessoDAO();
	}

	 /**Método para cadastrar todos os perfis de acessos habilitados
	 * @param perfil Perfil - Perfil do usuário cadastrado
	 * @exception PerfilAcessoException Não é permitido passar um perfil nulo
	 */
	public void cadastrarPerfilTodosAcessosHabilitados(Perfil perfil) throws PerfilAcessoException {
        for(TipoPerfilAcesso tipoPerfilAcesso : TipoPerfilAcesso.values()){
        	cadastrarPerfilAcesso(perfil, tipoPerfilAcesso, true);
        }
	}

	 /**Método para cadastrar determinado perfil de acesso
	 * @param perfil Perfil - Perfil do usuário cadastrado
	 * @param habilitado boolean - valor que indica se o perfil de acesso deve ser cadastrado habilitado ou desabilitado
	 * @exception PerfilAcessoException Não é permitido passar um perfil nulo
	 */
	public void cadastrarPerfilAcesso(Perfil perfil, TipoPerfilAcesso tipoPerfilAcesso, boolean habilitado) throws PerfilAcessoException {
		cadastrarPerfilAcessoValidate(perfil);
		
		perfilAcessoDAO.cadastrarPerfilAcesso(perfil, tipoPerfilAcesso, habilitado);
		
	}

	private void cadastrarPerfilAcessoValidate(Perfil perfil) throws PerfilAcessoException {
		if (perfil == null) {
			throw new PerfilAcessoException("Perfil inválido.");
		}
	}
	
}
