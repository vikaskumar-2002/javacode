package DataTypes;

public class MainDetail {
    public static void main(String[] args) {
        Details details = new Details();
        details.setName("vikas Kumar");
        details.setAccountNumber(123456789101112L);
        System.out.println(details.getName());
        System.out.println(details.getAccountNumber());
    }
}
