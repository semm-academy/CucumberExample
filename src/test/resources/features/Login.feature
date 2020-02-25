@Login
Feature: Login
  User enters email and password, then if it is successful, give access to the system.

  Scenario:
    # Sayfaya gitme asamasi, giris
    Given user is on the login page

    # Inputlarin girilme asamasi, gelisme
    When user enters email
    And user enters password
    And user clicks login button

    # Dogrulama kismi, sonuc
    Then is page title "Anasayfa"
