public class Impressora {
  private String Tipo;
  private String Marca;
  private String Cor;

  public Impressora() {

  }

  public Impressora (String tipo, String marca, String cor){
    Tipo = tipo;
    Marca = marca;
    Cor = cor;
  }

  public String getTipo() {
    return Tipo;
  }

  public void setTipo(String tipo) {
    Tipo = tipo;
  }

  public String getMarca() {
    return Marca;
  }

  public void setMarca(String marca) {
    Marca = marca;
  }

  public String getCor() {
    return Cor;
  }

  public void setCor(String cor) {
    Cor = cor;
  }

  public void imprimir() {
    System.out.println("imprimindo...");
  }
  
  public void scanear() {
    System.out.println("scaneando...");
  }
}