
public class Main {

	public static void main(String[] args) {
		Cliente giovani = new Cliente();
		giovani.setNome("Giovani");
		
		
		Conta cc = new ContaCorrente(giovani);		
		Conta poupanca = new ContaPoupanca(giovani);
		
		cc.depositar(100);		
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
