public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println('1');
        System.out.println(service.calculate(1_000_000, 12, 0.09));

        System.out.println('2');
        System.out.println(service.calculate(1_000_000, 24, 0.09));

        System.out.println('3');
        System.out.println(service.calculate(1_000_000, 36, 0.09));
    }
}
