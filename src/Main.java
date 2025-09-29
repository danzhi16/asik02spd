import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var usd1 = new UsdReceipt("AWS (Sep)", new BigDecimal("30.00"));
        var eur1 = new EurReceipt("Figma Pro", new BigDecimal("13.00"));
        var usd2 = new UsdReceipt("Domain renewal", new BigDecimal("9.99"));

        var invoices = List.of(
                new ReceiptAdapter(usd1),
                new ReceiptAdapter(eur1),
                new ReceiptAdapter(usd2)
        );

        var sum = invoices.stream()
                .peek(i -> System.out.printf("%-36s -> %s KZT%n", i.description(), i.totalKZT()))
                .map(KZTInvoice::totalKZT)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("TOTAL: " + sum + " KZT");
    }
}
