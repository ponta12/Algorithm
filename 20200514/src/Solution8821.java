import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution8821 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test_case = Integer.parseInt(br.readLine());

        for (int t = 1; t <= test_case; t++) {
            int[] arr = new int[10];
            int answer = 0;
            for(int i = 0 ; i < 10; i++) {
                arr[i] = 0;
            }
            char[] input = br.readLine().toCharArray();

           for(char tmp : input) {
               if(arr[tmp - '0'] == 0) arr[tmp - '0'] = 1;
               else arr[tmp - '0'] = 0;
           }

           for(int i = 0 ; i < 10; i++) {
               if(arr[i] == 1)  answer += 1;
           }

            System.out.println("#" + t + " " + answer);
        }
    }
}
