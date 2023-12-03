public class LDEInt {
    private LDENode primeiro;
    private LDENode ultimo;
    private int quant;

    public boolean isEmpty() {
        return this.primeiro == null && this.ultimo == null && this.quant == 0;
    }

    public void inserirNoFinal(int valor) {
        LDENode novo, aux = this.primeiro;
        novo = new LDENode(valor);
        if (this.isEmpty()) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.quant++;
        } else {
            while (aux != null) {
                if (aux.getInfo() == valor) {
                    System.out.println("Valor igual");

                    break;
                } else if (aux.getProx() == null) {
                    novo.setAnt(aux);
                    aux.setProx(novo);
                    this.ultimo = novo;
                    quant++;
                    break;
                } else {
                    aux = aux.getProx();
                }
            }
        }

    }

    public void inserirNoInicio(int valor) {
        LDENode novo, aux = this.primeiro;
        novo = new LDENode(valor);
        if (this.isEmpty()) {
            this.primeiro = novo;
            this.ultimo = novo;
            quant++;
        } else {
            while (aux != null) {
                if (aux.getInfo() == valor) {
                    System.out.println("Valor igual");
                    break;
                } else if (aux.getProx() == null) {
                    novo.setProx(this.primeiro);
                    this.primeiro.setAnt(novo);
                    this.primeiro = novo;
                    quant++;
                    break;
                } else {
                    aux = aux.getProx();
                }
            }
        }
    }

    public LDENode procurar(int valor) {
        LDENode aux = this.primeiro;

        if (this.isEmpty()) {
            return null;
        } else {
            while (aux != null) {
                if (aux.getInfo() == valor) {
                    return aux;
                }
                aux = aux.getProx();
            }
            return null;
        }

    }

    public void removerNoComeco() {

        if (this.isEmpty()) {
            System.out.println("Não tem nenhum valor na lista");
        } else {
            if (this.primeiro.getProx() == null && this.ultimo.getAnt() == null) {
                this.primeiro = null;
                this.ultimo = null;
                quant--;

            } else if (this.primeiro.getProx() == this.ultimo && this.ultimo.getAnt() == this.primeiro) {
                this.primeiro = this.primeiro.getProx();
                this.primeiro.setAnt(null);
                this.ultimo.setAnt(null);
                quant--;
            } else {
                this.primeiro = this.primeiro.getProx();
                this.primeiro.setAnt(null);
                quant--;
            }
        }
    }

    public void removerNoFinal() {
        if (this.isEmpty()) {
            System.out.println("Não tem nenhum valor na lista");
        } else {
            if (this.primeiro.getProx() == null && this.ultimo.getAnt() == null) {
                this.primeiro = null;
                this.ultimo = null;
                quant--;

            } else if (this.primeiro.getProx() == this.ultimo && this.ultimo.getAnt() == this.primeiro) {
                this.primeiro = this.primeiro.getProx();
                this.primeiro.setAnt(null);
                this.ultimo.setAnt(null);
                quant--;
            } else {
                this.ultimo = this.ultimo.getAnt();
                this.ultimo.setProx(null);
                quant--;
            }
        }
    }

    public void exibirTodos() {
        LDENode aux = this.primeiro;
        if (this.isEmpty()) {
            System.out.println("Não há valor na lista para exibir");
        } else {
            while (aux != null) {
                System.out.println("Valor: " + aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void remover(int valor) {
        LDENode aux = this.primeiro, temp;
        if (this.isEmpty()) {
            System.out.println("Lista Vazia");
        } else {
            while (aux != null) {
                if (aux.getInfo() == valor) {
                    if (this.primeiro.getInfo() == valor) {
                        this.removerNoComeco();
                    } else if (this.ultimo.getInfo() == valor) {
                        this.removerNoFinal();
                        break;
                    } else if (aux == this.ultimo.getAnt()) {
                        this.ultimo.setAnt(aux.getAnt());
                        aux.getAnt().setProx(this.ultimo);
                        break;
                    } else if (aux == this.primeiro.getProx()) {
                        this.primeiro.setProx(aux.getProx());
                        aux.getProx().setAnt(this.primeiro);
                        quant--;
                        break;
                    } else {
                        temp = aux.getAnt();
                        aux = aux.getProx();
                        temp.setProx(aux);
                        aux.setAnt(temp);
                        quant--;
                        break;
                    }
                } else {
                    aux = aux.getProx();
                }
            }
        }
    }

    public LDENode getPrimeiro() {
        return this.primeiro;
    }

    public LDENode getUltimo() {
        return ultimo;
    }

    public int getQuant() {
        return quant;
    }
}
