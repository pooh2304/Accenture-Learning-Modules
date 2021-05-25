/*

Miss.Jane, an experienced English professor, gives practice tests to her students to improve their written skills. Everyday students write an article and they submit it 
to Jane. Jane is particular that the students use only special characters like , ; : . ? ! in the article.

[Note : Using the above mentioned special characters will help to split the words in a sentence. All other special characters when used will be considered as a part of 
the word itself. ]

She counts the total number of words used and the count of each word in the article. Based on this analysis she gives her feedback to the students.  

Difficulty arises when the number of students increase. So she wanted to automate the process in the following format. Help her to write a java program to display the 
words and the number of times it has been used in the article and to display the words using lower case and in alphabetical order.

Sample Input 1 :
hello Hello HEllo hi hi: hi! Welcome,   welcome

Sample Output 1 :
Number of words 8
Words with the count
hello: 3
hi: 3
welcome: 2


Sample Input 2 :
Use Arrays.sort method

Sample Output 2:
Number of words 4
Words with the count
use: 1
arrays: 1
sort: 1
method: 1

*/

import java.util.*;

@SuppressWarnings("unchecked")
public class CountOfWords{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String []split2 = input.split("[\\s,:;!.?]+");
        List<String> splitData2 = Arrays.asList(split2);
        input = input.toLowerCase();
        String []split = input.split("[\\s,:;!.?]+");
        List<String> splitData = Arrays.asList(split);
        Map<String,Integer> dataToNum = new HashMap<>();
        for(String str:splitData){
            int occurences = Collections.frequency(splitData,str);
            dataToNum.put(str,occurences);
        }
        List<String> sortedWords = new ArrayList<String>(dataToNum.keySet());
        Collections.sort(sortedWords);
        System.out.println("Number of words "+split.length);
        System.out.println("Words with the count");
        for(String word:sortedWords){
            String str = null;
            for(int i=0;i<splitData2.size();i++){
                if(splitData2.get(i).toLowerCase().equals(word))
                str = splitData2.get(i);
            }
            System.out.println(str+": "+dataToNum.get(word));
        }
    } 
}
