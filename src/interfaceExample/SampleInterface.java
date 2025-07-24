package interfaceExample;

public interface SampleInterface {
    public int abc=100; // public static final abc=100;
    public final int xyz=300; // public static final xyz=300;
    public static int pqr=400; // public static final  pqr=400;
    int mno=900; // public static final mno=900;

    public void sample1(); // public abstract void sample1(); can't have body as well, need childcalss to haev body
    public abstract void sample2();

}
