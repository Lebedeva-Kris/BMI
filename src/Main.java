public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index = service.calculate(80,183);
        System.out.println("Индекс массы тела: " + index);

        float moreThanCurrentIndex = service.calculate(105,160);
        System.out.println("Индекс массы тела: " + moreThanCurrentIndex);

        float lessThanCurrentIndex = service.calculate(45,170);
        System.out.println("Индекс массы тела: " + lessThanCurrentIndex);
    }
}
