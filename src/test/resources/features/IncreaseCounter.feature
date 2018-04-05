Feature: Increasing the value of the Counter.

Scenario: Increasing the count without supplying an amount.

  Given a Counter with value 0
  When we increase the counter without supplying an amount
  Then the Counter value will be 1
