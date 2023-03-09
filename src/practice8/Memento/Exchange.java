package practice8.Memento;

public class Exchange {
    private int dollars;
    private int euros;
    public Exchange(int d, int e){
        dollars = d;
        euros = e;
    }

    public void getDollars(){
        System.out.println("Долларов " + dollars);
    }

    public void getEuros(){
        System.out.println("Евро " + euros);
    }

    public void sell(){
        if (dollars > 0)
            --dollars;
    }

    public void buy(){
        if (euros > 0)
            ++euros;
    }

    public ExchangeMemento save(){
        return new ExchangeMemento(dollars, euros);
    }

    public void restore(IMemento exchangeMemento){
        dollars = exchangeMemento.getDollars();
        euros = exchangeMemento.getEuro();
    }


}
