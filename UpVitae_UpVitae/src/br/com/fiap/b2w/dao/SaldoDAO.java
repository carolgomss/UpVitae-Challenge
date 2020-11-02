package br.com.fiap.b2w.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import br.com.fiap.b2w.model.*;

/**Classe responsavel para manusear o saldo dos usuários
* @author UpVitae
* @version 2.0
*/
public class SaldoDAO {

	 /**Método para atualizar o saldo do usuário
	 * @param saldo Saldo - Saldo atual
	 * @param valor Int - novo valor
	 */
    private void atualizarSaldo(Saldo saldo, int valor){
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("UPDATE saldo SET valor = %s WHERE id_saldo = %s", buscarSaldo(saldo.getIdSaldo()) + valor, saldo.getIdSaldo());
    	connect.executeQuery(query);
    	connect.closeConnection();
    
    }

	 /**Método para adicionar histórico para transações de beneficio
	 * @param saldo Saldo - Saldo atual
	 * @param beneficio Beneficio - beneficio que esta sendo debitado
	 */
    public void adicionarHistorico(Saldo saldo, Beneficio beneficio) {
    	int idSaldoHistorico = adicionarHistorico(saldo, "beneficio", beneficio.getCusto());
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("INSERT INTO beneficio_saldo_historico(id_saldo_historico, id_beneficio) VALUES (%s, %s)", idSaldoHistorico, beneficio.getIdBeneficio());
    	connect.executeQuery(query);
    	connect.closeConnection();
    	atualizarSaldo(saldo, -beneficio.getCusto());
    }

	 /**Método para adicionar histórico para transações de meta
	 * @param saldo Saldo - Saldo atual
	 * @param meta Meta - Meta que esta sendo creditada
	 */
    public void adicionarHistorico(Saldo saldo, Meta meta) {
    	int idSaldoHistorico = adicionarHistorico(saldo, "meta", meta.getPontuacao());
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("INSERT INTO meta_saldo_historico(id_saldo_historico, id_meta) VALUES (%s, %s)", idSaldoHistorico, meta.getIdMeta());
    	connect.executeQuery(query);
    	connect.closeConnection();
    	atualizarSaldo(saldo, meta.getPontuacao());
    }

	 /**Método para adicionar histórico por tipo de transação
	 * @param saldo Saldo - Saldo atual
	 * @param tipo String - O tipo de transacao ( Meta ou Beneficio )
	 * @param valor Int - Novo transacionado
	 * @return Int - Id do saldo histórico que foi adicionado
	 */
    public int adicionarHistorico(Saldo saldo, String tipo, int valor) {
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("INSERT INTO saldo_historico(tipo, valor, data_saldo_historico, id_saldo) VALUES (%s, %s, %s, %s)", tipo, valor, new Date(), saldo.getIdSaldo());
    	ResultSet rs = connect.executeQuery(query);
    	try {
			while (rs.next()) {
				connect.closeConnection();
				return rs.getInt("id_saldo_historico");
    	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return -1;
    }

	 /**Método para buscar o saldo atual por ID
	 * @param idSaldo Int - Identificador único do saldo por Perfil
	 * @return Int - Valor atual do saldo do usuário
	 */
    private int buscarSaldo(int idSaldo) {
    	SQLConnect connect = new SQLConnect();
    	String query = "SELECT valor_total FROM saldo";
    	ResultSet rs = connect.executeQuery(query);
    	
    	try {
			while(rs.next()) {
				return rs.getInt("valor_total");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return 0;
    } 
    
}