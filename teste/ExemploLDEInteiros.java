import java.util.Scanner;
import java.util.Random;

public class ExemploLDEInteiros {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            LDEInt numeros = new LDEInt();
            Random random = new Random();
            int op, num;
            do {
                exibirMenu();
                op = in.nextInt();
                System.out.println(" ");
                switch (op) {
                    case 1:
                        System.out.print("Informe o valor: ");
                        num = random.nextInt(0, 10);
                        numeros.inserirNoInicio(num);
                        break;
                    case 2:
                        System.out.print("Informe o valor: ");
                        num = random.nextInt(0, 10);
                        numeros.inserirNoFinal(num);
                        break;
                    case 3:
                        numeros.exibirTodos();
                        break;
                    case 4:
                        System.out.println("Em desenvolvimento!");
                        break;
                    case 5:
                        System.out.println("Em desenvolvimento!");
                        break;
                    case 6:
                        System.out.println("Em desenvolvimento!");
                        break;
                    case 0:
                        System.out.println("Fim de programa!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (op != 0);
        }
    }

    public static void exibirMenu() {
        System.out.println("Opções");
        System.out.println("1 -Inserir no início");
        System.out.println("2 -Inserir no final");
        System.out.println("3 -Exibir todos");
        System.out.println("4 -Remover primeiro");
        System.out.println("5 -Remover último");
        System.out.println("6 -Remover um elemento específico");
        System.out.println("0 -Encerrar o programa");
        System.out.print("Informe a opção desejada: ");
    }
}