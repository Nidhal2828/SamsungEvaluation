#Author: Nidhal
Feature: Climatiseur

  Scenario: Choix de produit
    Given Utilisateur est sur la page des produits
    When Utilisateur clique sur le produit nomme "Climatiseur Samsung 12000 BTU Digital Inverter"
    Then Utilisateur est sur la page du produit nomme "Climatiseur Samsung 12000 BTU Digital Inverter"

  