@smoke
Feature:  User can search for any product at system
  Scenario Outline 1: User can search by product name <pname>
    Given user click at search field
    When User search with name of product "pname"
    Then user could find relative products
    Examples:
      | pname |
      | book |
      | laptop |
      | nike |

  Scenario Outline 2: : User can search by SKU <sku>
    Given user click at search field
    When User search with SKU of product "sku"
    Then user could find relative products

    Examples:
       | sku |
       | SCI_FAITH |
       | APPLE_CAM |
       | SF_PRO_11 |