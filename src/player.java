import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class player {
    public static void main(String[] args) {
//        Play audio
        String filepath="src\\PYAAR_ [KUNyHCYRcno].wav";
        File file= new File(filepath);


        try (Scanner scanner=new Scanner(System.in);
             AudioInputStream audiostream= AudioSystem.getAudioInputStream(file)){

            Clip clip=AudioSystem.getClip();
            clip.open(audiostream);



            String respone="";

            while (!respone.equals("Q")){
                System.out.println("P=Play");
                System.out.println("S=stop");
                System.out.println("Q=Quit");

                System.out.print("Enter=");

                respone=scanner.next();

                switch (respone){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "Q" -> clip.close();
                }

            }

        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Runtime Exception");
        }
        catch (IOException e) {
            System.out.println("something went wrong");
        }
        catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }

    }
}
