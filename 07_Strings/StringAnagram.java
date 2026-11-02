import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1st String : ");
        String s1 = in.nextLine().toUpperCase();
        System.out.print("2nd String : ");
        String s2 = in.nextLine().toUpperCase();
        // boolean flag = true ;
        // if(s1.length() != s2.length()){
        //     System.out.println("Given String's are not anagrams.");
        // }
        // for(int i = 0 ; i<s1.length() ; i++){

        //     for(int j = 0 ; j<s2.length() ; j++){
        //         if(s1.toUpperCase().charAt(i) == s2.toUpperCase().charAt(j)){
        //             n = 
        //             break;
        //         }
        //     }
        //     if(flag){
        //         System.out.println("Given String's are not anagrams.");
        //         break;
        //     }
        // }
        // if(flag){
        //     System.out.println("Given String's is anagrams.");
        // }    
        boolean anagram = true ;
        boolean[] used = new boolean[s2.length()];
        boolean found = false ;
        if(s1.length() == s2.length()){
            for(int i = 0 ; i<s1.length() ; i++){
                char ch = s1.charAt(i);
                found = false ;
                for(int j = 0 ; j<s2.length() ; j++){
                    if(ch == s2.charAt(j) && !used[j]){
                        found = true ;
                        used[j] = true ;
                        break ;
                    }
                }
                if(!found){
                    anagram = false ;
                    break;
                }
            }
            if(anagram){
                System.out.println("Given String's were anagram.");
            }else{
                System.out.println("Given String's were not anagram.");
            }
        }else{
            System.out.println("Given String's were not anagram.");
        }in.close();
    }
}