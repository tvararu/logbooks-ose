For the first exercise I decided to add a method that helps format the time to the cleaner HH:MM:SS format.

In place of the `String.valueOf` calls I have changed to a call to an internal, private `Format` method. This method also calls `String.valueOf`, but before that it performs some simple additional logic to decide if the returning value should have a prefixing `0` or not.

After this modification, running the second exercise produces output that is pretty much identical to the clock that the operating system displays in my menu bar.
