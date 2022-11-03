package counter;

/**
 * Hello world!
 *
 */
public class Counter 
{
    int count;

    public int increment() {
        this.count++;
        return this.count;
    }

    public int decrement() {
        this.count--;
        return this.count;
    }

    public int getCount() {
        return this.count;
    }
}
