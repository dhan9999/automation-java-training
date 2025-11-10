# Shakedown Testing - Login Feature

## Charter
15-minute exploratory testing session focusing on login functionality edge cases and usability.

## Test Scenarios

### 1. Empty Submit
- Action: Submit login form with both fields empty
- Expected: Validation error displayed

### 2. Username Only
- Action: Enter username, leave password empty, submit
- Expected: Password required error

### 3. Password Only
- Action: Enter password, leave username empty, submit
- Expected: Username required error

### 4. Wrong Credentials
- Action: Submit with invalid username/password combination
- Expected: Authentication error message

### 5. Happy Path
- Action: Submit with valid credentials (standard_user/secret_sauce)
- Expected: Successful login, redirect to inventory

### 6. Tab Order
- Action: Navigate form using Tab key
- Expected: Logical focus order (username → password → button)

### 7. Enter Key
- Action: Submit form using Enter key on password field
- Expected: Form submits successfully

### 8. Mobile Layout Check (375px)
- Action: Resize browser to 375px width, verify layout
- Expected: Form remains usable, no horizontal scroll, elements properly stacked

## Findings
_(To be filled during exploratory session)_

- Issue 1:
- Issue 2:
- Issue 3:

