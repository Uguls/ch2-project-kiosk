package lv5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 버거 메뉴 리스트 생성 및 추가
        List<MenuItem> burgerList = new ArrayList<>();
        burgerList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 음료 메뉴 리스트 생성 및 추가
        List<MenuItem> drinkList = new ArrayList<>();
        drinkList.add(new MenuItem("Cola", 1.5, "코카콜라 제로"));
        drinkList.add(new MenuItem("Cider", 1.5, "스프라이트"));

        // 전체 메뉴 카테고리 리스트 생성 및 추가
        List<Menu> menus = new ArrayList<>();
        menus.add(new Menu("Burgers", burgerList));
        menus.add(new Menu("Drinks", drinkList));

        // Kiosk 객체 생성 및 실행
        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();
    }
}
