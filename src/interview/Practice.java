package interview;

import java.util.Locale;

public class Practice {
//    public void convert(){
//        String myName = "my name is maged";
////        //String newName = myName;
//
public static void main(String args[])
{
    System.out.println(capitalize("my"));
    System.out.println(capitalize("name"));
    System.out.println(capitalize("is"));
    System.out.println(capitalize("maged"));
}
    //user-defined function to capitalize the first letter also check for null string
    public static final String capitalize(String str)
    {
        if (str == null || str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }


//        System.out.println(newName);
//        String[] name = myName.split(" ");
//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);
//        System.out.println(name[3]);
//        name[0].toUpperCase(Locale.ROOT);
//        System.out.println(name[0]);
//


   // }

//    public static void main(String[] args) {
//        Practice obj = new Practice();
//        obj.convert();
//    }


}
