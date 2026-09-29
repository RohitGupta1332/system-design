public class Main {

    public static void main(String[] args){
        PaymentService service = new PaymentService(new Debitcard());

        service.pay(8997.87);

        service = new PaymentService(new UPI());
        service.pay(9869.98);   
    }
    
}
