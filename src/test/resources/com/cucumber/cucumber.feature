Feature: Get current Balance

  Scenario : Get Account Details
    Given  I set GET account service api endpoint
    When I set request HEADER
    Then I receive valid HTTP response code 200


  Scenario : Do Fund Transfer
    Given  I set POST account service api endpoint
    When I set request HEADER
    And send POST HTTP  request
    Then I receive valid HTTP response code 200

