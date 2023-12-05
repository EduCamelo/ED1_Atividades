public class Teste {
    public static void main(String[] args) {
        // Questão 1 - Teste do cadastro de produtos
        SearchTree arvoreProdutos = new SearchTree();
        // (a) Cadastrar um novo produto
        Produto produto1 = new Produto("c", "200", "Fornecedor A", 10.0, 100);
        arvoreProdutos.inserirSemRecursivoRepetido(produto1);

        Produto produto2 = new Produto("b", "150", "Fornecedor B", 20.0, 50);
        arvoreProdutos.inserirSemRecursivoRepetido(produto2);
        Produto produto3 = new Produto("d", "250", "Fornecedor C", 30.0, 75);
        arvoreProdutos.inserirSemRecursivoRepetido(produto3);

        Produto produto4 = new Produto("f", "325", "Fornecedor A", 10.0, 100);
        arvoreProdutos.inserirSemRecursivoRepetido(produto4);

        Produto produto5 = new Produto("a", "100", "Fornecedor B", 20.0, 50);
        arvoreProdutos.inserirSemRecursivoRepetido(produto5);

         Produto produto6 = new Produto("e", "300", "Fornecedor C", 30.0, 75);
        arvoreProdutos.inserirSemRecursivoRepetido(produto6);
        Produto produto7 = new Produto("c", "199", "Fornecedor C", 30.0, 75);
        arvoreProdutos.inserirSemRecursivoRepetido(produto7);

        arvoreProdutos.emOrdem();
    }
}
