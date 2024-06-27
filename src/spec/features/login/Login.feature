@connexion
Feature: Je souhaite verifier la page de connexion

  @tag1
  Scenario: Je souhaite verifier la page de connexion avec des donnees invalides
  Given Je visite le site nopcommerce
  When Je saisis l'adresse mail "fouedters@gmail.com"
  When Je saisis le mot de passe "Foued"
  When Je clique sur le bouton login
  Then Je verifie les messages d'erreur "wrang mail "