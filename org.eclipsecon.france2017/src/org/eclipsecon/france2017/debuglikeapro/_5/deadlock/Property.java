package org.eclipsecon.france2017.debuglikeapro._5.deadlock;

import java.util.HashMap;
import java.util.Map;

public class Property { 
    
	static final public String DEFAULT_VALUE = "..."; 
    Map<String, String> map = new HashMap<>(); 

    synchronized void set(String key, String value) { 
        synchronized (map) { 
            map.put(key, value); 
        } 
    }

    String get(String key) { 
        synchronized (map) { 
            String value = map.get(key); 
            if (value == null) { 
                value = DEFAULT_VALUE; 
                set(key, value); 
            } 
            return value; 
        } 
    } 
}