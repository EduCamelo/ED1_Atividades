public class Queue<T> {
    private T[] queue;
    private int quant;

    public void enqueue(T n) {
        this.queue[this.quant] = n;
        quant++;
    }

    public T dequeue() {
        T temp;
        T save = this.queue[0];
        for (int i = 0; i < this.queue.length; i++) {
            temp = this.queue[i];
            if (i != 0) {
                this.queue[i - 1] = temp;
            }
        }
        quant--;
        return save;
    }

    public T head() {
        return this.queue[0];
    }

    public boolean isFull() {
        return this.quant == this.queue.length;
    }

    public boolean empty() {
        return this.quant == 0;
    }
}
