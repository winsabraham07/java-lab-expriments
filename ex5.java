class Payment {

    void makePayment(double amount) {
        System.out.println("Payment Amount: Rs." + amount);
    }

    void makePayment(double amount, String mode) {
        System.out.println("Payment Amount: Rs." + amount);
        System.out.println("Payment Mode  : " + mode);
    }

    void makePayment(double amount, String mode, String transactionId) {
        System.out.println("Payment Amount : Rs." + amount);
        System.out.println("Payment Mode   : " + mode);
        System.out.println("Transaction ID : " + transactionId);
    }
}

class UPIPayment extends Payment {

    void makePayment(double amount) {
        System.out.println("UPI Payment Amount: Rs." + amount);
        System.out.println("Payment processed through UPI.");
    }
}

public class ex5 {
    public static void main(String[] args) {

        UPIPayment upi = new UPIPayment();

        System.out.println("--- Compile-Time Polymorphism ---");

        upi.makePayment(1000);
        upi.makePayment(1500, "UPI");
        upi.makePayment(2000, "UPI", "TXN12345");

        System.out.println("\n--- Runtime Polymorphism ---");

        Payment payment = new UPIPayment();

        payment.makePayment(2500);
    }
}