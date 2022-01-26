package entities;

public class Transacoes {

	private int number;
	private String name;
	private double total;
	
	
	public Transacoes() {
	}
	
	public Transacoes(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Transacoes(int number, String name, double deposit) {
		this.number = number;
		this.name = name;
		total = deposit;
	}
	
	
	public int getNumber() {
		return number;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotal() {
		return total;
	}


	public void depositarConta(double deposit) {
		total += deposit;
	}
	
	public void sacarConta(double saque) {
		total = total - saque - 5;
	}
	
	
	
	

}
