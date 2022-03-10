
public interface IConta{
	
	void depositar(double valor);
	
	void sacar(double valor);
			
	void transferir(double valor, Conta contaDestiono);
	
	void imprimirExtrato();
	
}
