package AboutJK;

public class MainJk {
    public static void main(String[] args) {
        Districts districts = new Districts();
        districts.setName("Doda, Kishtwar,Ramban,Udampur,Reasi,Poonch,Rajori,Jammu,Samba Kathua,Anantnag,Kulgam,Pulwama,Shopian,Budgam,Srinagar,Ganderbal,Bandipore,Baramulla,Kupwara");
        districts.setNumber(20);
        System.out.println(districts.getName());
        System.out.println(districts.getNumber());
    }
}
