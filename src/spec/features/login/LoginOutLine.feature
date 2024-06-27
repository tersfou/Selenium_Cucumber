@Login_multiUsers
Feature: Je souhaite me connecté sur plusieurs comptes
  
  @Login_multiUsers
  Scenario Outline: Je souhaite me connecté sur plusieurs comptes
    Given Je visite le site nopcommerce
    When Je saisis l'adresse email "<email>"
    When Je saisis le mot de passe "<mdp>"
    When Je clique sur le bouton login

    Examples: 
      | email							  | 		mdp		|
      | admin@yourstore.com |     admin |
      | fouedters@gmail.com |     admin |
