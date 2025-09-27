import java.util.List;

public class InvoicePrinterAdapter implements InvoiceListPrinter {
    private final InvoicePrinter printer;

    public InvoicePrinterAdapter(InvoicePrinter printer) {
        this.printer = printer;
    }

    @Override
    public void print(List<Invoice> invoices) {
        for (Invoice invoice : invoices) {
            printer.printInvoice(invoice.format());
        }
    }
}
