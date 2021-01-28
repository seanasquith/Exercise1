package com.company.asquith;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a city: ");
        String cityName = input.nextLine();

        System.out.println("Please enter the zipcode: ");
        int cityZip = input.nextInt();

        System.out.println("Please enter the high temperatures for the next five days: ");
        double cityHighTemp[] = new double[5];
        for (int i = 0; i < 5; i++) {
            cityHighTemp[i] = input.nextDouble();
        }

        double cityAvgHigh = (cityHighTemp[0] + cityHighTemp[1] + cityHighTemp[2] + cityHighTemp[3] + cityHighTemp[4]) / 5;

        System.out.println("City: " + cityName);
        System.out.println("Zip Code: " + cityZip);
        System.out.println("Average High Temperature: " + cityAvgHigh);
    }
}