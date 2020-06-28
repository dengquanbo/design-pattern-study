package observer.service;

import java.util.ArrayList;
import java.util.List;

import model.User;
import observer.event.MessageEvent;
import observer.event.UserEvent;
import observer.listener.UserListener;

/**
 * 注册监听器、当用户注册的时候，触发事件； 也就是我们所说的事件环境，相当于spring中的AbstractApplicationContext
 */
public class UserService {

    private List<UserListener> listeneres = new ArrayList<>();

    /**
     * 当用户注册的时候，触发发送短信事件 相当于事件源
     *
     * @param user
     */
    public void register(User user) {

        System.out.println("插入用户信息：" + user + " 到数据库");
        UserEvent event = new MessageEvent(user);
        publishEvent(event);

    }

    public void publishEvent(UserEvent event) {

        for (UserListener listener : listeneres) {
            listener.onRegister(event);
        }

    }

    public void addListeners(UserListener listener) {
        this.listeneres.add(listener);
    }
}