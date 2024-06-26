package daineka.moneytransferapp.model;

import lombok.Getter;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Card {

    @Getter
    private final String id;
    @Getter
    private final String validTill;
    @Getter
    private final String cvv;
    private final ConcurrentMap<String, Integer> currencies;

    public Card(String id, String validTill, String cvv) {
        this.id = id;
        this.validTill = validTill;
        this.cvv = cvv;
        this.currencies = new ConcurrentHashMap<>();
    }

    public Card(String id, String validTill, String cvv, ConcurrentMap<String, Integer> currencies) {
        this.id = id;
        this.validTill = validTill;
        this.cvv = cvv;
        this.currencies = currencies;
    }

    public int getBalance(String currency) {
        if (currencies.containsKey(currency)) return currencies.get(currency);
        return -1;
    }

    public void moneyIn(Amount amount) {
        currencies.put(amount.getCurrency(), currencies.get(amount.getCurrency()) + amount.getValue());
    }

    public void moneyOut(Amount amount, int comission) {
        currencies.put(amount.getCurrency(), currencies.get(amount.getCurrency()) - amount.getValue() - comission);
    }
}
