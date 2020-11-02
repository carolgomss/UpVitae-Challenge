package br.com.fiap.b2w.model;

public class Contato {
    private int idContato;
    private ContatoTipo tipo;
    private String titulo;
    private String mensagem;  
    private Perfil perfil; 
    
    public int getIdContato() {
		return idContato;
	}

	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}

    public ContatoTipo getTipo() {
		return tipo;
	}

	public void setTipo(ContatoTipo tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	Contato(ContatoTipo tipo, String titulo, String mensagem, Perfil perfil) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.perfil = perfil;
    }
}