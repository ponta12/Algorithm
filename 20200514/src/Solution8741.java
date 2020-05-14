import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution8741 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());

        for(int t = 1; t <= test_case; t++) {
            String[] str = br.readLine().split(" ");
            String answer = "";

            for(String tmp : str) {
                answer += tmp.toUpperCase().charAt(0);
            }

            System.out.println("#" + t + " " + answer);
        }
    }
}
