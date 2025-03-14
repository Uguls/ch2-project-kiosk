package lv4;

import java.util.List;

public class Menu {
    String category; // 메뉴 카테고리 이름
    List<MenuItem> menuItems; // 해당 카테고리에 속하는 메뉴 리스트

    public Menu(String category, List<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }

    public void printMenu() {
        System.out.println("\n[ " + category + " MENU ]"); // 카테고리명 출력
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menuItem = menuItems.get(i);
            System.out.println((i + 1) + ". " + menuItem.name + " | W " + menuItem.price + " | " + menuItem.descriptions);
        }
        System.out.println("0. 뒤로가기"); // 뒤로가기 옵션 출력
    }
}
