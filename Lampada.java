public class Lampada {
  private String Tipo;
  private String Marca;
  private String Iluminacao;

  public Lampada() {

    }

  public Lampada (String tipo, String marca, String iluminacao){
    Tipo = tipo;
    Marca = marca;
    Iluminacao = iluminacao;
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

  public String getIluminacao() {
    return Iluminacao;
  }

  public void setIluminacao(String iluminacao) {
    Iluminacao = iluminacao;
  }

  void ligar() {
    System.out.println("Está ligada");
  }
  
  void piscar() {
    System.out.println("Está piscando");
  }
}