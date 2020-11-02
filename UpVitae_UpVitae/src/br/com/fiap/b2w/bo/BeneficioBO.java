package br.com.fiap.b2w.bo;

import java.util.List;
import br.com.fiap.b2w.dao.BeneficioDAO;
import br.com.fiap.b2w.exception.BeneficioException;
import br.com.fiap.b2w.model.Beneficio;

/**Classe responsavel para manusear os beneficios do sistema
* @author UpVitae
* @version 2.0
*/

public class BeneficioBO {
	
	private BeneficioDAO beneficioDAO = null;
	
	public BeneficioBO() {
		this.beneficioDAO = new BeneficioDAO();
	}

	 /**Método para cadastro de beneficios da empresa 
	 * @param beneficio Beneficio - Beneficio para ser entregue ao perfil do usuário ( ex: Cupom, Curso e Etc )
	 * @exception BeneficioException Não é permitido cadastrar um beneficio com custo menor ou igual a zero, titulo nulo e descrição nula.
	 */
	public void cadastrar(Beneficio beneficio) throws BeneficioException {
		cadastrarValidate(beneficio);
		
		beneficioDAO.cadastrar(beneficio);
	}

	 /**Método para remover um beneficio
	 * @param beneficio Beneficio - Beneficio pre cadastrado
	 * @exception BeneficioException Não é permitido cadastrar um beneficio nulo e com o id do beneficio menor ou igual a zero
	 */
	public void remover(Beneficio beneficio) throws BeneficioException {
		removerValidate(beneficio);
		
		beneficioDAO.remover(beneficio);
	}

	 /**Método para alterar um beneficio já existente
	 * @param beneficioNovo Beneficio - Novos dados do beneficio
	 * @param beneficioAntigo Beneficio - Beneficio antigo que será atualizado
	 * @exception BeneficioException Não é permitido cadastrar um beneficio com custo menor ou igual a zero, titulo nulo e descrição nula.
	 */
    public void alterar(Beneficio beneficioNovo, Beneficio beneficioAntigo) throws BeneficioException {
        alterarValidate(beneficioNovo, beneficioAntigo);
        
        beneficioDAO.alterar(beneficioNovo, beneficioAntigo);
    }

	 /**Método para listar todos os beneficios cadastrados
	 * @return lista de beneficios cadastrados
	 */
    public List<Beneficio> listar() {
    	return beneficioDAO.listar();
    }	

	private void cadastrarValidate(Beneficio beneficio) throws BeneficioException {
		if (beneficio.getCusto() <= 0) {
			throw new BeneficioException("Custo para benefício deve ser superior a 0.");
		}
		
		if (beneficio.getTitulo().equals(null)) {
			throw new BeneficioException("É necessário incluir um título para o benefício.");
		}
		
		if (beneficio.getDescricao().equals(null)) {
			throw new BeneficioException("É necessário informar uma descrição para o benefício.");
		}
	}
	
	private void removerValidate(Beneficio beneficio) throws BeneficioException {
		if (beneficio == null) {
			throw new BeneficioException("Benefício informado encontra-se nulo, apresente benefício válido.");
		}
		
		if (beneficio.getIdBeneficio() <= 0) {
			throw new BeneficioException("Benefício inválido, necessário identificador válido");
		}	
		
	}
	
	private void alterarValidate(Beneficio beneficioNovo, Beneficio beneficioAntigo) throws BeneficioException {
		if (beneficioNovo == null) {
			throw new BeneficioException("Para ser atualizado, benefício precisa ser válido.");
		}
		if (beneficioNovo.getCusto() <= 0) {
			throw new BeneficioException("Custo para benefício deve ser superior a 0.");
		}
		if (beneficioNovo.getTitulo().equals(null)) {
			throw new BeneficioException("É necessário incluir um título para o benefício.");
		}
		if (beneficioNovo.getDescricao().equals(null)) {
			throw new BeneficioException("É necessário informar uma descrição para o benefício.");
		}
	}
	
}
