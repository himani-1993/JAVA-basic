package com.webonise.demo.demo1;

import com.googlecode.gwtphonegap.client.geolocation.Geolocation;
import com.googlecode.gwtphonegap.client.geolocation.GeolocationCallback;
import com.googlecode.gwtphonegap.client.geolocation.GeolocationOptions;
import com.googlecode.gwtphonegap.client.geolocation.GeolocationWatcher;
import com.maxmind.geoip2.record.Location;
import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocation;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LocationFinder {

    private static final String DATE_FORMAT = "MMM dd, YYYY";
    private static final String TIME_FORMAT = "HH:mm";

    public static String ZULU_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    public static void main(String[] args) {
        splitDateTime();
/*        String[] locales = Locale.getISOCountries();

        for (String countryCode : locales) {

            Locale obj = new Locale("", countryCode);

            System.out.println("Country Code = " + obj.getCountry()
                    + ", Country Name = " + obj.getDisplayCountry());

        }

        System.out.print(getCountryCode("India"));*/
    }

    private static String getCountryCode(String geocodeCountry) {
        for (String country : Locale.getISOCountries()) {
            Locale locale = new Locale("", country);
            if (locale.getDisplayCountry().equals(geocodeCountry)) {
                return locale.getCountry().toLowerCase();
            }
        }
        return "";
    }

    private static void splitDateTime() {

/*        Timestamp timestamp = new Timestamp(toLocalDateTime())
        SimpleDateFormat(DATE_FORMAT).format(timestamp)*/

        java.util.Date date= new java.util.Date();
        Timestamp timestamp = new Timestamp(date.getTime());

        convertTimeDateToString(timestamp).split("T");

        System.out.print(convertTimeDateToString(timestamp));
    }

    public static String convertTimeDateToString(Timestamp timestamp) {
//        DateTimeFormat.forPattern(TIME_FORMAT)
        return new SimpleDateFormat(TIME_FORMAT).format(timestamp);
    }
}
