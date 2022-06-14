import java.util.Locale;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if (myString.equals(myString.toLowerCase())) 
            return true;
        if (myString.equals(myString.toUpperCase())) 
            return true; 
        if (myString == null)
            throw new NullPointerException(); 

        String string = myString.substring(0,1).toUpperCase();
        String string2 = myString.substring(1).toLowerCase();

        return myString.equals(string + string2);
        
    }

}

