package com.example.javaAssignments.Assignment7.case2;

public class Main {
    public static void main(String[] args){
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new UniCycle();
        cycles[1] = new BiCycle();
        cycles[2] = new TriCycle();
////        cycles[0].balance();
//         cycles[1].balance();
//         cycles[2].balance();
        /* Above function calls doesn't work as the base class
        "Cycle" doesn't have balance method.
         */
        ((UniCycle)cycles[0]).balance();
        ((BiCycle)cycles[1]).balance();
//        ((TriCycle)cycles[2]).balance(); Won't work as class TriCycle doesn't have balance method.
    }
}
