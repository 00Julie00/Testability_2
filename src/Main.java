public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 58;
        double height = 1.78;
        double bodyMaxIndex = service.calculate(weight, height);
        System.out.println("Индекс массы тела =" + bodyMaxIndex);
        System.out.println("Интерпритвция показателей:\n 16 и менее - Выраженный дефицит массы тела;\n 16-18 - Недостаточная (дефицит) массы тела;\n 18-25 - Норма;\n 25-30 - Избыточная масса тела;\n 30-35 - Ожирение первой степени;\n 35-40 - Ожирение второй степени;\n 40 и более - Ожирение третьей степени");

    }
}