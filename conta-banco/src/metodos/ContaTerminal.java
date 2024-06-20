package metodos;

public class ContaTerminal{
	
	private int numeroConta;
	private String numeroAgencia;
	private String nomeCliente;
	private double saldo;
	
	public ContaTerminal(int numeroConta, String numeroAgencia,  String nomeCliente, double saldo){
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}

