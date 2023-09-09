package org.posilki;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SniadanieTest {

    @Test
    void testGetOpis() {
        Sniadanie sniadanie = new Sniadanie();

        String opis = sniadanie.getOpis();

        Assertions.assertNotNull(opis);
        Assertions.assertTrue(opis.contains("Twoje śniadanie:"));
    }
}