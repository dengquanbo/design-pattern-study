package observer.event;


import java.util.EventObject;

/**
 * 用户事件
 */
public abstract class UserEvent extends EventObject {

    public UserEvent(Object source) {
        super(source);
    }
}