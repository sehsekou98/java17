package tools;

public class Birthday extends Cake{
    private int candles;

    public Birthday() {
        super("chocolate");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

}
