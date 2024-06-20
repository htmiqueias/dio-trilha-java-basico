import metodos.ContaTerminal;
import javax.swing.JOptionPane;

class ContaBanco {
	
	public static void main(String[] args) {
		
		String menu = """ 
				Bem-vindo ao DIO Bank!
				
				Vamos fazer o seu cadastro!
				""";
		String contaCriada = "PARABÉNS, sua conta foi criada com sucesso! \n"
				+ "Anote os dados para não perder:\n";
		
		JOptionPane.showMessageDialog(null, menu);
		
		String numeroContaStr = JOptionPane.showInputDialog("Digite o número da sua conta: ");
		int numeroConta = Integer.parseInt(numeroContaStr);
		String numeroAgenciaStr = JOptionPane.showInputDialog("Digite o número da sua agência: ");
		String nomeTitular = JOptionPane.showInputDialog("Digite o nome do titular da conta: ");
		String saldoStr = JOptionPane.showInputDialog("Digite o seu saldo: ");
		double saldo = Double.parseDouble(saldoStr);
		
		ContaTerminal novaConta = new ContaTerminal(numeroConta, numeroAgenciaStr, nomeTitular, saldo);
		
		contaCriada += "\nNúmero da conta: "  + novaConta.getNumeroConta()
						+ "\nNúmero da Agência: "  + novaConta.getNumeroAgencia()
						+ "\nTitular: "  + novaConta.getNomeCliente()
						+ "\nSaldo: R$"  + novaConta.getSaldo();
		
		JOptionPane.showMessageDialog(null, contaCriada);
	}
}
