import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double horastrabalhadas;
    double valorporhoras;
    double salario;
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantos você ganha por hora?");
    horastrabalhadas = teclado.nextDouble();
    System.out.println("Quantas horas você trabalha por mês?");
    valorporhoras = teclado.nextDouble();
    // passo 3: calcular salario
    salario = valorporhoras * horastrabalhadas;
    // passo 4: exibir salario 
    System.out.println("O salário mensal é:" + salario);
  }
}