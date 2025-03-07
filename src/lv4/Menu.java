package lv4;

import java.util.ArrayList;

public class Menu {
    String category;
    ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu(String category, ArrayList<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }

    public ArrayList<MenuItem> printMenu() {
        System.out.println("\n[ " + category + " MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menuItem = menuItems.get(i);
            System.out.println(i + 1 + ". " + menuItem.name + " | W " + menuItem.price + " | " + menuItem.descriptions);
        }
        System.out.println("0. 뒤로가기");
        return menuItems;
    }

}
