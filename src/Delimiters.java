import java.util.ArrayList;
public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close){
        openDel = open;
        closeDel = close;
    }

    public String getCloseDel() {
        return closeDel;
    }

    public String getOpenDel() {
        return openDel;
    }

    public ArrayList<String> getDelimitersList(String[] token)
    {

        ArrayList<String> delimiters = new ArrayList<String>();
        for (String i : token)
        {
            if (i.equals(openDel) || i.equals(closeDel))
            {
                delimiters.add(i);
            }
        }
        return delimiters;
    }

    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int openDelCount = 0;
        int closeDelCount = 0;
        for (int i = 0; i < delimiters.size(); i++)
        {
            if (delimiters.get(i).equals(openDel))
            {
                openDelCount+=1;
            }
            else
            {
                closeDelCount+=1;
            }
            if (closeDelCount > openDelCount)
            {
                return false;
            }
        }
        return (closeDelCount == openDelCount);

    }


}
