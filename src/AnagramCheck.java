import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args){
        // TODO: Read the two strings
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // TODO: Check if lengths are equal. If not, print "false" and return.
        if(str1.length()!=str2.length()){
            System.out.print("false");
            return;
        }
        // TODO: Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        // TODO: Sort both char arrays
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // TODO: Compare the sorted arrays. Print "true" if equal, else "false".
        for(int i=0; i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                System.out.print("false");
                return;
            }
        }
        System.out.print("true");
        return;
    }
}
