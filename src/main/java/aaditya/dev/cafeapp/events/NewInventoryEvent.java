package aaditya.dev.cafeapp.events;

import aaditya.dev.cafeapp.domain.Beer;
import org.springframework.context.ApplicationEvent;

public class NewInventoryEvent extends ApplicationEvent {

    public NewInventoryEvent(Beer source) {
        super(source);
    }

    public Beer getBeer(){
        return (Beer) this.source;
    }
}
