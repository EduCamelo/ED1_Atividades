public class LSENode {
    private Integer info;
    private LSENode prox;

    public LSENode(Integer valor) {
        this.info = valor;
    }

    public void setInfo(Integer novoValor) {
        this.info = novoValor;
    }

    public void setProx(LSENode novoProx) {
        this.prox = novoProx;
    }

    public Integer getInfo() {
        return this.info;
    }

    public LSENode getProx() {
        return this.prox;
    }
}