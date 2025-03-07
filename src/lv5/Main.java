package lv5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> burgerList = new ArrayList<>();
        burgerList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        ArrayList<MenuItem> drinkList = new ArrayList<>();
        drinkList.add(new MenuItem("Cola", 1.5, "코카콜라 제로"));
        drinkList.add(new MenuItem("Cider", 1.5, "스프라이트"));

        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new Menu("Burgers", burgerList));
        menus.add(new Menu("Drinks", drinkList));

        Kiosk kiosk = new Kiosk(menus);

        kiosk.start();
    }
}