package br.com.fiap.b2w.dao;

import br.com.fiap.b2w.model.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**Classe responsavel para manusear as metas do sistema
* @author UpVitae
* @version 2.0
*/

public class MetaDAO {

	 /**Método para concluir uma meta que foi associado a um perfil
	 * @param perfil Perfil - Perfil do usuário associado a meta
	 * @param meta Meta - Meta pre cadastrada
	 * @param dataFinalizada Date - Data que a meta foi finalizada
	 * @param comentario String- Um comentário ao concluir a meta ( opcional )
	 */
    public void concluir(final Perfil perfil, final Meta meta, final Date dataFinalizada, final String comentario) {
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("UPDATE meta_associada SET comentario = %s, data_finalizada = %s WHERE id_meta = %s", comentario, dataFinalizada);
    	connect.executeQuery(query);
    	connect.closeConnection();
    }

	 /**Método para concluir uma meta que foi associado a um perfil
	 * @param perfil Perfil - Perfil do usuário associado a meta
	 * @param meta Meta - Meta pre cadastrada
	 * @param dataFinalizada Date - Data que a meta foi finalizada
	 */
    public void concluir(final Perfil perfil, final Meta meta, final Date dataFinalizada) {
        this.concluir(perfil, meta, dataFinalizada, null);
    }

	 /**Método para associar perfil de funcionario a meta previamente cadastrada conforme cargo e setor de trabalho
	 * @param perfil Perfil - Perfil do usuário a ser associado a area
	 * @param meta Meta - Meta pre cadastrada para associacao de colaborador
	 * @param dataEntregaPrevista Date - Data da previsão da entrega
	 */
	public void associar(final Perfil perfil, final Meta meta, final Date dataEntregaPrevista) {
   	SQLConnect connect = new SQLConnect();
   	ResultSet rs = connect.executeQuery(String.format("SELECT id FROM meta_associada WHERE id_perfil = %s AND id_meta = %s", perfil.getIdPerfil(), meta.getIdMeta()));
   	try {
			if (!rs.next()) {
				ResultSet rsInsert = connect.executeQuery(String.format("INSERT INTO meta_associada(id_perfil, id_meta, data_entrega_prevista, data_atribuicao) VALUES(%s,%s,%s,%s)", perfil.getIdPerfil(), meta.getIdMeta(), dataEntregaPrevista, new Date()));	
				while(rsInsert.next()) {
					int idMetaAssociada = rsInsert.getInt("id_meta_associada");
					String query = String.format("INSERT INTO perfil_meta_associada(id_perfil, id_meta_associada) VALUES (%s, %s)", perfil.getIdPerfil(), idMetaAssociada);
					connect.executeQuery(query);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
      	connect.closeConnection();
   }

	 /**Método para associar os perfis de funcionarios a meta previamente cadastrada conforme cargo e setor de trabalho
	 * @param perfis List<Perfil> - Perfis dos usuários a serem associado a area
	 * @param meta Meta - Meta pre cadastrada para associacao de colaborador
	 * @param dataEntregaPrevista Date - Data da previsão da entrega
	 */
	public void associar(final List<Perfil> perfis, final Meta meta, final Date dataEntregaPrevista) {
		for (final Perfil perfil : perfis) {
			this.associar(perfil, meta, dataEntregaPrevista);
		}
   	}

	 /**Método para cadastrar uma meta
	 * @param meta Meta - Meta devidamente preenchida
	 */
    public void cadastrar(final Meta meta) {
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("INSERT INTO meta(titulo, descricao) VALUES (%s, %s)", meta.getTitulo(), meta.getDescricao());
    	connect.executeUpdate(query);
    	connect.closeConnection();
    }

	 /**Método para remover uma meta
	 * @param meta Meta - Meta pre cadastrada
	 */
    public void remover(final Meta meta) {
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("DELETE FROM meta WHERE id_meta = %s", meta.getIdMeta());
    	connect.executeUpdate(query);
    	connect.closeConnection();
    }

	 /**Método para listar todas as metas cadastradas
	 * @return lista de metas cadastradas
	 */
    public List<Meta> listar() {
    	List<Meta> metas = new ArrayList<Meta>();
    	SQLConnect connect = new SQLConnect();
    	String query = "SELECT pontuacao, titulo, descricao FROM meta";
    	ResultSet rs = connect.executeQuery(query);
    	
    	try {
			while(rs.next()) {
				Meta meta = new Meta();
				meta.setPontuacao(rs.getInt("pontuacao"));
				meta.setTitulo(rs.getString("titulo"));
				meta.setDescricao(rs.getString("descricao"));
				metas.add(meta);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return metas;
    }

	 /**Método para alterar uma meta já existente
	 * @param metaNovo Meta - Novos dados da meta
	 * @param metaAntigo Meta - Meta antiga que será atualizada
	 */
    public Meta alterar(final Meta metaNovo, final Meta metaAntigo) {
    	SQLConnect connect = new SQLConnect();
    	String query = String.format("UPDATE meta SET pontuacao = %s, titulo = %s, descricao = %s WHERE id_meta = %s", metaNovo.getPontuacao(), metaNovo.getTitulo(), metaNovo.getDescricao(), metaAntigo.getIdMeta());
    	connect.executeQuery(query);
    	connect.closeConnection();
    	
    	metaNovo.setIdMeta(metaAntigo.getIdMeta());
    	return metaNovo;
    	
    }
}