package chjTest.list.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        System.out.println("n개의 정수를 입력하세요. (종료 0)");

        List<Integer> inputList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            inputList.add(input);
        }

        System.out.println("출력");

        for (int i = 0; i < inputList.size(); i++) {
            System.out.print(inputList.get(i));
            if (i < inputList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
