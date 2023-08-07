import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        
        System.out.println("Informe os pontos do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Informe os pontos do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calculoArea();
        double areaY = y.calculoArea();

        char resultado = decisao(areaX, areaY);
        System.out.println("Triangulo de maior area = " + resultado);
        
        sc.close();
    }

    public static char decisao(double areaX, double areaY) {
        char resposta = (areaX > areaY) ? 'X' : 'Y';
        return resposta;
    }

}