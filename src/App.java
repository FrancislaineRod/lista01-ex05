import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        double centimetros,metros;
        System.out.print("Digite o valor em metro(s) para conversão: ");
        metros = console.nextDouble();

        centimetros = metros*100;

        System.out.println("O valor " + metros + " equivale a " + centimetros + " centímetros");

        //fecha a variável console aberta no inicio em scanner
        console.close();
    }
}
