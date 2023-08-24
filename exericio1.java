import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Escolha quatro parâmetros para o programa");
    System.out.println("cada dois pontos representarão um ponto - Em ordem p1(x,y); p2(x,y)");
    System.out.println("O programa entregará a distância entre os dois pontos");

    Double x1, y1, x2, y2, distancia;

    Scanner sc = new Scanner(System.in);

    x1 = sc.nextDouble();
    y1 = sc.nextDouble();
    x2 = sc.nextDouble();
    y2 = sc.nextDouble();

    // System.out.printf("os valores de x1, y1, x2, y2 são: %.2f, %.2f, %.2f, %.2f
    // %n", +x1, +y1, +x2, +y2);
    distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    System.out.printf("A distância entre os dois pontos é: %.4f metros. %n", +distancia);

    sc.close();

  }
}
