import java.util.Scanner;
import java.util.Stack;

public class SImple_TExt_Editor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        String sc = "";
        String t = "";
        String v = "";

        Stack<Integer> st = new Stack<Integer>();

        for (int i = 0; i < q; i++) {
            int n = s.nextInt();

            if (n == 1) {
                st.add(1);
                String w = s.next();
                v = sc;
                sc = append(sc, w);

            }

            else if (n == 2) {
                st.add(2);
                int k = s.nextInt();
                t = sc;
                sc = delete(sc, k);

            }

            else if (n == 3) {
                int k = s.nextInt();
                char c = sc.charAt(k-1);
                System.out.println(c);
            }

            else {

                int temp=0;
                
                if(!st.empty())
                {temp = st.pop();}
                if (temp == 1) {
                    sc = v;

                } else {
                    sc = t;

                }

            }

        }

    }

    public static String append(String in, String x) {
        in = in.concat(x);
        return in;

    }

    public static String delete(String in, int k) {

        int n = in.length() - k;
        String x = in.substring(0, n);

        return x;
    }

}
