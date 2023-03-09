package practice8.Memento;

import java.util.Stack;

public class Memory {
    private Stack<IMemento> history;
    Exchange exchange;
    public Memory(Exchange exchange){
        this.exchange = exchange;
        history = new Stack<>();
    }
    public void backup() {
        history.push(exchange.save());
    }
    public void undo(){
        if(history.isEmpty()) return;
        exchange.restore(history.pop());
    }


}
