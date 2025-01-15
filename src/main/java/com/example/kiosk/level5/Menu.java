package com.example.kiosk.level5;


import java.util.ArrayList;
import java.util.List;

// 메뉴 클래스
class Menu {
    private String categoryName;
    private List<MenuItem> menuItems;

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getMenuItems() {
        return new ArrayList<>(menuItems); // 방어적 복사
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void printMenuItems() {
        System.out.printf("\n[ %s MENU ]%n", categoryName.toUpperCase());
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d. ", i + 1);
            menuItems.get(i).printMenuItem();
        }
        System.out.println("0. 뒤로가기");
        System.out.print("메뉴 번호를 선택하세요: ");
    }
}
