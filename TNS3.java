public class TNS3 {
    public static void main(String[] args) {
        int rows =5;
        int cols =5;
        // Hollow Rectangle pattern
        /*for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
}
            }
            System.out.println();
        }
        //Inverted Triangle pattern
        for (int i=rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {               
                    System.out.print("* ");
                }
                System.out.println();
            }
           
        // Right-aligned triangle
        //for space
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            //for star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

     }

            for(int i = 1; i <= rows; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }

             for(int i = rows; i >= 1; i--){
                for(int j = 1; j <= i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
                int count=1;
              for(int i = 1; i <= rows; i++){
                for(int j = 1; j <=i ; j++){
                    System.out.print(count+" ");
                    count++;
                }
                System.out.println();
            }*/

             for(int i = 1; i <= rows; i++){
                for(int j = 1; j <=i ; j++){
                    if((i+j)%2==0){
                        System.out.print(1+" ");
                    }
                    else{
                        System.out.print(0+" ");
                    }
                  
                    
                }
                System.out.println();
            }

        
}
}