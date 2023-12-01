/*Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
10
∑ (A[1] – A[21–1])
*/
package Exercicios;
public class Ex_05 {
public static void main(String[] args) {
	int vetor[] = new int [20];
	int i,soma=0;
	for(i=1;i<20;i++) {
		vetor[i] = i;
	}
	for(i=1;i<=10;i++) {
		soma = (soma+(vetor[i]-(21-i)));
	}
	System.out.println("A soma: "+soma);
}
}
