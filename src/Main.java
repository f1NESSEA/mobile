public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int bonus = 0;
        int amountDeposit = 1100;

        if (amountDeposit > 1000) {
            bonus = amountDeposit / 100;
        } else if (amountDeposit < 1000) {
            bonus = 0;
        }
        System.out.println((balance + amountDeposit + bonus) + "RUB");
    }
}