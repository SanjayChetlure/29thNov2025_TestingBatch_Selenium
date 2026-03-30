package S3_Encapsulation;

public class Ex1_Encapsulation
{
    //1: declare variables globally with private access specifier
   private int num1;
   private int num2;


   //2: Initialize variables within constructor with public scope
    public Ex1_Encapsulation()
    {
        num1=10;
        num2=30;
    }

    //3: use global variables within method with public scope
    public void add()
    {
        System.out.println(num1+num2);
    }
}
