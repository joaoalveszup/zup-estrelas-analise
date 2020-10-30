package br.com.zup.estrelas.analise;

import java.util.Arrays;
import java.util.Random;

public class ProgramaPrincipal {

    public static int geraNumeroPar() {

        Random random = new Random();
        return random.nextInt(40000000);
    }

    public static void main(String[] args) {

        int[] vetorBase = new int[40000];
        int valorPar = 0;
        for (int i = 0; i < vetorBase.length; i++) {
            vetorBase[i] = geraNumeroPar();
        }
//        
//        for (int i = 0; i < 10; i++) {
//            Busca.buscaComum(vetorBase, geraNumeroPar());
//            Busca.buscaMelhorada(vetorBase, geraNumeroPar());
//        }

        long inicio = System.currentTimeMillis();
        // int[] vetorASerOrdenadoBubble = {2, 5, 1, 95, 54, 33, 71, 115, 7, 9, 4};
        // System.out.println(Arrays.toString(Ordenacao.bubbleSort(vetorBase)));
        //Ordenacao.bubbleSort(vetorBase);
        long fim = System.currentTimeMillis();
        System.out.printf("\nTempo decorrido em milis Bubble %d\n", fim - inicio);

        int[] vetorBaseInsertion = new int[40000];
        for (int i = 0; i < vetorBase.length; i++) {
            vetorBaseInsertion[i] = geraNumeroPar();
        }

        inicio = System.currentTimeMillis();
        // int[] vetorASerOrdenadoInsertion = {2, 5, 1, 95, 54, 33, 71, 115, 7, 9, 4 };
        // System.out.println(Arrays.toString(Ordenacao.insertionSort(vetorBaseInsertion)));
        //Ordenacao.insertionSort(vetorBaseInsertion);
        fim = System.currentTimeMillis();
        System.out.printf("\nTempo decorrido em milis Insertion %d\n", fim - inicio);

        int[] vetorBaseQuick = {7, 4, 9, 1, 2, 3};
//        for (int i = 0; i < vetorBaseQuick.length; i++) {
//            vetorBaseQuick[i] = geraNumeroPar();
//        }
        
        Busca.buscaMelhorada(vetorBaseQuick, 3);

        inicio = System.currentTimeMillis();
        Ordenacao.quickSort(vetorBaseQuick, 0, vetorBaseQuick.length - 1);
        fim = System.currentTimeMillis();
        System.out.printf("\nTempo decorrido em milis Quick %d\n", fim - inicio);
        // int[] vetorASerOrdenadoQuick = {2, 5, 1, 95, 54, 33, 71, 115, 7, 9, 4 };
        // Ordenacao.quickSort(vetorASerOrdenadoQuick, 0, vetorASerOrdenadoQuick.length
        // - 1);
        // System.out.println(Arrays.toString(vetorASerOrdenadoQuick));

    }

}
