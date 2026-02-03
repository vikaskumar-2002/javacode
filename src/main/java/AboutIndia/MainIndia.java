package AboutIndia;

public class MainIndia {
    public static void main(String[] args) {
        India India = new India();
        India.setStates("Number of states in India is 28");
        India.setUts("Number of uts in India is 8");
        System.out.println(India.getStates());
        System.out.println(India.getUts());
    }
}

