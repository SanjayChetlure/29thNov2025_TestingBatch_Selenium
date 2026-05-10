package S3_ImpQuestions;

public class HowToDebugCode
{
    public static void main(String[] args)
    {
        System.out.println("main method started");
        int num4=add();

        HowToDebugCode s1=new HowToDebugCode();
        int num5=s1.mult();

        System.out.println(num4);
        System.out.println(num5);

        System.out.println("main method ended");
    }

    public static int add()
    {
        int num1=10;
        int num2=20;
        int num3=num1+num2;
        return num3;
    }

    public int mult()
    {
        int num1=10;
        int num2=20;
        int num3=num1*num2;
        return num3;
    }



}
