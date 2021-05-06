package org.clb.util.myexception;

import org.clb.util.enuma.ErrorCode;

public class WrongFactoryException extends Exception {
    public final static String code= ErrorCode.WrongFactory.getCode();
    public WrongFactoryException() {
        super();
    }

    public WrongFactoryException(String message) {
        super(message);
    }

    public WrongFactoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongFactoryException(Throwable cause) {
        super(cause);
    }

    public static String getCode() {
        return code;
    }
}
