package com.proserus.stocks.bo.utils;

import java.util.Arrays;

public class LoggerUtils {

    public static boolean validateCalledFromLogger() {
        return new Throwable().getStackTrace()[2].getClassName().equals("org.slf4j.helpers.MessageFormatter");
    }

    public static String callerException() {
        return Arrays.toString(new Throwable().getStackTrace());
    }
}
