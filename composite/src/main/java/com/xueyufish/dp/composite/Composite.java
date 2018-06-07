package com.xueyufish.dp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xueyufish
 */

public class Composite implements Component {

	private List<Component> childCompanies = new ArrayList<Component>();

	@Override
	public void print() {
		childCompanies.forEach(Component::print);
	}

	@Override
	public void add(Component component) {
		childCompanies.add(component);
	}

	@Override
	public void remove(Component component) {
		childCompanies.remove(component);
	}

	@Override
	public Component getChild(int i) {
		return this.childCompanies.get(i);
	}
}
