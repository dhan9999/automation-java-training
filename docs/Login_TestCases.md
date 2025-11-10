# Login Test Cases

## LGN_001: Valid Login
**Title**: Verify successful login with valid credentials

**Steps**:
1. Navigate to SauceDemo login page
2. Enter valid username: `standard_user`
3. Enter valid password: `secret_sauce`
4. Click login button
5. Verify redirect to inventory page

**Expected**: User is successfully logged in and redirected to inventory page showing products

**Priority**: High

**Tags**: `@positive`, `@smoke`, `@functional`

**Data**: standard_user / secret_sauce

---

## LGN_002: Empty Fields
**Title**: Verify error message when both username and password fields are empty

**Steps**:
1. Navigate to SauceDemo login page
2. Leave username field empty
3. Leave password field empty
4. Click login button

**Expected**: Error message displayed: "Username is required"

**Priority**: High

**Tags**: `@negative`, `@validation`

**Data**: (empty) / (empty)

---

## LGN_003: Username Only
**Title**: Verify error message when only username is provided

**Steps**:
1. Navigate to SauceDemo login page
2. Enter username: `standard_user`
3. Leave password field empty
4. Click login button

**Expected**: Error message displayed: "Password is required"

**Priority**: Medium

**Tags**: `@negative`, `@validation`

**Data**: standard_user / (empty)

---

## LGN_004: Wrong Password
**Title**: Verify error message when incorrect password is entered

**Steps**:
1. Navigate to SauceDemo login page
2. Enter username: `standard_user`
3. Enter incorrect password: `wrongpass`
4. Click login button

**Expected**: Error message displayed: "Username and password do not match any user in this service"

**Priority**: High

**Tags**: `@negative`, `@security`

**Data**: standard_user / wrongpass

---

## LGN_005: Locked User
**Title**: Verify error message when locked user attempts to login

**Steps**:
1. Navigate to SauceDemo login page
2. Enter username: `locked_out_user`
3. Enter password: `secret_sauce`
4. Click login button

**Expected**: Error message displayed: "Sorry, this user has been locked out."

**Priority**: High

**Tags**: `@negative`, `@security`

**Data**: locked_out_user / secret_sauce

---

## LGN_006: Tab Order
**Title**: Verify keyboard tab navigation through login form

**Steps**:
1. Navigate to SauceDemo login page
2. Press Tab key
3. Verify focus moves to username field
4. Press Tab key
5. Verify focus moves to password field
6. Press Tab key
7. Verify focus moves to login button

**Expected**: Tab order is logical: Username → Password → Login Button

**Priority**: Medium

**Tags**: `@a11y`, `@accessibility`

**Data**: N/A

---

## LGN_007: Enter Key Submission
**Title**: Verify login submission using Enter key

**Steps**:
1. Navigate to SauceDemo login page
2. Enter username: `standard_user`
3. Enter password: `secret_sauce`
4. Press Enter key on password field

**Expected**: Login is submitted and user is redirected to inventory page

**Priority**: Medium

**Tags**: `@a11y`, `@accessibility`, `@functional`

**Data**: standard_user / secret_sauce

---

## LGN_008: XSS Probe
**Title**: Verify XSS attempt is handled safely

**Steps**:
1. Navigate to SauceDemo login page
2. Enter username: `<script>alert('XSS')</script>`
3. Enter password: `secret_sauce`
4. Click login button

**Expected**: XSS attempt is rejected, error message shown or script not executed

**Priority**: Medium

**Tags**: `@security`, `@negative`

**Data**: <script>alert('XSS')</script> / secret_sauce

---

## LGN_009: Error Clears After Success
**Title**: Verify error message clears after successful login attempt

**Steps**:
1. Navigate to SauceDemo login page
2. Enter wrong credentials and submit (see error)
3. Enter correct credentials: `standard_user` / `secret_sauce`
4. Submit login

**Expected**: Previous error message is cleared and login succeeds

**Priority**: Low

**Tags**: `@usability`, `@functional`

**Data**: wrongpass → standard_user / secret_sauce

---

## LGN_010: Session Persists
**Title**: Verify user session persists after successful login

**Steps**:
1. Navigate to SauceDemo login page
2. Login with valid credentials: `standard_user` / `secret_sauce`
3. Navigate to inventory page
4. Refresh the page

**Expected**: User remains logged in, inventory page still accessible

**Priority**: High

**Tags**: `@functional`, `@session`

**Data**: standard_user / secret_sauce

