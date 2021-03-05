package ru.balmukanov.codewars.string.vowel2Index;

import org.junit.Test;

import static org.junit.Assert.*;

public class Vowel2IndexTest {
    public final Vowel2Index vowel2Index;

    public Vowel2IndexTest() {
        vowel2Index = new Vowel2Index();
    }

    @Test
    public void scenario1() {
        assertEquals("th3s 6s my str15ng", this.vowel2Index.convert("this is my string"));
    }

    @Test
    public void scenario2() {
        assertEquals(
                "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld",
                this.vowel2Index.convert("Codewars is the best site in the world")
        );
    }

    @Test
    public void scenario3() {
        assertEquals(
                "T2m4rr7w 10s g1415ng t20 b23 r2627n29ng",
                this.vowel2Index.convert("Tomorrow is going to be raining")
        );
    }
}