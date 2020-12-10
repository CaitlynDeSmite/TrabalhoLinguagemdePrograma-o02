
package filedesmonstration;
import java.io.File;
import java.util.Scanner;

public class FileDesmonstration {
     public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter file or directory name: ");
            analyzePath(input.nextLine());
    }
public static void analyzePath(String path) {
    File name = new File(path);
    if(name.exists()){
        System.out.printf("EsteComputador/Documento",
                name.getName(),"exits",
                (name.isFile()?"is a file":"is not a file"),
                (name.isDirectory()?"is a directory":"is not a directory"),
                (name.isAbsolute()?"is absolute path":"is not absolute path"),
                "Last modified",name.lastModified(),
                "length",name.length(),
                "Path",name.getPath(),
                "Absolute path",name.getAbsolutePath(),
                "Parebt",name.getParent());
       
        if(name.isDirectory()){
        String[] directory=name.list();
        System.out.println("/n/Direcroty contents: /n");
       
        for(String directoryName : directory){
            System.out.println(directoryName);
        }
    }
        else{
                System.out.printf("%s %S",path,"does not exist" );
                
       }
    }
 }   
}
