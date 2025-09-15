package com.advancedjava;
interface Payment {
    void pay(int amount);
}
class CreditCard implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UPI implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

class Cash implements Payment {
    public void pay(int amount) {
        System.out.println("Paid" + amount + " using Cash.");
    }
}
class PaymentService {
    public void makePayment(Payment paymentMethod,int amount) {
        paymentMethod.pay(amount); 
    }
}
public class InterfaceRealLifeExample {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.makePayment(new CreditCard(), 500);
        service.makePayment(new UPI(), 1000);
        service.makePayment(new Cash(), 200);
    }
}


