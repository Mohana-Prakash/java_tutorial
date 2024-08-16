
class StringClass {
    public static void main(String args[]) {
        // All datatype starts with small letter which is primitive
        // but the String starts with capital letter which is class, creates an object
        // eg:
        String name = "Mohan";
        name = name + " " + "Prakash";
        // Line no: 7 creates new object in heap memory (say address 101)
        // Line no: 8 creates new object in heap memory (say address 102)
        // Eventhough the variable is same, it creates a new object with diff address
        // which means class String object cannot be edited (immutable), instead it gets
        // updated with new address
        // Now address 101 is eligible for garbage collection

        // Also one more method in string class is String buffer and string builder
        // Stringbuffer and string builder are mutable
        // it gets updated without creating new object, it points to same address in
        // heap memory.
        // particularly used for thread safe and synchronised, but string builder is not
        // synchronised.
        // can not convert string buffer to string

    }
}
