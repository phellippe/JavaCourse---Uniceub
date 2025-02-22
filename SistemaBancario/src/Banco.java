import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		banco.rodar();

	}
	
	public void rodar() {
		System.out.println("Bem Vindo! Qual o seu nome?");
		
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		
		System.out.println("Ol� "+ nome + ". Estamos criando sua conta!");
		
		Cliente cliente = new Cliente(nome); //cria uma instancia do cliente
		
		System.out.println("Qual seu endere�o?");
		
		String endereco = sc.next();
		
		cliente.armazenaEndereco(endereco);
		
		ContaBancaria contaPoupanca = new ContaBancaria("poupanca", cliente);
		ContaBancaria contaCorrente = new ContaBancaria("corrente", cliente);
		
		System.out.println();
		System.out.println("Info do cliente:");
		System.out.println(contaCorrente.pegaInfoCliente());
		System.out.println();
		System.out.println(contaCorrente.pegaInfoConta());
		System.out.println(contaPoupanca.pegaInfoConta());
		
		
		//depositos
		System.out.println();
		System.out.println("Qual o valor que deseja depositar na conta corrente?");
		double valor = sc.nextDouble();
		contaCorrente.depositar(valor);
		
		System.out.println();
		System.out.println("Qual o valor que deseja depositar na conta poupan�a?");
		valor = sc.nextDouble();
		contaPoupanca.depositar(valor);
		
		System.out.println();
		System.out.println(contaPoupanca.pegaInfoConta());
		System.out.println(contaCorrente.pegaInfoConta());
		
		//saques
		
		System.out.println();
		System.out.println("Quanto deseja sacar?");
		valor = sc.nextDouble();
		try {
			contaCorrente.sacar(valor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(contaPoupanca.pegaInfoConta());
		System.out.println(contaCorrente.pegaInfoConta());
		
		sc.close();
	}
}
