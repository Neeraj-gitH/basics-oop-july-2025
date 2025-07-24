package abstractionexample;

public abstract class AbstractDemoClass { //writing "abstract" keyword is necessary
    public abstract void demo1();// Body is not present here, it's abstract method

    public  void demo2(){//concrete method
        System.out.println("Demo2 concrete method in AbstractionDemoClass");
    }
}
