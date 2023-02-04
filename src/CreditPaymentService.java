public class CreditPaymentService {
    public double calculate(int sum, int months, double percentage) {
        return sum * (percentage + (percentage / (1 + percentage) * months -1));

    }
}
