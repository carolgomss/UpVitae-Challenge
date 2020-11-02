package br.com.fiap.b2w.model;

import java.util.Date;
import java.util.List;

public class Perfil {
	private int idPerfil;
	private Date dataNascimento;
	private String nome;
	private String CPF;
	private String email;
	private String telefone;
	private List<PerfilAcesso> perfilAcesso;
	private Equipe equipe;
	private Meta meta;

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
    Perfil(final String CPF) {
        this.CPF = CPF;
    }

    public Perfil() {
		// TODO Auto-generated constructor stub
	}


	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public List<PerfilAcesso> getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(List<PerfilAcesso> perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

}