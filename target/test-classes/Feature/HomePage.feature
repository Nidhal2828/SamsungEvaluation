#Author: Nidhal
Feature: Home page

  Scenario: Selectionner le menu Climatiseur
    Given Utilisateur est sur la page daccueil
    When  Utilisateur survole le menu "Électroménager" And Utilisateur clique sur le sous-menu "Climatiseur"    
    Then  Utilisateur est sur la page "Climatiseur"
