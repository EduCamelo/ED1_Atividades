public class CadastroProduto {
    private int cont;
    private Produto[] dados;

    public CadastroProduto(int x) {
        dados = new Produto[x];
    }

    public boolean isFull() {
        if (this.cont == this.dados.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (this.cont == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void cadastro(Produto a) {
        if (this.isFull() == true) {
            System.out.println("\nLista cheia! Inserção não efetuada!");
        } else {
            int i = busca(a);
            if (i == -1) {
                bubblesort();
                this.dados[this.cont] = a;
                this.cont++;
                System.out.println("\nProduto cadastrado com sucesso!");
            } else {
                System.out.println("\nEsse produto já foi cadastrado!");
            }
        }
    }

    public void exibir() {
        int i;
        if (this.isEmpty() == true) {
            System.out.println("\nLista vazia");
        } else {
            for (i = 0; i < this.cont; i++) {
                System.out.println(this.dados[i]);
            }
        }
    }

    public void exibirProduto(Produto a) {
        if (this.isEmpty() == true) {
            System.out.println("\nLista vazia");
        } else {
            int i = busca(a);
            if (i != -1) {
                System.out.println(this.dados[i]);
            } else {
                System.out.println("\nProduto não cadastrado");
            }
        }
    }

    public void alterarPreco(Produto a, int percente, int operacao) {
        if (this.isEmpty() == true) {
            System.out.println("\nLista vazia");
        } else {
            int i = busca(a);
            if (i != -1) {
                if (operacao == 1) {
                    this.dados[i].aplicarAumento(percente);
                } else {
                    this.dados[i].aplicarDesconto(percente);
                }
                System.out.println("\nOperação feita com sucesso!");
            }

            else {
                System.out.println("\nProduto não cadastrado");
            }

        }
    }

    public void estoque(Produto a, int att) {
        if (this.isEmpty() == true) {
            System.out.println("\nLista vazia");
        } else {
            int i = busca(a);
            if (i != -1) {
                this.dados[i].atualizarEstoque(att);
                System.out.println("\nEstoque atualizado com sucesso!");

            } else {
                System.out.println("\nProduto não cadastrado");
            }
        }
    }

    public void vender(Produto a, int qtd) {
        if (this.isEmpty() == true) {
            System.out.println("\nLista vazia");
        } else {
            int i = busca(a);
            if (i != -1) {
                if (this.dados[i].getQtd() > qtd) {
                    this.dados[i].atualizarEstoque(qtd*-1);
                    System.out.println("\nVenda feita com sucesso!");
                } else {
                    System.out.println("\nQuantidade insuficiente");
                }
            } else {
                System.out.println("\nProduto não cadastrado");
            }
        }
    }

    public int busca(Produto a) {
        for (int i = 0; i < cont; i++) {
            if (this.dados[i].compareTo(a) == 0) {
                return i;
            }
        }
        return -1;
    }

    public void remover(Produto a) {
        int i = busca(a);
        if (i != -1) {
            this.dados[i] = null;
            bubblesort();
        } else {
            System.out.println("\nProduto não encontrado");
        }
    }

    public void bubblesort() {
        Produto aux;
        for (int i = 0; i < cont - 1; i++) {
            for (int j = 0; j < cont - i - 1; j++) {
                if (dados[j].compareTo(dados[j + 1]) > 0) {
                    aux = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = aux;
                }
            }
        }
    }

}
