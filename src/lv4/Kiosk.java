package lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체
    List<Menu> menus; // 메뉴 카테고리 리스트

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        while (true) {
            System.out.println("\n[ Main MENU ]"); // 메인 메뉴 출력

            // 카테고리 목록 출력
            for (int i = 0; i < menus.size(); i++) {
                Menu menuItem = menus.get(i);
                System.out.println((i + 1) + ". " + menuItem.category);
            }
            System.out.println("0. 종료");

            try {
                int categoryInput = scanner.nextInt(); // 카테고리 선택 입력

                switch (categoryInput) {
                    case 0 -> { // 0 입력 시 프로그램 종료
                        System.out.println("프로그램을 종료합니다");
                        System.exit(0);
                    }
                    case 1, 2 -> { // 유효한 카테고리 선택
                        Menu menu = menus.get(categoryInput - 1);
                        menu.printMenu(); // 선택한 카테고리의 메뉴 출력

                        int menuInput = scanner.nextInt(); // 메뉴 선택 입력
                        if (menuInput == 0) { // 사용자가 '뒤로가기' 선택 시 카테고리 선택으로 돌아감
                            break;
                        }
                        // 유효한 메뉴 선택 시 해당 메뉴 정보 출력
                        MenuItem menuItem = menu.menuItems.get(menuInput - 1);
                        System.out.println("선택한 메뉴: " + menuItem.name + " | W " + menuItem.price + " | " + menuItem.descriptions);
                    }
                    default -> System.out.println("잘못된 입력입니다. 다시 선택해주세요."); // 잘못된 카테고리 입력 처리
                }
            } catch (Exception e) { // 숫자가 아닌 값이 입력되었을 경우 예외 처리
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.next(); // 입력 버퍼 정리
            }
        }
    }
}
