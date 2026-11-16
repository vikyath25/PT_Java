public class charCount {
    public static void main() {
        String s = "Hi u are teh best u";
        char x = 'u';
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == x) {
                count++;
            }
        }
        IO.print(count);
    }
}