public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index = service.calculate(80,183);
        System.out.println("Индекс массы тела: " + index);

        float MoreThanCurrentIndex = service.calculate(105,160);
        System.out.println("Индекс массы тела: " + MoreThanCurrentIndex);

        float LessThanCurrentIndex = service.calculate(45,170);
        System.out.println("Индекс массы тела: " + LessThanCurrentIndex);
    }
}
