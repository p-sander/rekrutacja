package org.rekrutacja;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PrinterTest {

    @Test
    void shouldPrint10Rows() {

        int count = 0;

        for (int i = 0; i < 5; i++) {
            new Printer().printStars(1);
            count ++;
        }

        assertEquals(5, count);
    }

    @Test
    void shouldPrintDefaultString() {

        assertEquals("*", new Printer().getFirstRow().toString());
        assertEquals("***", new Printer().getSecondRow().toString());

    }

    @Test
    void shouldAppendCorrectly() {

        Printer printer = new Printer();
        printer.printStars(3);

        assertEquals("****", printer.getFirstRow().toString());
        assertEquals("******", printer.getSecondRow().toString());

    }

    @Test
    void shouldAppend() {

        Printer printer = new Printer();
        printer.printStars(4);

        assertNotEquals("*", printer.getFirstRow().toString());
        assertNotEquals("***", printer.getSecondRow().toString());

    }

    @Test
    void shouldCheckLengthCorrectly() {

        Printer printer = new Printer();

        assertEquals(1, printer.getFirstRow().length());
        assertEquals(3, printer.getSecondRow().length());

    }

    @Test
    void shouldUpdateLengthCorrectly() {

        Printer printer = new Printer();
        printer.printStars(4);

        assertEquals(5, printer.getFirstRow().length());
        assertEquals(7, printer.getSecondRow().length());

    }

}