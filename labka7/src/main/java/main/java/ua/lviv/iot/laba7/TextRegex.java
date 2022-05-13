package main.java.ua.lviv.iot.laba7;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TextRegex {
    public void findingCards(String text){
        Pattern p1= Pattern.compile("\\d{16}");
        Matcher m1 = p1.matcher(text);
        ArrayList<String> foundCards = new ArrayList<>();
        while (m1.find()){
        foundCards.add(m1.group());
        }
        Pattern p2=Pattern.compile("\\s\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4}\\s");
        Matcher m2 = p2.matcher(text);
        while(m2.find()){
        foundCards.add(m2.group());
        }
    System.out.print(foundCards);
}
}