// used for user input
import java.util.Scanner;

public class Main {
    // input
    public static Scanner scanner = new Scanner(System.in);

    // items the user buys, these variables will be stored and printed to show what the user has bought
    public static int[] how_many_in_inventry_prescription_drugs = {0, 0, 0, 0, 0};
    public static int[] how_many_in_inventry_medical_equipment = {0, 0, 0, 0, 0, 0};
    public static int[] how_many_in_inventry_supplements = {0, 0, 0, 0};

    // shoping cart items, how many items does the user want to have
    public static int[] how_many_in_cart_prescription_drugs = {0, 0, 0, 0, 0};
    public static int[] how_many_in_cart_medical_equipment = {0, 0, 0, 0, 0, 0};
    public static int[] how_many_in_cart_supplements = {0, 0, 0, 0};

    // the prices of the items
    public static int[] shoping_cart_prices_prescription_drugs = {63, 112, 43, 15, 10};
    public static int[] shoping_cart_prices_medical_equipment = {7, 13, 10, 17, 4, 4};
    public static int[] shoping_cart_prices_supplements = {10, 380, 18, 5};

    // money owned and spent
    public static int money_owned = 0;
    public static int money_spent = 0;

    public static void main(String[] args) {
        String option;

        // welcome screen
        Clear_Screeen();
        System.out.println("Welcome to our BRAND NEW online Pharmacy. Helthcare from anywere (our helthcare is not avalible anywere)\n");
        System.out.println("(Press enter to continue)");
        option = scanner.nextLine();

        // infinite loop, the user will return the here and program wont end until the user selects exit
        while (true) {
            Clear_Screeen();
            System.out.println("Menu\n");
            System.out.println("Owned money: $"+money_owned);
            System.out.println("1-Shop, 2-Owned Items, 3-Withdraw Money, 4-Terms And Conditions, 5-Quit\n");
            System.out.println("(What would you like to select)");
            // user has to select one of the options
            option = scanner.nextLine();
            while (option.equals("") || (!option.equals("1") && !option.equals("shop") && !option.equals("Shop") && !option.equals("2") && !option.equals("owned items") && !option.equals("Owned Items") && !option.equals("3") && !option.equals("withdraw Money") && !option.equals("Withdraw Money") && !option.equals("4") && !option.equals("terms and conditions") && !option.equals("Terms And Conditions") && !option.equals("5") && !option.equals("quit") && !option.equals("Quit") && !option.equals("exit") && !option.equals("Exit"))) {
            System.out.println("(please try again. make sure you have spelled the option correctly)");
                option = scanner.nextLine();
            }
            if (option.equals("1") || option.equals("shop") || option.equals("Work")) {
                Shop();
            }
            else if (option.equals("2") || option.equals("owned items") || option.equals("Owned Items")) {
                Owned_Items();
            }
            else if (option.equals("3") || option.equals("withdraw money") || option.equals("Withdraw Money")) {
                Withdraw_Money();
            }
            else if (option.equals("4") || option.equals("terms and conditions") || option.equals("Terms And Conditions")) {
                Terms_and_Conditions();
                option = scanner.nextLine();
            }
            else {
                System.out.println("Thank you for choosing us");
                System.exit(0);
            }
        }

    }

    static void Shop () {
        String option;
        boolean in_shop = true;

        // this loop only ends when the user selects "back"
        while (in_shop==true) {
            Clear_Screeen();
            System.out.println("Shop\n");
            System.out.println("Owned money: $"+money_owned);
            System.out.println("1-Prescription Drugs, 2-Medical Equipment, 3-Supplements, 4-Shopping Cart, 5-Back\n");
            System.out.println("(What would you like to select)");
            // user has to select one of the options
            option = scanner.nextLine();
            // otherwise if the user types somthing thats not in the options, they are prompted to try again
            while (option.equals("") || (!option.equals("1") && !option.equals("prescription drugs") && !option.equals("Prescription Drugs") && !option.equals("2") && !option.equals("medical equipment") && !option.equals("Medical Equipment") && !option.equals("3") && !option.equals("supplements") && !option.equals("Supplements") && !option.equals("4") && !option.equals("shopping cart") && !option.equals("Shopping Cart") && !option.equals("5") && !option.equals("back") && !option.equals("Back"))) {
                System.out.println("(please try again. make sure you have spelled the option correctly)");
                option = scanner.nextLine();
            }
            if (option.equals("1") || option.equals("prescription drugs") || option.equals("Prescription Drugs")) {
                Shop_Prescription_Drugs();
            }
            else if (option.equals("2") || option.equals("medical equipment") || option.equals("Medical Equipment")) {
                Shop_Medical_Equipment();
            }
            else if (option.equals("3") || option.equals("supplements") || option.equals("Supplements")) {
                Shop_Supplements();
            }
            else if (option.equals("4") || option.equals("shopping cart") || option.equals("Shopping Cart")) {
                Shop_Shoppingcart();
            }
            else {
                in_shop = false;
            }
        }
    }
    static void Shop_Prescription_Drugs() {
        String option;

        Clear_Screeen();
        System.out.println("Shop Prescription Drugs\n");
        System.out.println("Owned money: $"+money_owned);
        System.out.println("1-Anti Depressants ($63), 2-Stimulants ($112), 3-Anti-Biotics ($43), 4-Anti-Epileptic Drugs ($15), 5-Narcotic Analgesics ($10), 6-Back\n");
        System.out.println("(What would you like to select)");
        // user has to select one of the options
        option = scanner.nextLine();
         // otherwise if the user types somthing thats not in the options, they are prompted to try again
        while (option.equals("") || (!option.equals("1") && !option.equals("anti depressants") && !option.equals("Anti Depressants") && !option.equals("2") && !option.equals("stimulants") && !option.equals("Stimulants") && !option.equals("3") && !option.equals("snti-biotics") && !option.equals("Anti-Biotics") && !option.equals("4") && !option.equals("anti-epileptic drugs") && !option.equals("Anti-Epileptic Drugs") && !option.equals("5") && !option.equals("narcotic analgesics") && !option.equals("Narcotic Analgesics") && !option.equals("6") && !option.equals("back") && !option.equals("Back"))) {
            System.out.println("(please try again. make sure you have spelled the option correctly)");
            option = scanner.nextLine();
        }
        if (option.equals("1") || option.equals("anti depressants") || option.equals("Anti Depressants")) {
            // Anti Depressants
            Shop_Add_To_Cart(0, 0);
        }
        else if (option.equals("2") || option.equals("stimulants") || option.equals("Stimulants")) {
            // Stimulants
            Shop_Add_To_Cart(0, 1);
        }
        else if (option.equals("3") || option.equals("snti-biotics") || option.equals("Anti-Biotics")) {
            // Anti-biotics
            Shop_Add_To_Cart(0, 2);
        }
        else if (option.equals("4") || option.equals("anti-epileptic drugs") || option.equals("Anti-Epileptic Drugs")) {
            // anti-epileptic drugs
            Shop_Add_To_Cart(0, 3);
        }
        else if (option.equals("5") || option.equals("narcotic analgesics") || option.equals("Narcotic Analgesics")) {
            // narcotic analgesics
            Shop_Add_To_Cart(0, 4);
        }
        else {
            ;
        }
    }
    static void Shop_Medical_Equipment() {
        String option;

        Clear_Screeen();
        System.out.println("Shop Medical Equipment\n");
        System.out.println("Owned money: $"+money_owned);
        System.out.println("1-Medical Thermometer ($7), 2-Eye Wash ($13), 3-Face Mask ($10), 4-Plascic Gloves ($17), 5-Bandge ($4), 6-Adhesive plaster ($4), 7-Back\n");
        System.out.println("(What would you like to select)");
        // user has to select one of the options
        option = scanner.nextLine();
         // otherwise if the user types somthing thats not in the options, they are prompted to try again
        while (option.equals("") || (!option.equals("1") && !option.equals("anti depressants") && !option.equals("Anti Depressants") && !option.equals("2") && !option.equals("stimulants") && !option.equals("Stimulants") && !option.equals("3") && !option.equals("snti-biotics") && !option.equals("Anti-Biotics") && !option.equals("4") && !option.equals("anti-epileptic drugs") && !option.equals("Anti-Epileptic Drugs") && !option.equals("5") && !option.equals("narcotic analgesics") && !option.equals("Narcotic Analgesics") && !option.equals("6") && !option.equals("adhesive plaster") && !option.equals("Adhesive Plaster") && !option.equals("7") && !option.equals("back") && !option.equals("Back"))) {
            System.out.println("(please try again. make sure you have spelled the option correctly)");
            option = scanner.nextLine();
        }
        if (option.equals("1") || option.equals("medical thermometer") || option.equals("Medical Thermometer")) {
            // Medical Thermometer
            Shop_Add_To_Cart(1, 0);
        }
        else if (option.equals("2") || option.equals("eye wash") || option.equals("Eye Wash")) {
            // Eye wash
            Shop_Add_To_Cart(1, 1);
        }
        else if (option.equals("3") || option.equals("face mask") || option.equals("Face Mask")) {
            // Face mask
            Shop_Add_To_Cart(1, 2);
        }
        else if (option.equals("4") || option.equals("plascic gloves") || option.equals("Plascic Gloves")) {
            // Plascic gloves
            Shop_Add_To_Cart(1, 3);
        }
        else if (option.equals("5") || option.equals("bandge") || option.equals("Bandge")) {
            // Bandge
            Shop_Add_To_Cart(1, 4);
        }
        else if (option.equals("6") || option.equals("adhesive plaster") || option.equals("Adhesive Plaster")) {
            // Adhesive plaster
            Shop_Add_To_Cart(1, 5);
        }
        else {
            ;
        }
    }
    static void Shop_Supplements() {
        String option;

        Clear_Screeen();
        System.out.println("Shop Supplements\n");
        System.out.println("Owned money: $"+money_owned);
        System.out.println("1-Vitamins ($10), 2-Inhalers ($380), 3-Herbs ($18), 4-Lozenges ($5), 5-Back\n");
        System.out.println("(What would you like to select)");
        // user has to select one of the options
        option = scanner.nextLine();
         // otherwise if the user types somthing thats not in the options, they are prompted to try again
        while (option.equals("") || (!option.equals("1") && !option.equals("vitamins") && !option.equals("Vitamins") && !option.equals("2") && !option.equals("inhalers") && !option.equals("Inhalers") && !option.equals("3") && !option.equals("herbs") && !option.equals("Herbs") && !option.equals("4") && !option.equals("lozenges") && !option.equals("Lozenges") && !option.equals("5") && !option.equals("back") && !option.equals("Back"))) {
            System.out.println("(please try again. make sure you have spelled the option correctly)");
            option = scanner.nextLine();
        }
        if (option.equals("1") || option.equals("vitamins") || option.equals("Vitamins")) {
            // Vitamins
            Shop_Add_To_Cart(2, 0);
        }
        else if (option.equals("2") || option.equals("inhalers") || option.equals("Inhalers")) {
            // Inhalers
            Shop_Add_To_Cart(2, 1);
        }
        else if (option.equals("3") || option.equals("herbs") || option.equals("Herbs")) {
            // Herbs
            Shop_Add_To_Cart(2, 2);
        }
        else if (option.equals("4") || option.equals("lozenges") || option.equals("Lozenges")) {
            // Lozenges
            Shop_Add_To_Cart(2, 3);
        }
        else {
            ;
        }
    }
    static void Shop_Add_To_Cart(int category, int num) {
        String option;
        int number_to_add = 0;

        Clear_Screeen();
        System.out.println("Shop Add To Cart\n");
        System.out.println("(How many would you like add to the shoping list)");
        // this loop will continue looping until the user types an integer 
        while (true) {
            option = scanner.nextLine();
            try 
		    { 
                Integer.parseInt(option);
                number_to_add = Integer.parseInt(option);
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("(please try again. make sure you input an integer. Ex: \"1\")");
            }
        }
        if (category==0) {
            how_many_in_cart_prescription_drugs[num]+=number_to_add;
        }
        else if (category==1) {
            how_many_in_cart_medical_equipment[num]+=number_to_add;
        }
        else if (category==2) {
            how_many_in_cart_supplements[num]+=number_to_add;
        }
    }
    static void Shop_Shoppingcart() {
        String option;
        String yes_no;
        int number = 0;
        int total = 0;

        // prints whats allready in the cart and how much its going to cost
        // example:
        //                          Shoping Cart
        // itemname                                   cost x how many = sum
        // itemname2                                  cost x how many = sum
        //_________________________________________________________________
        // total                                               sum added up

        Clear_Screeen();
        System.out.println("Shop\n");
        System.out.println("Owned money: $"+money_owned+"\n");
        System.out.println("                          Shoping Cart");
        if (how_many_in_cart_prescription_drugs[0]==0 && how_many_in_cart_prescription_drugs[1]==0 && how_many_in_cart_prescription_drugs[2]==0 && how_many_in_cart_prescription_drugs[3]==0 && how_many_in_cart_prescription_drugs[4]==0 && how_many_in_cart_medical_equipment[0]==0 && how_many_in_cart_medical_equipment[1]==0 && how_many_in_cart_medical_equipment[2]==0 && how_many_in_cart_medical_equipment[3]==0 && how_many_in_cart_medical_equipment[4]==0 && how_many_in_cart_medical_equipment[5]==0 && how_many_in_cart_supplements[0]==0 && how_many_in_cart_supplements[1]==0 && how_many_in_cart_supplements[2]==0 && how_many_in_cart_supplements[3]==0)
        {
            System.out.println("\n               You dont have any items in the list\n");
        }
        else {
            for (int i=0; i<3; i++) {
                if (i==0) {
                    if (how_many_in_cart_prescription_drugs[0]!=0 || how_many_in_cart_prescription_drugs[1]!=0 || how_many_in_cart_prescription_drugs[2]!=0 || how_many_in_cart_prescription_drugs[3]!=0 || how_many_in_cart_prescription_drugs[4]!=0){
                        System.out.println("Prescription drugs:");
                        if (how_many_in_cart_prescription_drugs[0]>0) {
                            System.out.println("    Anti Depressants                                $"+shoping_cart_prices_prescription_drugs[0]+" x "+how_many_in_cart_prescription_drugs[0]+" = $"+(how_many_in_cart_prescription_drugs[0]*shoping_cart_prices_prescription_drugs[0]));
                            total+=how_many_in_cart_prescription_drugs[0]*shoping_cart_prices_prescription_drugs[0];
                        }
                        if (how_many_in_cart_prescription_drugs[1]>0) {
                            System.out.println("    Stimulants                                      $"+shoping_cart_prices_prescription_drugs[1]+" x "+how_many_in_cart_prescription_drugs[1]+" = $"+(how_many_in_cart_prescription_drugs[1]*shoping_cart_prices_prescription_drugs[1]));
                            total+=how_many_in_cart_prescription_drugs[1]*shoping_cart_prices_prescription_drugs[1];
                        }
                        if (how_many_in_cart_prescription_drugs[2]>0) {
                            System.out.println("    Anti-biotics                                    $"+shoping_cart_prices_prescription_drugs[2]+" x "+how_many_in_cart_prescription_drugs[2]+" = $"+(how_many_in_cart_prescription_drugs[2]*shoping_cart_prices_prescription_drugs[2]));
                            total+=how_many_in_cart_prescription_drugs[2]*shoping_cart_prices_prescription_drugs[2];
                        }
                        if (how_many_in_cart_prescription_drugs[3]>0) {
                            System.out.println("    Anti-Epileptic Drugs                            $"+shoping_cart_prices_prescription_drugs[3]+" x "+how_many_in_cart_prescription_drugs[3]+" = $"+(how_many_in_cart_prescription_drugs[3]*shoping_cart_prices_prescription_drugs[3]));
                            total+=how_many_in_cart_prescription_drugs[3]*shoping_cart_prices_prescription_drugs[3];
                        }
                        if (how_many_in_cart_prescription_drugs[4]>0) {
                            System.out.println("    Narcotic Analgesics                             $"+shoping_cart_prices_prescription_drugs[4]+" x "+how_many_in_cart_prescription_drugs[4]+" = $"+(how_many_in_cart_prescription_drugs[4]*shoping_cart_prices_prescription_drugs[4]));
                            total+=how_many_in_cart_prescription_drugs[4]*shoping_cart_prices_prescription_drugs[4];
                        }
                    }
                }
                else if (i==1) {
                    if (how_many_in_cart_medical_equipment[0]!=0 || how_many_in_cart_medical_equipment[1]!=0 || how_many_in_cart_medical_equipment[2]!=0 || how_many_in_cart_medical_equipment[3]!=0 || how_many_in_cart_medical_equipment[4]!=0 || how_many_in_cart_medical_equipment[5]!=0){
                        System.out.println("\nMedical Equipment:");
                        if (how_many_in_cart_medical_equipment[0]>0) {  
                            System.out.println("    Medical Thermometer                             $"+shoping_cart_prices_medical_equipment[0]+" x "+how_many_in_cart_medical_equipment[0]+" = $"+(how_many_in_cart_medical_equipment[0]*shoping_cart_prices_medical_equipment[0]));
                            total+=how_many_in_cart_medical_equipment[0]*shoping_cart_prices_medical_equipment[0];
                        }
                        if (how_many_in_cart_medical_equipment[1]>0) {
                            System.out.println("    Eye wash                                        $"+shoping_cart_prices_medical_equipment[1]+" x "+how_many_in_cart_medical_equipment[1]+" = $"+(how_many_in_cart_medical_equipment[1]*shoping_cart_prices_medical_equipment[1]));
                            total+=how_many_in_cart_medical_equipment[1]*shoping_cart_prices_medical_equipment[1];
                        }
                        if (how_many_in_cart_medical_equipment[2]>0) {
                            System.out.println("    Face mask                                       $"+shoping_cart_prices_medical_equipment[2]+" x "+how_many_in_cart_medical_equipment[2]+" = $"+(how_many_in_cart_medical_equipment[2]*shoping_cart_prices_medical_equipment[2]));
                            total+=how_many_in_cart_medical_equipment[2]*shoping_cart_prices_medical_equipment[2];
                        }
                        if (how_many_in_cart_medical_equipment[3]>0) {
                            System.out.println("    Plascic gloves                                  $"+shoping_cart_prices_medical_equipment[3]+" x "+how_many_in_cart_medical_equipment[3]+" = $"+(how_many_in_cart_medical_equipment[3]*shoping_cart_prices_medical_equipment[3]));
                            total+=how_many_in_cart_medical_equipment[3]*shoping_cart_prices_medical_equipment[3];
                        }
                        if (how_many_in_cart_medical_equipment[4]>0) {
                            System.out.println("    Bandge                                          $"+shoping_cart_prices_medical_equipment[4]+" x "+how_many_in_cart_medical_equipment[4]+" = $"+(how_many_in_cart_medical_equipment[4]*shoping_cart_prices_medical_equipment[4]));
                            total+=how_many_in_cart_medical_equipment[4]*shoping_cart_prices_medical_equipment[4];
                        }
                        if (how_many_in_cart_medical_equipment[5]>0) {
                            System.out.println("    Adhesive plaster                                $"+shoping_cart_prices_medical_equipment[5]+" x "+how_many_in_cart_medical_equipment[5]+" = $"+(how_many_in_cart_medical_equipment[5]*shoping_cart_prices_medical_equipment[5]));
                            total+=how_many_in_cart_medical_equipment[5]*shoping_cart_prices_medical_equipment[5];
                        }
                    }
                }
                else if (i==2) {
                    if (how_many_in_cart_supplements[0]!=0 || how_many_in_cart_supplements[1]!=0 || how_many_in_cart_supplements[2]!=0 || how_many_in_cart_supplements[3]!=0){
                        System.out.println("\nSupplements:");
                        if (how_many_in_cart_supplements[0]>0) {
                            System.out.println("    Vitamins                                       $"+shoping_cart_prices_supplements[0]+" x "+how_many_in_cart_supplements[0]+" = $"+(how_many_in_cart_supplements[0]*shoping_cart_prices_supplements[0]));
                            total+=how_many_in_cart_supplements[0]*shoping_cart_prices_supplements[0];
                        }
                        if (how_many_in_cart_supplements[1]>0) {
                            System.out.println("    Inhalers                                       $"+shoping_cart_prices_supplements[1]+" x "+how_many_in_cart_supplements[1]+" = $"+(how_many_in_cart_supplements[1]*shoping_cart_prices_supplements[1]));
                            total+=how_many_in_cart_supplements[1]*shoping_cart_prices_supplements[1];
                        }
                        if (how_many_in_cart_supplements[2]>0) {
                            System.out.println("    Herbs                                          $"+shoping_cart_prices_supplements[2]+" x "+how_many_in_cart_supplements[2]+" = $"+(how_many_in_cart_supplements[2]*shoping_cart_prices_supplements[2]));
                            total+=how_many_in_cart_supplements[2]*shoping_cart_prices_supplements[2];
                        }
                        if (how_many_in_cart_supplements[3]>0) {
                            System.out.println("    Lozenges                                       $"+shoping_cart_prices_supplements[3]+" x "+how_many_in_cart_supplements[3]+" = $"+(how_many_in_cart_supplements[3]*shoping_cart_prices_supplements[3]));
                            total+=how_many_in_cart_supplements[3]*shoping_cart_prices_supplements[3];
                        }
                    }
                }
            }
        }
        System.out.println("________________________________________________________________");
        System.out.println(" Total                                              $"+total+"\n");
        System.out.println("1-Buy, 2-Remove All, 3-back");
        System.out.println("(what would you like to do?)");
        // user has to select one of the options
        option = scanner.nextLine();
        while (option.equals("") || (!option.equals("1") && !option.equals("buy") && !option.equals("Buy") && !option.equals("2") && !option.equals("remove all") && !option.equals("Remove All") && !option.equals("3") && !option.equals("back") && !option.equals("Back"))) {
            System.out.println("(please try again. make sure you have spelled it correctly)");
            option = scanner.nextLine();
        }
        if (option.equals("1") || option.equals("buy") || option.equals("Buy")) {
            number = 0;
        }
        else if (option.equals("2") || option.equals("remove all") || option.equals("Remove All")) {
            number = 1;
        }
        if (!option.equals("3") && !option.equals("back") && !option.equals("Back")){
            System.out.print("Are you sure you want to ");
            if (number==0) {
                System.out.println("Buy these items from the list?");
            }
            else if (number==1) {
                System.out.println("Remove all items from the list?");
            }
            System.out.println("(1-Yes, 2-No) or (y/n)");
            yes_no = scanner.nextLine();
            while (yes_no.equals("") || (!yes_no.equals("1") && !yes_no.equals("yes") && !yes_no.equals("Yes") && !yes_no.equals("y") && !yes_no.equals("Y") && !yes_no.equals("2") && !yes_no.equals("no") && !yes_no.equals("No") && !yes_no.equals("n") && !yes_no.equals("N"))) {
                System.out.println("Something went wrong. plese type (yes or no)");
                yes_no= scanner.nextLine();
            }
            if (yes_no.equals("1") || yes_no.equals("1") || yes_no.equals("yes") || yes_no.equals("Yes") || yes_no.equals("y") || yes_no.equals("Y")) {
                // if yes push back all items to inventry
                if (number==0 && (option.equals("1") || option.equals("buy") || option.equals("Buy"))){
                    if (how_many_in_cart_prescription_drugs[0]==0 && how_many_in_cart_prescription_drugs[1]==0 && how_many_in_cart_prescription_drugs[2]==0 && how_many_in_cart_prescription_drugs[3]==0 && how_many_in_cart_prescription_drugs[4]==0 && how_many_in_cart_medical_equipment[0]==0 && how_many_in_cart_medical_equipment[1]==0 && how_many_in_cart_medical_equipment[2]==0 && how_many_in_cart_medical_equipment[3]==0 && how_many_in_cart_medical_equipment[4]==0 && how_many_in_cart_medical_equipment[5]==0 && how_many_in_cart_supplements[0]==0 && how_many_in_cart_supplements[1]==0 && how_many_in_cart_supplements[2]==0 && how_many_in_cart_supplements[3]==0) {
                            System.out.println("There are no items in the list.");
                    }
                    else if (money_owned<total) {
                        System.out.println("You dont have enough money, please withdraw enough money before buying");
                    }
                    else {
                        Clear_Screeen();
                        Shop_Shoppingcart_AddToInv(total);
                        System.out.println("Thank you, All items have been deliverd to your Owned Items");
                    }
                }
                // if yes, remove all items in the shoping cart
                else if (number==1 && (option.equals("2") || option.equals("remove all") || option.equals("Remove All"))) {
                    for (int i=0; i<how_many_in_cart_prescription_drugs.length; i++){
                        how_many_in_cart_prescription_drugs[i]=0;
                    }
                    for (int i=0; i<how_many_in_cart_medical_equipment.length; i++){
                        how_many_in_cart_medical_equipment[i]=0;
                    }
                    for (int i=0; i<how_many_in_cart_supplements.length; i++){
                        how_many_in_cart_supplements[i]=0;
                    }
                    System.out.println("All items have been removed from our list");
                }
                option = scanner.nextLine();
            }
        }
    }
    static void Shop_Shoppingcart_AddToInv(int total) {
        // adds the amount of items the user has from the cart to the inventy
        for (int i=0; i<how_many_in_cart_prescription_drugs.length; i++){
            how_many_in_inventry_prescription_drugs[i] += how_many_in_cart_prescription_drugs[i];
            how_many_in_cart_prescription_drugs[i]=0;
        }
        for (int i=0; i<how_many_in_cart_medical_equipment.length; i++){
            how_many_in_inventry_medical_equipment[i] += how_many_in_cart_medical_equipment[i];
            how_many_in_cart_medical_equipment[i]=0;
        }
        for (int i=0; i<how_many_in_cart_supplements.length; i++){
            how_many_in_inventry_supplements[i] += how_many_in_cart_supplements[i];
            how_many_in_cart_supplements[i]=0;
        }
        money_spent+=total;
        money_owned = money_owned - total;
    }

    static void Owned_Items() {
        String option;

        // simularly to the shoping cart, the items owned are printed
        // example:
        //                     List of your Owned Items
        // itemname                                        x how many 
        // itemname2                                       x how many
        //_________________________________________________________________
        // money spent                                     sum added up

        Clear_Screeen();
        System.out.println("Owned Items\n");
        System.out.println("                    List of your Owned Items:");
        if (how_many_in_inventry_prescription_drugs[0]==0 && how_many_in_inventry_prescription_drugs[1]==0 && how_many_in_inventry_prescription_drugs[2]==0 && how_many_in_inventry_prescription_drugs[3]==0 && how_many_in_inventry_prescription_drugs[4]==0 && how_many_in_inventry_medical_equipment[0]==0 && how_many_in_inventry_medical_equipment[1]==0 && how_many_in_inventry_medical_equipment[2]==0 && how_many_in_inventry_medical_equipment[3]==0 && how_many_in_inventry_medical_equipment[4]==0 && how_many_in_inventry_medical_equipment[5]==0 && how_many_in_inventry_supplements[0]==0 && how_many_in_inventry_supplements[1]==0 && how_many_in_inventry_supplements[3]==0) {
            System.out.println("\n                     You dont own any items\n");
        }
        else {
            for (int i=0; i<3; i++) {
                if (i==0) {
                    if (how_many_in_inventry_prescription_drugs[0]!=0 || how_many_in_inventry_prescription_drugs[1]!=0 || how_many_in_inventry_prescription_drugs[2]!=0 || how_many_in_inventry_prescription_drugs[3]!=0 || how_many_in_inventry_prescription_drugs[4]!=0){
                        System.out.println("Prescription drugs:");
                        if (how_many_in_inventry_prescription_drugs[0]>0) {
                            System.out.println("    Anti Depressants                                      x "+how_many_in_inventry_prescription_drugs[0]);
                        }
                        if (how_many_in_inventry_prescription_drugs[1]>0) {
                            System.out.println("    Stimulants                                            x "+how_many_in_inventry_prescription_drugs[1]);
                        }
                        if (how_many_in_inventry_prescription_drugs[2]>0) {
                            System.out.println("    Anti-biotics                                          x "+how_many_in_inventry_prescription_drugs[2]);
                        }
                        if (how_many_in_inventry_prescription_drugs[3]>0) {
                            System.out.println("    Anti-Epileptic Drugs                                  x "+how_many_in_inventry_prescription_drugs[3]);
                        }
                        if (how_many_in_inventry_prescription_drugs[4]>0) {
                            System.out.println("    Narcotic Analgesics                                   x "+how_many_in_inventry_prescription_drugs[4]);
                        }
                    }
                }
                else if (i==1) {
                    if (how_many_in_inventry_medical_equipment[0]!=0 || how_many_in_inventry_medical_equipment[1]!=0 || how_many_in_inventry_medical_equipment[2]!=0 || how_many_in_inventry_medical_equipment[3]!=0 || how_many_in_inventry_medical_equipment[4]!=0 || how_many_in_inventry_medical_equipment[5]!=0) {
                        System.out.println("Medical Equipment:");
                        if (how_many_in_inventry_medical_equipment[0]>0) {
                            System.out.println("    Medical Thermometer                                  x "+how_many_in_inventry_medical_equipment[0]);
                        }
                        if (how_many_in_inventry_medical_equipment[1]>0) {
                            System.out.println("    Eye wash                                             x "+how_many_in_inventry_medical_equipment[1]);
                        }
                        if (how_many_in_inventry_medical_equipment[2]>0) {
                            System.out.println("    Face mask                                            x "+how_many_in_inventry_medical_equipment[2]);
                        }
                        if (how_many_in_inventry_medical_equipment[3]>0) {
                            System.out.println("    Plascic gloves                                       x "+how_many_in_inventry_medical_equipment[3]);
                        }
                        if (how_many_in_inventry_medical_equipment[4]>0) {
                            System.out.println("    Bandge                                               x "+how_many_in_inventry_medical_equipment[4]);
                        }
                        if (how_many_in_inventry_medical_equipment[5]>0) {
                            System.out.println("    Adhesive plaster                                      x "+how_many_in_inventry_medical_equipment[5]);
                        }
                    }
                }
                else if (i==2) {
                    if (how_many_in_inventry_supplements[0]!=0 || how_many_in_inventry_supplements[1]!=0 || how_many_in_inventry_supplements[2]!=0 || how_many_in_inventry_supplements[3]!=0) {
                        System.out.println("Supplements:");
                        if (how_many_in_inventry_supplements[0]>0) {
                            System.out.println("    Vitamins                                            x "+how_many_in_inventry_supplements[0]);
                        }
                        if (how_many_in_inventry_supplements[1]>0) {
                            System.out.println("    Inhalers                                            x "+how_many_in_inventry_supplements[1]);
                        }
                        if (how_many_in_inventry_supplements[2]>0) {
                            System.out.println("    Herbs                                              x "+how_many_in_inventry_supplements[2]);
                        }
                        if (how_many_in_inventry_supplements[3]>0) {
                            System.out.println("    Lozenges                                            x "+how_many_in_inventry_supplements[3]);
                        }
                    }
                }
            }
        }
        System.out.println("________________________________________________________________");
        System.out.println(" Total Money Spent:                                 $"+money_spent+"\n");
        System.out.println("1-Remove Owned Items, 2-Back\n");
        System.out.println("(What would you like to select)");
        // user has to select one of the options
        option = scanner.nextLine();
        while (option.equals("") || (!option.equals("1") && !option.equals("remove owned items") && !option.equals("Remove owned items") && !option.equals("2") && !option.equals("back") && !option.equals("Back"))) {
            System.out.println("(please try again. make sure you have spelled the option correctly)");
            option = scanner.nextLine();
        }
        if (option.equals("1") || option.equals("remove owned items") || option.equals("Remove Owned Items")) {
            Clear_Screeen();
            System.out.println("Owned Items\n");
            System.out.println("are you sure you want to remove all of your Owned Items?");
            System.out.println("(Y/N)");
            option = scanner.nextLine();
            while (option.equals("") || (!option.equals("1") && !option.equals("yes") && !option.equals("Yes") && !option.equals("y") && !option.equals("Y") && !option.equals("2") && !option.equals("no") && !option.equals("No") && !option.equals("n") && !option.equals("N"))) {
                System.out.println("(please try again. make sure you have spelled the option correctly)");
                option = scanner.nextLine();
            }
            if (option.equals("1") || option.equals("1") || option.equals("yes") || option.equals("Yes") || option.equals("y") || option.equals("Y")) {
                // remove all items
                for (int i=0; i<how_many_in_inventry_prescription_drugs.length; i++) {
                    how_many_in_inventry_prescription_drugs[i]=0;
                }
                for (int i=0; i<how_many_in_inventry_medical_equipment.length; i++) {
                    how_many_in_inventry_medical_equipment[i]=0;
                }
                for (int i=0; i<how_many_in_inventry_supplements.length; i++) {
                    how_many_in_inventry_supplements[i]=0;
                }
                money_spent=0;
                System.out.println("Your Owned Items have been sucsesfully been removed");
                option = scanner.nextLine();
            }

        }
    }

    static void Withdraw_Money() {
        // prompt the userhow much money they want to withdraw
        String option;

        Clear_Screeen();
        System.out.println("Withdraw Money\n");
        System.out.println("Please enter your credit card(type anything)");
        option = scanner.nextLine();
        Clear_Screeen();
        System.out.println("Withdraw Money\n");
        System.out.println("Owned money: $"+money_owned);
        System.out.println("(How much money would you like to withdraw)");
        while (true) {
            option = scanner.nextLine();
            try 
		    { 
                Integer.parseInt(option);
                money_owned+=Integer.parseInt(option);
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("(please try again. make sure you input an integer. Ex: \"10\")");
            }
        }
        System.out.println("\n$"+option+" has been Withdrawn");
        option = scanner.nextLine();

    }

    static void Terms_and_Conditions() {
        Clear_Screeen();
        // prints the terms and conditions
        System.out.println("Terms and Conditions\n");
        System.out.println("By using our product you agree to the following Terms and Conditions:");
        System.out.println("    1.(This is not a real company, this aplicatioon is not officialy owned or coppywrited by any one)");
        System.out.println("    2.(This aplication does not take any money of any kind, also this application does not record any data)");
        System.out.println("    3.(This aplication is desined only to simulate the expiriance of buying products from a pharmacy and does not deliver or provide the products listed in the shoping menu in real life.)");
        System.out.println("    4.(We are not responsible for any liabilities and obligations. if the user is somehow injured from this aplication we do not take any responcibility.)");
        System.out.println("    5.(You cannot exchange the programs currency to real life money)\n");
    }

    public static void Clear_Screeen(){
        // to clear the console/terminal and make it easyer to read
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}