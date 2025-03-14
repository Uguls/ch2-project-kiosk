package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 프로그램의 메인 클래스
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        List<MenuItem> menuList = new ArrayList<>(); // 메뉴 아이템을 저장할 리스트 생성

        // 메뉴 리스트에 항목 추가
        menuList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 무한 루프를 사용하여 사용자에게 계속 메뉴를 출력
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");

            // 메뉴 리스트 출력
            for (int i = 0; i < menuList.size(); i++) {
                MenuItem menuItem = menuList.get(i);
                System.out.println(
                        (i + 1) + ". " + menuItem.name + " | W " + menuItem.price + " | " + menuItem.descriptions);
            }
            System.out.println("0. 종료      | 종료");

            try {
                int menuInput = scanner.nextInt(); // 사용자 입력 받기

                switch (menuInput) {
                    case 0 -> { // 0 입력 시 프로그램 종료
                        System.out.println("프로그램을 종료합니다");
                        System.exit(0);
                    }
                    // 각 메뉴 번호에 따라 메뉴 정보를 출력
                    case 1 -> System.out.println("ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                    case 2 -> System.out.println("SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                    case 3 -> System.out.println("Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                    case 4 -> System.out.println("Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                    default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요."); // 올바르지 않은 숫자 입력 시 안내 메시지 출력
                }
            } catch (Exception e) { // 숫자가 아닌 입력을 방지하기 위한 예외 처리
                System.out.println("잘못된 입력입니다.");
                scanner.next(); // 잘못된 입력을 제거하여 다음 입력을 받을 수 있도록 처리
            }
        }
    }
}