import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("Loja Preço Bom - Sistema de Controle de Estoque");
        System.out.println("\nOpções:");
        System.out.println("1 – Cadastro de um produto");
        System.out.println("2 – Exibição dos dados de um produto");
        System.out.println("3 – Exibição de todos os produtos da loja");
        System.out.println("4 – Alterar o preço de um produto");
        System.out.println("5 – Atualizar o estoque de um produto");
        System.out.println("6 – Realizar a venda de um produto");
        System.out.println("7 – Remover um produto do cadastro");
        System.out.println("0 – Sair do programa");
        System.out.println("Digie uma das opções: ");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam, e, op, op2;
        String a, b, c;
        double d;
        boolean aux = false;
        Produto y;
        System.out.println("Informe a quantidade de produtos: ");
        tam = input.nextInt();
        CadastroProduto x = new CadastroProduto(tam);
        menu();
        do {
            menu();
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Digite o código do produto: ");
                    a = input.nextLine();
                    System.out.print("Digite o descrição do produto: ");
                    b = input.nextLine();
                    System.out.print("Digite o fornecedor do produto: ");
                    c = input.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    d = input.nextDouble();
                    System.out.print("Digite a quantidade do produto: ");
                    e = input.nextInt();
                    y = new Produto(a, b, c, d, e);
                    x.cadastro(y);
                    break;
                case 2:
                    System.out.print("Digite qual o produto deverá ser buscado: ");
                    a = input.nextLine();
                    y = new Produto(a);
                    x.exibirProduto(y);
                    break;
                case 3:
                    x.exibir();
                    break;
                case 4:
                    System.out.println("Digite o código do produto: ");
                    a = input.nextLine();
                    y = new Produto(a);
                    do {
                        aux = false;
                        System.out.println("Digite uma das opções: (1- Aumentar o preço // 2 - Desconto no preço)");
                        op2 = input.nextInt();
                        if (op2 == 1) {
                            System.out.println("Digite o valor do aumento: ");
                            e = input.nextInt();
                            x.alterarPreco(y, e, op2);
                            aux = true;
                        } else if (op2 == 2) {
                            System.out.println("Digite o valor do desconto: ");
                            e = input.nextInt();
                            x.alterarPreco(y, e, op2);
                            aux = true;
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    } while (aux != true);
                    break;
                case 5:
                    System.out.println("Digite o código do produto: ");
                    a = input.nextLine();
                    y = new Produto(a);
                    System.out.println("Digite o valor para adicionar ao estoque: ");
                    e = input.nextInt();
                    x.estoque(y, e);
                    break;
                case 6:
                    System.out.println("Digite o código do produto: ");
                    a = input.nextLine();
                    y = new Produto(a);
                    System.out.println("Digite a quantidade que deseja vender: ");
                    e = input.nextInt();
                    x.vender(y, e);
                    break;
                case 7:
                    System.out.println("Digite o código do produto que deseja remover: ");
                    a = input.nextLine();
                    y = new Produto(a);
                    a = input.nextLine();
                    x.remover(y);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite uma opção válida.");
                    break;
            }
        } while (op != 0);
        input.close();
    }
}