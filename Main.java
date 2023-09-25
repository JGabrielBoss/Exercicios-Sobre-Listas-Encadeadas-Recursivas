import java.util.Scanner;

class Main {
  public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        ListaR l = new ListaR();
        
        l.add(41);  //adiciona valores à lista
        l.add(30);
        l.add(80);
        l.add(20);  
        l.add(60);
        l.add(55);
        l.add(17);  
        l.add(9);
        l.add(10);

        System.out.println("1) ============");
        //Construa os métodos que imprima na tela os valores armazenados nos 
        //nós da Lista Encadeada.
        l.show();   // imprime na tela os valores armazenados na lista

        System.out.println("2) ============");
        //Construa os métodos que retornem a quantidade de nós da Lista Encadeada.
        System.out.println(l.size());

        System.out.println("3) ============");
        //Construa os métodos que retornem a soma dos valores
        //armazenados nos nós da Lista Encadeada
        System.out.println(l.soma());

        System.out.println("4) ============");
        //Construa os métodos que retornem o maior dos valores armazenados nos 
        //nós da Lista Encadeada.
        System.out.println(l.maior());

        System.out.println("5) ============");
        //Construa os métodos que, dado um valor inteiro como parâmetro, retornem a
        //quantidade de valores armazenados nos nós da Lista Encadeada que sejam 
        //iguais ao valor passado.
        System.out.println(l.qtdNosComValor(30));

        System.out.println("6) ============");
        //Construa os métodos que imprimam na tela os valores armazenados nos nós da lista
        //que ocupem posições pares, considerando que o nó HEAD ocupa a primeira posição (1).
        l.showPosPares();

        System.out.println("7) ============");
        //Escreva o método boolean contains(int valor), que verificará se o valor passado 
        //como parâmetro está armazenado na lista encadeada. Se houver uma ocorrência desse
        //valor na lista, deve retornar True, caso contrário, deve retornar False.
        System.out.println(l.contains(90));

        System.out.println("8) ============");
        //Escreva o método int somaPosImpares(), que fará a soma dos valores dos nós nas
        //posições ímpares da lista encadeada. Considere que o Início está na posição 1.
        System.out.println("Soma dos numeros em POSIÇÃO impar "+l.somaPosImpares());

    
        System.out.println("9) ============");
        //Escreva o método void doubleX(), que dobrará o valor dos x dos nós da lista
        //encadeada, usando recursividade.
        l.doubleX();

        System.out.println("10) ============");
        //Construa métodos recursivos para a classe Lista e Node, desenvolvidas em sala de
        //aula, que recebam como parâmetro dois valores inteiros e imprimam na tela a 
        //posição dos nós que contém valores que estejam entre os dois valores.
        l.doisValores(10, 60);

        System.out.println("11) ============");
        //Escreva os métodos para a Classe Lista e Node, usando recursividade, que determine
        //se uma lista encadeada tem os valores de seus nós, em ordem crescente.
        System.out.println(l.crescente());

        System.out.println("12) ============");
        //Escreva os métodos para a Classe lista e Node, usando recursividade, que inverta a
        //sequência de Nós da lista.
        System.out.println("Lista invertida");
        l.inverte();
        l.show();

        System.out.println("13) ============");
        //Escreva os métodos para a Classe lista e Node, usando recursividade, que encontre 
        //a soma dos elementos de uma lista encadeada que são pares.
        System.out.println(l.somaPares());

        System.out.println("14) ============");
        //Escreva os métodos para a Classe lista e Node, usando recursividade, que encontre
        //o menor elemento de uma lista encadeada que seja maior que um determinado valor
        //passado como parâmetro para os métodos criados.
        System.out.println(l.menorValorQue(40));
  }
}