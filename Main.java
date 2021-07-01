
import java.util.*;

public class Main {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);
    public static double roomSize;

    public static void main(String[] args) {

        int inventory = 0;
        String continue1 = "";
        double furnishedBaseArea = 0;

        //creates objects (3 of each type)
        Chair ottoman = new Chair("Ottoman chair", 1.5, "velvet", 20, "Belgium");
        Chair pouf = new Chair("Pouf chair", 1, "leather", 35, "Canada");
        Chair armchair = new Chair("Armchair", 1.5, "cotton", 17, "Egypt");
        Table dining = new Table("dining table", 1, 1, "mahogany", 50, "Spain");
        Table accent = new Table("living room accent table", 0.5, 0.5, "glass", 40, "Hawaii");
        Table cocktail = new Table("cocktail table", 1.5, 0.25, "bronze", 25, "Denmark");
        Couch chesterfield = new Couch("chesterfield", 1, 3, 1.5, "linen", 17, "France");
        Couch divan = new Couch("divan", 0.75, 2, 1, "nylon", 19, "China");
        Couch chaiseLounge = new Couch("chaise lounge", 1.25, 2.25, 1.25, "leather", 35, "Canada");
        Rug woolRug = new Rug("natural wool rug", 3.5, 2, "wool", 45, "Australia");
        Rug sheepskin = new Rug("sheepskin rug", 2, 2, "sheepskin", 50, "New Zealand");
        Rug fauxFur = new Rug("faux fur rug", 4, 3, "faux fur", 38, "United Kingdom");
 
        ArrayList<Chair> chairs = new ArrayList<>();
        chairs.add(ottoman);
        chairs.add(pouf);
        chairs.add(armchair);

        ArrayList<Table> tables = new ArrayList<>();
        tables.add(dining);
        tables.add(accent);
        tables.add(cocktail);

        ArrayList<Rug> rugs = new ArrayList<>();
        rugs.add(woolRug);
        rugs.add(fauxFur);
        rugs.add(sheepskin);

        ArrayList<Couch> couches = new ArrayList<>();
        couches.add(chesterfield);
        couches.add(divan);
        couches.add(chaiseLounge);

        //new ArrayList necessary to retrive items for sorts? this arraylist, the one that isnt
        //a class and is instead a superclass, doesn't calculate the properties of each individual class
        ArrayList<Object> allObjects = new ArrayList<>();
        allObjects.add(ottoman);
        allObjects.add(pouf);
        allObjects.add(armchair);
        allObjects.add(dining);
        allObjects.add(accent);
        allObjects.add(cocktail);
        allObjects.add(woolRug);
        allObjects.add(fauxFur);
        allObjects.add(sheepskin);
        allObjects.add(chesterfield);
        allObjects.add(divan);
        allObjects.add(chaiseLounge);

        //adding everything bought to this arraylist
        var totalItems = new ArrayList<String>();

        String[] array_everything = {"ottoman", "pouf", "armchair", "dining", "accent", "cocktail", "woolRug", "fauxFur", "sheepskin", "chesterfield", "divan", "chaiseLounge"};

        System.out.println("Welcome to the home renovation calculator.");
        System.out.println();
        System.out.println("Please enter the size of the room you wish to refurnish on the line below(metres sqaured).");

        System.out.println("If you would like to exit the program, please enter zero.");
        roomSize = numscan.nextDouble();

        while (roomSize < 0) {
            System.out.print("You entered an invalid number, please try again: ");
            roomSize = numscan.nextDouble();
        }
        if (roomSize == 0) {
            System.out.println("Understandable, have a nice day.");
        } else {
            while (true) {
                System.out.println("1. Chair");
                System.out.println("2. Table");
                System.out.println("3. Couch");
                System.out.println("4. Rug");
                System.out.println();
                System.out.println("Our store offers the following inventory of items, please enter the number of the type of item you would like to order: ");
                int inven = numscan.nextInt();
                System.out.println();

                switch (inven) {
                    case 1:
                        for (int i = 0; i < chairs.size(); i++) {
                            Chair elem = chairs.get(i);
                            System.out.println((i + 1) + ". " + elem.getName()); //chair items in an arraylist and prints out names
                        }
                        break;
                    case 2:
                        for (int i = 0; i < tables.size(); i++) {
                            Table elem = tables.get(i);
                            System.out.println((i + 1) + ". " + elem.getName()); //table items in an arraylist and prints out names
                        }
                        break;
                    case 3:
                        for (int i = 0; i < couches.size(); i++) {
                            Couch elem = couches.get(i);
                            System.out.println((i + 1) + ". " + elem.getName()); //couch items in an arraylist and prints out names
                        }
                        break;
                    case 4:
                        for (int i = 0; i < rugs.size(); i++) {
                            Rug elem = rugs.get(i);
                            System.out.println((i + 1) + ". " + elem.getName()); //rug items in an arraylist and prints out names
                        }
                        break;
                    default:
                        break;
                }
                System.out.println("Please enter the name of the particular style of option you are interested in learning about.");
                int choice = numscan.nextInt();
                System.out.println();
                System.out.println("Here are a list of the properties of that item.");

                switch (inven) {
                    case 1:
                        System.out.println("Item name: " + chairs.get(choice - 1).getName());
                        System.out.println("Material: " + chairs.get(choice - 1).getMaterial());
                        System.out.println("Import: " + chairs.get(choice - 1).getImportLocation());
                        break;
                    case 2:
                        System.out.println("Item name: " + tables.get(choice - 1).getName());
                        System.out.println("Material: " + tables.get(choice - 1).getMaterial());
                        System.out.println("Import: " + tables.get(choice - 1).getImportLocation());
                        break;
                    case 3:
                        System.out.println("Item name: " + couches.get(choice - 1).getName());
                        System.out.println("Material: " + couches.get(choice - 1).getMaterial());
                        System.out.println("Import: " + couches.get(choice - 1).getImportLocation());
                        break;
                    case 4:
                        System.out.println("Item name: " + rugs.get(choice - 1).getName());
                        System.out.println("Material: " + rugs.get(choice - 1).getMaterial());
                        System.out.println("Import: " + rugs.get(choice - 1).getImportLocation());
                        break;
                    default:
                        break;
                }

                System.out.println();
                System.out.println();
                System.out.println("Would you like to purchase this item? (y/n)");
                String purchase = wordscan.nextLine();
                if (purchase.equalsIgnoreCase("y")) {
                    System.out.println("Please enter the style name to confirm the purchase.");
                    String confirm = wordscan.nextLine();
                    inventory++;
                    totalItems.add(confirm); //add
                    switch (inven) {
                        case 1:
                            totalItems.add(chairs.get(choice - 1).getName());
                            break;
                        case 2:
                            totalItems.add(tables.get(choice - 1).getName());
                            break;
                        case 3:
                            totalItems.add(couches.get(choice - 1).getName());
                            break;
                        case 4:
                            totalItems.add(rugs.get(choice - 1).getName());
                            break;
                        default:
                            break;
                    }

                    if (inventory > 5) {
                        System.out.println("Warning: you have now exceeded five items.");
                    }
                } else if (purchase.equalsIgnoreCase("n")) {
                    System.out.println("That's okay");
                }
                
                for(Chair item: chairs){
                    furnishedBaseArea = furnishedBaseArea + item.getBaseArea();
                }for(Rug item: rugs){
                    furnishedBaseArea = furnishedBaseArea + item.getBaseArea();
                }for(Table item: tables){
                    furnishedBaseArea = furnishedBaseArea + item.getBaseArea();
                }for(Couch item: couches){
                    furnishedBaseArea = furnishedBaseArea + item.getBaseArea();
                }
                
                if (furnishedBaseArea > roomSize){
                    System.out.println("WARNING! You now have more items than space in your room.");
                    System.out.println("Please proceed to checkout.");
                    
                }
                System.out.println("You may not have enough space for everything. Please proceed to checkout.");//see if we can automatically jump to checkout

                System.out.println("Please enter 'done' if you would like to see your total shopping list and checkout.");
                System.out.println("Otherwise, you will be shown the entire inventory again.");
                continue1 = wordscan.nextLine();
                if (continue1.equalsIgnoreCase("done")) {
                    break;
                }
            }//end while

            System.out.println("Please enter the exact name of the item you would like to search for:");
            String styleSearch = wordscan.nextLine();
            int index = binarySearch(array_everything, styleSearch);
            if (index == -1){
                System.out.println("Sorry. Not found. Please try again later.");
            } else{
                //index is found
                for (int i = 0; i < chairs.size(); i++) {
                    if ((chairs.get(i).toString()).equalsIgnoreCase(array_everything[index])){
                        System.out.println();
                        System.out.println("Item name: " + chairs.get(i).getName());
                        System.out.println("Material: " + chairs.get(i).getMaterial());
                        System.out.println("Import: " + chairs.get(i).getImportLocation());
                    }
                }for (int i = 0; i < couches.size(); i++) {
                    if ((couches.get(i).toString()).equalsIgnoreCase(array_everything[index])){
                        System.out.println();
                        System.out.println("Item name: " + couches.get(i).getName());
                        System.out.println("Material: " + couches.get(i).getMaterial());
                        System.out.println("Import: " + couches.get(i).getImportLocation());
                    }
                } for (int i = 0; i < rugs.size(); i++) {
                    if ((rugs.get(i).toString()).equalsIgnoreCase(array_everything[index])){
                        System.out.println();
                        System.out.println("Item name: " + rugs.get(i).getName());
                        System.out.println("Material: " + rugs.get(i).getMaterial());
                        System.out.println("Import: " + rugs.get(i).getImportLocation());
                    }
            } for (int i = 0; i < tables.size(); i++) {
                if ((tables.get(i).toString()).equalsIgnoreCase(array_everything[index])){
                    System.out.println();
                    System.out.println("Item name: " + tables.get(i).getName());
                    System.out.println("Material: " + tables.get(i).getMaterial());
                    System.out.println("Import: " + tables.get(i).getImportLocation());
                }
            }
        }

            // if (styleSearch.equals(ottoman.getName()) || styleSearch.equals(pouf.getName()) || styleSearch.equals(armchair.getName())) {
            //     if (styleSearch.equals(ottoman.getName())) {
            //         System.out.println(" properties:" );
            //         System.out.println(ottoman.getMaterial());
            //         System.out.println(ottoman.getImportLocation());
            //         System.out.println("$" + ottoman.cost());
            //     } else if (styleSearch.equals(pouf.getName())) {
            //         System.out.println(" properties:" );
            //         System.out.println(pouf.getMaterial());
            //         System.out.println(pouf.getImportLocation());
            //         System.out.println("$" + pouf.cost());
            //     } else {
            //         System.out.println(" properties:" );
            //         System.out.println(armchair.getMaterial());
            //         System.out.println(armchair.getImportLocation());
            //         System.out.println("$" + armchair.cost());
            //     }
            // } else if (styleSearch.equals(dining.getName()) || styleSearch.equals(accent.getName()) || styleSearch.equals(cocktail.getName())){
            //     if (styleSearch.equals(dining.getName())) {
            //         System.out.println(" properties:" );
            //         System.out.println(dining.getMaterial());
            //         System.out.println(dining.getImportLocation());
            //         System.out.println("$" + dining.cost());
            //     } else if (styleSearch.equals(accent.getName())) {
            //         System.out.println(" properties:" );
            //         System.out.println(accent.getMaterial());
            //         System.out.println(accent.getImportLocation());
            //         System.out.println("$" + accent.cost());
            //     } else {
            //         System.out.println(" properties:" );
            //         System.out.println(cocktail.getMaterial());
            //         System.out.println(cocktail.getImportLocation());
            //         System.out.println("$" + cocktail.cost());
            //     }
            // } else if (styleSearch.equals(woolRug.getName()) || styleSearch.equals(fauxFur.getName()) || styleSearch.equals(sheepskin.getName())){
            //     if (styleSearch.equals(woolRug.getName())) {
            //         System.out.println(" properties:" );
            //         System.out.println(woolRug.getMaterial());
            //         System.out.println(woolRug.getImportLocation());
            //         System.out.println("$" + woolRug.cost());
            //     } else if (styleSearch.equals(fauxFur.getName())) {
            //         System.out.println(" properties:" );
            //         System.out.println(fauxFur.getMaterial());
            //         System.out.println(fauxFur.getImportLocation());
            //         System.out.println("$" + fauxFur.cost());
            //     } else {
            //         System.out.println(" properties:" );
            //         System.out.println(sheepskin.getMaterial());
            //         System.out.println(sheepskin.getImportLocation());
            //         System.out.println("$" + sheepskin.cost());
            //     }
            // } else if (styleSearch.equals(chesterfield.getName()) || styleSearch.equals(divan.getName()) || styleSearch.equals(chaiseLounge.getName())){
            //     if (styleSearch.equals(chesterfield.getName())) {
            //         System.out.println(" properties:" );
            //         System.out.println(chesterfield.getMaterial());
            //         System.out.println(chesterfield.getImportLocation());
            //         System.out.println("$" + divan.cost());
            //     } else if (styleSearch.equals(fauxFur.getName())) {
            //         System.out.println(" properties:" );
            //         System.out.println(divan.getMaterial());
            //         System.out.println(divan.getImportLocation());
            //         System.out.println("$" + divan.cost());
            //     } else {
            //         System.out.println(" properties:" );
            //         System.out.println(chaiseLounge.getMaterial());
            //         System.out.println(chaiseLounge.getImportLocation());
            //         System.out.println("$" + chaiseLounge.cost());
            //     }
            // } else{
            //     System.out.println("Sorry, this choice is not valid. Try again later.");
            //     break;
            // }
            
            System.out.println("Please press 1 if you would like to sort alphabetically or");
            System.out.println(" 2 if you want to sort by price");
            int sort = numscan.nextInt();
            if (sort == 1) {
                //sort alphabetically
            } else if (sort == 2) {

                //sort by price- lowest to highest
            } else {
                System.out.println("Sorry I am unable to analyze your answer.");
            }

        }//end if

        //checkout 
        if (continue1.equalsIgnoreCase("y")) {
            System.out.println("You purchased a total of " + inventory + " item(s).");
            System.out.println("Here is your list and prices: ");

            for (int i = 0; i < allObjects.size(); i++) {
                if((allObjects.get(i).toString().equalsIgnoreCase("ottoman")) || allObjects.get(i).toString().equalsIgnoreCase("pouf") || allObjects.get(i).toString().equalsIgnoreCase("armchair")){
                    if(allObjects.get(i).toString().equalsIgnoreCase("ottoman")){
                        System.out.println(allObjects.get(i).toString() + ".........  $" + ottoman.cost());
                    } else if (allObjects.get(i).toString().equalsIgnoreCase("pouf")){
                        System.out.println(allObjects.get(i).toString() + ".........  $" + pouf.cost());
                    } else{
                        System.out.println(allObjects.get(i).toString() + ".........  $" + armchair.cost());
                    }
                    
                } else if ((allObjects.get(i).toString().equalsIgnoreCase("dining")) || allObjects.get(i).toString().equalsIgnoreCase("accent") || allObjects.get(i).toString().equalsIgnoreCase("cocktail")){
                    if(allObjects.get(i).toString().equalsIgnoreCase("dining")){
                        System.out.println(allObjects.get(i).toString() + ".........  $" + dining.cost());
                    } else if (allObjects.get(i).toString().equalsIgnoreCase("accent")){
                        System.out.println(allObjects.get(i).toString() + ".........  $" + accent.cost());
                    } else{
                        System.out.println(allObjects.get(i).toString() + ".........  $" + cocktail.cost());
                    }
                } else if ((allObjects.get(i).toString().equalsIgnoreCase("woolRug")) || allObjects.get(i).toString().equalsIgnoreCase("fauxFur") || allObjects.get(i).toString().equalsIgnoreCase("sheepskin")){
                    if(allObjects.get(i).toString().equalsIgnoreCase("woolRug")){
                        System.out.println(allObjects.get(i).toString() + ".........  $" + woolRug.cost());
                    } else if (allObjects.get(i).toString().equalsIgnoreCase("fauxFur")){
                        System.out.println(allObjects.get(i).toString() + ".........  $" + fauxFur.cost());
                    } else{
                        System.out.println(allObjects.get(i).toString() + ".........  $" + sheepskin.cost());
                    }
                } else if ((allObjects.get(i).toString().equalsIgnoreCase("chesterfield")) || allObjects.get(i).toString().equalsIgnoreCase("divan") || allObjects.get(i).toString().equalsIgnoreCase("chaiseLounge")){
                    if(allObjects.get(i).toString().equalsIgnoreCase("chesterfield")){
                        System.out.println(allObjects.get(i).toString() + ".........  $" + chesterfield.cost());
                    } else if (allObjects.get(i).toString().equalsIgnoreCase("divan")){
                        System.out.println(allObjects.get(i).toString() + ".........  $" + divan.cost());
                    } else{
                        System.out.println(allObjects.get(i).toString() + ".........  $" + chaiseLounge.cost());
                    }
                }
            }

        }//end checkout

        System.out.println("Have a great day.");
    }//end main


    //methods
    static int binarySearch(String[] arr, String x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            int res = x.compareTo(arr[m]);
            // Check if x is present at mid
            if (res == 0)
                return m;
            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        return -1;
    }

    public static int binarySearch(String values[], int len, String target) {     //array of Strings

        int max = len - 1;
        int min = 0;
        int guess;

        while (max >= min) {
            guess = (max + min) / 2;

            if (values[guess].equalsIgnoreCase(target)) {
                return guess;
            } else if (values[guess].compareToIgnoreCase(target) > 0) { //first string alphabetically comes first
                max = (guess - 1);
            } else {  //second string alphabetically comes first
                min = (guess + 1);
            }
        }
        //when target is not present
        return -1;
    }//end method

    //bubbleSort for String array
    public static void bubbleSort(ArrayList<String> array) {
        String hold;
        boolean x = false;

        while (x == false) {
            x = true;
            for (int i = 0; i < (array.size() - 1); i++) {
                if (array.get(i).compareToIgnoreCase(array.get(i + 1)) > 0) { //means that first one comes first

                    hold = array.get(i + 1);

                    array.set(i + 1, array.get(i));
                    array.set(i, hold);
                    x = false;
                }
            }

        }//end while

    }//end bubbleSort

}//end class
