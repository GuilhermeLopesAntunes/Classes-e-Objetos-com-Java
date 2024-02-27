package empresa;

public class Conta {
	int numero;
	String titular;
	float saldo,limite;
	
	Conta(int numero,String titular,float saldo, float limite){
		this.numero = numero;
		this.titular=titular;
		this.saldo=saldo;
		this.limite=limite;
	}
	
	public boolean sacar(float valor) {
		if(valor>saldo && valor>limite) {
			System.out.println("Você não tem saldo o suficiente");
			return false;
		}
		else {
			if(saldo>=valor) {
				saldo = saldo-valor;
				return true;
			}
			else {
				limite -=valor;
				return true;
			}
			
			
			
		}
	}
	
	public boolean depositar(float valor) {
		if(valor<=0) {
			
			return false;
		}
		else {
			saldo +=valor;
			return true;
		}
		
	}
	
	public boolean transferir(Conta conta, float valor) {
		if(valor>saldo&&valor>limite) {
			System.out.println("Você não tem saldo o suficiente");
			return false;
		}
		else {
			if(saldo>=valor) {
				conta.saldo += valor;
				saldo-=valor;
				return true;
			}
			else {
				conta.saldo+=valor;
				limite -=valor;
				return true;
			}
			
		}
		
	}
	
	public void info() {
		System.out.println("O número da conta é: "+ numero);
		System.out.println("O nome do titular da conta é: "+ titular);
		System.out.println("O saldo da conta é: "+ saldo);
		System.out.println("O limite da conta é: "+ limite);
		
	}
}
