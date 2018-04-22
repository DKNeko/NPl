package nlp.week2.Tokenization;

import java.util.*;
import java.util.regex.*;

public class regEx {
    public regEx(){}
    
    String regex[] = {"[BMD][0-9]+","([\\w]{8,})+([\\.\\+\\-\\*\\/]{2})","[\\dA-Z]{9,13}",
                      "[\\d]{5}","[\\d]{3}-[\\d]{7}","^(.+)@(.+)$","[A-Z]{3}+[0-9]{3}"};
    
    public String regEx(int i){
        return regex[i];
    }
    
    public boolean checkRegEx(String text,int i){        
           Pattern pt0 = Pattern.compile(regex[i]);              
           Matcher mat0 = pt0.matcher(text);          
           return mat0.matches();
          
        
    }   

}
