package br.com.fiap.b2w.bo;

import java.util.Date;

import br.com.fiap.b2w.dao.PerfilDAO;
import br.com.fiap.b2w.exception.PerfilException;
import br.com.fiap.b2w.model.Perfil;

/**Classe responsavel para manusear os perfis de acesso
* @author UpVitae
* @version 2.0
*/
public class PerfilBO {

	private PerfilDAO perfilDAO = null;
	
	public PerfilBO() {
		this.perfilDAO = new PerfilDAO();
	}

	 /**Método para cadastrar um perfil
	 * @param perfil Perfil - Perfil devidamente preenchido
	 * @exception PerfilException Não é permitido cadastrar um perfil, nome, CPF, email e telefone com dados nulos e com data de nascimento maior que a data atual
	 */

    public void cadastrar(Perfil perfil) throws PerfilException {
    	genericValidate(perfil);
    	
    	perfilDAO.cadastrar(perfil);
    }

	 /**Método para remover um perfil
	 * @param perfil Perfil - Perfil pre cadastrado
	 * @exception PerfilException Não é permitido cadastrar um perfil, nome, CPF, email e telefone com dados nulos,
	 * com data de nascimento maior que a data atual e com idPerfil menor ou igual a zero.
	 */
    public void remover(Perfil perfil) throws PerfilException {
		removerValidate(perfil);
		perfilDAO.remover(perfil);
	}

	 /**Método para alterar um Perfl já existente
	 * @param perfilNovo Perfil - Novos dados do perfil
	 * @param perfilAntigo Perfil - Perfil antigo que será atualizado
	 * @exception PerfilException Não é permitido cadastrar um perfil, nome, CPF, email e telefone com dados nulos e com data de nascimento maior que a data atual
	 */
    public void alterar(Perfil perfilNovo, Perfil perfilAntigo) throws PerfilException {
    	alterarValidate(perfilNovo, perfilAntigo);
    	
    	perfilDAO.alterar(perfilNovo, perfilAntigo);
    }
	
	private void removerValidate(Perfil perfil) throws PerfilException {
		genericValidate(perfil);
		if (perfil.getIdPerfil() <= 0) {
    		throw new PerfilException("Número de identificação de perfil não pode ser nulo");
    	}
	}
	
	private void alterarValidate(Perfil perfilNovo, Perfil perfilAntigo) throws PerfilException {
		genericValidate(perfilNovo);
		genericValidate(perfilAntigo);
	}
	
	private void genericValidate(Perfil perfil) throws PerfilException {
		if (perfil == null) {
			throw new PerfilException("A criação de um perfil não pode ser nula");
		}
		if (perfil.getNome().equals(null)) {
			throw new PerfilException("É necessário informar nome para criar perfil.");
		}
		if (perfil.getDataNascimento().after(new Date())) {
			throw new PerfilException("A data de nascimento não pode ser superior a data atual.");
		}
		if (perfil.getCPF().equals(null)) {
			throw new PerfilException("A numeração de CPF deve ser informada");
		}
		if (perfil.getEmail().equals(null)) {
			throw new PerfilException("Um email deve ser informado");
		}
		if (perfil.getTelefone().equals(null)) {
			throw new PerfilException("Numero de telefone deve conter ddd e numero");
		}
	}
}
