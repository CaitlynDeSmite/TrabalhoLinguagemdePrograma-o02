
package createtextfiletest;
import com.deitel.ch17.AccountRecord;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
        
public class CreateTextFile {
    private Formatter output;
    public void openFile(){
    try{
        output = new Formatter("clients.txt");
    }
    catch(SecurityException securityException){
        System.err.println("You do not have write acess to this file");
        System.exit(1);
        
    }
    catch(FileNotFoundException fileNotFoundException){
        System.err.println("Error opening or Creating file");
        System.exit(1);
    }
  }
    public void addRecords(){
        AccountRecord record = new AccountRecord();
        Scanner input = new Scanner(System.in);
        System.out.printf("%s\n%s\n%s\n%s\n\s","to terminate input,type the end of file indicator","when you ar promoted to enter input","on UNIX/Linux/Maca OS X Type <ctrl> d then press enter","on Windows type <ctrl> z then press Enter");
        System.out.printf("%s\n%s","Enter account number(>0),%rst name, last name and balance");
    
        While(input.hasNext()){
            try{
                record.setAccount(input.nextInt());
                record.setFirstName(input.next());
                record.setLastName(input.next());
                record.setBalance(input.nextDouble());
                
            
            
            if(record.getAccount()>0){
                output.format("%d %s %s %.2f/n");
                record.getAccount();
                record.getFirstName();
                record.getLastName();
                record.getBalance();
            }
            else{
            System.out.println("Account number must be greater thna 0");
            
         }
       }
            catch(FormatterClosedException formatterClosedException){
               System.err.println("Error writting ti file");
               return;
            }
            catch(NoSuchElementException elementException){
                System.err.println("invalid input Please try again");
                input.nextLine();
            }
            System.out.printf("%s %s\n%s","Enter account number(>0)","first name","last name and balance","?");
            
        }
        public void closeFile(){
            if(output !=null){
                output.close();
            }    
        }


   
    }



