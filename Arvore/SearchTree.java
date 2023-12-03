public class SearchTree {
    private TreeB<Produto> raiz;

    public boolean isEmpty() {
        return raiz == null;
    }

    public void add(Produto x) {
        if (this.isEmpty()) {
            raiz.setInfo(x);
        } else {
            raiz.insertNode(x);
        }
    }

    public void Ordem() {
        if (this.isEmpty()) {
            System.out.println("Árvore vazia");
        } else {
            this.percorrerOrdemCres(raiz);
        }
    }

    private void percorrerOrdemCres(TreeB<Produto> r) {
        if (r != null) {
            percorrerOrdemCres(r.getLeft());
            System.out.println(r.getInfo().toString());
            System.out.println(r.getRight().toString());
        }
    }

    public Produto find(String value) {
        Produto x = new Produto(value);
        if (this.isEmpty() == true) {
            return null;
        } else {
            return raiz.findNode(x);
        }
    }

    public void alteraPreco(String cod, double preco) {
        Produto aux = this.find(cod);
        if (aux != null) {
            aux.setPreco(preco);
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado ou nã cadastrado");
        }
    }

    public void alteraQtd(String cod, int qtd) {
        Produto aux = this.find(cod);
        if (aux != null) {
            aux.setQtd(qtd);
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado ou nã cadastrado");
        }
    }

    public void exibirProd(String cod) {
        Produto aux = this.find(cod);
        if (aux != null) {
            aux.toString();
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public Produto buscaSemRecursivo(String cod) {
        if (this.isEmpty()) {
            return null;
        } else {
            Produto x = new Produto(cod);
            TreeB<Produto> aux = raiz;
            do {
                if (aux.getInfo().compareTo(x) == 0) {
                    return aux.getInfo();
                } else if (aux.getInfo().compareTo(x) > 0) {
                    aux = aux.getLeft();
                } else {
                    aux = aux.getRight();
                }
            } while (true);
        }
    }

    public void inserirSemRecursivo(Produto outro) {
        if (this.isEmpty()) {
            this.raiz.setInfo(outro);
        } else {
            TreeB<Produto> aux = raiz;
            do {
                if (aux.getInfo().compareTo(outro) == 0) {
                    System.out.println("Valor repetido");
                } else {
                    if (aux.getInfo().compareTo(outro) > 0) {
                        if (aux.getLeft() == null) {
                            aux.getLeft().setInfo(outro);
                        } else {
                            aux = aux.getLeft();
                        }
                    } else {
                        if (aux.getRight() == null) {
                            aux.getRight().setInfo(outro);
                        } else {
                            aux = aux.getRight();
                        }
                    }
                }
            } while (true);
        }
    }

    public TreeB<Produto> menor() {
        if (this.isEmpty()) {
            return null;
        } else {
            if (raiz.getLeft() == null) {
                return raiz;
            } else {
                TreeB<Produto> aux = raiz;
                do {
                    aux = aux.getLeft();
                } while (aux.getLeft() != null);
                return aux;
            }
        }
    }

    public TreeB<Produto> maior() {
        if (this.isEmpty()) {
            return null;
        } else {
            if (raiz.getRight() == null) {
                return raiz;
            } else {
                TreeB<Produto> aux = raiz;
                do {
                    aux = aux.getRight();
                } while (aux.getRight() != null);
                return aux;
            }
        }
    }

    public void emOrdemRecursivo(){
        if(this.isEmpty()){
            System.out.println("Lista vazia");
        }else{
            TreeB<Produto> aux;
            Queue<Produto> fila = new Queue<Produto>();
        }
    }

}