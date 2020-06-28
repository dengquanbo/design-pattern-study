package observer.listener.impl;

import model.User;
import observer.event.MessageEvent;
import observer.event.UserEvent;
import observer.listener.UserListener;

/**
 * 具体用户监听器：发送短信监听器
 */
public class MessageListener implements UserListener {

    @Override
    public void onRegister(UserEvent event) {
        if (event instanceof MessageEvent) {

            Object source = event.getSource();
            User user = (User) source;
            System.out.println("send message to " + user.getPhoneNumber());
        }
    }
}