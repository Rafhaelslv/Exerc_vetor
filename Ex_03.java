/*Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar 
esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
VT1| 1| 2| 3| |VT2| 4| 5| 6| |VT3| 1| 2| 3| 4| 5| 6
*/

package Exercicios;
import javax.swing.JOptionPane;
public class Ex_03 {
	public static void main(String args[]) {
	int vetor1[] = new int [3];
	int vetor2[] = new int [3];
	int vetor3[] = new int [6];
	int i1;
	for (i1=0;i1<3;i1++) {
		vetor1[i1]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor : "));
		vetor3[i1]=vetor1[i1];
	}
	for (i1=0;i1<3;i1++) {
		vetor2[i1]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor : "));
	vetor3[i1+3]=vetor2[i1];
}
	for (i1=0;i1<6;i1++) {
		System.out.print(+vetor3[i1]+ "|");
}
	
}
}
