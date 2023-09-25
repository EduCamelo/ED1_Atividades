public class LSEInt {
    private LSENode primeiro;

    public boolean isEmpty() {
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public void exibirTodos() {
        LSENode aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void inserirNoInicioSemRepeticao(Integer valor) {
        LSENode novo, retorno;
        novo = new LSENode(valor);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            System.out.println("Inserção efetuada.");
        } else {
            retorno = this.procurar(valor);
            if (retorno == null) {
                novo.setProx(this.primeiro);
                this.primeiro = novo;
                System.out.println("Inserção efetuada!");
            } else {
                System.out.println("Valor repetido. Inserção não efetuada!");
            }
        }
    }

    private LSENode procurar(int valor) {
        LSENode auxNode = this.primeiro;
        while (auxNode != null) {
            if (auxNode.getInfo() == valor) {
                return auxNode;
            }
            auxNode = auxNode.getProx();
        }
        return null;
    }

    public void removerInicio() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            this.primeiro = this.primeiro.getProx();
            System.out.println("Remoção efetuada!");
        }
    }

    public void inserirNoFinal(Integer valor) {
        LSENode novo = new LSENode(valor);
        if (isEmpty()) {
            this.primeiro = novo;
        } else {
            LSENode atual = this.primeiro;
            while (atual.getProx() != null) {
                if (valor == atual.getInfo()) {
                    System.out.println("Valor repetido não adicionado");
                    break;
                }
                atual = atual.getProx();
            }
            atual.setProx(novo);
        }
    }

    public void removerNoFinal() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            LSENode novo = this.primeiro;
            while (novo != null) {
                if (novo.getProx() == null) {
                    novo = null;
                    System.out.println("Remoção efetuada!");
                }
            }
        }
    }
}
