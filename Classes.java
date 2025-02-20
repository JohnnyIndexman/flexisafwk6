import java.util.Arrays;
// Interface for anonymous class demonstration

interface CarName {
    void carName();
}

enum Car {
    BMW, AUDI, MERCEDES, TESLA;
}
// Outer class
class OuterClass {
    private String privateMessage = "I would love to have one these cars!";
    
    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("Get me a " + Car.TESLA + " car!");
        }
    }

    // Non-static inner class
    class InnerClass {
        void showMessage() {
            // Accessing private member of the outer class
            System.out.println(privateMessage);
        }
    }

    // Method demonstrating an anonymous class
    void createAnonymousClass() {
        // Anonymous class implementing an interface
        CarName cars = new CarName() {
            public void carName() {
                System.out.println("Brand Name: " + Arrays.toString(Car.values()));
            }
        };
        cars.carName();
    }
}

