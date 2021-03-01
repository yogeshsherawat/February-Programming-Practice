package February.String;


public class count_substring_end_with_x {
    public static void main(String args[]) {

    
    String str = "abcd";
    char x = 'd';
    int ans = 0;
    for( int i = str.length() - 1;i>=0;i--)
    {
        if (str.charAt(i) == x) {
            ans +=   (i + 1);
        } 
    }
    System.out.println(ans);
}

}
