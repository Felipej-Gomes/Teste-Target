package Exercicios;

public class Ex1 {

//	1) Observe o trecho de código abaixo:
//		int INDICE = 13, SOMA = 0, K = 0;
//		enquanto K < INDICE faça
//		{
//		K = K + 1;
//		SOMA = SOMA + K;
//		}
//		imprimir(SOMA);
//		Ao final do processamento, qual será o valor da variável SOMA?
	
//	1 : O valor que da variável SOMA vai ser 78.
	
	public static void main(String[] args) {
		int indice = 13;
		int soma  = 0;
		
		
	for (int k = 0; k < indice; k++) {
			soma += k;
	}
		System.out.println(soma);
	}
	
}
