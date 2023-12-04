public class Teste {
    public static void main(String[] args) {
        // Questão 1 - Teste do cadastro de produtos
        SearchTree arvoreProdutos = new SearchTree();
        // (a) Cadastrar um novo produto
        Produto produto1 = new Produto("a", "Produto A", "Fornecedor A", 10.0, 100);
        arvoreProdutos.inserirSemRecursivo(produto1);

        Produto produto2 = new Produto("b", "Produto B", "Fornecedor B", 20.0, 50);
        arvoreProdutos.inserirSemRecursivo(produto2);
        Produto produto3 = new Produto("c", "Produto C", "Fornecedor C", 30.0, 75);
        arvoreProdutos.inserirSemRecursivo(produto3);

        Produto produto4 = new Produto("d", "Produto A", "Fornecedor A", 10.0, 100);
        arvoreProdutos.inserirSemRecursivo(produto4);

        Produto produto5 = new Produto("e", "Produto B", "Fornecedor B", 20.0, 50);
        arvoreProdutos.inserirSemRecursivo(produto5);

         Produto produto6 = new Produto("f", "Produto C", "Fornecedor C", 30.0, 75);
        arvoreProdutos.inserirSemRecursivo(produto6);

        arvoreProdutos.emOrdem();
    }
}
