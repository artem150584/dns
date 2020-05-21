@dns
Feature: check hardware

  Scenario: Succesfull log in
    Given Open https://dns-shop.ru/ page
    When Click on Компьютеры
    And Click on Компьютеры, ноутбуки и ПО
    And Click on Системные блоки
    And Sort by По убыванию цены
    And Find 3 item from beginnig
    And Click on Характеристики
    And Save mainframe character
    And Open https://dns-shop.ru/ page
    And Click on Компьютеры
    And Click on Компьютеры, ноутбуки и ПО
    And Click on Системные блоки
    And Sort by По возрастанию цены
    And Go to the last page
    And Find 3 item from ending
    And Click on Характеристики
    And Save mainframe character
    Then Compare 1 and 2 mainframe characters

