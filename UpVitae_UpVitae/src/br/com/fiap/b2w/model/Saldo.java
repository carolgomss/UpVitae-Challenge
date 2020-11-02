package br.com.fiap.b2w.model;

public class Saldo {
	private int idSaldo;
    private int valorTotal;
    private Perfil perfil;

    public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

    
	public int getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getIdSaldo() {
		return idSaldo;
	}

	public void setIdSaldo(int idSaldo) {
		this.idSaldo = idSaldo;
	}
    
}