package com.example.kiosk.level5;


// 메뉴 항목 클래스
class MenuItem {
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void printMenuItem() {
        System.out.printf("%-13s | W %.1f | %s%n", name, price, description);
    }
}
