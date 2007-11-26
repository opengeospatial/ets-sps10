package org.opengis.cite.sps.functions;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class functions {
    public static String getCurrentDateTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss.fff");
        Date currentDateTime = cal.getTime();
        return dateFormat.format(currentDateTime);
    }
}