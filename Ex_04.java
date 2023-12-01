/*Criar e coletar em um vetor [30] real e calcular e exibir:
a. A média do grupo;
b. A quantidade de notas acima do grupo;
c. As posições dos valores abaixo da média do grupo
*/
package Exercicios;
import javax.swing.JOptionPane;
public class Ex_04 {
	public static void main(String args[]) {
		int vetor[] = new int [30];
		int i;
		double md=0, acima=0, pabaixo=0;
		for(i=0;i<30;i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
			md = md + vetor[i];
		}
		md = md / 30;
		System.out.println("Media: "+md);
		for(i=0;i<30;i++) {
			if(vetor[i]>md) {
				acima++;
			}else {
				pabaixo = vetor[i];
				System.out.println("Posicao abaixo da media: " +(i)+ " valor: "+pabaixo);
			}
				
		}
		System.out.println("Quantidade de notas acima da media: "+acima);
	}

}
