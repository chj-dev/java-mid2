package chjTest.list.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
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

        int sum = 0;
        double avg;
        for(int input : inputList){
            sum += input;
        }
        avg = (double) sum / inputList.size();

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
