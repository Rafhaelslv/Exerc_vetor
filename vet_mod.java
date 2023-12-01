package Exemplo;
import javax.swing.JOptionPane;
public class vet_mod {
public static void main(String args[]) {
int vetor[] = new int [5];
int opc=0;
while(opc!=9) {
opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor \\n \r\n2 - Classifica Vetor \\n 3 - Mostra Vetor \\n 9 - Fim\r\n"));
switch(opc)
{
case 1:
	vetor = Carregavetor(vetor);
	break;
case 2:
	vetor = Classificavetor(vetor);
	System.out.println("Vetor classificado");
	break;
case 3:
	vetor = Mostrarvetor(vetor);
	break;
case 9:
	System.out.println("FIM");
	System.exit(0);
	break;
	default:JOptionPane.showInputDialog("OPÇÃO INVALIDA");
}
}
}
public static int[] Classificavetor(int vetor[]) {
	int x,y,aux;
	for(x=0;x<4;x++) {
		for(y=(x+1);y<5;y++) {
			if(vetor[x]>vetor[y]) {
			aux = vetor[x];
			vetor[x] = vetor[y];
			vetor[y] = aux;
		}
		}
	}
	return vetor;
	
}
public static int[] Carregavetor(int vetor[]) {
	int i;
	for(i=0;i<5;i++) {
		vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
	}
	return vetor;
}
public static int[] Mostrarvetor(int vetor[]) {
	int i;
	for(i=0;i<5;i++) {
		System.out.println(+vetor[i]);
	}
	return vetor;
}

}
