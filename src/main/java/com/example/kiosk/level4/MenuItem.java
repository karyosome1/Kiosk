package com.example.kiosk.level4;

// 메뉴 항목 클래스
class MenuItem {
    private String name;
    private double price;
    private String description;

    // 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 이름 반환
    public String getName() {
        return name;
    }

    // 가격 반환
    public double getPrice() {
        return price;
    }

    // 설명 반환
    public String getDescription() {
        return description;
    }

    // 메뉴 항목 출력
    public void printMenuItem() {
        System.out.printf("%-13s | W %.1f | %s%n", name, price, description);
    }
}

