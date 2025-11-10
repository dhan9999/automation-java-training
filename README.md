# SauceDemo Login Testing Framework

QA automation framework for testing SauceDemo login functionality using Java 21, Maven, Selenium 4, TestNG, WebDriverManager, Allure, and Log4j2.

## Prerequisites
- Java 21 or higher
- Maven 3.6+
- Chrome browser (latest version)

## Folder Layout
```
automation-java-training/
├── docs/                          # Test documentation
│   ├── TestStrategy.md           # Test strategy document
│   ├── Login_TestCases.md        # Test cases (LGN_001-LGN_010)
│   ├── Login_TestData.md         # Test data reference
│   ├── Traceability.csv          # Requirements traceability
│   ├── Shakedown.md              # Exploratory test charter
│   ├── QualityGates.md           # Quality gate criteria
│   ├── ReleaseReadiness.md       # Release checklist
│   └── BugTemplate.md            # Bug report template
├── src/
│   ├── main/java/com/aw/
│   │   ├── core/
│   │   │   └── DriverFactory.java
│   │   └── pages/
│   │       ├── LoginPage.java
│   │       └── InventoryPage.java
│   └── test/
│       ├── java/com/aw/tests/
│       │   ├── BaseTest.java
│       │   └── LoginTests.java
│       └── resources/
│           ├── config/
│           │   ├── dev.properties
│           │   └── qa.properties
│           ├── log4j2.xml
│           └── login.xml
├── pom.xml
└── README.md
```

## Running Tests

### Run All Tests
```bash
mvn clean test
```

### Run Specific Test Class
```bash
mvn test -Dtest=LoginTests
```

### Run with Specific Environment
```bash
mvn test -Denv=qa
```

### Run with Headless Mode
```bash
mvn test -Dheadless=true
```

### Generate Allure Report
```bash
mvn allure:serve
```

Or after test execution:
```bash
mvn test
mvn allure:report
mvn allure:serve
```

## Configuration

### Environment Properties
Edit `src/test/resources/config/dev.properties` or `qa.properties` to change:
- `baseUrl`: Application URL
- `browser`: Browser type (chrome, firefox, edge)
- `explicitWaitSec`: Explicit wait timeout
- `headless`: true/false for headless mode

### Logging
Log4j2 configuration in `src/test/resources/log4j2.xml`. Default log level is INFO.

## Troubleshooting

### Log4j2 Warnings
If you see Log4j2 warnings about missing configuration:
- Verify `log4j2.xml` exists in `src/test/resources/`
- Check that log4j2 dependencies are included in `pom.xml`

### Allure Warnings
If Allure report generation fails:
- Ensure Allure plugin is installed: `mvn allure:install`
- Verify test execution completed successfully
- Check that `target/allure-results` directory contains test results

### WebDriver Issues
- WebDriverManager automatically downloads compatible drivers
- Ensure internet connection is available for first run
- Check browser version compatibility

### Java Version
If Maven build fails:
- Verify Java 21 is installed: `java -version`
- Set JAVA_HOME to Java 21 installation path
- Check Maven uses correct Java version: `mvn -version`

## Test Execution
Tests are located in `src/test/java/com/aw/tests/LoginTests.java` and cover:
- Valid login (LGN_001)
- Empty fields validation (LGN_002)
- Wrong password handling (LGN_004)

## Reporting
Allure reports provide:
- Test execution results
- Step-by-step test flow
- Screenshots (if configured)
- Historical trends

## Support
For issues or questions, refer to:
- Test Strategy: `docs/TestStrategy.md`
- Test Cases: `docs/Login_TestCases.md`
- Bug Template: `docs/BugTemplate.md`

