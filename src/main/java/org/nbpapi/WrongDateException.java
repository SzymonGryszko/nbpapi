package org.nbpapi;

public class WrongDateException extends Exception {
    public WrongDateException(String reason) {
        super(reason);
    }
}
