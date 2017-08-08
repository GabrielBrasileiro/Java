package Atividade02_UNIT;

public class Data {

	int dia, mes, ano;
	String getFormatada;

	void calendario(int dia, int mes, int ano) {

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		getFormatada = (dia + "/" + mes + "/" + ano);

	}
}
