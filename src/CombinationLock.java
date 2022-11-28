public class CombinationLock {
    private String lock;
    private String guess;
    private String guessLetter1;
    private String guessLetter2;
    private String guessLetter3;
    private String guessLetter4;
    private String lockLetter1;
    private String lockLetter2;
    private String lockLetter3;
    private String lockLetter4;
    private String modifiedGuess;
    private char combinationLetter;
    private char guessLetter;

    private char newGuess;

    public CombinationLock(String newLock) {
        lock = newLock;
        modifiedGuess = "";
    }
    public String getClue(String newGuess)
    {
        guess = newGuess;
        for(int i = 0; i < lock.length(); i++)
        {
            combinationLetter = lock.charAt(i);
            guessLetter = guess.charAt(i);

            if(i == 0)
            {
                lockLetter1 += combinationLetter;
                guessLetter1 += guessLetter;
            }
            else if(i == 1)
            {
                lockLetter2 += combinationLetter;
                guessLetter2 += guessLetter;
            }
            else if(i == 2)
            {
                lockLetter3 += combinationLetter;
                guessLetter3 += guessLetter;
            }
            else if(i == 3)
            {
                lockLetter4 += combinationLetter;
                guessLetter4 += guessLetter;
            }

            if(combinationLetter == guessLetter)
            {
                modifiedGuess += combinationLetter;
            }
            else if(guessLetter1 == lockLetter1 || guessLetter1 == lockLetter2 || guessLetter1 == lockLetter3 || guessLetter1 == lockLetter4)
            {
                modifiedGuess += '+';
            }
            else
            {
                modifiedGuess += '*';
            }
        }
        return modifiedGuess;
    }
    public static void main(String []args) {
        CombinationLock c1 = new CombinationLock("");
        System.out.println(c1.getClue("frog"));
    }
}
