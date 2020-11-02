package br.com.fiap.b2w.model;

public class Beneficio {
    private int idBeneficio;
    private int custo;
    private String titulo;
    private String descricao;
    
    public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCusto() {
		return custo;
	}

	public void setCusto(int custo) {
		this.custo = custo;
	}
	
	public Beneficio(){
		
	}

	Beneficio(String titulo, String descricao, int custo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.custo = custo;
    }
	public int getIdBeneficio() {
		return idBeneficio;
	}

	public void setIdBeneficio(int idBeneficio) {
		this.idBeneficio = idBeneficio;
	}

    
}   