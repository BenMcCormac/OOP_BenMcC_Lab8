package ie.atu;

import java.io.File;
import java.io.IOException;

public class Part5
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a FileName:   ");
        //Specify the file name
        String fileName = System.in.read();

        //Create a new file object
        File myFile = new File(fileName);

        try
        {
            //Create a new file on the disk
            if(myFile.createNewFile())
            {
                System.out.println("File created successfully at " + myFile.getAbsolutePath());
            }
            else
            {
                System.out.println("File already exists at " + myFile.getAbsolutePath());
            }
        } catch (IOException e)
        {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }


    }
}