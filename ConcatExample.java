public class ConcatExample{
    public static void main(String args[]){
        String s1="java string";


        s1=s1.concat(" is immutable so assign it explicitly");
        System.out.println(s1);
        String str1 = "Hello";
        String str2 = "Java";
        String str3 = "Reader";
        // Concatenating one string
        String str4 = str1.concat(str2);
        System.out.println(str4);
        // Concatenating multiple strings
        String str5 = str1.concat(str2).concat(str3);
        System.out.println(str5);
        String str6 = str1.concat(" ").concat(str2).concat(" ").concat(str3);
        System.out.println(str6);

        String str7 = str1.concat("!!!");
        System.out.println(str7);

        String str = "Country";
        String s = "India is my ".concat(str);

        // displaying the string
        System.out.println(s);
    }}