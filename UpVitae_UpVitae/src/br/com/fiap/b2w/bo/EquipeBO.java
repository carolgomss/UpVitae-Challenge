package br.com.fiap.b2w.bo;

/**Classe responsavel para manusear as equipes do sistema
* @author UpVitae
* @version 2.0
*/

import java.util.Date;
import java.util.List;

import br.com.fiap.b2w.dao.EquipeDAO;
import br.com.fiap.b2w.exception.EquipeException;
import br.com.fiap.b2w.model.Equipe;
import br.com.fiap.b2w.model.Perfil;

public class EquipeBO {

	private EquipeDAO equipeDAO = null;
	
	public EquipeBO() {
		this.equipeDAO = new EquipeDAO();
	}

	 /**Método para cadastro de equipe da empresa 
	 * @param equipe Equipe - Equipe de atuacao do funcionario.
	 * @exception EquipeException Não é permitido cadastrar uma equipe com o titulo nulo e a data da criação menor que a data atual
	 */
	public void cadastrar(Equipe equipe) throws EquipeException {
		cadastrarValidate(equipe);
		
		equipeDAO.cadastrar(equipe);
	}
	

	 /**Método para remover uma equipe
	 * @param equipe Equipe - Equipe pre cadastrada
	 * @exception EquipeException Não é permitido remover uma equipe nula ou com idEquipe menor ou igual a zero
	 */
	public void remover(Equipe equipe) throws EquipeException {
		removerValidate(equipe);
		
		equipeDAO.remover(equipe);
	}

	 /**Método para associar perfil de funcionario a uma equipe previamente cadastrada
	 * @param equipe Equipe - Equipe pre cadastrada para associacao de colaborador
	 * @param perfil Perfil - Perfil do usuário a ser associado a area
	 * @exception EquipeException Não é permitido uma equipe ou perfil nulo
	 */
	public void associar(Equipe equipe, Perfil perfil) throws EquipeException {
		
		associarValidate(equipe, perfil);
		
		equipeDAO.associar(equipe, perfil);
	}

	 /**Método para associar perfis des funcionarios a uma equipe previamente cadastrada
	 * @param equipe Equipe - Equipe pre cadastrada para associacao de colaborador
	 * @param perfis List<Perfil> - Perfis dos usuários a serem associado a equipe
	 * @exception EquipeException Não é permitido uma equipe ou perfil nulo
	 */
    public void associar(final List<Perfil> perfis, Equipe equipe) throws EquipeException {
        for (final Perfil perfil : perfis) {
        	associar(equipe, perfil);
        }
    }

	private void cadastrarValidate(Equipe equipe) throws EquipeException {
		if (equipe.getTitulo().equals(null)) {
			throw new EquipeException("É necessário informar um titulo para a equipe");
		}
		
		if (equipe.getDataCriacao().before(new Date())) {
			throw new EquipeException("Data de criação de equipe não pode ser inferior a data atual.");
		}
	}
		
	private void removerValidate(Equipe equipe) throws EquipeException {
		if (equipe == null) {
			throw new EquipeException("A equipe informada não pode ser inválida.");
		}
		if (equipe.getIdEquipe() <= 0) {
			throw new EquipeException("Equipe informada para remoção não pode ser localizada com identificação inválida.");
		}
	}
	
	private void associarValidate(Equipe equipe, Perfil perfil) throws EquipeException {
    	if (equipe == null) {
			throw new EquipeException("Equipe informada não é válido");
    	}
    
    	if (perfil == null) {
			throw new EquipeException("Perfil informado não é válida para inclusão em equipe.");	
    	}
	}
	
}
