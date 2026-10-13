package Day 8.Exception Handling;

public class throws {
    static void readFile() throws IOException{
        FileReader file = new FileReader(fileName:"data.text";
        System.out.println("File Opened");
    }
    public static void main(String[]args){
        try{
            readFile();
        }catch(IOException e){
            System.out.println("could not find the file");
        }

    }
    
}
