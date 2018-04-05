Feature: Decreasing the value of the Counter.

Scenario: Decreasing the Counter without supplying an amount

  Given a new Counter
  When we decrease the Counter without supplying an amount
  Then the Counter value equals -1

Scenario: Decreasing the Counter by supplying an amount

  Given a new Counter with value 10
  When we decrease the Counter with supplied amount 5
  Then the Counter value equals 5

Scenario Outline: Decreasing

  Given a new Counter with value <value>
  When we decrease the Counter with supplied amount <amount>
  Then the Counter value equals <result>

  Examples:
    | value | amount | result |
    |     1 |      1 |      0 |
    |     2 |      1 |      1 |
    |     3 |      1 |      2 |
    |     4 |      1 |      3 |
    |   100 |    100 |      0 |

