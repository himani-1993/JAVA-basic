package com.webonise.demo.demo1;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Polygon;

public class App {

    private static final String coordinates = "[\\\"-77.95512199401855,35.267065845369366\\\",\\\"-77.95168876647949,35.257815001651736\\\",\\\"-77.93675422668457,35.25928679742892\\\",\\\"-77.9355525970459,35.264122509649674\\\",\\\"-77.95512199401855,35.267065845369366\\\"]";
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }

    private double getAreaOfPolygon(Polygon polygon) {

        double area= 0.0;
        float numberOfPoints = polygon.getNumPoints()-1; //The last vertex is the 'previous' one to the first
//        /def cordinates = polygon.exteriorRing.coordinateSequence

/*
        for (int i=0; i<=numberOfPoints; i++) {
            area = area +  (cordinates[j]+cordinates[i]) * (Y[j]-Y[i]);
            j = i;  //j is previous vertex to i
        }


*/



//        def length = ring.components && ring.components.length
        return area;
    }

/*    private Polygon generatePolygon(String[] viewPortBounds) {

        LatLng bottomLeftLatLng = getLatLng(viewPortBounds[0])
        LatLng topRightLatLng = getLatLng(viewPortBounds[1])

        GeometryFactory geometryFactory = new GeometryFactory()
        Coordinate[]  coordinates = [        new Coordinate(bottomLeftLatLng.longitude, topRightLatLng.latitude),
                new Coordinate(topRightLatLng.longitude, topRightLatLng.latitude),
                new Coordinate(topRightLatLng.longitude, bottomLeftLatLng.latitude),
                new Coordinate(bottomLeftLatLng.longitude, bottomLeftLatLng.latitude),
                new Coordinate(bottomLeftLatLng.longitude, topRightLatLng.latitude)
        ];

        Polygon polygon = geometryFactory.createPolygon(coordinates);
        polygon.setSRID(SRID);
        return polygon;
    }*/

/*    private static LatLng getLatLng(String coordinates) {
        LatLng latLang = new LatLng()
        int commaIndexValue = coordinates.lastIndexOf(",")
        latLang.setLongitude(Double.valueOf(coordinates.substring(0, commaIndexValue)))
        latLang.setLatitude(Double.valueOf(coordinates.substring(commaIndexValue + 1)))
        return latLang
    }*/

}
