package contaBanco;
import java.util.Scanner;

public class ContaTerminal {
//declaraçao de  variaveis
	int Numero;
	String Agencia;
	String NomeCliente;
	static double Saldo;

	
	
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Por favor, insira seu número:..");
	int Numero = sc.nextInt();
	
	System.out.println("Por favor, insira o nome da sua Agência:..");
	String Agencia = sc.next();
	
	System.out.println("Por favor, insira o seu nome:..");
	String NomeCliente = sc.next();
	
	System.out.println("Por favor, insira o saldo da sua conta:..");
	
	double Saldo = sc.nextDouble();
	
	System.out.println("Olá" +NomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia +", conta "+ Numero + " e seu saldo "+ Saldo +" já está disponível para saque");
	}
	
	}
