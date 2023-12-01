package Exemplo;
import javax.swing.JOptionPane;
public class ex_02 {
public static void main(String args[]) {
int vetor[] = new int [5];
int i;
for(i=0;i<5;i++) {
	vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
	System.out.println("vetor["+i+"]valor: "+vetor[i]);
}
}
}
