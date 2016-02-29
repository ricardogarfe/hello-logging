package org.ricardogarfe.logging;

import org.apache.log4j.Logger;

public class LoggingApp {

  public static void main(String[] args) {

    Logger logger = Logger.getLogger(LoggingApp.class);

    final String message = "Hello logging!";
    logger.trace(message);
    logger.debug(message);
    logger.info(message);
    logger.warn(message);
    logger.error(message);

  }

}
