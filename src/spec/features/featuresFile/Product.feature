@product
Feature: Je souhaire rechercher et ajouter un produit

  Background: 
    Given Je visite le site nopcommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le mot de passe "admin"
    And Je clique sur le bouton login
    And Je clique sur le bouton catalog
    And Je clique sur le bouton products

  @rechercheProduit
  Scenario: Recherche de Produit
    And Je saisis le nom du produit
    And Je selectionne une categorie
    And Je clique sur le bouton search

  @ajoutProduct
  Scenario: Ajout de Produit
    And Je clique sur le bouton add new
    And Je saisis le nom du nouveau produit
    And Je saisis la date de debut disponible
    And Je saisis la Date de fin disponible
    And Je selectionne un taxe categorie
    And Je clique sur le bouton save
    
