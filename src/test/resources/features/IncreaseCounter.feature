Feature: Increasing the value of the Counter.

Scenario: Increasing the count without supplying an amount.

  Given a new Counter with value 0
  When we increase the Counter without supplying an amount
  Then the Counter value equals 1

Scenario: Increasing the count by supplying an amount.

  Given a new Counter with value 0
  When we increase the Counter with supplied amount 1
  Then the Counter value equals 1

Scenario Outline: Increasing

  Given a new Counter with value <value>
  When we increase the Counter with supplied amount <amount>
  Then the Counter value equals <result>

  Examples:
    | value | amount | result |
    |     1 |      1 |      2 |
    |     5 |      1 |      6 |
    |     0 |      8 |      8 |
    |   100 |    100 |    200 |
    |     2 |    100 |    102 |
