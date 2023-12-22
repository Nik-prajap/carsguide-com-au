Feature: Search functionality
  As a user i would like to test the search functionality of CarsGuide marketplace website

  Scenario Outline: : Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make “<make>”
    And I select model “<model>”
    And I select location “<location>”
    And I select price “<price>”
    And I click on Find My Next Car tab
    Then I should see the make “<make>” in results
    Examples:
      | make | model | location | price |
#  Example:
 #     | make       | model            | location        | price       |
  #   | Toyota     |  Landcruiser     | QLD - All       | $200,000    |
   #   | Audi       |  RS Q8           | NSW - All       | $200,000    |
    #  | Maserati   |  Levante         | Any Location    | $200,000    |
     # | Maybach    |  S550            | QLD - Brisbane  | $150,000    |
     # | Lexus      |  LC500H          | Any Location    | Price (max) |
     # | Cadillac   |  Escalade        | NSW - Sydney    | $40,000     |

  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make “<make>”
    And I select model “<model>”
    And I select location “<location>”
    And I select price “<price>”
    And I click on Find My Next Car tab
    Then I should see the make “<make>” in results
    Examples:
      | make | model | location | price |

 # Example:
  #    | make       | model            | location        | price       |
 #     | audi       | q8               | QLD             |$100         |
  #    | nissan     | Almera           |Sydney           |$1000        |
   #   | Toyota     | Avensis          | London          |$10000       |


