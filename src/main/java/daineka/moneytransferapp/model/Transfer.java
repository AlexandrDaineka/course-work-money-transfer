package daineka.moneytransferapp.model;

import lombok.Getter;

@Getter
public class Transfer {

    private final String cardFromNumber;
    private final String cardToNumber;
    private final String cardFromCVV;
    private final String cardFromValidTill;
    private final Amount amount;

    public Transfer(String cardFromNumber, String cardToNumber, String cardFromCVV, String cardFromValidTill, Amount amount) {
        this.cardFromNumber = cardFromNumber;
        this.cardToNumber = cardToNumber;
        this.cardFromCVV = cardFromCVV;
        this.cardFromValidTill = cardFromValidTill;
        this.amount = amount;
    }

}
