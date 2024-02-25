package Practice.Day13;

import static Practice.Day13.MessageDatabase.getMessages;
import static Practice.Day13.MessageDatabase.showDialog;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("S1lkbeard");
        User user2 = new User("luXor");
        User user3 = new User("S1lkworm");

        user1.isSubscribed(user2);
        user1.isFriend(user2);
        user1.subscribe(user2);

        user1.isSubscribed(user2);
        user1.isFriend(user2);

        user2.subscribe(user1);

        user1.isFriend(user2);

        user1.sendMessage(user2, "������, �����");
        user1.sendMessage(user2, "������?");

        user2.sendMessage(user1, "� �������");
        user2.sendMessage(user1, "����� ����� �����");
        user2.sendMessage(user1, "�� ������� �����");

        user3.sendMessage(user1, "������:)");
        user3.sendMessage(user1, "������ �������?");
        user3.sendMessage(user1, "� �� ������");

        user1.sendMessage(user3, "�����");
        user1.sendMessage(user3, "� �� ��� ��� ���������");
        user1.sendMessage(user3, "����� ����� �����");

        user3.sendMessage(user1, "�� ����");

        System.out.println(getMessages());

        showDialog(user1, user3);
    }
}
