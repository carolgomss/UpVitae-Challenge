package br.com.fiap.b2w.model;

import java.util.Calendar;
import java.util.Date;

public class SaldoHistorico {
	private Date dataSaldoHistorico;
	private int idSaldoHistorico;
	private int valor;
	private String tipo;
	private Beneficio beneficio;
	private Saldo saldo;
    
    public Date getData() {
		return dataSaldoHistorico;
	}

	public void setData(Date data) {
		this.dataSaldoHistorico = data;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Beneficio getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(Beneficio beneficio) {
		this.beneficio = beneficio;
	}

	public Date getDataSaldoHistorico() {
		return dataSaldoHistorico;
	}

	public void setDataSaldoHistorico(Date dataSaldoHistorico) {
		this.dataSaldoHistorico = dataSaldoHistorico;
	}

	public int getIdSaldoHistorico() {
		return idSaldoHistorico;
	}

	public void setIdSaldoHistorico(int idSaldoHistorico) {
		this.idSaldoHistorico = idSaldoHistorico;
	}

	public Saldo getSaldo() {
		return saldo;
	}

	public void setSaldo(Saldo saldo) {
		this.saldo = saldo;
	}

	public SaldoHistorico(Meta meta){
        this.valor = meta.getPontuacao();
        this.dataSaldoHistorico = Calendar.getInstance().getTime();
        this.tipo = "Crédito";
    }

    public SaldoHistorico(Beneficio beneficio){
        this.valor = beneficio.getCusto();
        this.dataSaldoHistorico = Calendar.getInstance().getTime();
        this.tipo = "Débito";
    }
}