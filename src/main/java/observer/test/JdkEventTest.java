package observer.test;

import model.User;
import observer.listener.impl.MessageListener;
import observer.service.UserService;

public class JdkEventTest {

    public static void main(String[] args) {

        UserService service = new UserService();

        // 添加发送短信监听器
        service.addListeners(new MessageListener());
        // 还可以添加其他监听器...

        User user = new User("zhangsan", "123456", "15174480311");
        service.register(user);
    }
}