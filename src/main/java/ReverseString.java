public class ReverseString {

    public static void main(String[] args) {
        String str = "This is India";
        String[] stringArray = str.split(" ");
        String temp1 = "";

//        for(String str1 : stringArray) {
//            for(int i = str1.length()-1; i<=0; i++)
//            {
//                temp = temp + str1.charAt(i);
//            }
//            temp1 = temp1 + " " + temp;
//        }


        for(String string : stringArray)
        {
            String temp = "";
            for(int i = string.length()-1; i>=0; i--)
            {
                temp = temp + string.charAt(i);
            }
            temp1 = temp1 + " " + temp;

        }
        System.out.println(temp1);


    }
}
