import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InvoicePrinter printer = new InvoicePrinter();
        InvoiceListPrinter adapter = new InvoicePrinterAdapter(printer);

        List<Invoice> invoices = Arrays.asList(
                new Invoice("A001", 150.0),
                new Invoice("A002", 200.5)
        );
        adapter.print(invoices);
    }
}
