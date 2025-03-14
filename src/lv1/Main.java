package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성

        while (true) { // 무한 루프를 사용하여 메뉴를 계속 출력

            // 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]\n" +
                    "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                    "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                    "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                    "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                    "0. 종료      | 종료");

            try {
                int menuInput = scanner.nextInt(); // 사용자로부터 메뉴 번호 입력 받기
                switch (menuInput) {
                    case 0 -> {
                        System.out.println("프로그램을 종료합니다");
                        System.exit(0);
                    }
                    case 1 -> System.out.println("ShackBurger 선택");
                    case 2 -> System.out.println("SmokeShack 선택");
                    case 3 -> System.out.println("Cheeseburger 선택");
                    case 4 -> System.out.println("Hamburger 선택");
                    default -> System.out.println("잘못된 입력입니다. 다시 선택해주세요."); // 0~4 이외의 입력값 처리
                }
            } catch (Exception e) { // 숫자가 아닌 값이 입력될 경우 예외 처리
                System.out.println("잘못 입력하셨습니다.");
                scanner.next(); // 잘못된 입력값을 버퍼에서 제거
            }
        }
    }
}
