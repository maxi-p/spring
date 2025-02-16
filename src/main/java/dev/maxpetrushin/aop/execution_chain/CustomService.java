package dev.maxpetrushin.aop.execution_chain;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CustomService {
    Logger log = Logger.getLogger(CustomService.class.getName());

    @ToSecure
    @ToLog
    public void exec() {
        log.info("Executing Custom Service");
    }
}
