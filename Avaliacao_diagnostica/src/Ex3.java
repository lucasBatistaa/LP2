import javax.swing.JOptionPane;

public class Ex3 {

    public static int[] Insere_Exclusivo(int vet[], int N) {
        int aux;
        
        for (int count = 0; count < N; count++) {
            boolean flag = true;

            do {
                flag = true;
                aux = (int) Math.floor(Math.random() * (N + 1));

                for (int i = 0; i <= count; i++) {
                    if (vet[i] == aux) {
                        flag = false;
                    }
                }


            } while (!flag);

            vet[count] = aux;
        }

        return vet;
    }
    public static void main(String[] args) {
        //Crie um método chamado Insere_Exclusivo(int vet[], int N) que alimenta
        //um vetor de N elementos com valores aleatórios entre 1 e N sem que 
        //ocorram números repetidos. Exiba o vetor gerado.

        int N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o total: "));

        int vector[] = new int[N];

        vector = Insere_Exclusivo(vector, N);

        for (int number : vector) {
            System.out.println(number);
        }
    }
}
