package br.com.fiap.b2w.bo;

import java.util.Date;
import java.util.List;

import br.com.fiap.b2w.dao.MetaDAO;
import br.com.fiap.b2w.exception.MetaException;
import br.com.fiap.b2w.model.Meta;
import br.com.fiap.b2w.model.Perfil;

/**Classe responsavel para manusear as metas do sistema
* @author UpVitae
* @version 2.0
*/

public class MetaBO {
	
	private MetaDAO metaDAO = null;
	
	public MetaBO(){
		this.metaDAO = new MetaDAO();
	}

	 /**Método para concluir uma meta que foi associado a um perfil
	 * @param perfil Perfil - Perfil do usuário associado a meta
	 * @param meta Meta - Meta pre cadastrada
	 * @param dataFinalizada Date - Data que a meta foi finalizada
	 * @param comentario String - Um comentário ao concluir a meta ( opcional )
	 * @exception MetaException Não é permitido perfil, meta e dataFinalizada nulos e a dataFinalizada não pode ser maior que a data atual
	 */
	public void concluir(final Perfil perfil, final Meta meta, final Date dataFinalizada, final String comentario) throws MetaException {
	    	
		 concluirValidate(perfil, meta, dataFinalizada, comentario);
		 
		 metaDAO.concluir(perfil, meta, dataFinalizada, comentario);
	}

	 /**Método para concluir uma meta que foi associado a um perfil
	 * @param perfil Perfil - Perfil do usuário associado a meta
	 * @param meta Meta - Meta pre cadastrada
	 * @param dataFinalizada Date - Data que a meta foi finalizada
	 * @exception MetaException Não é permitido perfil, meta e dataFinalizada nulos e a dataFinalizada não pode ser maior que a data atual
	 */
	public void associar(final Perfil perfil, final Meta meta, final Date dataEntregaPrevista) throws MetaException {
		associarValidate(perfil, meta, dataEntregaPrevista);
		metaDAO.associar(perfil, meta, dataEntregaPrevista);
	}

	 /**Método para associar perfil de funcionario a meta previamente cadastrada conforme cargo e setor de trabalho
	 * @param perfil Perfil - Perfil do usuário a ser associado a area
	 * @param meta Meta - Meta pre cadastrada para associacao de colaborador
	 * @param dataEntregaPrevista Date - Data da previsão da entrega
	 * @exception MetaException Não é permitido perfil, meta e dataFinalizada nulos e a dataFinalizada não pode ser maior que a data atual
	 */
    public void associar(final List<Perfil> perfis, final Meta meta, final Date dataEntregaPrevista) throws MetaException {
        for (final Perfil perfil : perfis) {
        	associar(perfil, meta, dataEntregaPrevista);
        }
    }

	 /**Método para cadastrar uma meta
	 * @param meta Meta - Meta devidamente preenchida
	 * @exception MetaException Não é permitido meta com titulo nulo e pontuação menor o igual que zero 
	 */
    public void cadastrar(final Meta meta) throws MetaException {
    	cadastrarValidate(meta);
    	metaDAO.cadastrar(meta);
    }

	 /**Método para remover uma meta
	 * @param meta Meta - Meta pre cadastrada
	 * @exception MetaException Não é permitido meta nula ou idMetas menor ou igual a zero 
	 */
    public void remover(final Meta meta) throws MetaException {
    	removerValidate(meta);
    	metaDAO.remover(meta);
    }

	 /**Método para listar todas as metas cadastradas
	 * @return lista de metas cadastradas
	 */
    public List<Meta> listar(){
    	return metaDAO.listar();
    }
    
    public void alterar(final Meta metaNovo, final Meta metaAntigo) throws MetaException {
    	alterarValidate(metaNovo, metaAntigo);
    	metaDAO.alterar(metaNovo, metaAntigo);
    }
	
	private void concluirValidate(Perfil perfil, Meta meta, Date dataFinalizada, String comentario) throws MetaException {
		if (perfil == null) {
			throw new MetaException("Perfil informado não é válido");
		}
		
		if (meta == null) {
			throw new MetaException("Meta informada não é válida, necessita de valor superior a zero.");	
		}
		
		if (dataFinalizada == null) {
			throw new MetaException("Data Finalizada informada não é válida, informe uma data superior a data atual.");
		}
		
		if (dataFinalizada.after(new Date())) {
			throw new MetaException("Data finalizada não pode ser inferior a data atual.");
		}
	}
    
    private void cadastrarValidate(Meta meta) throws MetaException {
    	if (meta.getTitulo().equals(null)) {
    		throw new MetaException("É necessário informar um título para criação de meta");
    	}
    	
    	if (meta.getPontuacao() <= 0) {
    		throw new MetaException("É necessário informar uma pontuação maior que zero para criação de meta");
    	}
    }
    
    private void associarValidate(Perfil perfil, Meta meta, Date dataEntregaPrevista) throws MetaException {
    	if (perfil == null) {
			throw new MetaException("Perfil informado não é válido");
    	}
    	
    	if (meta == null) {
			throw new MetaException("Meta informada não é válida, necessita de valor superior a zero.");	
    	}
    	
    	if (dataEntregaPrevista == null) {
			throw new MetaException("Data Finalizada informada não é válida, informe uma data para ser a data de entrega prevista.");
    	}
    	
    	if (dataEntregaPrevista.before(new Date())) {
			throw new MetaException("Data de entrega prevista não pode ser inferior a data atual.");
		}
	}
    
    private void removerValidate(Meta meta) throws MetaException {
    	if (meta == null) {
			throw new MetaException("Meta informada não é válida, informe uma meta.");	
    	}
    	
    	if (meta.getIdMeta() <= 0) {
    		throw new MetaException("Número de identificação de meta não pode ser menor ou igual a 0");
    	}
	}

    private void alterarValidate(Meta metaNovo, Meta metaAntigo) throws MetaException {
    	if (metaNovo == null) {
			throw new MetaException("Meta informada não é válida, é necessário informar uma meta com dados válidos.");	
    	}
    	
    	if (metaNovo.getPontuacao() <= 0) {
    		throw new MetaException("Valor de pontuação informado não pode ser menor ou igual a 0");
    	}
    	
    	if (metaNovo.getTitulo().equals(null)) {
    		throw new MetaException("É necessário informar um título para alteração de meta");
    	}
	}
}
