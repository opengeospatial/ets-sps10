/*
 * functions.java
 *
 * Created on November 26, 2007, 11:53 AM
 *
 * This softare was created under contract with the US Government
 */
package org.opengis.cite.sps.functions;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author Northrop Grumman IT TASC
 */
public class functions {
    
    public static String getCurrentDateTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        Date currentDateTime = cal.getTime();
        return dateFormat.format(currentDateTime);
    }
    
}
