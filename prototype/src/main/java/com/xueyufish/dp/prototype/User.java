
package com.xueyufish.dp.prototype;

/**
 * @author xueyufish
 */
public class User implements Cloneable {

    private String userName;

    private String password;

    public User() {
        System.out.println("user constructor.");
    }

    @Override
    public Object clone() {
        User user = null;
        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
