public class NodeR{
    private int x;
    private NodeR prox;

    public NodeR(int valor){
        // inicializa variáveis de instância
        x = valor;
        prox = null;
    }
    
   public void add(int valor){
       if(prox!=null){
           prox.add(valor);
       }
       else{
           prox = new NodeR(valor);
       }
   }

    public void show(){
        System.out.print(x + " -> ");
        if(prox!=null){
            prox.show();
        }
        //System.out.print(x + " -> ");
    }
    
    public int size(){
        if(prox!=null){
            return prox.size() + 1;
        }
        else{
            return 1;
        }
    }
    
    public int soma(){
        if(prox!=null){
            return prox.soma() + x;
        }
        else{
            return x;
        }
    }
    
    public int maior(){
        if(prox!=null){
            int m = prox.maior();
            if(x>m){
                return x;
            }
            else{
                return m;
            }
        }
        else{
            return x;
        }
    }
        
    public int qtdNosComValor(int valor){
        if(prox!=null){
            int q = prox.qtdNosComValor(valor);
            if(x==valor){
                return q + 1;
            }
            else{
                return q;
            }
        }
        else{
            if(x==valor){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    
    public void showPosPares(int pos){
        if(pos%2==0){
            System.out.println(x);
        }
        if(prox!=null){
            prox.showPosPares(pos+1);
        }
    }

    public boolean contains(int valor) {
        //Primeiro verifica se o nó contem o valor desejado:
        if (x == valor) {
            return true; // Encontrou o valor, portanto, retorna true
        }
        //Se não encontrou, aponta para o próximo nó da lista:
        if (prox != null) {
            return prox.contains(valor); // Continua a busca recursiva no próximo nó
        }
        // Chegou ao final da lista sem encontrar o valor
        return false; 
    }
  
    public int somaPosImpares(int pos) {
        //Verifica se a posição é impar ou não apartir da posição 1:
        if (pos % 2 == 1) {
            //
            if (prox != null) {
                return prox.somaPosImpares(pos + 1) + x;
            } else {
                return x; // Somente o valor atual, pois não há próximo nó
            }
        }
        if (prox != null) {
            return prox.somaPosImpares(pos + 1);
        } else {
            return 0; // ou outro valor apropriado para indicar o final da recursão
        }
    }

    public void doubleX(){
          if(prox!=null){
              x = x * 2;
              System.out.println(x);  
              prox.doubleX();
          }
          else{
              x = x * 2;
              System.out.println(x);
          }
      }

    public boolean crescente() {
    if (prox != null) {
        if (x <= prox.x) {
            return prox.crescente(); // Continua procurando
        } 
        else{
            return false; // A lista não é crescente
        }
    } 
      else {
          // Chegou ao final da lista sem encontrar um problema
          return true;
      }
    }

  public NodeR inverte() {
        if (prox != null) {
            NodeR rest = prox.inverte();
            prox.prox = this;
            prox = null;
            return rest;
        } else {
            return this;
        }
    }
  
    public int somaPares(){
        //Verifica se é par ou não:
        if (x % 2 == 0) {
            if (prox != null) {
                return prox.somaPares() + x;
            } 
            else {
                return x; // Somente o valor atual, pois não há próximo nó
            }
        }
        if (prox != null) {
            return prox.somaPares();
        } else {
            return 0;
        }
    }
  
    public int menorValorQue(int valor) {
    if (prox != null) {
        int menor = prox.menorValorQue(valor);
        //Primeiro verifica se o valor atual é maior que o parâmetro 
        if (x > valor) {
            //Depois ele verifica se o valor atual é menor que a parte restante da lista
            if (menor == -99999 || x < menor) {
                //Se sim, retorna o valor atual
                return x;
            } 
            else {
                //Se não retorna o valor encontrado no resto da lista
                return menor;
            }
        } 
        //Se o valor do nó atual for menor que o valor do parâmetro, retorna o valor encontrado na parte restante da lista
        else {
            return menor; 
        }
    } 
    else {
        if (x > valor) {
            return x;
        } 
        else {
            return -99999;
        }
    }
}

  public void doisValores(int valor1, int valor2, int pos){
        if(x > valor1 && x < valor2){
            System.out.println("Posição: "+ pos + " Valor: " + x);
        }
        if(prox!=null){
            prox.doisValores(valor1, valor2, pos + 1);
        }
    }
}