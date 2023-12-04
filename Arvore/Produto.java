public class Produto implements Comparable <Produto> {
    public Produto(String codigo) {
        this.codigo = codigo;
    }


    private String codigo;
    private String descricao;
    private String fornecedor;
    private int qtd;
    private double preco;

    public Produto(String codigo, String descricao, String fornecedor, double preco, int qtd) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.qtd = qtd;
        this.preco = preco;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getFornecedor() {
        return fornecedor;
    }


    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }


    public int getQtd() {
        return qtd;
    }


    public void setQtd(int qtd) {
        this.qtd = qtd;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    
    public int compareTo(Produto outro) {
        return this.getCodigo().compareTo(outro.getCodigo());
    }


    @Override
    public String toString() {
        return "\nCodigo: " + this.codigo + "\nDescricao=" + this.descricao + "\nFornecedor:" + this.fornecedor + "\nQuantidade em estoque" + this.qtd
                + "\nPreço: " + this.preco + "]";
    }
}
