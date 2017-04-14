# verify
Java assertions framework for tests

# Usage:
All verifications are created through `Verify.that()`, passing a variable / runnable / supplier / etc.

On the returned type, a verification can be executed, for example is not null:
`Verify.that(fooVariable).isNotNull();`
If the verification fails, an VerifcationException will be thrown.
