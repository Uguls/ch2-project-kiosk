package lv5;

public class MenuItem {
    private String name;
    private double price;
    private String descriptions;

    public MenuItem(String name, double price, String descriptions) {
        this.name = name;
        this.price = price;
        this.descriptions = descriptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
