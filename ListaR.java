public class ListaR {
  private NodeR inicio;

  public ListaR() {
    inicio = null;
  }

  public void add(int valor) {
    if (inicio != null) {
      inicio.add(valor);
    } else {
      inicio = new NodeR(valor);
    }

  }

  public void show() {
    if (inicio != null) {
      inicio.show();
    }

  }

  public int size() {
    if (inicio != null) {
      return inicio.size();
    } else {
      return 0;
    }
  }

  public int soma() {
    if (inicio != null) {
      return inicio.soma();
    } else {
      return 0;
    }
  }

  public int maior() {
    if (inicio != null) {
      return inicio.maior();
    } else {
      return -99999;
    }
  }

  public int qtdNosComValor(int valor) {
    if (inicio != null) {
      return inicio.qtdNosComValor(valor);
    } else {
      return 0;
    }
  }

  public void showPosPares() {
    if (inicio != null) {
      inicio.showPosPares(1);
    }
  }

  public boolean contains(int valor) {
    if (inicio != null) {
      return inicio.contains(valor);
    } 
    else {
      return false;
    }
  }

  public int somaPosImpares() {
    if (inicio != null) {
      return inicio.somaPosImpares(1);
    }
    else {
      return 0;
    }
  }

  public void doubleX() {
    if (inicio != null) {
      inicio.doubleX();
    }
  } 

  public boolean crescente(){
    if (inicio != null) {
      return inicio.crescente();
    } 
    else {
      System.out.println("Lista Vazia");
      return false;
    }
  }

  public void inverte() {
        if (inicio != null) {
            inicio = inicio.inverte();
        }
    }

  public int somaPares(){
    if(inicio != null){
      return inicio.somaPares();
    }
    else{
      return 0;
    }
  }

  public int menorValorQue(int valor) {
    if (inicio != null) {
      return inicio.menorValorQue(valor);
    } 
    else {
      return -99999;
    }
  }
  public void doisValores(int valor1, int valor2) {
    if (inicio != null) {
      inicio.doisValores(valor1, valor2, 1);
    }
  }
}
