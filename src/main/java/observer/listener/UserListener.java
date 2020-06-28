package observer.listener;

import java.util.EventListener;

import observer.event.UserEvent;

/**
 * 用户监听器
 *
 * @param <E>
 */
public interface UserListener<E extends UserEvent> extends EventListener {

    void onRegister(E event);
}