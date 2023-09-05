import java.util.Scanner;

public class MainChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase ou uma palavra para verificar, se é um palíndormo: ");
        String x = input.nextLine();
        StackChar y = new StackChar(x.length());
        for (int i = 0; i < x.length(); i++) {
            y.push(x.charAt(i));
        }
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != y.top()) {
                System.out.println("Não é um palíndromo");
                break;
            } else {
                y.pop();
            }
        }
        System.out.println("É um palíndromo");
        input.close();
    }
}
