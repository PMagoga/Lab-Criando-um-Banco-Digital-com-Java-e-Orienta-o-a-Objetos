
public class Main {
	public static void main(String[] args) {
		//teste usando meu nome como Cliente
		Cliente pablo = new Cliente();
		pablo.setNome("Pablo");
		
		Conta cc = new ContaCorrente(pablo);
		Conta poupanca = new ContaPoupanca(pablo);
		
		//teste depositar 500 reais
		cc.depositar(500);
		//teste transferir 250 reais para a poupança
		cc.transferir(250, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
