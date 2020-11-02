package br.com.fiap.b2w.bo;

import java.util.List;
import br.com.fiap.b2w.dao.AreaDAO;
import br.com.fiap.b2w.exception.AreaException;
import br.com.fiap.b2w.model.Area;
import br.com.fiap.b2w.model.Perfil;

/**Classe responsavel para manusear as areas do sistema
* @author UpVitae
* @version 2.0
*/
public class AreaBO {
	
private AreaDAO areaDAO = null;

	public AreaBO() {
		this.areaDAO = new AreaDAO();
	}

	 /**Método para cadastro de areas da empresa 
	 * @param area Area - Area de atuacao do funcionario.
	 * @exception AreaException - Não é permitido cadastrar uma area nula ou com o nome nulo.
	 */
	
	public void cadastrar(Area area) throws AreaException {
	    	
    	cadastrarValidate(area);
    	
    	areaDAO.cadastrar(area);
    }

	 /**Método para associar perfil de funcionario a area previamente cadastrada conforme cargo e setor de trabalho
	 * @param perfil Perfil - Perfil do usuário a ser associado a area
	 * @param area Area - Area pre cadastrada para associacao de colaborador
	 * @exception AreaException - Não é permitido cadastrar uma area nula ou com o nome nulo.
	 */
	public void associar(final Perfil perfil, Area area) throws AreaException {
		
		associarValidate(perfil, area);
		
		areaDAO.associar(perfil, area);
	}


	 /**Método para associar uma lista de perfis de funcionarios a area previamente cadastrada conforme cargo e setor de trabalho
	 * @param perfils List<Perfil> - Perfis dos usuários a serem associado a area
	 * @param area Area - Area pre cadastrada para associacao de colaborador
	 * @exception AreaException - Não é permitido cadastrar uma area nula ou com o nome nulo.
	 */
	public void associar(final List<Perfil> perfis, Area area) throws AreaException {
        for (final Perfil perfil : perfis) {
        	associar(perfil, area);
        }
    }

	 /**Método para remover uma area
	 * @param area Area - Area pre cadastrada
	 * @exception AreaException - Não é permitido cadastrar uma area nula ou o id ser menor ou igual a zero.
	 */
    public void remover(Area area) throws AreaException {
    	removerValidate(area);
    	areaDAO.remover(area);
    }

	 /**Método para atualizar uma area
	 * @param area Area - Area pre cadastrada
	 * @param nome String - Nome da area para ser atualizado
	 * @exception AreaException - Não é permitido cadastrar uma area nula ou com o nome nulo.
	 */
    public void atualizar(Area area, String nome) throws AreaException{
    	atualizarValidate(area);
    	areaDAO.atualizar(area, nome);
    }

	private void cadastrarValidate(Area area) throws AreaException {
		if (area == null) {
			throw new AreaException("Area informada nao pode ser nula.");
		}
		
		if (area.getNome().equals(null)) {
			throw new AreaException("Deve ser informado nome para a area.");
		}
	}	
	
	private void associarValidate(Perfil perfil, Area area) throws AreaException {
		if (area == null) {
			throw new AreaException("Para associar area, a mesma não pode ser nula.");
		}
		
		if (perfil == null) {
			throw new AreaException("Para associar perfil, o mesmo não pode ser nulo.");
		}
	}
	
	private void removerValidate(Area area) throws AreaException {
		if (area == null) {
			throw new AreaException("Para remover area, a mesma não pode ser nula.");
		}
		
		if (area.getIdArea() <= 0) {
    		throw new AreaException("Número de identificação de area não pode ser menor ou igual a 0");
		}
	}
	
	private void atualizarValidate(Area area) throws AreaException {
		if (area == null) {
			throw new AreaException("Para atualizar area, a mesma não pode ser nula.");
		}
		
		if (area.getNome().equals(null)) {
			throw new AreaException("Deve ser informado um nome válido para atualização de area.");
		}
	}
}
