package com.example.javaAssignments.Assignment7.case1;

public abstract class Rodent {
    Rodent(){
        System.out.println("Rodent class");
    }
    abstract void printName();
}

class Mouse extends Rodent{
    Mouse(){
        System.out.println("Mouse class");
    }

    @Override
    void printName() {
        System.out.println("You summoned a Mouse");
    }
}

class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Gerbil class");
    }

    @Override
    void printName() {
        System.out.println("You summoned a Gerbil");
    }
}

class Hamster extends Rodent{
    Hamster(){
        System.out.println("Hamster class");
    }

    @Override
    void printName() {
        System.out.println("You summoned a Hamster");
    }
}
