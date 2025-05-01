package kiosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //메뉴 출력
            System.out.println("[ 메뉴 선택 ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료");

            System.out.print("메뉴 번호를 선택하세요: ");
            int categoryInput = sc.nextInt();

            if (categoryInput == 0) {
                System.out.println("주문을 종료합니다.");
                break;
            } else if (categoryInput >= 1 && categoryInput <= menus.size()) {
                Menu selectedMenu = menus.get(categoryInput - 1);

                // 2. 해당 카테고리 메뉴 출력
                int itemCount = selectedMenu.getMenuItemCount();
                System.out.println("[ " + selectedMenu.getCategoryName() + " 메뉴 ]");
                for (int i = 0; i < itemCount; i++) {
                    MenuItems item = selectedMenu.getMenuItem(i);
                    System.out.printf("%d. %s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getDescription());
                }
                System.out.println("0. 뒤로가기");

                System.out.print("메뉴 번호를 선택하세요: ");
                int itemInput = sc.nextInt();

                if (itemInput == 0) {
                    continue; // 카테고리 선택으로 다시 돌아감
                } else if (itemInput >= 1 && itemInput <= itemCount) {
                    MenuItems selItem = selectedMenu.getMenuItem(itemInput - 1);
                    System.out.println(selItem.getName() + " 를 주문하시겠습니까?");
                    System.out.printf("가격: W %.1f\n", selItem.getPrice());
                    System.out.println("설명: " + selItem.getDescription());
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }

            System.out.println();
        }

        sc.close();
    }
}