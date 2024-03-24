package daineka.moneytransferapp.logger;

import daineka.moneytransferapp.model.Transaction;
import daineka.moneytransferapp.model.Transfer;

public interface Logger {

    void log(Transaction transaction);

    void log(Exception e, Transaction transaction);

    void log(Exception e, Transfer transfer);
}
