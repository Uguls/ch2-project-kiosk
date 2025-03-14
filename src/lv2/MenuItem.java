package lv2;

public class MenuItem {
    String name; // 메뉴 이름
    double price; // 가격
    String descriptions; // 메뉴 설명

    // 생성자
    public MenuItem(String name, double price, String descriptions) {
        this.name = name;
        this.price = price;
        this.descriptions = descriptions;
    }
}
