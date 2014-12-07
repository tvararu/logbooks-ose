The reason that `LengthOfFilesX` exits when a file that doesn't exist is provided is because this case is not being considered; ergo, `java.io.FileNotFoundException` is not being resolved and bubbles up to the `main` method.

For the `ReadFile` application, I opted to use very similar code, but store the result of `f.read()` in an `integer` variable to facilitate displaying it and checking whether the file is empty.
