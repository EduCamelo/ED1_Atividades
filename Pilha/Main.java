import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackInt x = new StackInt(10);
        System.out.println("Digite um número normal para converter em binário: ");
        int aux, a = input.nextInt();
        do {
            aux = a % 2;
            x.push(aux);
            a /= 2;
        } while (a == 1 || a == 0);
        do {
            System.out.println(x.top());
            x.pop();
        } while (x.top() != 0);
        input.close();
    }
}
