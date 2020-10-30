package br.com.zup.estrelas.analise;

public class Busca {

    public static Integer buscaComum(int[] vetor, int elementoBuscado) {

        int qtdIteracoes = 0;
        Integer posElemento = null;
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            qtdIteracoes++;
            if (vetor[posicao] == elementoBuscado) {
                posElemento = posicao;
                break;
            }
        }

        System.out.println(String.format("Foram feitas %d iterações para encontrar " 
        + "o resultado com busca comum", qtdIteracoes));
        return posElemento;
    }

    public static Integer buscaMelhorada(int[] vetor, int elementoBuscado) {

        Integer posicao = null;
        int qtdIteracoes = 0;
        int limiteInferior = 0;
        int limiteSuperior = vetor.length - 1;

        while (limiteInferior <= limiteSuperior) {

            qtdIteracoes++;
            int meio = (limiteInferior + limiteSuperior) / 2;

            if (vetor[meio] < elementoBuscado) {
                limiteInferior = meio + 1;
            } else if (vetor[meio] > elementoBuscado) {
                limiteSuperior = meio - 1;
            } else if (vetor[meio] == elementoBuscado) {
                posicao = meio;
                break;
            }
        }

        System.out.println(String.format("Foram feitas %d iterações para encontrar "
        + "o resultado com a busca melhorada", qtdIteracoes));
        return posicao;
    }

}
