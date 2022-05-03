package com.example.javaAssignments.Assignment7.case4;

interface Cycle {
    void balance();
}
interface Type
{
    Cycle getType();
}
class Bicycle implements Cycle
{
    public void balance()
    {
        System.out.println("I need a stand to balance");
    }

}
class Unicycle implements Cycle
{
    public void balance()
    {
        System.out.println("I don't know how to balance");
    }
}
class Tricycle implements Cycle
{
    public void balance()
    {
        System.out.println("I can balance myself");
    }
}
class BiCycleFactory implements Type{
    public Cycle getType() {
        return new Bicycle();
    }
}
class UniCycleFactory implements Type
{
    public Cycle getType()
    {
        return new Unicycle();
    }
}
class TriCycleFactory implements Type
{
    public Cycle getType()
    {
        return new Tricycle();
    }
}

public class CycleFactories
{
    public static void get(Type g)
    {
        Cycle s = g.getType();
        s.balance();
    }
    public static void main(String[] args)
    {
        get(new BiCycleFactory());
        get(new UniCycleFactory());
        get(new TriCycleFactory());
    }
}

