import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        Scanner obj3=new Scanner(System.in); 

        int choice =0;
        int a;
        while(choice !=3){

            System.out.println(" Enter 1- for Module 1 (Student Details) \n Enter 2- for Module 2 (Book categories and authors) \n Enter 3- for Exit ");
            choice =obj.nextInt();

            if (choice == 1) {
            Module1 obj1=new Module1();
                System.out.println("Enter student's name: ");
            obj1.name=obj.nextLine();obj1.name=obj.nextLine();
                System.out.println("Enter the father's name: ");
                obj1.fname=obj.nextLine();
                System.out.println("Enter university id: ");
                obj1.uni_id=obj.nextLine();
                System.out.println("Enter the User id: ");
                obj1.uid=obj.nextLine();
                System.out.println("In which semester do you study:");
                obj1.sem=obj.nextInt();

                obj1.getdata(obj1.name, obj1.fname, obj1.uid,obj1.uni_id,obj1.sem);
                obj1.setdata();
            }

            else if(choice ==2){
                Module2 obj2=new Module2();
                System.out.println("Which Genre of books or authors are you looking for?\n");
                System.out.println("1. Self-help");
                System.out.println("2. Romance");
                System.out.println("3. Business");
                System.out.println("4. Authors");
                System.out.println("5. All Genres and Authors\n ");
                System.out.println("Enter your choice: ");
                a=obj3.nextInt();
                switch(a)
                {
                    case 1:
                    obj2.self_help();
                    break;
                    case 2:
                    obj2.romance();
                    break;
                    case 3:
                    obj2.business();
                    break;
                    case 4:
                    obj2.authors();
                    break;
                    case 5:
                    obj2.self_help();
                    obj2.romance();
                    obj2.business();
                    obj2.authors();
                    break;
                    default:
                    System.out.println(" Error: Enter valid choice\n");
                    continue;
                }
                
            }
            }


        }

    }