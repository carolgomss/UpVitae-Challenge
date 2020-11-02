package br.com.fiap.b2w.bo;

import br.com.fiap.b2w.dao.*;
import br.com.fiap.b2w.exception.ContatoException;
import br.com.fiap.b2w.model.Contato;

/**Classe responsavel para manusear os contatos do sistema
* @author UpVitae
* @version 2.0
*/

public class ContatoBO {
	private ContatoDAO contatoDAO = null;
	
	public ContatoBO() {
		this.contatoDAO = new ContatoDAO();
	}

	 /**Método para enviar uma mensagem 
	 * @param contato Contato - Dados de contato para enviar a mensagem
	 * @exception ContatoException Não é permitido enviar uma mensagem com o contato, tipo, titulo e mensagem com dados nulos.
	 */
	
	public void envioMensagem(Contato contato) throws ContatoException {
		envioMensagemValidate(contato);
		
		contatoDAO.envioMensagem(contato);
	}
	
	void envioMensagemValidate(Contato contato) throws ContatoException {
		if (contato == null) {
			throw new ContatoException("Contato não pode ser nulo.");
		}
		
		if (contato.getTipo().equals(null)) {
			throw new ContatoException("É necessário escolher o tipo do contato.");		
		}
		
		if (contato.getTitulo().equals(null)) {
			throw new ContatoException("É necessário incluir um título para o contato.");
		}
		
		if (contato.getMensagem().equals(null)) {
			throw new ContatoException("Para encaminhar contato é necessário mensagem.");
		}
	}

}
