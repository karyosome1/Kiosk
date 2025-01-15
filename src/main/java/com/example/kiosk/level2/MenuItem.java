// 제출

package com.example.kiosk.level2;

// 개별 음식 항목을 관리하는 클래스
public class MenuItem {

    // 멤버 변수
    private String name;
    private double price;
    private String description;

    // 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void printMenuItem() {
        System.out.printf("%-13s | W %.1f | %s%n", name, price, description);
    }
}

