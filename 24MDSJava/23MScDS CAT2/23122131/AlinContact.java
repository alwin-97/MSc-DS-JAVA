 alin.Person; //importing person clss from pckage alin

//importing other neccessary pckages to run the program
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//main program for lin with AlinContact as name
public class AlinContact{
    private static final String PERSONS_FILE= "persons.csv";    //static function
    private List<persons> Person = new ArrayList<>();           //creating array of Person details to store the persons' details
    public static void main(String[] args){
    
    //adding new contacts
    public void addPerson(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter person details");
        System.out.println("Enter name:");
        String name = Scanner.nextLine();
        System.out.println("Enter phone number");
        int phoneno = Scanner.nextInt();
        System.out.println("Enter Email ID:");
        String email = Scanner.nextLine();
        Person person = new Person(name, phoneno, email);
        person.add(persons);
        savePersonsToFile(persons);
        System.out.println("Persons' details addes successfully");
        private void SavePersonToFile(Person persons)
        {
            try(FileWriter fw = new FileWriter(PERSONS_FILE,true));
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            {
                out.println(persons.toString());
            }
            catch(IOException e){
                System.out.println("Error writing to file");

            }
            }
            //listing contacts
            public void listPersons()
            {
                persons.forEach(System.out.println);

            }
        public void view Persons(){
            try(BufferedReader bw = new BufferedReader(new FileReader(PERSONS_FILE)));
            {
                String line;
                while((line=br.readLine())!=null){
                    System.out.println(line);

                }
            }
            catch(IOException e){
              System.out.println("Error reading from file");  
            }
        }
        public void load Persons(){
             try(BufferedReader bw = new BufferedReader(new FileReader(PERSONS_FILE)));
            {
                String line;
                while((line=br.readLine())!=null){
                    String [] detils= line.split(",");
                    String name= details[0];
                    int phoneno = details[1];
                    String email= details[2];
                    persons.add(new persons(name,phoneno,email));

                 }
            }
            catch(IOException e){
              System.out.println("Error reading from file");  
            }
            public static void main(string[] args){
                AlinContact alinContact = new AlinContact();
                alinContact.load Persons();
                Scanner scanner= new Scanner(System.in);
                //Menu with option[Adding new contact, searching for an existing contact, listing contacts]
                while(true){                            
                    System.out.println("Menu");
                    System.out.println("1.Adding new contact");
                    System.out.println("2.Searching for an existing contact");
                    System.out.println("3.Listing contacts");
                    System.out.println("4.Exit");
                    System.out.println("Enter choice");
                    int choice= scnner.nextInt();
                    Scanner.nextLine();
                    //switch case to call the required functions according to the choice
                    Switch(choice){
                        case 1:
                            alinContact.addPerson();
                            break;
                        case 2:
                            alinContact.searchPerson();
                            break;
                        case 3:
                            alinContact.listPerson();
                            break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice");       
                        }
                    }
                }
            }
        }
    }
}
