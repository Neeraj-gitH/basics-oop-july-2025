package interfaceExample;

public class SampleClass implements SampleInterface,SampleInterface2{
    @Override
    public void sample1() {
        System.out.println("value of pqr is : "+SampleInterface.pqr);
        System.out.println("value of xyz is : "+SampleInterface.xyz);
        System.out.println("sample1 implementation in SampleClass");
    }

    @Override
    public void sample2() {
        System.out.println("value of abc is : "+SampleInterface.abc);
        System.out.println("value of mno is : "+SampleInterface.mno);
        System.out.println("sample2 implementation in SampleClass");
    }

    @Override
    public void sample3() {
        System.out.println("sample3 implementation in SampleClass");
    }
}