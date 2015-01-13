package example;

/**
 * This is an example class to demonstrate Javadoc. Javadoc only generates
 * documentation for classes inside packages.
 */
public class FooBar {
    /**
     * This is a description for a function. The first sentence is used as a
     * short summary, with subsequent sentences appearing in the detailed
     * description of the function.
     */
    public String getBar() {
        return "bar";
    }

    public String getFoo() {
        return "foo";
    }

    /**
     * Function descriptions can also use keywords such as:
     *  @param str This describes a parameter for the function, identified by
     *      the parameters name.
     *  @return This describes what the function returns.
     */
    public boolean isFooBar(String str) {
        return str.equals("foo") || str.equals("bar");
    }
}
