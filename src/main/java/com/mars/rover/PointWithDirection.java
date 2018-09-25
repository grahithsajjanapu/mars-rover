package com.mars.rover;

public class PointWithDirection {

    private Integer xCoordinate;
    private Integer yCoordinate;
    private Character direction;

    public Integer getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(Integer xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public Integer getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(Integer yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Character getDirection() {
        return direction;
    }

    public void setDirection(Character direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "PointWithDirection{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", direction=" + direction +
                '}';
    }
}
