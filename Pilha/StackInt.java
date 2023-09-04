public class StackInt {
    private int aux;
    private int vet[];

    public StackInt(int tam) {
        this.vet = new int[tam];
        this.aux = -1;
    }

    public StackInt() {
        int tam = 10;
        this.vet = new int[tam];
        this.aux = -1;
    }

    public void push(int b) {
        if (!this.isFull()) {
            this.aux++;
            this.vet[this.aux] = b;
        } else {
            System.out.println("Lista cheia!");
        }
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        } else {
            this.aux--;
            return this.vet[this.aux+1] = 0;
        }
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        } else {
            return this.vet[this.aux];
        }
    }

    public boolean isEmpty() {
        return aux == -1;
    }

    public boolean isFull() {
        return aux == vet.length-1;
    }

}