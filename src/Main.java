public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float totalBmi = service.calculate(1.50f, 50);
        System.out.println(totalBmi);
    }
}
