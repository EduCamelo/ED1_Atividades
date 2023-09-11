public class QueueInt {
    private int[] queue;
    private int quant;

    public void enqueue(int n) {
        this.queue[this.quant] = n;
        quant++;
    }

    public int dequeue() {
        int temp;
        int save = this.queue[0];
        for (int i = 0; i < this.queue.length; i++) {
            temp = this.queue[i];
            if (i != 0) {
                this.queue[i - 1] = temp;
            }
        }
        quant--;
        return save;
    }

    public int head() {
        return this.queue[0];
    }

    public boolean isFull() {
        return this.quant == this.queue.length;
    }

    public boolean empty() {
        return this.quant == 0;
    }
}
