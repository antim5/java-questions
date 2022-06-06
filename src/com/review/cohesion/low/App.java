package com.review.cohesion.low;

// COPY
class Contact {
    private String name;
    String mobileNum;
    private int debtAmount;
    int timesCalled;
    String email; // to be implemented
    int timesEmailed; // to be implemented

    public Contact(String name, String mobileNum, int debtAmount) {
        this.name = name;
        this.mobileNum = mobileNum;
        this.debtAmount = debtAmount;
    }

    public void makeCall(String n) throws Exception {
        System.out.printf("Calling %s", n);
        // TODO: perform external call here
        boolean dialFailed = false;
        if (dialFailed == true) {
            throw new Exception("dial_failed");
        }
    }
}

class App {
    public static void main(String[] args) {
        Contact contact = new Contact("Marie J. Hoppe", "865-749-8540", 1200);
        contact.timesCalled++;
        try {
            contact.makeCall(contact.mobileNum);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}