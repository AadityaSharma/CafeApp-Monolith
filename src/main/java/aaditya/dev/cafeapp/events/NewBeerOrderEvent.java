package aaditya.dev.cafeapp.events;

import aaditya.dev.cafeapp.domain.BeerOrder;
import org.springframework.context.ApplicationEvent;

public class NewBeerOrderEvent extends ApplicationEvent {

    public NewBeerOrderEvent(BeerOrder source) {
        super(source);
    }

    public BeerOrder getBeerOrder(){
        return (BeerOrder) this.source;
    }
}
