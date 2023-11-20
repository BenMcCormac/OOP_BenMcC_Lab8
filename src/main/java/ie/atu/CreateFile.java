package ie.atu;

import java.io.File;
import java.io.IOException;

public class CreateFile
{
    public static void main(String[] args)
    {
        //Specify the file name
        String fileName = "File13.txt";

        //Create a new file object
        File myFile = new File(fileName);

        try
        {
            //Create a new file on the disk
            if(myFile.createNewFile())
            {
                System.out.println("File created successfully at " + myFile.getAbsolutePath());

                System.out.println("File length = " + myFile.length());
            }
            else
            {
                System.out.println("File already exists at " + myFile.getAbsolutePath());

                if(myFile.exists())
                {
                    myFile.delete();

                    System.out.println("\nFile has been deleted");
                }
            }
        } catch (IOException e)
        {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

    }
}
