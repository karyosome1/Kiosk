// 제출

package com.example.kiosk.level1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 메뉴 출력 및 입력 처리
        while (true) {
            System.out.println("\n[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");

            System.out.print("메뉴 번호를 선택하세요: ");
            int choice = scanner.nextInt(); // 사용자 입력 받기

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break; // 프로그램 종료
            } else if (choice == 1) {
                System.out.println("선택한 메뉴: ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            } else if (choice == 2) {
                System.out.println("선택한 메뉴: SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            } else if (choice == 3) {
                System.out.println("선택한 메뉴: Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            } else if (choice == 4) {
                System.out.println("선택한 메뉴: Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }

        scanner.close(); // Scanner 리소스 닫기
    }
}
