package LogicBuilding;

public class GenderCheck {
    private String gender;
    private String person;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public void GenderCheck() {
        if (gender.equals("vikas")) {
            System.out.println("True");
        } else {
            System.out.println("false");

        }
    }
}