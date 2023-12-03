import java.util.Scanner;

public class ListaDeInteirosSemRepetidos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LSEInt numeros;
        numeros = new LSEInt();
        int op, num;
        do {
            exibirOpcoes();
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Informe o valor a ser inserido: ");
                    num = in.nextInt();
                    numeros.inserirNoInicioSemRepeticao(num);
                    break;
                case 2:
                    numeros.exibirTodos();
                    break;
                case 3:
                    numeros.removerInicio();
                    break;
                case 4:
                    System.out.print("Escolha um número: ");
                    num = in.nextInt();
                    numeros.inserirNoFinal(num);
                    break;
                case 5:
                    numeros.removerNoFinal();
                    case 0:
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
        in.close();
    }

    public static void exibirOpcoes() {
        System.out.println("Opções");
        System.out.println("1 - Inserir novo valor no início da lista");
        System.out.println("2 - Exibir valores na lista");
        System.out.println("3 - Remover o nó que se encontra no início da lista");
        System.out.println("4 - Colocar um valor no final da lista.");
        System.out.println("5 - Remover o nó que se encontra no início da lista");
        System.out.println("0 -Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}
