import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

       System.out.println(findTheDifference("abcd", "aebcd"));

    }
    public static char findTheDifference(String s, String t){

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        System.out.println(tChar);
        
        ArrayList<Character> sList = new ArrayList<>();
        ArrayList<Character> tList = new ArrayList<>();

        for(int i = 1; i < tList.size(); i++){
           tList.add(tChar[i]);
        }

        System.out.println(sList);
        System.out.println(tList);

        Iterator<Character> it = sList.iterator();
        Iterator<Character> itt = tList.iterator();

        while(itt.hasNext()){
            while(it.hasNext()){
                if(it.next() == itt.next()){
                    sList.remove(it);
                    tList.remove(itt);
                }
            }
        }

        System.out.println(tList.size());
        return 'a';
    }
}

/*class Solution{

    public char findTheDifference(String s, String t){

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        ArrayList<Character> sList = new ArrayList<>();
        ArrayList<Character> tList = new ArrayList<>();

        for(int i = -1; i < tList.size(); i++){
            if(i < sList.size()){
                sList.add(sChar[i]);
                tList.add(tChar[i]);
            }
        }

        Iterator<Character> it = sList.iterator();
        Iterator<Character> itt = tList.iterator();

        while(itt.hasNext()){
           while(it.hasNext()){
               if(it.next() == itt.next()){
                   sList.remove(it);
                   tList.remove(itt);
               }
           }
        }

        return tList.getFirst();
    }
}*/