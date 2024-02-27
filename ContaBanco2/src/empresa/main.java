package empresa;

public class main {
	public static void main(String[] args) {
		Conta usuario1 = new Conta(10002,"Guilherme",10,100);
		Conta usuario2 = new Conta(12234,"Mario",100,300);
		
		/*usuario1.info();
		usuario1.depositar(100);
		System.out.println();
		usuario1.info();
		usuario1.sacar(50);
		System.out.println();
		usuario1.info();*/
		
		usuario2.info();
		System.out.println();
		usuario1.info();
		System.out.println();
		usuario2.transferir(usuario1,400);
		System.out.println();
		usuario2.info();
		System.out.println();
		usuario1.info();
		
		
		
	}
}
