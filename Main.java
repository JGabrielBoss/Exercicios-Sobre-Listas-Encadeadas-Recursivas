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
        //l.show();   // imprime na tela os valores armazenados na lista
        //System.out.println(l.size());
        //System.out.println(l.soma());
        //System.out.println(l.maior());
        //System.out.println(l.qtdNosComValor(30));
        // l.showPosPares();
        //System.out.println(l.contains(90));
        //System.out.println("Soma dos numeros em POSIÇÃO impar "+l.somaPosImpares());
        //l.show();
        //System.out.println("============");
        //l.doubleX();
        //System.out.println(l.crescente());
        //System.out.println(l.somaPares());
        System.out.println(l.menorValorQue(40));
        
        //l.doisValores(10, 60);

        //l.inverte();
        //l.show();
  }
}