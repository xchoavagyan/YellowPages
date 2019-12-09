package com.company;

public class Company {

    // region Properties
    private String name;
    private String address;
    private int numberOfEmployees;
    private String mapLink;
    private String websiteURL;
    //endregion

    // region Constructors

    public Company(String name, String address, int numberOfEmployees, String mapLink, String websiteURL) {
        this.name = name;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
        this.mapLink = mapLink;
        this.websiteURL = websiteURL;

    }

    public Company() {
    }
    //endregion

    // region public Methods
    public void print() {
        System.out.println("------Company details------");
        System.out.println("Name: " + this.name);
        System.out.println("Number Of employees : " + this.numberOfEmployees);
        System.out.println("Address : " + this.address);
        System.out.println("Website : " + this.websiteURL);
        System.out.println("Location : " + this.mapLink);
        System.out.println("-----------------------------");
    }
    // endregion

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getMapLink() {
        return mapLink;
    }

    public void setMapLink(String mapLink) {
        this.mapLink = mapLink;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }
    //endregion
}
