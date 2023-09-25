public class StackInt {
    private int aux;
    private LSENode vet;
    private int valorMax;

    public StackInt(){
        this.valorMax = 10;
    }

    public StackInt(int valorMax){
        this.valorMax = valorMax;
    }

    public void push(Integer valor) {
        LSENode novo;
        novo = new LSENode(valor);
        if (this.isEmpty() == true) {
            this.vet = novo;
        } else {
            novo.setProx(this.vet);
            this.vet = novo;
        }
        System.out.println("Inserção efetuada.");
        aux++;
    }

    public void pop() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            this.vet = this.vet.getProx();
            System.out.println("Remoção efetuada!");
            aux--;
        }
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        } else {
            return this.vet.getInfo();
        }
    }

    public boolean isEmpty() {
        return this.vet == null;
    }

    public boolean isFull() {
        return valorMax == aux ;
    }

}