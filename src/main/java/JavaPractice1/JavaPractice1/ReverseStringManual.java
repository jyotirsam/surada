package JavaPractice1.JavaPractice1;

public class ReverseStringManual{
    public static void main(String[] args) {
    	 String s = "today is my interview";
         char[] result = new char[s.length()];
         int j = s.length() - 1;
         for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) == ' ') {
                 result[i] = ' ';
             } else {
                 while (s.charAt(j) == ' ') j--;
                 result[i] = s.charAt(j--);
             }
         }
         System.out.println(new String(result));
    }
}

