public class Lowercase {
    public static void main ( String args[]) {
        for (char ch = 'A' ; ch <= 'Z' ; ch ++ ) {
            System.out.println ((char) ( ch | ' ')) ;  // doing OR with 32 returns that group like adding 32
            
        }
    }
}