package fr.diginamic.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void TestlevenshteinDistance() {
        StringUtils stringUtils = new StringUtils();
        int resultat = stringUtils.levenshteinDistance("Chat", "Chats");
        assertEquals(resultat,1);
        resultat= stringUtils.levenshteinDistance("machins", "machine");
        assertEquals(resultat,1);
        resultat = stringUtils.levenshteinDistance("aviron", "avion");
        assertEquals(resultat,1);
        resultat = stringUtils.levenshteinDistance("distance", "instance");
        assertEquals(resultat,2);
        resultat = stringUtils.levenshteinDistance("Chien", "Chine");
        assertEquals(resultat,2);

        resultat = stringUtils.levenshteinDistance(null, "Chat");
        assertEquals(resultat,-1);
        resultat = stringUtils.levenshteinDistance("Machine",null);
        assertEquals(resultat,-1);
        resultat = stringUtils.levenshteinDistance("avion",null);
        assertEquals(resultat,-1);


    }
}