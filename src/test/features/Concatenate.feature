# Test the functionality of the concatenator.htm page.
Feature:
  As a developer
  I want to test concatenating words
  So that I can have confidence in my webpage

  Background:
    Given a concatenate facility

  Scenario Outline: Concatenate words
    When I concatenate "<value1>" and "<value2>"
    Then the result should be "<expected>"

    Examples:
      |value1 |value2 |expected     |
      |cheese |please |cheeseplease |
      |1      |2      |12           |