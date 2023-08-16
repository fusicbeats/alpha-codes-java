// public class abstract1 {
//     public static void main(String args[]){
//        Bengaltiger b = new Bengaltiger();
//        System.out.println(b.color);
//     }
// }

// abstract class Animal{
//     String color;
//     Animal(){  // This constructor changes by default color to brown
//         color = "Brown";
//     }
//     void eat(){
//         System.out.println("Eats");
//     }

//     abstract void walk(); // Must declare this in every extended class [Abstruct Function]
// }

// class Cow extends Animal{
//     void changeColor(){
//         color="white";
//     }
//     void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Tiger extends Animal{
//     Tiger(){
//         System.out.println("Tiger constructor is called");
//     }
//     void changeColor(){
//         color="Yellow";
//     }
//     void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Bengaltiger extends Tiger{
//     Bengaltiger(){
//         System.out.println("Bengal Tiger constructor is called");
//     }
// }