import java.util.Scanner;
public class Main2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        books ob = new books();
        int choice;
        int searchChoice;
        do {

            ob.dispMenu();
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    book b = new book();

                    ob.addBook(b);

                    break;
                case 2:
                    System.out.println("Press 1 for search by category.");
                    System.out.println("Press 2 for search by Author's name.");
                    System.out.println("Press 3 for search by Book's Title.");
                    searchChoice = input.nextInt();
                    switch (searchChoice) {
                        case 1:
                            ob.searchByCategory();
                            break;
                        case 2:
                            ob.searchByAuthorName();
                            break;
                        case 3:
                            ob.searchByTitle();
                            break;
                    }
                    break;
                case 3:
                    ob.showAllBooks();
                    break;
                default:
                    System.out.println("ENTER BETWEEN 0 TO 4.");
                case 4:

                    ob.sortbyauthor();
                case 5:

                    ob.sortbycategories();

            }
        }
        while (choice != 0);
    }
}
