package br.com.fiap.b2w.model;

public class PerfilAcesso {
	private int idPerfilAcesso;
	private String nome;
	private Perfil perfil;
	private boolean habilitado;

    public int getIdPerfilAcesso() {
		return idPerfilAcesso;
	}

	public void setIdPerfilAcesso(int idPerfilAcesso) {
		this.idPerfilAcesso = idPerfilAcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
    
	public String getNomeCargo() {
		return nome;
	}
	
	public void setNomeCargo(String nomeCargo) {
		this.nome = nomeCargo;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
}