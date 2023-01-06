package org.clb.function;

import org.clb.pojo.User;

public class FuncitonIntefaceTest {

    public static void main(String[] args) {
        User user = new User();
        user.setName("aaa");
        FunctionT test2 = test(user);
        test2.test(user);
    }

    public static FunctionT test(User user) {
        return a->{
            System.out.println(user.getName().equals(a.getName()));
        };
    }
}
