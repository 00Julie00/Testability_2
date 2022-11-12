public class BmiService {
    public double calculate(int weight, double height) {
        double result = (weight / (height * height));
        return result;
    }

}
