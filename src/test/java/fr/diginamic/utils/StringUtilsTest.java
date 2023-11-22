package fr.diginamic.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void TestlevenshteinDistance() {
        int resultat = StringUtils.levenshteinDistance("Chat", "Chats");
        assertEquals(resultat,1);
        resultat= StringUtils.levenshteinDistance("machins", "machine");
        assertEquals(resultat,1);
        resultat = StringUtils.levenshteinDistance("aviron", "avion");
        assertEquals(resultat,1);
        resultat = StringUtils.levenshteinDistance("distance", "instance");
        assertEquals(resultat,2);
        resultat = StringUtils.levenshteinDistance("Chien", "Chine");
        assertEquals(resultat,2);

        resultat = StringUtils.levenshteinDistance(null, "Chine");
        assertEquals(resultat,-1);


    }
}