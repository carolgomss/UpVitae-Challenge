package br.com.fiap.b2w.bo;

import br.com.fiap.b2w.dao.SaldoDAO;
import br.com.fiap.b2w.exception.SaldoException;
import br.com.fiap.b2w.model.Beneficio;
import br.com.fiap.b2w.model.Meta;
import br.com.fiap.b2w.model.Saldo;

/**Classe responsavel para manusear o saldo dos usuários
* @author UpVitae
* @version 2.0
*/
public class SaldoBO {
	
	private SaldoDAO saldoDAO = null;
	
	public SaldoBO() {
		this.saldoDAO = new SaldoDAO();
	}

	 /**Método para adicionar histórico para transações de beneficio
	 * @param saldo Saldo - Saldo atual
	 * @param beneficio Beneficio - beneficio que esta sendo debitado
	 * @exception SaldoException Não é permitido adicionar saldo e beneficio nulo, custo do beneficio menor 
	 * que zero e valor total do saldo ser maior que o custo do beneficio 
	 */
    public void adicionarHistorico(Saldo saldo, Beneficio beneficio) throws SaldoException {
    	adicionarValidate(saldo, beneficio);
    	
    	saldoDAO.adicionarHistorico(saldo, beneficio);
    }

	private void adicionarValidate(Saldo saldo, Beneficio beneficio) throws SaldoException {
		if (saldo == null) {
			throw new SaldoException("Saldo informado inválido");	
		}
		
		if (beneficio == null) {
			throw new SaldoException("Beneficio informado é nulo.");
		}
		
		if (beneficio.getCusto() <= 0) {
			throw new SaldoException("Valor de beneficio informado não pode ser menor ou igual a 0");
		}
		
		if (saldo.getValorTotal() > beneficio.getCusto()) {
			throw new SaldoException("Valor de beneficio é superior ao valor existente no saldo para sua aquisição");
		}
		
	}

	 /**Método para adicionar histórico para transações de meta
	 * @param saldo Saldo - Saldo atual
	 * @param meta Meta - Meta que esta sendo creditada
	 * @exception SaldoException Não é permitido adicionar saldo, meta nulos e metas com pontuação menor ou igual a zero
	 */
	public void adicionarHistorico(Saldo saldo, Meta meta) throws SaldoException {
    	adicionarValidate(saldo, meta);
    	
    	saldoDAO.adicionarHistorico(saldo, meta);
    }

	private void adicionarValidate(Saldo saldo, Meta meta) throws SaldoException {
		if (saldo == null) {
			throw new SaldoException("Saldo informado inválido");	
		}
		
		if (meta == null) {
			throw new SaldoException("Meta informada é nula.");
		}
		
		if (meta.getPontuacao() <= 0) {
			throw new SaldoException("Pontuação de meta informada não pode ser menor ou igual a 0");
		}
		
	}
}
