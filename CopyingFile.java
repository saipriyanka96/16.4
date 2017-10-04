package copy;
//Package is a grouping of related types providing access protection and name

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

import javax.print.attribute.standard.Destination;
public class CopyingFile {
	//public keyword is used in the declaration of a class,method or 
		//field;public classes,method and fields can be accessed by the 
		//members of any class.
		//class defines instance and class fields,methods and inner classes as
		//well as specifying the interfaces the class implements and the 
		//immediate superclass of the class
	public static void main(String[] args) throws IOException {
		  //static is used for memory management
		//void is used to define the return type of the method
		//String[] args is actually an array of java.lang.String type and it's name is args here
	//throws is akeyword which is used in the signature of method that this method might throw one of the listed type exceptions
 //IOException is for when input or output is failed or interrupted
		// TODO Auto-generated method stub
		File sourceFile=new File("D:/Sourcefile.txt");
//we are creating an object of source file where we create a file and its path 
		//to know where the file is saved
//creating a path  variable name as from and getting the the source file 
		File destinationFile=new File("assignment.txt");
		//we are creating an object of destination file where we create a file and its path 
				//to know where the file is saved
//creating  another path of declaring a variable name as to and passing the destination file where as the source file content will be copied to the destination file
		Files.copy(sourceFile.toPath(),destinationFile.toPath());
//creating the the Files.copy()method to copy the file using this copy method and replacing the existing file 
		

		System.out.println("success");
		//if the file is copied then it will print success
	}

}
