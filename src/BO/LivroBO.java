package BO;

public class LivroBO {

	public static boolean validaString(String string){
		if(string == ""){
			System.out.println("O campo n�o pode ficar em branco!");
			return false;
		}else
			return true;
	}
	
	public static boolean validaAnoDeEdicao(int anoDeEdicao){
		if(anoDeEdicao  < 2015){
			return true;
		}else
			System.out.println("Ano de edi��o inv�lido!!");
			return false;
	}
	
	public static boolean validaQuantidadeNaEstatnte(int qtdNaEstatne){
		if(qtdNaEstatne  > 0 ){
			return true;
		}else
			System.out.println("Dado inv�lido(menor que 1)!");
			return false;
	}
	
}
