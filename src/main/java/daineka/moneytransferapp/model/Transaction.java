package daineka.moneytransferapp.model;

import lombok.Getter;

public class Transaction {

    @Getter
    private final long id;
    @Getter
    private final Transfer transfer;
    private final int comission;
    @Getter
    private final String verificationCode;
    private volatile boolean isExecuted;

    public Transaction(long id, Transfer transfer, int comission, String verificationCode) {
        this.id = id;
        this.transfer = transfer;
        this.comission = comission;
        this.verificationCode = verificationCode;
    }

    public void setExecuted(boolean executed) {
        isExecuted = executed;
    }

    public int getTransferFee() {
        return comission;
    }

    public boolean isExecuted() {
        return isExecuted;
    }
}
