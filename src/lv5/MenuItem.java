package lv5;

public class MenuItem {
    private String name; // 메뉴 이름
    private double price; // 메뉴 가격
    private String descriptions; // 메뉴 설명

    public MenuItem(String name, double price, String descriptions) {
        this.name = name;
        this.price = price;
        this.descriptions = descriptions;
    }

    // 메뉴 이름 반환
    public String getName() {
        return name;
    }

    // 메뉴 가격 반환
    public double getPrice() {
        return price;
    }

    // 메뉴 설명 반환
    public String getDescriptions() {
        return descriptions;
    }
}
