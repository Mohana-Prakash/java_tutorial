public class StaticBlock {
    // Every time object is created, the class loads and objects are instantiated.

    // Static block loads only one time, irrespective of how many object is created.

    // So, whenever object is created class loads first and then static block loads
    // and then objects gets initialised and then constructor loads.

    // whenever object is created, constructor created implicitly eventhough if not
    // created explicitly.

    // If you don't create the object, class does not loads.

    // Also you can load the class without creating any object by using
    // class.forname("classname").

    // static block are used to initialise the static variables.
}
