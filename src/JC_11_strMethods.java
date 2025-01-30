import java.sql.SQLOutput;

public class JC_11_strMethods {
    public static void main(String[] args) {
        //This Program is about String methods
        System.out.println("String methods ");
        String name="Pavan";

        //Length method
        int len= name.length();
        System.out.println(len);

        //toLowercase method
        String Temp;
        Temp = name.toLowerCase();
        System.out.println(Temp);

        //toUppercase method
        Temp=name.toUpperCase();
        System.out.println(Temp);

        //Substring method (begin with)
        Temp = name.substring(1);
        System.out.println(Temp);

        //Substring method (begin with + end at)
        Temp = name.substring(1, 4);
        System.out.println(Temp);

        //Trim Method - (Removes/Trims the extra spaces from the string)
        String str="           Namaste   ";
        Temp=str.trim();
        System.out.println(Temp);

        //Replace method
        Temp = name.replace('P','d');
        System.out.println(Temp);

        //Replace method (Replacing substring)
        Temp = name.replace("Pa","dha");
        System.out.println(Temp);

        //startsWith method - (Checks the string whether starts with the character or string and gives result as true or false)
        System.out.println(name.startsWith("Pa"));

        //endsWith method - (Checks the whether the string ends with the character or string and gives result as true or false)
        System.out.println(name.endsWith("n"));

//        charAt method - ( When we enter the position number it gives the char present at that position )
        char T = name.charAt(3);
        System.out.println(T);

        //indexOf method - ( Gives the index number of given character!)
//        int i=name.indexOf("n");
//        System.out.println(i);
        System.out.println(name.indexOf("v"));

        //indexOf
        int i=name.indexOf("n",2);
        System.out.println(i);
        System.out.println(name.indexOf("a",1));

    }
}
