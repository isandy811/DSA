public class Reverse {
    public static void main(String[] args) {
        int a = 532; 
        int ans = 0;

        while (a != 0) {
            int digit = a % 10; 
            ans = ans * 10 + digit;  
            a /= 10;
        }

        System.out.println("Reversed number: " + ans);
    }
}
