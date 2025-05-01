package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //버거들
        Menu burgerMenu = new Menu("버거");
        burgerMenu.addItem(new MenuItems("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItems("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItems("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItems("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        //음료들
        Menu drinkMenu = new Menu("음료");
        drinkMenu.addItem(new MenuItems("Milk Shake", 4.5, "부드럽고 달콤한 바닐라 밀크쉐이크"));
        drinkMenu.addItem(new MenuItems("Strawberry Juice", 5.2, "신선한 딸기로 만든 상큼한 주스"));
        drinkMenu.addItem(new MenuItems("Tomato Juice", 4.8, "건강에 좋은 신선한 토마토 주스"));

        // 메뉴 리스트 생성
        List<Menu> menus = new ArrayList<>();
        menus.add(burgerMenu);
        menus.add(drinkMenu);

        Kiosk kiosk = new Kiosk(menus);
        kiosk.start(); // 키오스크 시작
    }
}