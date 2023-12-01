package Exemplo;
import javax.swing.JOptionPane;
public class ex_01 {
public static void main(String args[]) {
	double vetor[] = new double [4];
	double soma=0,media=0;
	int i;
	for(i=0;i<4;i++) {
		vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		soma = soma + vetor[i];
	}
	media = soma/4;
	System.out.println("Media: "+media);
}
}
