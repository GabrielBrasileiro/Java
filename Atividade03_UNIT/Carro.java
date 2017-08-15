package Atividade03_UNIT;

import java.util.Scanner;

public class Carro {
	
	Scanner sc = new Scanner(System.in);
	String marca;
	String modelo;
	String cor;
	int ano;
	int anoModelo;
	double ValorDeFabrica;
	double ValorDeVenda;
	
	public void Digitavel() {
		
		System.out.println("Digite a marca: ");
		this.marca = sc.nextLine();
		
		System.out.println("Digite o Modelo: ");
		this.modelo = sc.nextLine();
		
		System.out.println("Digite a cor: ");
		this.cor = sc.nextLine();
		
		System.out.println("Digite o ano: ");
		this.ano = sc.nextInt();
		
		System.out.println("Digite o ano modelo: ");
		this.anoModelo = sc.nextInt();
		
		System.out.println("Digite o valor de fábrica: ");
		this.ValorDeFabrica = sc.nextDouble();
		
		System.out.println("\n");
		
	}
	
	public double gerarValorVenda() {
		
		return (this.ValorDeFabrica * 0.27) + this.ValorDeFabrica;
		
	}
	
	public void ExibirCarro() {
		
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Ano modelo: " + this.anoModelo);
		System.out.println("Valor de Fábrica: " + this.ValorDeFabrica);
		System.out.println("Valor de Venda: " + this.gerarValorVenda());
		System.out.println("");
		
	}

}
