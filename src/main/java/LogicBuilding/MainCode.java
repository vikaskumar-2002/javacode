package LogicBuilding;

import java.util.Scanner;

public class MainCode {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter your gender");
        String name=sc.nextLine();
    GenderCheck genderCheck = new GenderCheck();
    genderCheck.setGender(name);
    genderCheck.GenderCheck();
    }
}
