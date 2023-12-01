//Criar e coletar um vetor [50] inteiro. Calcular e exibir:
//a. A média dos valores entre 10 e 200;
//b. A soma dos números ímpares

package Exercicios;
import javax.swing.JOptionPane;
public class Ex_01 {
	public static void main(String[] args) {
		int vetor[] = new int [50];
		int i, md=0, somaimp=0, cta=0;
		for(i=0;i<=49;i++) {
			vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor : "));
			if((vetor[i%2])!=0){
				somaimp = (somaimp + vetor[i]);
			}
			if(vetor[i]>=10 && vetor[i]<=200) {
				md = md + vetor[i];
				cta++;
			}
		}
		md = md/cta;
		System.out.println("Media dos valores: " +md+ "| A soma dos numeros impares: " +somaimp);
	}
}
