class Storage {
    // class object are stored in heap memory
    // Instance variables which belongs to object are also stored in heap memory

    // methods contains code (byte code) which is stored in method area in jvm (is
    // not the part of stack memory)
    // but method execution are stored in stack memory
    // methods contains local variable are stored in stack memory
    // so method area is not the part of stack memory, it is a separate memory area
    // within jvm

    // size of the stack is smaller than heap memory
    // Variables and data stored in the stack are short-lived; they only exist for
    // the duration of the method execution.

    // The stack and heap are connected via reference variables.
}
