package com.design_patterns.client;

import com.design_patterns.component.Menu;
import com.design_patterns.component.MenuComponent;
import com.design_patterns.component.MenuItem;

public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","BREAKFAST");
		MenuComponent dinerMenu = new Menu("DINER MENU","LUNCH");
		MenuComponent cafeMenu = new Menu("CAFE MENU","DINNER");
		MenuComponent dessertMenu = new Menu("DESSERT MENU","DESSERT OF COURSE!");
		MenuComponent allMenus = new Menu("ALL MENUS","All menus combined!");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		pancakeHouseMenu.add(new MenuItem("k&B's Pancake Breakfast",
				"Pancakes with scrambled eggs and toast",
				true,
				2.99));
		pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, Sausage",
				false,
				2.99));
		pancakeHouseMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("Apple Pie","Apple Pie with a flakey crust, topped with vanilla ice cream",true,1.59));
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}
