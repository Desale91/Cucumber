Scenario Outline: create multiple new users
    Given user is on fb regiser page
    When user enter "<firstname>", "<lastname>", "<MobNo>", "<password>"
    Then user will be created

    Examples: 
      | firstname | lastname | MobNo       | password    |
      | Harshali  | Mahajan  |  9898988989 | harshali123 |
      | snehal    | Ghavare  |   855888555 | snehal123   |
      | Kunal     | Patil    | 54544545656 | kunal123    |
