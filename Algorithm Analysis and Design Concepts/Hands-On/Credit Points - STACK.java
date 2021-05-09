/*

ShopClue is an online shopping platform and it is distributing gift vouchers to its esteemed users. The voucher can be redeemed by providing a fixed amount of shopping credit
points.  Each credit point is sent by a user one by one. Since there is a huge rush of people you are required to manage the users on the basis of first come first serve.  
To make this process easier, you are allowed to serve K no. of people at one time.  You are given an array where you can store the credit points of each user on first come 
first serve basis.  You can serve K people at a given point of time.  Finally you need to display the credits details of unserved people.  If all users are served at a time, 
then print “0 users to serve”.

Input Format:
The first input is the no. of users
The second input is the credit points of each user.

Output Format:
Output shows the unserved users credit points.
If all users are served, then print “0 users to serve”
If no. of users are 0 or less than 0 or greater than 1000 then print “Invalid no. of users”
If no. of users to server (K) is less than or equal to 0 or greater than no. of users, then print “ Invalid no. of users”

Constraints:
1<=n<=1000
1<=a[i]<=100
1<=k<=n

Note: Create the main() function inside the class "ShopMain".

Sample Input 1:
Enter the no. of users:5
Enter the credit points for user 1: 4
Enter the credit points for user 2: 5
Enter the credit points for user 3: 2
Enter the credit points for user 4: 8
Enter the credit points for user 5: 4
Enter the no. of users to serve: 3

Sample Output 1:
The unserved user’s credit points are: 8 4


Sample Input 2:
Enter the no. of users: 0

Sample Output 2:
Invalid no. of users


Sample Input 3:
Enter the no. of users: 3
Enter the credit points for user 1: 4
Enter the credit points for user 2: 5
Enter the credit points for user 3: 2
Enter the no. of users to serve: 3

Sample Output 3:
0 users to serve


Sample Input 4:
Enter the no. of users: 2
Enter the credit points for user 1: 7
Enter the credit points for user 2: 2
Enter the no. of users to serve: 3

Sample Output 4:
Invalid no. of users


Sample Input 5:
Enter the no. of users: 2
Enter the credit points for user 1: 5
Enter the credit points for user 2: 8
Enter the no. of users to serve: 0

Sample Output 5:
Invalid no. of users


Sample Input 6:
Enter the no. of users: -1

Sample Output 6:
Invalid no. of users

*/

import java.util.*;

public class ShopMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of users:");
        int n = sc.nextInt();
        System.out.println();
        if(n>=1 && n<=1000) {
            int[] a = new int[n];
            int temp = 0;
            while(temp<n) {
                System.out.print("Enter the credit points for user "+(temp+1)+":");
                a[temp] = sc.nextInt();
                if(a[temp]>=1 && a[temp]<=100) {
                    temp++;
                    System.out.println();
                }
                else
                    break;
            }
            System.out.print("Enter the no. of users to serve: ");
            int k = sc.nextInt();
            if(k>=1 && k<n) {
                System.out.print("The unserved user's credit points are: ");
                for(int i=k;i<n;i++)
                    System.out.print(a[i]+" ");
            }
            else if(k==n)
                System.out.println("0 users to serve");
            else
                System.out.println("Invalid no. of users");
        }
        else
            System.out.println("Invalid no. of users");
    }
}
