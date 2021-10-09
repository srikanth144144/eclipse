package com.test;
import org.apache.log4j.Logger;
public class Log4jtest {
final static Logger logger = Logger.getLogger(Log4jtest.class);
public static void main(String[] args) {

logger.debug("This is debug: "+"parameter/exception object");

logger.info("This is info: "+"parameter/exception object");

logger.warn("This is warn: "+"parameter/exception object");

logger.error("This is error: "+"parameter/exception object");

logger.fatal("This is fatal: "+"parameter/exception object");
}

}
