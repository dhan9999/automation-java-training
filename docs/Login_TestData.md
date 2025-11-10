# Login Test Data

| Username | Password | Notes |
|----------|----------|-------|
| `standard_user` | `secret_sauce` | Valid user, full access |
| `locked_out_user` | `secret_sauce` | Locked account, should show error |
| `standard_user` | `wrongpass` | Invalid password for valid user |
| (empty) | (empty) | Both fields empty - validation test |
| `standard_user` | (empty) | Username only - validation test |
| (empty) | `secret_sauce` | Password only - validation test |
| `<script>alert('XSS')</script>` | `secret_sauce` | XSS probe test |

## Notes
- Standard user (`standard_user`) provides full access to the application
- Locked out user (`locked_out_user`) simulates account security restriction
- Empty fields test input validation
- XSS probe validates security handling

