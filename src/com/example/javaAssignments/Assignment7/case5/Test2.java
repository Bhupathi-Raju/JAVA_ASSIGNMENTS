package com.example.javaAssignments.Assignment7.case5;

public class Test2 extends Test1{  // without extending the superclass here, we can't inherit the inner class below.
    class InnerClass2 extends Test1.InnerClass1 {
    }
}
