import java.math.BigDecimal;

public class UsdReceipt {
    private final String description;
    private final BigDecimal amountUsd;

    public UsdReceipt(String description, BigDecimal amountUsd) {
        this.description = description;
        this.amountUsd = amountUsd;
    }

    public String description() { return description; }
    public BigDecimal amountUsd() { return amountUsd; }
}