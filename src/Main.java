public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 183;
        int weight = 10100;
        int bodymassindex = service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела: " + bodymassindex);

    }
}