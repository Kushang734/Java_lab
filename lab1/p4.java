package lab1;

public class p4 {
    public static void main(String[] args){
        int num = 121;
        int original = num;
        int reversed = 0;
        int temp;

        while(num > 0){
            temp = num % 10;            
            reversed = reversed * 10 + temp;  
            num = num / 10;             
        }

        if(original == reversed){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
