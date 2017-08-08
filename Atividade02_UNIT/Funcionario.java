package Atividade02_UNIT;

public class Funcionario {
	
	String nome;
	String departamento;
	double salario;
	String rg;
	Data dataDeEntrada;
	
	public double getSalario(double salario) {
		
		return this.salario;
		
	}
	
	public double calculaGanhoAnual() {
		
		return salario * 12;
		
	}
	
	public double RecebeAumento(double aumento) {
		
		return this.salario = this.salario + aumento;
		
	}
	
	public void mostra() {
		
		System.out.println("Nome do funcionário: " + this.nome);
		System.out.println("Departamento do funcionário: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("Salário anual: " + this.calculaGanhoAnual());
		System.out.println("RG: " + this.rg);
		System.out.print("Data de entrada: " + this.dataDeEntrada.getFormatada);
		System.out.println("\n");
		
	}

}
