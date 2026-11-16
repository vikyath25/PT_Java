public class stringSpace {
    public static void main() {
        String s = "Hello my name is Vikyath";
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }
        IO.print(count);
    }
}