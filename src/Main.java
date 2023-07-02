import java.util.HashSet;
import java.util.Set;


public class Main {
  private static   StringBuilder str =new StringBuilder();
    private static String word="aabcdcb";
    private static String word1="bananas";
    public static void main(String[] args) {
        Set<String> words = allWordsFromString(word);
        Set<String> allPalindrome = palindromeOrNot(words);
        String s = longestPalindrome(allPalindrome);
        System.out.println(s);



    }
    private static Set<String> allWordsFromString(String s){

        Set<String>strings=new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {


                StringBuilder append = str.append(s.charAt(j));
                if (str.length() != 1) {
                    strings.add(append.toString());

                }
            }
            str.setLength(0);
        }
        for (int i = s.length()-1; i >=0 ; i--) {
            for (int j = i; j >=0 ; j--) {
                StringBuilder append = str.append(s.charAt(j));
                if (str.length() != 1) {
                    strings.add(append.toString());

                }
            }

            str.setLength(0);

        }

        return strings;
    }
    private static Set<String>palindromeOrNot(Set<String>words){

        Set<String>palindrome=new HashSet<>();
        for (String s:words) {
            for (int i = s.length()-1; i >=0 ; i--) {
                StringBuilder append = str.append(s.charAt(i));
                if (s.equals(append.toString())){
                    palindrome.add(s);
                }

            }
            str.setLength(0);

        }
        return palindrome;

    }
    private static String longestPalindrome(Set<String>longest){
        int i=0;
        String z="";
        for (String s:longest) {
            if (s.length()>i){
                z=s;
                i=s.length();
            }


        }
        return z;
    }

}