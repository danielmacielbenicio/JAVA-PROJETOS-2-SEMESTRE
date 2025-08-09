	package banco;

	import java.util.Scanner;

	public class ContaBancaria {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        boolean sair = false;
	        Pessoa pessoa = new Pessoa(1000.0); // saldo inicial de 1000 reais.
	        
	        while (!sair) {
	        	System.out.println();
	            System.out.println("Seja bem vindo ao banco PedMais");
	            System.out.println();
	            System.out.println("ESCOLHA A OPERAÇÃO: SAQUE [1] DEPOSITO [2] SAIR [3]");
	            System.out.println("Você tem " + pessoa.getSaldo() + " R$ em sua carteira virtual.");
	            int opcoes = sc.nextInt();
	            double valor;

	            switch (opcoes) {
	                case 1:
	                    System.out.println("Você escolheu a opção de saque - Digite o quanto quer sacar:");
	                    valor = sc.nextDouble();
	                    System.out.println();
	                    if (valor > 0 && valor <= pessoa.getSaldo()) {
	                        pessoa.sacar(valor);
	                        System.out.println("Saque realizado! Novo saldo: " + pessoa.getSaldo());
	                    } else {
	                        System.out.println("Valor inválido. O valor deve ser maior que 0 e menor que seu saldo");
	                        System.out.println();
	                    }
	                    break;
	                case 2:
	                    System.out.println("Você escolheu a opção de depósito - Digite o quanto quer depositar:");
	                    valor = sc.nextDouble();
	                    if (valor > 0) {
	                        pessoa.depositar(valor);
	                        System.out.println("Depósito realizado! Novo saldo: " + pessoa.getSaldo());
	                        System.out.println();
	                    } else {
	                        System.out.println("Valor inválido. O valor deve ser maior que 0.");
	                    }
	                    break;
	                case 3:
	                    sair = true;
	                    System.out.println("Você saiu com sucesso!");
	                    break;
	                default:
	                    System.out.println("Opção inválida.");
	            }
	        }
	        sc.close();
	    }
	}
