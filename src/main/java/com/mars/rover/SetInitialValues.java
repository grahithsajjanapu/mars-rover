package com.mars.rover;

public class SetInitialValues {

    static Point setPoint(String data) {
        String[] values = data.split("\\s+");
        Point point = new Point();
        point.setxCoordinate(Integer.valueOf(values[0].trim()));
        point.setyCoordinate(Integer.valueOf(values[1].trim()));
        return point;
    }

    static PointWithDirection setPointWithDirection(String data) {
        String[] values = data.split("\\s+");
        PointWithDirection point = new PointWithDirection();
        point.setxCoordinate(Integer.valueOf(values[0].trim()));
        point.setyCoordinate(Integer.valueOf(values[1].trim()));
        point.setDirection(values[2].trim().charAt(0));

        return point;
    }
}
