package com.example.kiosk.level5;


import java.util.List;
import java.util.Scanner;

// 키오스크 클래스
class Kiosk {
    private List<Menu> menus;
    private Scanner scanner;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
        this.scanner = new Scanner(System.in);
    }

    // 카테고리 선택
    public void start() {
        while (true) {
            printMainMenu();
            int categoryChoice = getUserChoice();

            if (categoryChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (categoryChoice >= 1 && categoryChoice <= menus.size()) {
                Menu selectedMenu = menus.get(categoryChoice - 1);
                handleMenu(selectedMenu);
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }

    // 프로그램 시작 시 뜨는 메뉴판
    private void printMainMenu() {
        System.out.println("\n[ MAIN MENU ]");
        for (int i = 0; i < menus.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, menus.get(i).getCategoryName());
        }
        System.out.println("0. 종료      | 종료");
        System.out.print("메뉴 번호를 선택하세요: ");
    }

    // 메뉴 선택
    private void handleMenu(Menu menu) {
        while (true) {
            menu.printMenuItems();
            int itemChoice = getUserChoice();

            if (itemChoice == 0) {
                break; // 뒤로가기
            } else if (itemChoice >= 1 && itemChoice <= menu.getMenuItems().size()) {
                MenuItem selectedItem = menu.getMenuItems().get(itemChoice - 1);
                System.out.printf("선택한 메뉴: %s | W %.1f | %s%n",
                        selectedItem.getName(),
                        selectedItem.getPrice(),
                        selectedItem.getDescription());
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }

    private int getUserChoice() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.next(); // 잘못된 입력 처리
            System.out.println("숫자를 입력하세요.");
            return -1;
        }
    }
}
