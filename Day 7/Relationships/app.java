// public class app {
//     public static void main(String[]args){
//         car sc = new car();
//         sc.drive();
//     }
    
// }

// public class app {
//      public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         Address A1 = new Address()
//         Student S1 = new Student()
//      }
    
//  } 

class app{
    public static void main(String[] args){
Battery phbattery = new Battery(capacitymaH: 250);
Camera phcam = new Camera(pix: 450);
Phone motorola = new Phone(brand: "Pixel", phbattery, phcam);
motorola.snapPicture();
}
}
