package lv5;

import java.util.ArrayList;

public class Menu {
    private String category;
    private ArrayList<MenuItem> menuItems;

    public Menu(String category, ArrayList<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<MenuItem> printMenu() {
        System.out.println("\n[ " + category + " MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menuItem = menuItems.get(i);
            System.out.println(i + 1 + ". " + menuItem.getName() + " | W " + menuItem.getPrice() + " | " + menuItem.getDescriptions());
        }
        System.out.println("0. 뒤로가기");
        return menuItems;
    }

}
