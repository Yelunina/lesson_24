package ait.user;

import ait.user.model.User;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("john@gmail.com", "1234");
        System.out.println(user);
        user.setEmail("jo!hn@gms.d.e.");
        System.out.println(user);
    }
}
