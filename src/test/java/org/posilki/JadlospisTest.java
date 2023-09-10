package org.posilki;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JadlospisTest {

    @Test
    void testGetOpis() {
        Jadlospis jadlospis = new Jadlospis();

        assertThat(opis).isNotNull();
        assertThat(opis).contains("Jadłospis:");
        assertThat(opis).contains("Śniadanie:");
        assertThat(opis).contains("Obiad:");
        assertThat(opis).contains("Kolacja:");
    }
}