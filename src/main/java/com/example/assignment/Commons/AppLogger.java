package com.example.assignment.Commons;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppLogger {
    public static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void info(String s){
        logger.log(Level.INFO, s);
    }
    public static void error(String s){
        logger.log(Level.SEVERE, s);
    }
    public static void warning(String s){
        logger.log(Level.WARNING, s);
    }
}
