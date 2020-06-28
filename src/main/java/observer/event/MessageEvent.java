package observer.event;

/**
 * 具体用户事件：短信事件
 */
public class MessageEvent extends UserEvent {

    public MessageEvent(Object source) {
        super(source);
    }
}