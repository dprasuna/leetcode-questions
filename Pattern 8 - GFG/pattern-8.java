//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj=new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
         for(int i=0;i<n;i++){

            for(int space=0;space<i;space++)

                System.out.print(" ");

                

                for(int star1=0;star1<n-i;star1++)

                System.out.print('*');

                

                for(int star2=0;star2<n-i-1;star2++)

                 System.out.print('*');

                

                 System.out.println();
    }
    }
}