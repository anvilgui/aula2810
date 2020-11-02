class Main {
  public static void main(String[] args) {
    Impressora impresoraA = new Impressora("Jato de tinta", "HP", "Branca");
    
    Impressora impresoraB = new Impressora();
    impresoraB.setTipo("Laser");
    impresoraB.setMarca("Epson");
    impresoraB.setCor("Preta");

    Lampada lampadaA = new Lampada("Incandescente", "Osram","fria");

    Lampada lampadaB = new Lampada();
    lampadaB.setTipo("Fluorescente");
    lampadaB.setMarca("Sil Lux");
    lampadaB.setIluminacao("neutra");

    System.out.println("Tipo: " + impresoraA.getTipo());
    System.out.println("Marca: " + impresoraA.getMarca());
    System.out.println("Cor: " + impresoraA.getCor());
    impresoraA.imprimir();

    System.out.println("Tipo: " + impresoraB.getTipo());
    System.out.println("Marca: " + impresoraB.getMarca());
    System.out.println("Cor: " + impresoraB.getCor());
    impresoraB.scanear();

    System.out.println("Tipo: " + lampadaA.getTipo());
    System.out.println("Marca: " + lampadaA.getMarca());
    System.out.println("Iluminação: " + lampadaA.getIluminacao());
    lampadaA.ligar();

    System.out.println("Tipo: " + lampadaB.getTipo());
    System.out.println("Marca: " + lampadaB.getMarca());
    System.out.println("Iluminação: " + lampadaB.getIluminacao());
    lampadaB.piscar();

  }
}