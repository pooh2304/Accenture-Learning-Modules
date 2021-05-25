/*

Miss.Jane, an experienced English professor, gives practice tests to her students to improve their written skills. Everyday students write an article and they submit it 
to Jane. Jane is particular that the students use only special characters like , ; : . ? ! in the article.

She counts the total number of words used and the number of new words used by the students in the article. Based on the analysis done on the new words used by the students 
she gives her feedback to the students.  

Jane finds it difficult when the number of students increase. So she wanted to automate the process in the following format. Help her to write a java program to display 
the new words using lower case and in alphabetical order.

Sample Input and Output - 1
Enter Student's Article
Hello Everybody, welcome to collection in JAVA. Collection, is like a container and powerful concept in Java!
Number of words 17
Number of unique words 14
The words are
1. a
2. and
3. collection
4. concept
5. container
6. everybody
7. hello
8. in
9. is
10. java
11. like
12. powerful
13. to
14. welcome


Sample Input and Output - 2
Enter Student's Article
hello Hello HEllo hi hi: hi! Welcome,   welcome
Number of words 8
Number of unique words 3
The words are
1. hello
2. hi
3. welcome

*/

import java.util.*;   

@SuppressWarnings("unchecked")
public class UniqueWords{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Article");
        String s = sc.nextLine();
        s = s.toLowerCase();
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int a=0;a<sb.length();a++){
            if(!(Character.isLetter(sb.charAt(a)))){
                if(sb.charAt(a)!=' '){
                    if(sb.charAt(a)!='\'')
                    sb.deleteCharAt(a);
                }
            }
        }
        s = sb.toString();
        String str[] = s.split(" ");
        Set<String> s1 = new HashSet<String>
        (Arrays.asList(str));
        List<String> s2 = new ArrayList<String>(s1);
        System.out.println("Number of words "+str.length);
        System.out.println("Number of unique words "+s1.size());
        Collections.sort(s2);
        int a = 1;
        System.out.println("The words are");
        for(String stemp:s2)
            System.out.println((a++)+". "+stemp);
    }
}
