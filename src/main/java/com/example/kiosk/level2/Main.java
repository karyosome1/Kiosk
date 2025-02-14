// 제출

package com.example.kiosk.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.printf("%d. ", i + 1);
                menuItems.get(i).printMenuItem();
            }
            System.out.println("0. 종료      | 종료");

            System.out.print("메뉴 번호를 선택하세요: ");


            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice >= 1 && choice <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(choice - 1);
                System.out.print("선택한 메뉴: ");
                selectedItem.printMenuItem();
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }

        }

        scanner.close();
    }
}


