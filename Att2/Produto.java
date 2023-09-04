public class Produto implements Comparable<Produto> {
    private String codigo;
    private String descricao;
    private String fornecedor;
    private double preco;
    private int qtd;

    public Produto(String cod, String desc, String forn, double pre, int QTD) {
        this.codigo = cod;
        setDescricao(desc);
        setFornecedor(forn);
        setPreco(pre);
        setQtd(QTD);
    }

    public Produto(String cod) {
        this.codigo = cod;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void aplicarDesconto(int percente) {
        this.preco -= (percente * this.preco) / 100;
    }

    public void aplicarAumento(int percente) {
        this.preco += (percente * this.preco) / 100;
    }

    public void atualizarEstoque(int estoque) {
        this.qtd += estoque;
    }

    public void venderProduto(int QTD) {
        atualizarEstoque(QTD * -1);
    }

    public int compareTo(Produto x) {
        if (this.codigo.compareTo(x.codigo) > 0) {
            return 1;
        } else if (this.codigo.compareTo(x.codigo) < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "\nCódigo: "+ this.codigo +"\nDescrição: "+ this.descricao +"\nFornecedor: "+ this.fornecedor +"\nPreço: R$"+ this.preco +"\nQuantidade: "+ this.codigo;
    }

}
