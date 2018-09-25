package com.mars.rover;

import java.util.List;

public class MarsRoverApplication {

    public static void main(String[] args) {

        String filePath = "****root path***/inputFile.txt";
        Problem problem = new Problem();
        List<String> resultList = problem.start(filePath);

        resultList.forEach(System.out::println);
    }

}
