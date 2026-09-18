class Car {
    // Data (Fields)
    String brand = "Toyota";
    String color = "White";
    String model = "Fortuner";

    // Behavior (Method)
    void display () {
        System.out.println("Brand:"+brand);
        System.out.println("Colour:"+color);
        System.out.println("Model:"+model);
    }
   public static void main(String[] args) {

        Car s1 = new Car();   //Create a Car object and store its reference in s1

        s1.display();  

    
    }
}





// with constructor
class Car {
    // Data (Fields)
    String brand;
    String color;
    String model;
// Default Constructor without parameter
    Car() {
     brand = "Toyota";
     color = "White";
     model = "Fortuner";
    }
    // Behavior (Method)
    void display () {
        System.out.println("Brand:"+brand);
        System.out.println("Colour:"+color);
        System.out.println("Model:"+model);
    }
   public static void main(String[] args) {

        Car s1 = new Car();   //Create a Car object and store its reference in s1

        s1.display();  

    
    }
}
