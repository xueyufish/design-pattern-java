package com.xueyufish.dp.prototype;

/**
 * @author xueyufish
 */

public class Client {

	public static void main(String...args) {
		User user1 = new User();
		user1.setUserName("user1");
		user1.setPassword("123456");

		User user2 = (User)user1.clone();

		System.out.println("user1 == user2 " + (user1 == user2));
		System.out.println("user1.getClass() == user2.getClass() " + (user1.getClass() == user2.getClass()));
		System.out.println("user1.equals(user2) " + (user1.equals(user2)));
	}
}
