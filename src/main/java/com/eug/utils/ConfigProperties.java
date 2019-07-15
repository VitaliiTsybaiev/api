package com.eug.utils;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

public class ConfigProperties {

    public static Properties PROPERTIES;

    static {
        PROPERTIES = new Properties();
        URL props = ClassLoader.getSystemResource("config.properties");
        try {
            PROPERTIES.load(props.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }



    //----Example of method using----
    //  ConfigProperties.getAllKeys();
    //  Set<Object> keys = ConfigProperties.getAllKeys();
    //  for(Object k:keys){
    //      String key = (String)k;
    //      System.out.println(key);
    //  }
    public static Set<Object> getAllKeys() {
        Set<Object> keys = PROPERTIES.keySet();
        return keys;

    }
}
