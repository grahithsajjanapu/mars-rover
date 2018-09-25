package com.mars.rover;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import static com.mars.rover.SetInitialValues.setPoint;

public class Problem {

    private static final Logger LOGGER = Logger.getLogger(Problem.class.getName());

    public List<String> start(String fileName) {

        //To hold the initial location, steps for each rover as key value pairs
        Map<String, String> map = new HashMap<>();
        String extremePoint = null;

        Point extremeValue = new Point();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            extremePoint = br.readLine();
            extremeValue = setPoint(extremePoint);

            String key = null;

            while ((key = br.readLine()) != null) {
                String value = br.readLine();
                map.put(key, value);
            }

        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }

        //To hold the result for each rover
        List<String> result = new ArrayList<>();

        Point finalExtremeValue = extremeValue;
        map.forEach((key, value) -> {
            String finalLocation = ProblemExecution.findFinalLocation(key, value, finalExtremeValue);
            result.add(finalLocation);
        });
        return result;
    }
}
