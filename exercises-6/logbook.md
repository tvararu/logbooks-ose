For the `Router` exercise, I had to figure out what the most likely best practice is for redirecting the `DatagramPacket` to the appropriate host and port.

At first I thought of recycling code from `Sender1` in order to get the bytes and use them to construct a new `DatagramPacket` object, but a quick look into the [DatagramPacket Java documentation](https://docs.oracle.com/javase/7/docs/api/java/net/DatagramPacket.html) revealed the much more convenient `setAddress` and `setPort` methods. This made the task trivial.
