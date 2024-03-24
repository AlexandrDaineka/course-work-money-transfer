package daineka.moneytransferapp.repository;

import daineka.moneytransferapp.model.Card;
import daineka.moneytransferapp.model.ConfirmOperation;
import daineka.moneytransferapp.model.Transaction;
import daineka.moneytransferapp.model.Transfer;

public interface Repository {
    Transaction newTransfer(Transfer transfer, int transferFee, String verificationCode);

    void confirmOperation(ConfirmOperation confirmOperation);

    Card getCard(String id);

    Transaction getTransaction(String id);
}
