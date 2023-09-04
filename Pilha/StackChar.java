public class StackChar {
    private int aux;
    private char vet[];

    public StackChar(int tam) {
        this.vet = new char[tam];
        this.aux = tam;
    }

    public void push(char b) {
        if (!this.isFull()) {
            this.aux--;
            this.vet[this.aux] = b;
        } else {
            System.out.println("Lista cheia!");
        }
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        } else {
            this.aux++;
            return this.vet[this.aux - 1] = 0;
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
        if (this.aux == this.vet.length) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (this.aux == 0) {
            return true;
        }
        return false;
    }
}
