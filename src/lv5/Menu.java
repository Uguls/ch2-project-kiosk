package lv5;

import java.util.List;

public class Menu {
    private String category; // 메뉴 카테고리 이름
    private List<MenuItem> menuItems; // 해당 카테고리의 메뉴 리스트

    public Menu(String category, List<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }

    // 카테고리 이름 반환
    public String getCategory() {
        return category;
    }

    // 메뉴 리스트 반환
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // 카테고리 내 메뉴 출력 메서드
    public void printMenu() {
        System.out.println("\n[ " + category + " MENU ]"); // 카테고리명 출력
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menuItem = menuItems.get(i);
            System.out.println((i + 1) + ". " + menuItem.getName() + " | W " + menuItem.getPrice() + " | " + menuItem.getDescriptions());
        }
        System.out.println("0. 뒤로가기"); // 뒤로가기 옵션 출력
    }
}
