package lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MenuItem> menuList = new ArrayList<>();

        menuList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuList.size(); i++) {
                MenuItem menuItem = menuList.get(i);
                System.out.println(i + 1 + ". " + menuItem.name + " | W " + menuItem.price + " | " + menuItem.descriptions);
            }
            System.out.println("0. 종료      | 종료");
            int menuInput = scanner.nextInt();

            switch (menuInput) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
                }
                case 1 -> System.out.println("ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                case 2 -> System.out.println("SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                case 3 -> System.out.println("Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                case 4 -> System.out.println("Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            }

        }

    }
}