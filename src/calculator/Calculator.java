package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    while (true) {

        int result = 0;

        System.out.println("첫번째 숫자를 입력해주세요: ");
        int number1 = scanner.nextInt();

        System.out.println("연산 기호를 입력해주세요: ");
        char sign = scanner.next().charAt(0);

        System.out.println("두번째 숫자를 입력해주세요: ");
        int number2 = scanner.nextInt();

        // 아래처럼 향상된 switch문을 쓸 수도 있었다. result를 앞에 선언해주고,
        // 뒤에서 간단하게 수식만 정리하는 느낌이었다. 쓰기에는 이게 더 편해보이긴 한다.

//        result = switch (sign) {
//            case '+' -> number1 + number2;
//            case '-' -> number1 - number2;
//            case '*' -> number1 * number2;
//            case '/' -> number1 / number2;
//            default -> result;
//        };

        switch (sign) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    continue;
                }
                break;
            default:
                System.out.println("올바른 연산 기호가 아닙니다.");
                continue;
        }


        System.out.println("result = " + result);

        System.out.print("다시 계산하시겠습니까? (계속하려면 아무 글자나 입력, 종료하려면 'exit' 입력): ");
        String input = scanner.next();

        if (input.equalsIgnoreCase("exit")) {
            System.out.println("계산기를 종료합니다.");
            break;
        }
    }
    }
}
