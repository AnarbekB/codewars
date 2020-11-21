package ru.balmukanov.codewars.algorithms.morse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseDecoderTest {

    @Test
    public void testHelloWorld() {
        assertEquals(
                "HELLO WORLD",
                MorseDecoder.decode(".... . .-.. .-.. ---   .-- --- .-. .-.. -..")
                );
    }

    @Test
    public void testSos() {
        assertEquals(
                "SOS",
                MorseDecoder.decode("... --- ...")
        );
    }

    @Test
    public void testExampleFromDescription() {
        assertEquals(
                "HEY JUDE",
                MorseDecoder.decode(".... . -.--   .--- ..- -.. .")
        );
    }

    @Test
    public void testEE() {
        assertEquals(
                "EEE",
                MorseDecoder.decode(" . \n . . \n")
        );
    }

}
