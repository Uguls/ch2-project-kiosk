package lv5;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in);
    private final ArrayList<Menu> menus;

    public Kiosk(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        while (true) {
            System.out.println("\n[ Main MENU ]");
            
            // 카테고리 출력
            for (int i = 0; i < menus.size(); i++) {
                Menu menuItem = menus.get(i);
                System.out.println(i + 1 + ". " + menuItem.getCategory());
            }
            System.out.println("0. 종료");

            int categotyInput = scanner.nextInt();

            switch (categotyInput) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
                }
                case 1, 2 -> {
                    Menu menu = menus.get(categotyInput - 1);
                    menu.printMenu();
                    int menuInput = scanner.nextInt();
                    if (menuInput == 0) {
                        break;
                    }
                    MenuItem menuItem = menu.getMenuItems().get(menuInput - 1);
                    System.out.println("선택한 메뉴: " + menuItem.getName() + " | W " + menuItem.getPrice() + " | " + menuItem.getDescriptions());
                }
            }
        }
    }
}
