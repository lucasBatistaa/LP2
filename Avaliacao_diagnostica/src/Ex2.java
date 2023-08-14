import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        //Crie um programa em JAVA que solicita ao usuário o valor de N e, 
        //posteriormente, alimente o vetor com valores aleatórios entre 0 e M
        //(M também é informado pelo usuário). Exiba o vetor gerado.

        int N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o total de números: "));

        int M = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor máximo possível: "));

        int vector[] = new int[N];

        for (int count = 0; count < N; count++) {
            vector[count] = (int) Math.floor(Math.random() * M);
        }

        for (int number : vector) {
            System.out.println(number);
        }

    }
}
