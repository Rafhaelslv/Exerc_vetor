/*Criar e coletar um vetor [100] inteiro e exibir:
a. O maior e o menor valor;
b. A média dos valores. 
*/
package Exercicios;
import javax.swing.JOptionPane;
public class Ex_02 {
	public static void main(String[] args) {
	int vetor[] = new int [5];
	int i, maior=0, menor=0, md=0;
	for(i=0;i<=4;i++) {
		vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		if(vetor[i]>maior) {
			maior = vetor[i];
		}
		if(menor==0) {
			menor = vetor[i];
		}else {
				if (vetor[i]<menor) {
				menor = vetor[i];
				}
			}
		md = md+vetor[i];
	}
	System.out.println("O maior numero: " +maior+ " O menor numero: " +menor+ " A media: " +md);
	}
}
