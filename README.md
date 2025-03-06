# Emirates Red E2E UI Tests

This repository contains automated end-to-end UI tests for the Emirates Red e-commerce website using Selenium WebDriver with Java and TestNG.

## Project Overview

This automation framework is designed to test the functionality of the Emirates Red e-commerce website. It follows the Page Object Model (POM) design pattern to create a maintainable and scalable test automation framework.

## Tech Stack

- Java 8
- Selenium WebDriver 4.10.0
- TestNG 7.4.0
- Maven

## Project Structure

```
emirates-red-e2e-ui-tests/
├── src/
│   ├── main/java/
│   │   ├── Pages/ - Original page objects
│   │   │   ├── CerrutiPage.java
│   │   │   ├── CheckOutPage.java
│   │   │   ├── HomePage.java
│   │   │   └── WatchListPage.java
│   │   └── com/emiratesred/pages/ - Refactored page objects
│   │       ├── Header.java
│   │       └── HomePage.java
│   └── test/java/
│       ├── Base/
│       │   └── BaseTest.java
│       ├── Test/ - Original tests
│       │   ├── AddToCartTest.java
│       │   └── CheckOutTest.java
│       └── com/emiratesred/tests/ - Refactored tests
│           └── HomePageTest.java
└── pom.xml
```

## Features Tested

- Product Search
- Adding products to cart
- Checkout process
- Flight information entry during checkout

## Getting Started

### Prerequisites

- Java JDK 8 or higher
- Maven
- Chrome/Edge/Safari WebDriver (depending on which browser you want to use)

### Setup

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/emirates-red-e2e-ui-tests.git
   cd emirates-red-e2e-ui-tests
   ```

2. Update the WebDriver path in `BaseTest.java`:
   ```java
   System.setProperty("webdriver.chrome.driver", "/path/to/your/chromedriver");
   ```

3. Install dependencies:
   ```
   mvn clean install -DskipTests
   ```

### Running Tests

To run all tests:
```
mvn test
```

To run a specific test class:
```
mvn test -Dtest=HomePageTest
```

## Test Cases

### Add to Cart Flow
- Navigate to the homepage
- Close notification banner
- Navigate to Watches category
- Select a specific Cerruti watch
- Accept cookies
- Add the product to the cart

### Checkout Flow
- Add product to cart
- Proceed to checkout
- Enter email
- Fill in flight information (departure, arrival, flight number, etc.)

### Search Functionality
- Search for valid products
- Verify search results are displayed
- Test handling of searches with no results

## Framework Design

The project follows the Page Object Model pattern to encapsulate web page interactions:

- **Page Classes**: Each web page has a corresponding class that represents its elements and behaviors
- **Test Classes**: Test scenarios that use the page objects to interact with the application
- **Base Test**: Handles common setup and teardown operations

## Notes

- The project contains both original implementations (in `Pages` and `Test` packages) and refactored implementations (in `com.emiratesred` packages)
- The framework uses both implicit and explicit waits for element synchronization
- Different browser drivers are used in different test classes (EdgeDriver in BaseTest, SafariDriver in HomePageTest)

## Author
Mohammed Lukmanudin M - [GitHub Profile](https://github.com/redJavaMan)
