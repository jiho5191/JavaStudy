package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // 상품을 입력받기 위한 Scanner 객체
        int productCount = 0;  // 현재 등록된 상품의 개수를 저장할 int 변수
        String[] productNames = new String[10];   // 상품 이름을 저장할 String 배열
        int[] productPrices = new int[10];        // 상품 가격을 저장할 int 배열
        int maxProducts = 10;   // 상품 등록 최대 개수

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                if (productCount == maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();
                scanner.nextLine();
                productCount++;     // 상품의 개수 1개 증가
            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}
