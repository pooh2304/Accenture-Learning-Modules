/*

Ram has passed in certain subjects and failed in a few. Write a program to count the no of subjects he passed in and the no of subjects he has failed in. Marks scored below 50 is considered as failed. If Ram has passed in all the subjects print "Ram passed in all subjects" and if failed print "Ram failed in all subjects".

Assume maximum size of array is 20,

Sample Input 1:
Enter the no of subjects:
6
60
70
80
90
45
49

Sample Output 1:
Ram passed in 4 subjects and failed in 2 subjects


Sample Input 2:
Enter the no of subjects:
0

Sample Output 2:
Invalid input range


Sample Input 3:
Enter the no of subjects:
-2

Sample Output 3:
Invalid input range

*/

import java.util.*;

class Count{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of subjects:");
        int noofsub=sc.nextInt();
        int pass=0,fail=0;
        if(noofsub>0 && noofsub<=20){
            int[] submarks=new int[noofsub];
            for(int i=0;i<noofsub;i++){
                submarks[i]=sc.nextInt();
                if(submarks[i]>=50)
                    pass++;
                else
                    fail++;
            }
            if(pass==noofsub && fail==0)
                System.out.println("Ram passed in all subjects");
            else if(pass==0 && fail==noofsub)
                System.out.println("Ram failed in all subjects");
            else
                System.out.println("Ram passed in "+pass+" subjects and failed in "+fail+" subjects");
        }
        else
            System.out.println("Invalid input range");
    }
}