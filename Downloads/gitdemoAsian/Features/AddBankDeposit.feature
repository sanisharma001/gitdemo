@addDeposit
Feature: Bank deposit
  Customer Wants to deposit money in his/her account

  Scenario Outline: Customer deposits money
    Given Customer has <initialBalance> in the account
    When Customer deposits <depositAmount> in the account
    Then Customer has <finalBalace> in the account.
    Examples: 
      |   initialBalance                  | depositAmount    | finalBalace |
      | 100 | 500 | success |600|
    