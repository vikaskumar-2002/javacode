package COM.swapping;

public class MainCode {
    public static void main(String[] args) {
int a = 6;
int b = 4;
        {
            a = a+b;
            b = a-b;
            a = a-b;
            System.out.println(a);
            System.out.println(b);
        }
    }
}
