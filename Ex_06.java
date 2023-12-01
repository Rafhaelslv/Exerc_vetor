/*Criar e coletar em um vetor [20] com números aleatórios. Classificar este 
vetor em ordem crescente e mostre os dados.
*/
package Exercicios;
import javax.swing.JOptionPane;
public class Ex_06 {
public static void main(String[] args) {
	int vetor[] = new int[5];
	int i, x, aux=0;
	for (i=0;i<5;i++) {
		vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
	}
	for(i=0;i<4;i++) {
		for(x=(i+1);x<5;x++) {
			if(vetor[i]>vetor[x]) {
				aux = vetor[x];
				vetor[x] = vetor[i];
				vetor[i]=aux;
			}
		}
	}
	for(i=0;i<5;i++) {
		System.out.println(+vetor[i]);
	}
	
}
}
