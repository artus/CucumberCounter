Feature: Initializing a new Counter.

Scenario: Initialising a Counter without supplying an amount.

    Given a new Counter
    Then the Counter value equals 0

Scenario: Initialising a Counter by supplying an amount.

    Given a new Counter with value 1
    Then the Counter value equals 1

Scenario Outline: Initializing

    Given a new Counter with value <value>
    Then the Counter value equals <value>

    Examples:
      | value |
      |     1 |
      |     2 |
      |     3 |
      |     4 |
      |     5 |
      |  1000 |
      | 10000 |
