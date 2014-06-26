package com.proserus.stocks.bo.utils;

import java.util.Arrays;

public class LoggerUtils {

	public static boolean validateCalledFromLogger() {
		return Arrays.toString((new Throwable().getStackTrace())).contains("org.slf4j.impl.Log4jLoggerAdapter.");
	}

	public static String callerException() {
		return Arrays.toString(new Throwable().getStackTrace());
	}
}
