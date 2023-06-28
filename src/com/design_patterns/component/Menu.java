package com.design_patterns.component;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
	List<MenuComponent> menuComponenets = new ArrayList<>();
	String name;
	String description;
	public Menu(String name,String description) {
		this.name=name;
		this.description=description;
	}
	public void add(MenuComponent menuComponent) {
		menuComponenets.add(menuComponent);
	}
	public void remove(MenuComponent menuComponent) {
		menuComponenets.remove(menuComponent);
	}
	public MenuComponent getChild(int i) {
		return menuComponenets.get(i);
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", "+getDescription());
		System.out.println("-------------------------------");
		for(MenuComponent menuComponent : menuComponenets) {
			menuComponent.print();
		}
	}

}
