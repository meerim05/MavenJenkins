Feature: Adding employees

  Background:
    And user is logged in with valid admin credentials
    When user clicks on PIM option
    And user clicks on Add employee button

  @smoke
  Scenario: Adding employee from add employee page
    And user enters firstname middlename lastname
    And user clicks on save button option
    Then employee added successfully

  @smoke
  Scenario: Adding employee from add employee page via feature file
    And user enters first name "Anna" middlie name "Ryan" last name "Andrew"
    And user clicks on save button
    Then employee added successfully

  @example
  Scenario Outline: Adding employee from add employee page via feature file
    And user enters "<FirstName>" "<MiddleName>" "<Lastname>" in the application
    And user clicks on save button
    Then employee added successfully

    Examples:
      | FirstName | MiddleName | LastName |
      | Ylia      | MA         | Test242  |
      | Ale       | TA         | Tset1234 |
      | Lena      | BS         | Test9409 |

  @datatablewithheader
  Scenario: Adding multiple employees in a singe execution
    When add multiple employees and verify they are added successfully
      | FirstName | MiddleName | LastName |
      | Kar       | Mac        | US       |
      | Ary       | Lev        | US       |
      | Jon       | Jonny      | MS       |

    @excel
    Scenario: Adding the employee from excel file
      When user adds multiple employees from excel file from "Sheet1" sheet and verify they are added