public class Main {
    public static void main(String[] args) {
        // Using static nested class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        // Using non-static inner class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.showMessage();

        // Using an anonymous class
        outer.createAnonymousClass();
    }
}
