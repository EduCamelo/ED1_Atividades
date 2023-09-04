public class ListaDeFiguras {
    private int qtd;
    private Circulo[] dados;

    public ListaDeFiguras(int tam) { // Construtor da classe ListaDeFiguras
        dados = new Circulo[tam];
    }

    public void inserir(Circulo c) {
        if (qtd < dados.length) {
            dados[qtd] = c;
            qtd++;
        } else {
            System.out.println("A lista cheia.");
        }
    }

    public void exibir() {
        for (int i = 0; i < qtd; i++) {
            System.out.println(dados[i]);
        }
    }
    public void bubblesort(){
    for (int i = 0; i < qtd - 1; i++) {
        for (int j = 0; j < qtd - i - 1; j++) {
            if (dados[j].compareTo(dados[j+1])> 0) {
                Circulo aux = dados[j];
                dados[j] = dados[j + 1];
                dados[j + 1] = aux;
            }
        }
    }
}
}

