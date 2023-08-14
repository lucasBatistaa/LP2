import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        //Crie um programa em JAVA que faça a leitura de um arquivo de texto contendo
        // um número inteiro em cada linha onde: O número da primeira linha é o valor
        // de N e os números subsequentes são a sequência numérica de interesse. 
        //Armazene os valores lidos em um vetor e exiba-o. Aproveite sua implementação 
        //do Exercício 1. e escreva em outro arquivo a sequência numérica em ordem inversa.

        Files file = new Files();

        // ler arquivo
        int vector[] = file.fileRead();
        
        int count = vector.length;
        int inverseVector[] = new int[count];   

        for (int i : vector) {
            System.out.println(i);

            inverseVector[count - 1] = i;
            count--;
        }

        file.Write(inverseVector);

    }
}
