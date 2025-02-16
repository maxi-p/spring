package dev.maxpetrushin.aop.intercept_method;

import org.springframework.stereotype.Component;

@Component
public class ChangeDecision {
    private boolean CHANGE_ARGUMENT = false;
    private boolean CHANGE_RETURNED_OBJECT = false;

    public boolean isCHANGE_ARGUMENT() {
        return CHANGE_ARGUMENT;
    }

    public void setCHANGE_ARGUMENT(boolean CHANGE_ARGUMENT) {
        this.CHANGE_ARGUMENT = CHANGE_ARGUMENT;
    }

    public boolean isCHANGE_RETURNED_OBJECT() {
        return CHANGE_RETURNED_OBJECT;
    }

    public void setCHANGE_RETURNED_OBJECT(boolean CHANGE_RETURNED_OBJECT) {
        this.CHANGE_RETURNED_OBJECT = CHANGE_RETURNED_OBJECT;
    }
}
