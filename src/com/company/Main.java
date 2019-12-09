package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //region Task
        // Create a program `Yellow Pages`
        //
        //user must enter company name from console
        //if company exists in your program display the company details
        //use HashMap for data storage Hashmap<companyName, company>
        //
        //company has following properties
        //	- Name
        //	- Address
        //	- Number of employees
        //	- google map pin link
        //	- website url
        //endregion

        //region Created companies
        Company company1 = new Company();
        company1.setName("ACA");
        company1.setAddress("3, Hakob Hakobyan Street, Yerevan , Armenia");
        company1.setNumberOfEmployees(10);
        company1.setWebsiteURL("https://aca.am/hy/");
        company1.setMapLink("https://www.google.ru/maps/place/ACA/@40.1988886,44.4901933,19z/data=!3m1!4b1!4m5!3m4!1s0x406abce69a1b0d77:0x31ea9da813693c2e!8m2!3d40.1988874!4d44.4907404");
        Company company2 = new Company();
        company2.setName("SFL");
        company2.setAddress("24, Azatutyan Avenue, Yerevan, Armenia");
        company2.setNumberOfEmployees(100);
        company2.setWebsiteURL("https://sflpro.com/");
        company2.setMapLink("https://www.google.ru/maps/place/SFL+LLC/@40.208222,44.5268284,17z/data=!3m1!4b1!4m5!3m4!1s0x406aa2ccf21f91db:0x3bdb56d2f44309dd!8m2!3d40.2082179!4d44.5290171");
        //endregion

        //region Performance
        Scanner scanner = new Scanner(System.in);
        String companyName = scanner.nextLine();
        HashMap<String, Company> companyHashMap = new HashMap<>();
        companyHashMap.put(company1.getName(), company1);
        companyHashMap.put(company2.getName(), company2);
        if (companyHashMap.containsKey(companyName)) {
            companyHashMap.get(companyName).print();
        }
        //endregion
    }
}
