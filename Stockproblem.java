package geeks.array;
import java.util.*;
public class Stockproblem {
/* Efficient solution of *STOCK BUY AND SELL PROBLEM* 
 * TIME COMPLEXITY IS : O(N)
 * AUXILARY SPACE IS  : O(1)
 * User taking the input
 */
    static int maxprofit (int price[],int n){
        int profit = 0;
        for (int i =1;i<n;i++){
            if (price[i]>price[i-1])
                profit += price[i]-price[i-1];
        }
            return profit;
        
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        System.out.println("enter the array");
        int price [] = new int[n];
        
        for (int i =0;i<n;i++){
           price[i]=sc.nextInt();
        }
        System.out.println(maxprofit(price,n));
    }
}
