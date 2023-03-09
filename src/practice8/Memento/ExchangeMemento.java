package practice8.Memento;

public class ExchangeMemento implements IMemento{
    private int dollars;
    private int euros;
    public ExchangeMemento(int d, int e){
        this.dollars = d;
        this.euros = e;
    }

    @Override
    public int getDollars() {
        return dollars;
    }

    @Override
    public int getEuro() {
        return euros;
    }
}
