import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainClass {

    @Test
    public void test1() {
        final String expected =
                "Two green bottles hanging on the wall,\n"+
                        "Two green bottles hanging on the wall,\n"+
                        "And if one green bottle should accidentally fall,\n"+
                        "There'll be one green bottle hanging on the wall.\n"+
                        "\n"+
                        "One green bottle hanging on the wall,\n"+
                        "One green bottle hanging on the wall,\n"+
                        "If that one green bottle should accidentally fall,\n"+
                        "There'll be no green bottles hanging on the wall.\n";
        assertEquals(expected, MainKataClass.tenGreenBottles(2));
    }

    @Test
    public void test2() {
        final String expected =
                "Three green bottles hanging on the wall,\n"+
                        "Three green bottles hanging on the wall,\n"+
                        "And if one green bottle should accidentally fall,\n"+
                        "There'll be two green bottles hanging on the wall.\n"+
                        "\n"+
                "Two green bottles hanging on the wall,\n"+
                        "Two green bottles hanging on the wall,\n"+
                        "And if one green bottle should accidentally fall,\n"+
                        "There'll be one green bottle hanging on the wall.\n"+
                        "\n"+
                        "One green bottle hanging on the wall,\n"+
                        "One green bottle hanging on the wall,\n"+
                        "If that one green bottle should accidentally fall,\n"+
                        "There'll be no green bottles hanging on the wall.\n";
        assertEquals(expected, MainKataClass.tenGreenBottles(3));
    }



}
