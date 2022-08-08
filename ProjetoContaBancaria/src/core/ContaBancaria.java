package core;

public class ContaBancaria {
	private int numeroConta;
	private int digitoVerif;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, int digitoVerif, String nomeTitular, String cpfTitular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.digitoVerif = digitoVerif;
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.saldo = saldo;
	}
	
	// metodos específicos que dizem respeito à conta bancária
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public String exibirDados() {
		return "Conta: "+numeroConta+"-"+digitoVerif+"-"+nomeTitular+" ("+cpfTitular+") "
				+String.format("%.2f", saldo);
	}
	
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoVerif() {
		return digitoVerif;
	}

	public void setDigitoVerif(int digitoVerif) {
		this.digitoVerif = digitoVerif;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	

}
