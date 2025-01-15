package com.example.kiosk.level4;

import java.util.ArrayList;
import java.util.List;

// 메뉴 클래스
class Menu {
    private String categoryName;
    private List<MenuItem> menuItems;

    // 생성자
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    // 메뉴 항목 추가
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName;
    }

    // 메뉴 항목 리스트 반환
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // 메뉴 항목 출력
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
