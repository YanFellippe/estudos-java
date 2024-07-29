public class casa {
    //atributos
    String cimento;
    String areia;

  //construtor 
  public casa (String cimento, String areia) {
    this.cimento = cimento;
    this.areia = areia;  
  }

  public String getCimento(){
    return cimento;
  }

  public String getAreia(){
    return areia;
  }

  public static void main(String[] args) {
    casa casa1 = new casa("Argamassado", "Areia");
    System.out.println("Casa 1: " + casa1.cimento + " - " + casa1.areia);
  }
}
