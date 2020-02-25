@AddBlog
Feature: AddBlog
  User fill blog form and send it to be approved by admins.

  Scenario:
    # Sayfaya gitme asamasi, giris
    Given user is on the domain page

    # Inputlarin girilme asamasi, gelisme
    When user fill blog form

    # Dogrulama kismi, sonuc
    Then is page title Anasayfa
