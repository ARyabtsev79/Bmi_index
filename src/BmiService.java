public class BmiService {

    public double calculate(double height, double weight) {
        double bodymassindex;
        bodymassindex = weight / (height * height);
        return bodymassindex;
    }
}
