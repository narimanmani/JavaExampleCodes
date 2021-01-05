import java.io.*;

public class FlipWords {


    String inputStr = "";
    FlipWords( final BufferedReader br ) throws IOException {


        this.inputStr=  br.readLine();

    }

    /**
     * Returns the string read with the letters within
     * words (separated by an ASCII space: ' ') reversed.
     * e.g.  input: The red fox
     *       output: ehT der xof
     * nb: Leading and trailing white space may be removed.
     */
    public String flipLettersButWordsInOrder() {

        if(inputStr == null)
            return " ";
        StringBuilder reverse = new StringBuilder();
        String[] rvs = inputStr.split(" ");

        for(int i = 0; i < rvs.length ; i++)
        {
            rvs[i] = new StringBuilder(rvs[i]).reverse().toString();

        }

        return String.join(" ",rvs);
    }


    /**
     * Returns the string read with the words
     * (separated by an ASCII space: ' ') reversed.
     * e.g.  input: The red fox
     *       output: fox red The
     * nb: Leading and trailing white space may be removed.
     */
    public String flipWordOrderButNotLettersInWords() {
        if(inputStr == null)
            return " ";
        char[] chStr = inputStr.toCharArray();
        int counter = 0;
        StringBuilder outputStr= new StringBuilder();
        for(int i = chStr.length -1; i >=0 ; i--)
        {
            if(chStr[i] == ' ' || i ==0 )
            {
                outputStr.append(inputStr.substring(i,i+counter+1));
                outputStr.append(" ");
                counter = 0;
            }
            else
                counter ++;
        }

        return outputStr.toString();
    }

    public static void main(String[] args) {
        try {


            final BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

            final FlipWords flipWords = new FlipWords(br);

            System.out.println( flipWords.flipLettersButWordsInOrder() );
            System.out.println( flipWords.flipWordOrderButNotLettersInWords() );


            br.close();
        } catch (final IOException ioe) {
            ioe.printStackTrace();
            System.exit(-1);
        }
    }
}