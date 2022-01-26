package application;

import java.util.Scanner;

import entities.Transacoes;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		String name;
		double deposit;
		char yn;
		
		Transacoes transacoes;
		
		System.out.print("Enter account number: ");
		number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		name = sc.nextLine();
		
		System.out.print("Is there a initial deposit? (y or n):  ");
		yn = sc.next().charAt(0);
		if(yn == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			System.out.println();
			transacoes = new Transacoes(number, name, deposit);
		}
		else {
			transacoes = new Transacoes(number, name);
		}
		
		
		System.out.println("Informações: ");
		System.out.println("Conta:  " + transacoes.getNumber() + " Nome: " + transacoes.getName() + " Total na conta: " + transacoes.getTotal());
		System.out.println();
		
		System.out.print("Enter a deposit value:  ");
		deposit = sc.nextDouble();
		transacoes.depositarConta(deposit);
		System.out.println("Conta:  " + transacoes.getNumber() + " Nome: " + transacoes.getName() + " Total na conta: " + transacoes.getTotal());
		
		System.out.println();
		System.out.print("Enter a withdraw value:  ");
		double saque = sc.nextDouble();
		transacoes.sacarConta(saque);
		System.out.println("Conta:  " + transacoes.getNumber() + " Nome: " + transacoes.getName() + " Total na conta: " + transacoes.getTotal());
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
