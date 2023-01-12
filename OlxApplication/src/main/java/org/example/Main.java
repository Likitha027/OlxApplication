package org.example;

public class Main {
    public static void main(String[] args) {
        Buyer B= new Buyer();
        B.setUserName("Lokesh");
        B.setMobileNum(987654321);
        B.setPropertyType("Apartment");
        B.setBudget(15000.0);
        B.setLocation("NewDelhi");

        Seller S = new Seller();
        S.setOwnerName("Santhosh");
        S.setPropertyType("Apartment");
        S.setArea(1000);
        S.setFurnishing("Semi Furnishing");
        S.setPropertyFacing("west");
        S.setPropertyLocation("New Delhi");
        S.setProjectName("Shubh Homes");

        System.out.println("User Name:"+B.getUserName());
        System.out.println("Property Type:" +B.getPropertyType());
        System.out.println("User Mobile Number:" +B.getMobileNum());
        System.out.println("Property Budget:" +B.getBudget());
        System.out.println("Property Location:" +B.getLocation());
        System.out.println(" ");
        System.out.println("Property Owner Name:" +S.getOwnerName());
        System.out.println("Property Type:"+S.getPropertyType());
        System.out.println("Property Area:"+S.getArea());
        System.out.println("Property furnishing status:"+S.getFurnishing());
        System.out.println("Property Facing:" +S.getPropertyFacing());
        System.out.println("Property Location:" +S.getPropertyLocation());
        System.out.println("Property Project Name:"+S.getProjectName());



    }
}