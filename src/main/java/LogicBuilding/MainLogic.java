package LogicBuilding;

import java.util.Scanner;

public class MainLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.EvenOdd(num);


    }
}
