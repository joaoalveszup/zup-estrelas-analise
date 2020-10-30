package br.com.zup.estrelas.analise;

public class Ordenacao {

    public static int[] bubbleSort(int[] vetorASerOrdenado) {

        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetorASerOrdenado.length - 1; i++) {
                if (vetorASerOrdenado[i] > vetorASerOrdenado[i + 1]) {
                    aux = vetorASerOrdenado[i];
                    vetorASerOrdenado[i] = vetorASerOrdenado[i + 1];
                    vetorASerOrdenado[i + 1] = aux;
                    troca = true;
                }
            }
        }

        return vetorASerOrdenado;

    }

    public static int[] insertionSort(int[] vetor) {

        int elementoReferencia, i, j;
        for (j = 1; j < vetor.length; j++) {
            elementoReferencia = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > elementoReferencia); i--) {
                vetor[i + 1] = vetor[i];
            }

            vetor[i + 1] = elementoReferencia;
        }

        return vetor;
    }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int separar(int[] vetor, int inicio, int fim) {

        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;

        while (i <= f) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (pivo < vetor[f]) {
                f--;
            } else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }

        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;

    }

}
