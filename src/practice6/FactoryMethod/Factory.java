package practice6.FactoryMethod;

public abstract class Factory {
    public Transport doTransport(){
        Transport transport = createTransport();
        transport.deliver();
        return  transport;
    }

    protected abstract Transport createTransport();
}
