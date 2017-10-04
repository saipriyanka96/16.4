package copy;
//Package is a grouping of related types providing access protection and name
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
public class CopyingFileStream {
	//public keyword is used in the declaration of a class,method or 
			//field;public classes,method and fields can be accessed by the 
			//members of any class.
			//class defines instance and class fields,methods and inner classes as
			//well as specifying the interfaces the class implements and the 
			//immediate superclass of the class	

    public static void main(String[] args)
     //static is used for memory management
		//void is used to define the return type of the method
		//String[] args is actually an array of java.lang.String type and it's name is args here
	
    {    
    	//we are creating an object of source file where we create a file and its path 
    			//to know where the file is saved
        File sourceFile = new File("D:/sourcefile.txt");
      //we are creating an object of destination file where we create a file and its path 
		//to know where the file is saved
        File destFile = new File("D:/destinationFile.txt");
         //InputStream is representing an input stream of bytes and initializing it to null
        FileInputStream inStream = null;
      //OutputStream is representing an output stream of bytes and initializing it to null
        FileOutputStream outStream = null;
         
        try
        /*the code is prone to exceptions is placed in the try block
	      *when exception occurs that exception occurred is handled by the 
	       *catch block associated with it
	        */	            
        {
            inStream = new FileInputStream(sourceFile);
             //here it is creating a source file
            outStream = new FileOutputStream(destFile);
          //here it is creating a destination file 
            byte[] buffer = new byte[1024];
            //byte is group of binary digits or bits (usually eight) operated on as a unit.
            //buffer is essentially a blockof memory into which we can write data which can read again. 
            //allocates memory of 1024 bytes
            int length;
            /*copying the contents from input stream to
    	     * output stream using read and write methods
    	     */
            while ((length = inStream.read(buffer)) != -1) 
           //here it reads buffer's length no.of bytes from the input stream to the buffer array buffer
            //this will return no.of bytes actually read in buffer or -1 if the end of the stream is reached
            {
             //this will writes length bytes from specifed bytes array starting at offset off to thids uotput stram
            	outStream.write(buffer, 0, length);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        //this is used to execute important code such as closing connection,
        //it always executed whether is handled or not
        {
            try
            {
                inStream.close();
                //this method closes the stream and releases any system resources associated with it
                 
                outStream.close();
            }
            catch (IOException e) 
            //IOException is for when input or output is failed or interrupted
            {
            	//prints stack trace for this throwable object
            	e.printStackTrace();
            }
        }
         
        System.out.println(" the source file is copied Successfully");
      //system is final class
	      //out is a static member of system class and type printStream
	      //println is method of printStream class.ln means nextline
         
    }

}


