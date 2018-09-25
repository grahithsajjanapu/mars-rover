package com.mars.rover;

import static com.mars.rover.Constants.EAST;
import static com.mars.rover.Constants.NORTH;
import static com.mars.rover.Constants.SOUTH;
import static com.mars.rover.Constants.WEST;
import static com.mars.rover.SetInitialValues.setPointWithDirection;

public class ProblemExecution {

    public static String findFinalLocation(String initialLocation, String steps, Point extremeValue) {
        PointWithDirection roverLocation = setPointWithDirection(initialLocation);

        for (Character step : steps.toCharArray()) {
            run(step, roverLocation, extremeValue);
        }
        return roverLocation.toString();

    }

    private static void run(Character step, PointWithDirection roverLocation, Point extremeValue) {
        switch (step) {
            case 'L':
                Character nextDir = Constants.leftDirection.get(roverLocation.getDirection());
                roverLocation.setDirection(nextDir);
                break;
            case 'R':
                Character nextRightDir = Constants.rightDirection.get(roverLocation.getDirection());
                roverLocation.setDirection(nextRightDir);
                break;
            case 'M':
                move(roverLocation, extremeValue);
                break;
            default:
                throw new NotValidStepException(step + " is not a valid step that rover can make");
        }
    }

    private static void move(PointWithDirection roverLocation, Point extremeValue) {
        Character currentDirection = roverLocation.getDirection();
        if (currentDirection.equals(NORTH) && roverLocation.getyCoordinate() < extremeValue.getyCoordinate()) {
            roverLocation.setyCoordinate(roverLocation.getyCoordinate() + 1);
        } else if (currentDirection.equals(SOUTH) && roverLocation.getyCoordinate() > 0) {
            roverLocation.setyCoordinate(roverLocation.getyCoordinate() - 1);
        } else if (currentDirection.equals(EAST) && roverLocation.getxCoordinate() < extremeValue.getxCoordinate()) {
            roverLocation.setxCoordinate(roverLocation.getxCoordinate() + 1);
        } else if (currentDirection.equals(WEST) && roverLocation.getxCoordinate() > 0) {
            roverLocation.setxCoordinate(roverLocation.getxCoordinate() - 1);
        }

    }
}
