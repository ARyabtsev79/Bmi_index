public class BmiService {

    public int calculate(int height, int weight) {
        int bodymassindex = weight * 100 / (height * height);
        return bodymassindex;
    }
}