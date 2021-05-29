public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.83; //рост в метрах
        double weight = 101.2; //вес в килограммах
        double bodymassindex = service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела: " + bodymassindex);

    }
}
