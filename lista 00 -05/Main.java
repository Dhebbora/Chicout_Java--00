import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();

        System.out.print("Qual o valor para o cateto Adjacente: ");
        trinagulo.setcCatetoA(scanner.nextDouble());
        System.out.print("Qual o valor para o cateto Oposto: ");
        trinagulo.setcCatetoB(scanner.nextDouble());

        System.out.println(triangulo.toString());
    }
}
