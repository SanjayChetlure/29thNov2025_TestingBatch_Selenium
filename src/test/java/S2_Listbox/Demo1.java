package S2_Listbox;

import java.util.ArrayList;
import java.util.List;

public class Demo1
{
    public static void main(String[] args)
    {
//        ArrayList<String> al=new ArrayList<>();
        List<String> al=new ArrayList<>();
        al.add("mahesh");
        al.add("ganesh");
        al.add("suresh");

        System.out.println(al);

        for(String s1:al)
        {
            System.out.println(s1.toUpperCase());
        }


        System.out.println(al.size());


    }
}
