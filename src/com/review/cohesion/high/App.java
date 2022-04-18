package com.review.cohesion.high;

class Name {
    String name;
    public String getName(String name)
    {
        this.name = name;
        return name;
    }
}

class Age {
    int age;
    public int getAge(int age)
    {
        this.age = age;
        return age;
    }
}

class Number {
    int mobileno;
    public int getNumber(int mobileno)
    {
        this.mobileno = mobileno;
        return mobileno;
    }
}

class Display {
    public static void main(String[] args)
    {
        Name n = new Name();
        System.out.println(n.getName("Geeksforgeeks"));
        Age a = new Age();
        System.out.println(a.getAge(10));
        Number no = new Number();
        System.out.println(no.getNumber(1234567891));
    }
}
