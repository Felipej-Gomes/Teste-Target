package Exercicios;
import java.util.Iterator;
import java.util.Scanner;

public class Ex2 {
		
//2) Dado a sequ�ncia de Fibonacci, onde se inicia por 0 e 1 e o pr�ximo valor sempre ser� a soma dos 2 valores anteriores
//(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um n�mero,
//ele calcule a sequ�ncia de Fibonacci e retorne uma mensagem avisando se o n�mero informado pertence ou n�o a sequ�ncia.
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		int numero = 0;
		Scanner entrada  = new Scanner(System.in);
		
		System.out.println("Digite o n�mero desejado: ");
		 numero = entrada.nextInt();
		
		 while (numero > num3) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
		}
		if (numero == num3) {
			System.out.println("O n�mero digitado faz parte da sequ�ncia de Fibonacci");
		}else {
			System.out.println("O n�mero digitado n�o faz parte da sequ�ncia de Fibonacci");
		}
	}
									
	
}
