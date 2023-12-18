
public class InvoiceTest{

    public static void main(String[] args){

        Invoice invoice1 = new Invoice("1234", "Hammer", 2, 14.95);
        Invoice invoice2 = new Invoice("5678", "Paint Brush", -5, -9.99);

        System.out.println(invoice1);
        System.out.println(invoice2);

        invoice1.setPartNum("001234");
        invoice1.setPartDesc("Yellow Hammer");
        invoice1.setQuantity(3);
        invoice1.setPrice(19.49);

        invoice2.setQuantity(3);
        invoice2.setPrice(9.49);

        System.out.println(invoice1);
        System.out.println(invoice2);
    }
}
