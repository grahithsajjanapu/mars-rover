package com.mars.rover;

import java.util.HashMap;
import java.util.Map;

public class Constants {

    protected static final Character NORTH = 'N';
    protected static final Character WEST = 'W';
    protected static final Character SOUTH = 'S';
    protected static final Character EAST = 'E';

    protected static final Map<Character, Character> leftDirection;

    static {
        leftDirection = new HashMap<>();
        leftDirection.put(NORTH, WEST);
        leftDirection.put(WEST, SOUTH);
        leftDirection.put(SOUTH, EAST);
        leftDirection.put(EAST, NORTH);
    }

    protected static final Map<Character, Character> rightDirection;

    static {
        rightDirection = new HashMap<>();
        rightDirection.put(NORTH, EAST);
        rightDirection.put(EAST, SOUTH);
        rightDirection.put(SOUTH, WEST);
        rightDirection.put(WEST, NORTH);
    }
}
