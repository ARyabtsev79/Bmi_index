public class BmiService {

    public int calculate(double height, double weight) {
        double bodymassindex;
        bodymassindex = weight / (height * height);
        return (int) bodymassindex;
    }
}