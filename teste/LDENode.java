public class LDENode{
    private Integer info;
    private LDENode prox;
    private LDENode ant;
    
    public LDENode(Integer valoInteger) {
        this.info = valoInteger;
    }
    public void setInfo(Integer novoValor) {
        this.info = novoValor;
    }
    public void setProx(LDENode novoProx) {
        this.prox = novoProx;
    }
    public Integer getInfo() {
        return info;
    }
    public LDENode getProx() {
        return prox;
    }
    public void setAnt(LDENode novoAnt){
        this.ant = novoAnt;
    }
    public LDENode getAnt(){
        return this.ant;
    }
  
}
