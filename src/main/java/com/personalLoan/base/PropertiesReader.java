package com.personalLoan.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	 public static Properties config = new Properties();

	 

     public static Properties readProp() {

                     FileInputStream fis = null;

                     try {

                                     fis = new FileInputStream(System.getProperty("user.dir")

                                                                     + "/src/test/resources/config/Config.properties");

                                     config.load(fis);

                     } catch (IOException e) {

                                     System.err.println(e.getMessage()+"\n\n"+e.getStackTrace());

                                     // log.warn(e.getMessage());//added for logging

                     }

                     return config;

     }



     public static String getPropertyValue(String prop) {

                     String propertyValue = null;

                     try {

                                     propertyValue = readProp().getProperty(prop);

                                     if (propertyValue.isEmpty()) {

                                                     throw new NullPointerException();

                                     }

                     } catch (Exception e) {

                     System.err.println(e.getMessage()+"\n\n"+e.getStackTrace());

                                     // log.info(e.getMessage() + " for property: " + prop);//added for

                                     // logging

                     }

                     return propertyValue;

     }

    

}

