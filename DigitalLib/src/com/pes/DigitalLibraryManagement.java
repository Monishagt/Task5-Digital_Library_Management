package com.pes;

import java.util.*;

class DigitalLibraryManagement{
    HashMap<String,Integer> loginto = new HashMap<>();
    HashMap<Integer,String> map = new HashMap<>();
    public static String userID;
    public static int issues = 0;
    Scanner sc=new Scanner(System.in);
    
    
    public HashMap<Integer,String> book_database_server()
    {
        map.put(1,"CS : Data Structures");
        map.put(2,"CS : Operating Systems");
        map.put(3,"CS : Computer Networks");
        map.put(4,"CS : Database Management Systems");
        map.put(5,"CS : Software Engineering");
        map.put(6,"CS : Algorithms");
        map.put(7,"CS : Artificial Intelligence");
        map.put(8,"IT : Information Security");
        map.put(9,"IT : Web Development");
        map.put(10,"IT : Cloud Computing");
        map.put(11,"IT : Big Data Analytics");
        map.put(12,"EE : Circuits and Systems");
        map.put(13,"EE : Electromagnetics");
        map.put(14,"EE : Power Systems");
        map.put(15,"EE : Control Systems");
        map.put(16,"ME : Thermodynamics");
        map.put(17,"ME : Fluid Mechanics");
        map.put(18,"ME : Heat Transfer");
        map.put(19,"CE : Structural Analysis");
        map.put(20,"CE : Geotechnical Engineering");
        map.put(21,"CE : Hydraulics");
        map.put(22,"CE : Transportation Engineering");
        map.put(23,"ECE : Digital Signal Processing");
        map.put(24,"ECE : Microelectronics");
        map.put(25,"ECE : Embedded Systems");
        map.put(26,"BBA : Marketing Management");
        map.put(27,"BBA : Financial Accounting");
        map.put(28,"BBA : Human Resource Management");
        map.put(29,"BBA : Business Law");
        map.put(30,"MATH : Calculus");
        map.put(31,"MATH : Linear Algebra");
        map.put(32,"MATH : Probability and Statistics");
        
        return map;
    }
    
    public void homepage()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("----- WELCOME TO DIGITAL LIBRARY MANAGEMENT SYSTEM -----");
        System.out.println("----------------------- HOMEPAGE -----------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> Admin Login >>>");
        System.out.println("2.>>> User Login >>>");
        System.out.println("3.>>> Exit >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int sp=sc.nextInt();
        switch(sp){
            case 1: 
                admin_login();
                break;
            case 2: 
                user_login();
                break;
            case 3:
                System.out.print("\n" + "Do You want to Exit? (Y/N): ");
                String exit = sc.next();
                if(exit.equalsIgnoreCase("Y"))
                {
                    System.out.println("\n" + "--------------------------------------------------------");
                    System.out.println("\n" + "EXITING SUCCESSFULLY...!");
                    System.out.println("\n" + "--------------------------------------------------------");
                    System.out.println("\n" + "Thank You.!!! Please Visit Again...");
                    System.out.println("\n" + "--------------------------------------------------------");
                    System.exit(0);
                }
                else{
                    System.out.println("\n" + "Exiting Cancelled... Stayed on the HomePage...");
                    homepage();
                }
                break;
            default: 
                System.out.println("\n" + "Invalid Option Choice.! Please Try again...");
                homepage();
                break;
        }
    }
    
    public void admin_login()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("------------------- ADMIN LOGIN PAGE -------------------");
        System.out.println("--------------------------------------------------------");
        System.out.print("Enter User-Id: ");
        userID = sc.next();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();
        loginto.put("Admin1",13579);
        loginto.put("Admin2",20026);
        
        if (loginto.containsKey(userID) && loginto.get(userID) == password)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("\n" + "LOGIN SUCCESSFULLY...!");
            System.out.println("\n" + "--------------------------------------------------------");
            admin_mainpage();
        }
        else{
            System.out.println("\n" + "Invalid login credentials.!!! Please try again...");
            admin_login();
        }
    }

    public void user_login()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------- USER LOGIN PAGE -------------------");
        System.out.println("--------------------------------------------------------");
        System.out.print("Enter User-Id: ");
        userID = sc.next();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();
        loginto.put("User1",13579);
        loginto.put("User2",20026);
        loginto.put("User3",12345);
        loginto.put("User4",24680);
        loginto.put("User5",11111);
        
        if (loginto.containsKey(userID) && loginto.get(userID) == password)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("\n" + "LOGIN SUCCESSFULLY...!");
            System.out.println("\n" + "--------------------------------------------------------");
            user_mainpage();
        }
        else{
            System.out.println("\n" + "Invalid login credentials.!!! Please try again...");
            user_login();
        }
    }

    public void admin_mainpage()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("----- Digital Library ---> Welcome Admin " + DigitalLibraryManagement.userID + "! ----");
        System.out.println("-------------------- ADMIN MAINPAGE --------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> Add a New Book >>>");
        System.out.println("2.>>> Update a Existing Book >>>");
        System.out.println("3.>>> Delete a Existing Book >>>");
        System.out.println("4.>>> Go To User MainPage >>>");
        System.out.println("5.>>> Logout >>> Back to HomePage >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int sp=sc.nextInt();
        switch(sp){
            case 1: 
                map = add_new();
                admin_mainpage();
                break;
            case 2:
                map = upd_old();
                admin_mainpage();
                break;
            case 3: 
                map = del_old();
                admin_mainpage();
                break;
            case 4:
                user_mainpage();
                break;
            case 5:
                System.out.println("--------------------------------------------------------");
                System.out.println("\n" + "LOGOUT SUCCESSFULLY...!");
                System.out.println("\n" + "--------------------------------------------------------");
                homepage();
                break;
            default: 
                System.out.println("\n" + "Invalid Option Choice.! Please Try again...");
                admin_mainpage();
                break;
        }
    }
    
    public void user_mainpage()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("----- Digital Library ---> Welcome User " + DigitalLibraryManagement.userID + "! -----");
        System.out.println("--------------------- USER MAINPAGE --------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> View any Book >>>");
        System.out.println("2.>>> Issue a Book >>>");
        System.out.println("3.>>> Return a Book >>>");
        System.out.println("4.>>> Logout >>> Back to HomePage >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int sp=sc.nextInt();
        switch(sp){
            case 1: 
                views();
                break;
            case 2: 
                borrows();
                break;
            case 3:
                returns();
                break;
            case 4:
                System.out.println("--------------------------------------------------------");
                System.out.println("\n" + "LOGOUT SUCCESSFULLY...!");
                System.out.println("\n" + "--------------------------------------------------------");
                homepage();
                break;
            default: 
                System.out.println("\n" + "Invalid Option Choice.! Please Try again...");
                user_mainpage();
                break;
        }
    }

    public HashMap<Integer,String> add_new()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------- ADD A NEW BOOK -------------------");
        System.out.print("Enter a New Book Number: ");
        int addbook = sc.nextInt();
        if(book_database_server().containsKey(addbook))
        {
            System.out.println("\n" + "This Book Number is already exist... Please try with another number...");
        }
        else if(addbook == 0 || addbook < 0)
        {
            System.out.println("\n" + "You can't assign Zero(0) or a Negative(-ve) number for a book...");
        }
        else{
            System.out.print("Enter New Book Details: ");
            String addbookdetails = scanner.nextLine();
            map.put(addbook,addbookdetails);
            System.out.println("\n" + "New Book added Successfully...");
            System.out.println("New Book No.:: " + addbook);
            System.out.println("New Book Name & Details:: " + map.get(addbook));
        }
        return map;
    }

    public HashMap<Integer,String> upd_old()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------- UPDATE A EXISTING BOOK -------------------");
        System.out.print("Enter a Book Number to Update: ");
        int updbook = sc.nextInt();
        if(book_database_server().containsKey(updbook))
        {
            System.out.print("Enter Updated Book Details: ");
            String updbookdetails = scanner.nextLine();
            map.put(updbook,updbookdetails);
            System.out.println("\n" + "Book updated Successfully...");
            System.out.println("Updated Book No.:: " + updbook);
            System.out.println("Updated Book Name & Details:: " + map.get(updbook));
        }
        else{
            System.out.println("\n" + "This Book Number doesn't exist... Please try with a valid number...");
        }
        return map;
    }

    public HashMap<Integer,String> del_old()
    {
        System.out.println("------------------- DELETE A EXISTING BOOK -------------------");
        System.out.print("Enter a Book Number to Delete: ");
        int delbook = sc.nextInt();
        if(book_database_server().containsKey(delbook))
        {
            System.out.println("Deleted Book No.:: " + delbook);
            System.out.println("Deleted Book Name & Details:: " + map.get(delbook));
            map.remove(delbook);
            System.out.println("\n" + "Book deleted Successfully...");
        }
        else{
            System.out.println("\n" + "This Book Number doesn't exist... Please try with a valid number...");
        }
        return map;
    }

    public void views()
    {
        System.out.println("--------------------- VIEW ANY BOOK --------------------");
        System.out.print("Enter a Book Number to View: ");
        int viewbook = sc.nextInt();
        if(book_database_server().containsKey(viewbook))
        {
            System.out.println("\n" + "View Book No.:: " + viewbook);
            System.out.println("View Book Name & Details:: " + map.get(viewbook));
        }
        else{
            System.out.println("\n" + "This Book Number doesn't exist... Please try with a valid number...");
        }
    }

    public void borrows()
    {
        if (issues < 5)
        {
            System.out.println("--------------------- ISSUE A BOOK --------------------");
            System.out.print("Enter a Book Number to Issue: ");
            int issuebook = sc.nextInt();
            if(book_database_server().containsKey(issuebook))
            {
                System.out.println("\n" + "Issued Book No.:: " + issuebook);
                System.out.println("Issued Book Name & Details:: " + map.get(issuebook));
                issues++;
                System.out.println("\n" + "Book issued Successfully...");
            }
            else{
                System.out.println("\n" + "This Book Number doesn't exist... Please try with a valid number...");
            }
        }
        else
        {
            System.out.println("\n" + "You have already issued 5 books... Return a book to issue a new one...");
        }
    }

    public void returns()
    {
        if (issues > 0)
        {
            System.out.println("--------------------- RETURN A BOOK --------------------");
            System.out.print("Enter a Book Number to Return: ");
            int returnbook = sc.nextInt();
            if(book_database_server().containsKey(returnbook))
            {
                System.out.println("\n" + "Returned Book No.:: " + returnbook);
                System.out.println("Returned Book Name & Details:: " + map.get(returnbook));
                issues--;
                System.out.println("\n" + "Book returned Successfully...");
            }
            else{
                System.out.println("\n" + "This Book Number doesn't exist... Please try with a valid number...");
            }
        }
        else
        {
            System.out.println("\n" + "You don't have any issued books to return...");
        }
    }

    public static void main(String[] args)
    {
        DigitalLibraryManagement dlm = new DigitalLibraryManagement();
        dlm.book_database_server();
        dlm.homepage();
    }
}

        		
        		
