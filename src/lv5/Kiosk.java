package lv5;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final Scanner scanner = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체
    private final List<Menu> menus; // 메뉴 카테고리 리스트

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        while (true) {
            System.out.println("\n[ Main MENU ]");

            // 카테고리 목록 출력
            for (int i = 0; i < menus.size(); i++) {
                Menu menu = menus.get(i);
                System.out.println((i + 1) + ". " + menu.getCategory());
            }
            System.out.println("0. 종료");
            System.out.print("카테고리 선택: ");

            int categoryInput = readInt();

            // 종료 조건
            if (categoryInput == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 입력값 검증
            if (categoryInput < 1 || categoryInput > menus.size()) {
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                continue;
            }

            Menu selectedMenu = menus.get(categoryInput - 1);
            selectedMenu.printMenu(); // 선택한 카테고리의 메뉴 출력

            System.out.print("메뉴 선택(0은 뒤로가기): ");
            int menuInput = readInt();

            // 뒤로 가기
            if (menuInput == 0) {
                continue;
            }

            // 메뉴 항목 검증
            if (menuInput < 1 || menuInput > selectedMenu.getMenuItems().size()) {
                System.out.println("잘못된 메뉴 선택입니다. 다시 시도해주세요.");
                continue;
            }

            // 선택한 메뉴 출력
            MenuItem selectedItem = selectedMenu.getMenuItems().get(menuInput - 1);
            System.out.println("선택한 메뉴: "
                    + selectedItem.getName()
                    + " | W " + selectedItem.getPrice()
                    + " | " + selectedItem.getDescriptions());
        }
    }

    // 안전한 숫자 입력을 위한 메서드
    private int readInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.print("숫자를 입력해주세요: ");
            }
        }
    }
}
