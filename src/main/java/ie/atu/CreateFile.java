package ie.atu;

import java.io.*;

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

        //Use FileWriter to write to the File
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName, true)))
        {
            writer.println("This line will be appended");
            writer.printf("Appended formatted content:");

            System.out.println("Content Successfully Added");
        }
        catch (IOException e)
        {
            System.out.println("An Error has occurred");
            e.printStackTrace();
        }

    }
}
