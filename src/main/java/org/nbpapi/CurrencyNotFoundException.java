package org.nbpapi;

public class CurrencyNotFoundException extends Exception {

    public CurrencyNotFoundException(String message) {
        super("Currency " + message + " could not be found!");
    }

}
