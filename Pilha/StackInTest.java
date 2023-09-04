import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class StackInTest {

    @Test
    public void Teste1() {
        Random random = new Random();
        int a = random.nextInt(0, 100);
        int b = random.nextInt(0, 100);
        StackInt x = new StackInt(2);
        StackInt y = new StackInt(1);
        x.push(a);
        x.push(b);
        x.pop();
        y.push(a);

        //Teste para avaliar a função pop;
        Assert.assertEquals(x.top(), y.top());
    }

    @Test
    public void Teste2() {
        Random random = new Random();
        int a = random.nextInt(0, 100);
        int b = random.nextInt(0, 100);
        StackInt x = new StackInt(2);
        StackInt y = new StackInt(1);
        x.push(a);
        x.push(b);
        y.push(a);

        //Teste para avaliar a função push;
        Assert.assertNotEquals(x.top(), y.top());
    }

    @Test
    public void Teste3() {
        Random random = new Random();
        int a[] = new int[3];
        for(int i =0; i< 3;i++){
            a[i] = random.nextInt(0,100);
        }
        StackInt x = new StackInt(3);
        StackInt y = new StackInt(3);
        x.push(a[0]);
        y.push(a[0]);
        y.push(a[2]);
        y.push(a[1]);
        x.push(a[1]);
        x.push(a[2]);
        x.pop();

        //Teste para avaliar a função push e pop várias vezes;
        Assert.assertEquals(x.top(), y.top());
    }

    @Test
    public void Teste4() {
        Random random = new Random();
        int a = random.nextInt(0, 100);
        int b = random.nextInt(0, 100);
        StackInt x = new StackInt(2);
        x.push(a);
        x.push(b);
        x.pop();
        x.pop();
        //Teste para avaliar a função Empty;
        Assert.assertEquals(x.top(), -1);
    }

    @Test
    public void Teste5() {
        Random random = new Random();
        int a = random.nextInt(0, 100);
        int b = random.nextInt(0, 100);
        int c = random.nextInt(0, 100);
        StackInt x = new StackInt(2);
        x.push(a);
        x.push(b);
        x.push(c);
        //Teste para avaliar a função isFull;
        Assert.assertEquals(x.top(), b);
    }

}
