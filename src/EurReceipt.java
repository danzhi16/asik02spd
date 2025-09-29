import java.math.BigDecimal;

public class EurReceipt {
    private final String description;
    private final BigDecimal amountEur;

    public EurReceipt(String description, BigDecimal amountEur) {
        this.description = description;
        this.amountEur = amountEur;
    }

    public String description() { return description; }
    public BigDecimal amountEur() { return amountEur; }
}
