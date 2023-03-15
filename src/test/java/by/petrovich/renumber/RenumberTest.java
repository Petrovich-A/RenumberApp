package by.petrovich.renumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RenumberTest {
    private final Renumber renumber = new Renumber();

    @Test
    void renumber() {
        List<String> actual = new ArrayList<>();
        actual.add("(75131-3001038 KORPYSKYLAKA)\n");
        actual.add("N3(OP.40)\\n");
        actual.add("N4(STANOK BTN-13A)\\n");
        actual.add("N5(PRISPOSOBLENIE - 7274-6410)\\n");
        actual.add("N6(OTRABOTANO -   )\\n");
        actual.add("N7#501=-894.33(*** KOORDINATA OSI POV. STOLA PO \\\"X\\\" ***)\\n");

        List<String> ncProgram = new ArrayList<>();
        ncProgram.add("(75131-3001038 KORPYSKYLAKA)\n");
        ncProgram.add("(OP.40)\\n");
        ncProgram.add("(STANOK BTN-13A)\\n");
        ncProgram.add("(PRISPOSOBLENIE - 7274-6410)\\n");
        ncProgram.add("(OTRABOTANO -   )\\n");
        ncProgram.add("#501=-894.33(*** KOORDINATA OSI POV. STOLA PO \\\"X\\\" ***)\\n");
        List<String> expected = renumber.renumber(ncProgram, 3, 2);
        Assertions.assertEquals(expected, actual);
    }
}