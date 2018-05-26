package com.xueyufish.dp.prototype;

import lombok.Data;

/**
 * @author xueyufish
 */
@Data
public class User implements Cloneable {

	private String userName;
	private String password;

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
}
