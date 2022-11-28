public class Wordulator {
    private String word;

    public String getword(){
        return word;
    }
    public int letterCount(String letter){
        int length;
        int count = 0;
        length = word.length();
        while (length>0){
            if(letter.equals(word.substring(length-1, length))){
                count++;
            }
            length--;
        }
        return count;
    }

    public String letterXer(char replace){
        String newWord = "";
        int count = word.length();
        int i = 0;
        while(i<count){
            if(word.charAt(i)==replace){
                newWord+="X";
            }
            else {
                newWord+=word.charAt(i);
            }
            i++;
        }
        return newWord;
    }
}