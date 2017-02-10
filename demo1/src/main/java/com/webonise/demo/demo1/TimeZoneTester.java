package com.webonise.demo.demo1;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.security.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;

public class TimeZoneTester {

    public static String ZULU_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    public static void main(String[] args) throws ParseException {

/*        for (String id : DateTimeZone.getAvailableIDs()) {
            StringBuilder timeZoneBuilder = new StringBuilder();
            timeZoneBuilder.append( "id "+ id + ",,, " +TimeZone.getTimeZone(id).getDisplayName());
*//*            timeZoneBuilder.append("(");
            timeZoneBuilder.append(DateTimeZone.forID(id));
            timeZoneBuilder.append(")");*//*
            System.out.println("\n" + timeZoneBuilder.toString());
        }

        for ( String id: ZoneId.getAvailableZoneIds()) {
            System.out.println(id);
        }*/
/*
        System.out.println(printDate());

        Date date = new Date();
        TimeZone timeZone = TimeZone.getTimeZone("MST");
        DateTime dateTime = new DateTime();
        System.out.println("Time " + dateTime);
        dateTime.withZone(DateTimeZone.forID("MST"));
        System.out.println("Time " + dateTime);
        */

        Date date = new Date();
        String timeZoneId = "Zulu";

        System.out.println("1. Date = " + date);
        String convertedDate = convertToTimeZone(timeZoneId, date);
        System.out.println("2. Date = " + convertedDate);


        String utcDate = convertToTimeZone("UTC", convertStringToDate(convertedDate));
        System.out.println("3. Date = " + utcDate);
        System.out.println("6. Date = " + convertBack(convertStringToDate(utcDate)));

        convertBackToTimeZone("UTC", convertStringToDate(convertedDate));

/*        String fromUTCDate = convertToTimeZone("UTC", convertStringToDate(utcDate));
        System.out.println("3. Date = " + fromUTCDate);*/

    /*    String convertedFromDate = convertToTimeZone(timeZoneId, convertStringToDate(fromUTCDate));
        System.out.println("4. Date = " + convertedFromDate);*/
    }

    public static java.sql.Timestamp printDate() {
        DateTime dateF = new DateTime();
        final String ISO_FORMAT = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(ISO_FORMAT);
        final TimeZone utc = TimeZone.getTimeZone("UTC");
        sdf.setTimeZone(utc);
        java.sql.Timestamp timeStamp = java.sql.Timestamp.valueOf((String)(sdf.format(dateF)));
        return timeStamp;
    }

    public static String convertToTimeZone(String timeZone, Date date) {
        final String ISO_FORMAT = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat dateFormat = new SimpleDateFormat(ISO_FORMAT);
        dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
        return dateFormat.format(date);
    }

    public static Date convertStringToDate(String date) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
    }

    public static String convertBack(Date date) {

        DateTimeZone dateTimeZone = DateTimeZone.forID("Pacific/Apia");

//        java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf("");
        DateTime dateTime = new DateTime(date.getTime(), dateTimeZone);

        System.out.println(dateTimeZone.getOffset(Calendar.ZONE_OFFSET));

        return dateTime.toString();
    }

    public static String convertBackToTimeZone(String timeZone, Date date) {
        final String ISO_FORMAT = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat dateFormat = new SimpleDateFormat(ISO_FORMAT);
        dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));


        DateTimeZone dateTimeZone = DateTimeZone.forID(timeZone);
        dateTimeZone.getOffset(Calendar.ZONE_OFFSET);

        DateTime dateTime = new DateTime(date.getTime(), dateTimeZone);
        DateTime newDateTime = dateTime.plus(dateTimeZone.getOffset(Calendar.ZONE_OFFSET));
        System.out.println("newDateTime" + newDateTime);
        System.out.println(newDateTime.toString(ISO_FORMAT));
        return dateFormat.format(date);
    }
}
