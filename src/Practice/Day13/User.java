package Practice.Day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
        //        subscriptions = null;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
        System.out.println("Вы только что подписались на пользователя " + user);
    }

    public boolean isSubscribed(User user) {
        if (this.subscriptions.contains(user)) {
            System.out.println("Вы подписаны на пользователя " + user);
        } else {
            System.out.println("Вы не подписаны на пользователя " + user);
        }
        return this.subscriptions.contains(user);
    }

    public boolean isSubscribedWithoutSOUT(User user) {
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        if (this.isSubscribedWithoutSOUT(user) && user.isSubscribedWithoutSOUT(this)) {
            System.out.println("Вы дружите с пользователем " + user);
        } else {
            System.out.println("Вы не дружите с пользователем " + user);
        }
        return this.isSubscribedWithoutSOUT(user) && user.isSubscribedWithoutSOUT(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    public String toString() {
        return username;
    }
}
