# Test Strategy - SauceDemo Login Feature

## Objective
Validate the login functionality of SauceDemo application ensuring secure access, proper validation, usability, and cross-browser compatibility.

## In Scope
- Functional login with valid credentials
- Input validation (empty fields, partial inputs)
- Error handling for invalid credentials
- Locked user account handling
- Keyboard navigation and accessibility (tab order, Enter key)
- Basic security checks (XSS prevention)
- Session management
- Cross-browser compatibility (Chrome, Firefox, Edge)

## Out of Scope
- Password reset functionality
- Remember me / persistent sessions
- OAuth/SSO integrations
- Mobile device testing
- Performance/load testing
- Deep security penetration testing

## Risks
- **High**: Invalid credentials bypass authentication
- **Medium**: Accessibility issues blocking keyboard-only users
- **Medium**: Session not persisting after successful login
- **Low**: Error messages not clearing properly
- **Low**: Cross-browser inconsistencies

## Environments
- **DEV**: https://www.saucedemo.com (development validation)
- **QA**: https://www.saucedemo.com (pre-production testing)

## Test Types
1. **Functional Tests**: Valid login, invalid credentials, locked user
2. **Negative Tests**: Empty fields, username-only, wrong password
3. **Basic Accessibility**: Tab order, Enter key submission
4. **Cross-Browser Sanity**: Chrome, Firefox, Edge (smoke tests)
5. **Security Hygiene**: XSS probe validation

## Entry Criteria
- Application deployed to QA environment
- Test data prepared (valid/invalid credentials)
- Test environment accessible
- TestNG suite configured

## Exit Criteria
- All critical test cases (LGN_001, LGN_004) passing
- 95%+ pass rate for smoke tests
- Zero Sev1/Sev2 defects
- All accessibility blockers resolved
- All negative test scenarios validated

## Tooling
- **Language**: Java 21
- **Build Tool**: Maven
- **Test Framework**: TestNG 7.10.2
- **Browser Automation**: Selenium 4
- **Driver Management**: WebDriverManager 5.8.0
- **Reporting**: Allure 2.26.0
- **Logging**: Log4j2 2.22.1

## Reporting
- Allure HTML reports generated after test execution
- Test execution logs via Log4j2 (console output)
- Traceability matrix mapping requirements to test cases

## Traceability
Requirements mapped to test cases via `Traceability.csv`:
- R-LOGIN-REDIRECT → LGN_001
- R-LOGIN-VALIDATION → LGN_002, LGN_003, LGN_004
- R-LOCKED-USER → LGN_005
- R-A11Y-USABILITY → LGN_006, LGN_007
- R-SECURITY-HYGIENE → LGN_008

