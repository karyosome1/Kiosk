// 제출

package com.example.kiosk.level4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Menu 카테고리 생성
        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinkMenu = new Menu("Drinks");
        drinkMenu.addMenuItem(new MenuItem("Coke", 2.5, "탄산음료 콜라"));
        drinkMenu.addMenuItem(new MenuItem("Lemonade", 3.0, "레몬 맛 음료"));
        drinkMenu.addMenuItem(new MenuItem("Milkshake", 4.5, "바닐라, 초코, 딸기 밀크쉐이크"));

        Menu dessertMenu = new Menu("Desserts");
        dessertMenu.addMenuItem(new MenuItem("Ice Cream", 3.5, "바닐라, 초코, 딸기 아이스크림"));
        dessertMenu.addMenuItem(new MenuItem("Brownie", 2.9, "초콜릿 브라우니"));

        // Kiosk 객체 생성
        List<Menu> menus = new ArrayList<>();
        menus.add(burgerMenu);
        menus.add(drinkMenu);
        menus.add(dessertMenu);

        Kiosk kiosk = new Kiosk(menus);
        kiosk.start(); // 키오스크 실행
    }
}


