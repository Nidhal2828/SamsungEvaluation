#Author: Nidhal
Feature: Ajout Panier

  Scenario: Ajouter le produit au panier
    Given Utilisateur est sur la page du produit 
    When Utilisateur clique sur le bouton "Acheter" And Utilisateur clique sur "CONTINUER MES ACHATS"
    Then Le produit "Climatiseur Samsung 12000 BTU Digital Inverter" est correctement ajouté au panier
