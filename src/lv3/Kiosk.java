package lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체 생성
    List<MenuItem> menuItems; // 메뉴 리스트를 저장할 리스트

    public Kiosk(List<MenuItem> menuItem) {
        this.menuItems = menuItem;
    }

    // Kiosk 실행 메서드
    public void start() {
        while (true) { // 무한 루프를 사용하여 메뉴를 계속 출력
            System.out.println("[ SHAKESHACK MENU ]"); // 메뉴 타이틀 출력
            for (int i = 0; i < menuItems.size(); i++) { // 메뉴 리스트 출력
                MenuItem menuItem = menuItems.get(i);
                System.out.println((i + 1) + ". " + menuItem.name + " | W " + menuItem.price + " | " + menuItem.descriptions);
            }
            System.out.println("0. 종료      | 종료");

            try {
                int menuInput = scanner.nextInt(); // 사용자 입력 받기

                switch (menuInput) {
                    case 0 -> { // 0 입력 시 프로그램 종료
                        System.out.println("프로그램을 종료합니다");
                        System.exit(0);
                    }
                    case 1, 2, 3, 4 -> { // 사용자가 유효한 메뉴를 선택한 경우
                        MenuItem selectedItem = menuItems.get(menuInput - 1);
                        System.out.println(selectedItem.name + " | W " + selectedItem.price + " | " + selectedItem.descriptions);
                    }
                    default -> System.out.println("잘못된 입력입니다. 다시 선택해주세요."); // 잘못된 입력 처리
                }
            } catch (Exception e) { // 숫자가 아닌 입력이 들어올 경우 예외 처리
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.next(); // 잘못된 입력 제거
            }
        }
    }
}
