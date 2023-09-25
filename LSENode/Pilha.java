public class Pilha {

    private int elementos[];
    private int topo;

    public Pilha() {
        this.elementos = new int[10];
        this.topo = -1;
    }

    public void push(int a) {
        if (this.isFull()) {
            System.out.println("Pilha cheia!");
        } 
        else {
            this.topo++;
            this.elementos[this.topo] = a;
        }
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        } else {
            this.topo--;
            return this.elementos[this.topo + 1] = 0;
        }
    }

    public boolean isEmpty() {
        if (this.topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (this.topo == this.elementos.length - 1) {
            return true;
        } else {
            return false;
        }

    }

    public int top() {
        return this.elementos[this.topo];
    }
}