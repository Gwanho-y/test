package cal_lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("\n==== 계산기 메뉴 ====");
            System.out.println("1. 계산하기");
            System.out.println("2. 가장 오래된 결과 삭제");
            System.out.println("3. 종료");
            System.out.print("메뉴를 선택하세요: ");

            String input = sc.next();

            if (input.equalsIgnoreCase("exit") || input.equals("3")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (input) {
                case "1":
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    int num1 = sc.nextInt();
                    if (num1 < 0) {
                        System.out.println("음수는 입력할 수 없습니다.");
                        continue;
                    }

                    System.out.print("연산 기호를 입력해주세요: ");
                    char sign = sc.next().charAt(0);

                    System.out.print("두 번째 숫자를 입력하세요: ");
                    int num2 = sc.nextInt();
                    if (num2 < 0) {
                        System.out.println("음수는 입력할 수 없습니다.");
                        continue;
                    }

                    int result = calculator.calculate(num1, num2, sign);
                    System.out.println("계산 결과: " + result);
                    System.out.println("지금까지의 계산 결과들: " + calculator.getResults());
                    break;

                case "2":
                    calculator.removeFirstResult();
                    break;

                default:
                    System.out.println("올바른 메뉴 번호를 선택해주세요.");
                    break;
            }
        }

        sc.close();
    }
}