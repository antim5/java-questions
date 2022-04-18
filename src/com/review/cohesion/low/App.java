package com.review.cohesion.low;

class Contact {
    private String name;
    private int age;
    String mobileNum;
    private int debtAmount;
    int timesCalled;
    String email; // to be implemented
    int timesEmailed; // to be implemented

    public Contact(String name, int age, String mobileNum, int debtAmount) {
        this.name = name;
        this.age = age;
        this.mobileNum = mobileNum;
        this.debtAmount = debtAmount;
    }

    public void makeCall(String n){
        System.out.printf("Calling %s", n);
    }
}

class App {
    public static void main(String[] args)
    {
        Contact contact = new Contact("Marie J. Hoppe", 26, "865-749-8540", 1200);
        contact.timesCalled++;
        contact.makeCall(contact.mobileNum);
    }
}