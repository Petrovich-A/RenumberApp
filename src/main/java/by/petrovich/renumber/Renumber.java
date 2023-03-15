package by.petrovich.renumber;

import java.util.*;

public class Renumber {
    private final String firstLetterOfRenumber = "N";

    public List<String> renumber(List<String> ncProgramLines, int startNumbering, int firstNumberingLine){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < ncProgramLines.size(); i++) {
            if (i+1 == firstNumberingLine){
                result.add(firstLetterOfRenumber + startNumbering + ncProgramLines.get(i));
                firstNumberingLine++;
                startNumbering++;
                System.out.println("line: " + result.get(i));
            }else {
                result.add(ncProgramLines.get(i));
                System.out.println("line: " + result.get(i));
            }
        }
        return result;
    }
}
