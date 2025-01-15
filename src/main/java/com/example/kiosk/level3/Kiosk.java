package com.example.kiosk.level3;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems;
    private Scanner scanner;

    // Kiosk 클래스 생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.scanner = new Scanner(System.in);
    }

    // 키오스크 프로그램 시작 메서드
    public void start() {
        while (true) {
            printMenu();
            int choice = getUserChoice();

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

    // 메뉴 출력
    private void printMenu() {
        System.out.println("\n[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d. ", i + 1);
            menuItems.get(i).printMenuItem(); // 메뉴 항목 출력
        }
        System.out.println("0. 종료      | 종료");
    }

    // 사용자 입력 받기
    private int getUserChoice() {
        System.out.print("메뉴 번호를 선택하세요: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            // System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            scanner.next(); // 버퍼 비우기 (중요!)
            return -1; // 잘못된 값 반환
        }
    }
}
