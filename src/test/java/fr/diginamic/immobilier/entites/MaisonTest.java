package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaisonTest {

    @Test
    void TestajouterPiece() {
        Maison maison = new Maison();
        Chambre chambre = new Chambre(5,23);
        int resultat = maison.ajouterPiece(chambre);
        assertEquals(1, resultat);

    }

    @Test
    public void TestnbPieces() {

    }

    @Test
    void TestsuperficieEtage() {
    }

    @Test
    void TestsuperficieTypePiece() {
    }

    @Test
    void TestcalculerSurface() {
    }

    @Test
    void TestgetPieces() {
        Maison maison = new Maison();
        Cuisine cuisine = new Cuisine(5,23);
        int resultat = maison.ajouterPiece(cuisine);
        assertEquals(1, resultat);
    }
}