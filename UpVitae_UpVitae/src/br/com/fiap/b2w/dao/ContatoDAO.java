package br.com.fiap.b2w.dao;

import br.com.fiap.b2w.model.Contato;

/**Classe responsavel para manusear os contatos do sistema
* @author UpVitae
* @version 2.0
*/

public class ContatoDAO {

	 /**Método para enviar uma mensagem 
	 * @param contato Contato - Dados de contato para enviar a mensagem
	 */
	
    public void envioMensagem(Contato contato){	
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("INSERT INTO contato(tipo, titulo, mensagem) VALUES (%s, %s, %s)", contato.getTipo(), contato.getTitulo(), contato.getMensagem());
    	connect.executeUpdate(query);
    	connect.closeConnection();
    	
    }
}