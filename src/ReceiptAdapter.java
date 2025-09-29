import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReceiptAdapter implements KZTInvoice {
    private final String desc;
    private final BigDecimal totalKzt;

    public ReceiptAdapter(UsdReceipt r) {
        this.desc = r.description() + " [" + r.amountUsd() + " USD]";
        this.totalKzt = r.amountUsd().multiply(new BigDecimal("542.50")).setScale(2, RoundingMode.HALF_UP);
    }

    public ReceiptAdapter(EurReceipt r) {
        this.desc = r.description() + " [" + r.amountEur() + " EUR]";
        this.totalKzt = r.amountEur().multiply(new BigDecimal("635.00")).setScale(2, RoundingMode.HALF_UP);
    }

    @Override public BigDecimal totalKZT() { return totalKzt; }
    @Override public String description() { return desc; }
}
