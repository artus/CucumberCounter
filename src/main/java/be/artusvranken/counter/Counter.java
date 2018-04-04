package be.artusvranken.counter;

/**
 * A Counter is an object used to keep track of a certain amount of things. Its count can be increased, decreased and reset.
 */
public class Counter
{
    private int count;

    /**
     * Initialize a new Counter starting from zero.
     */
    public Counter()
    {
        this(0);
    }

    /**
     * Initialize a new Counter with supplied count.
     * @param count
     */
    public Counter(int count)
    {
        this.setCount(count);
    }

    /**
     * Get the current count value of the counter.
     * @return
     */
    public int getCount()
    {
        return count;
    }

    /**
     * Set the current value of the counter.
     * @param count
     */
    public void setCount(int count)
    {
        this.count = count;
    }

    /**
     * Increase the counter by 1.
     *
     * @return
     */
    public int increase()
    {
        return this.increase(1);
    }

    /**
     * Increase the counter by a supplied amount.
     * @param amount
     * @return
     */
    public int increase(int amount)
    {
        this.setCount(this.getCount() + amount);
        return this.getCount();
    }

    /**
     * Decrease the counter by 1.
     * @return
     */
    public int decrease()
    {
        return this.decrease(0);
    }

    /**
     * Decrease the counter by a supplied amount.
     * @param amount
     * @return
     */
    public int decrease(int amount)
    {
        this.setCount(this.getCount() - amount);
        return this.getCount();
    }
}