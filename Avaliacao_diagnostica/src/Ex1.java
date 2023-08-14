import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        // Crie um programa em que solicita ao usuário o valor de N e, posteriormente os N números
        // que devem ser armazenados em um vetor. Em um segundo momento, exiba o vetor na ordem em
        // que os elementos foram digitados e em ordem inversa.

        int N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de números: "));

        int[] vector = new int[N];

        for (int count = 0; count < N; count++) {
            vector[count] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: ")); 
        }

        System.out.println("Vetor: ");

        for (int number : vector) {
            System.out.println(number);
        }

        System.out.println("\nVetor inverso: ");
        
        for (int count = N - 1; count >= 0; count--) {
            System.out.println(vector[count]);
        }
    }
}
