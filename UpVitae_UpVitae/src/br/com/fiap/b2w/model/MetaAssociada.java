package br.com.fiap.b2w.model;

import java.util.Date;

public class MetaAssociada {
    private int idMetaAssociada;
    private String comentario;
    private Date dataAtribuicao;
    private Date dataEntregaPrevista;
    private Date dataFinalizada;
    private Meta meta;
    private Perfil perfil;
	
    public int getIdMetaAssociada() {
		return idMetaAssociada;
	}
	public void setIdMetaAssociada(int idMetaAssociada) {
		this.idMetaAssociada = idMetaAssociada;
	}
	public Date getDataAtribuicao() {
		return dataAtribuicao;
	}
	public void setDataAtribuicao(Date dataAtribuicao) {
		this.dataAtribuicao = dataAtribuicao;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	public int getId() {
		return idMetaAssociada;
	}
	public void setId(int id) {
		this.idMetaAssociada = id;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Date getDataAtribuicai() {
		return dataAtribuicao;
	}
	public void setDataAtribuicai(Date dataAtribuicai) {
		this.dataAtribuicao = dataAtribuicai;
	}
	public Date getDataEntregaPrevista() {
		return dataEntregaPrevista;
	}
	public void setDataEntregaPrevista(Date dataEntregaPrevista) {
		this.dataEntregaPrevista = dataEntregaPrevista;
	}
	public Date getDataFinalizada() {
		return dataFinalizada;
	}
	public void setDataFinalizada(Date dataFinalizada) {
		this.dataFinalizada = dataFinalizada;
	}
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
    
}