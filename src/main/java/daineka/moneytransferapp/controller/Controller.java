package daineka.moneytransferapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import daineka.moneytransferapp.logger.Logger;
import daineka.moneytransferapp.model.ConfirmOperation;
import daineka.moneytransferapp.model.Transfer;
import daineka.moneytransferapp.service.Service;

@RestController
@RequestMapping("/")
public class Controller {

    private final Service service;
    private final Logger logger;

    public Controller(Service service, Logger logger) {
        this.service = service;
        this.logger = logger;
    }

    @PostMapping("transfer")
    public Object transfer(@RequestBody Transfer transfer) {
        return service.runTransaction(transfer, logger);
    }

    @PostMapping("confirmOperation")
    public Object confirmOperation(@RequestBody ConfirmOperation confirmOperation) {
        return service.confirmOperation(confirmOperation, logger);
    }
}
