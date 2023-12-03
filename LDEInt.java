public class LDEInt {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public boolean isEmpty() {
        return this.primeiro == null && this.ultimo == null && this.qtd == 0;
    }

    public void inserirOrdenado(int valor) {
        LDENode novo = new LDENode(valor);
        if (this.isEmpty()) {//Se for vazio, insere no inicio;
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Valor inserido");

        } else if (valor < this.primeiro.getInfo()) {//Insere inicio se o primeiro for maior que o novo
            this.primeiro.setAnt(novo);
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
            System.out.println("Valor inserido");

        } else if (valor == this.primeiro.getInfo()) {
            System.out.println("Valor não pode ser inserido");

        } else if (valor > this.ultimo.getInfo()) {//Insere no final se o novo for maior que o ultimo
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            qtd++;
            System.out.println("Valor inserido");

        } else if (valor == this.ultimo.getInfo()) {
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            qtd++;

        } else {
            LDENode aux = this.primeiro.getProx();
            while (aux != null) {
                if (aux.getInfo() > valor) {
                    novo.setAnt(aux.getAnt());
                    novo.setProx(aux);
                    aux.getAnt().setProx(novo);
                    aux.setAnt(novo);
                    aux.setProx(null);
                    aux = novo;
                    this.qtd++;
                    System.out.println("Valor inserido");
                    return;
                    
                } else if (aux.getInfo() == valor) {
                    System.out.println("Valor já foi inserido na lista");
                    return;

                }
                aux = aux.getProx();
            }
        }
    }

    public void exibirTodos() {
        LDENode aux = this.primeiro;
        for (int i = 0; i < this.qtd; i++) {
            System.out.println(i + "°: " + aux.getInfo());
            aux = aux.getProx();
        }
    }
}
