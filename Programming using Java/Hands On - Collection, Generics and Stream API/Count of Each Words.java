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