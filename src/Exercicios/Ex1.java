package Exercicios;

public class Ex1 {

//	1) Observe o trecho de c�digo abaixo:
//		int INDICE = 13, SOMA = 0, K = 0;
//		enquanto K < INDICE fa�a
//		{
//		K = K + 1;
//		SOMA = SOMA + K;
//		}
//		imprimir(SOMA);
//		Ao final do processamento, qual ser� o valor da vari�vel SOMA?
	
//	1 : O valor que da vari�vel SOMA vai ser 78.
	
	public static void main(String[] args) {
		int indice = 13;
		int soma  = 0;
		
		
	for (int k = 0; k < indice; k++) {
			soma += k;
	}
		System.out.println(soma);
	}
	
}
