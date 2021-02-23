package com.valuemomentum.training2.quick;

import java.util.Scanner;
import java.util.regex.Pattern;
//import java.util.regex.Matcher;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		EmsDAOImpl emsdaoi = new EmsDAOImpl();
		@SuppressWarnings("unused")
		Admin a = new Admin();
		Users u = new Users();
		

		DBConnection.getConnection();
		
		while (true) {
			// try {
			
			System.out.println("**************************************************");
			System.out.println("|    QUICK RECORDS (Employee Management System)  |");
			System.out.println("**************************************************");
			System.out.println("|  1.  LOGIN                                     |");
			System.out.println("|  2.  REGISTER                                  |");
			System.out.println("|  3.  EXIT                                      |");
			System.out.println("**************************************************");
			System.out.println();
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				// Users u=new Users();
//				System.out.println("|  1.  REGISTER               |");
//				System.out.println("|  2.  LOGIN                  |");
//				System.out.println("|  3.  BACK                   |");
//				int d1 = sc.nextInt();
//				if (d1 == 2) {
					System.out.println("Enter User Name ?");
					String name = sc.next();
					while (!Pattern.matches("[A-Za-z0-9]{1,14}", name)) {
						System.err.println("plese enter name in alphabets");
					}
					u.setUsername(name);
					System.out.println("Enter Password ?");
					String password = sc.next();
					while (!Pattern.matches("[0-9a-zA-Z]{1,8}", password)) {
						System.err.println("please enter valid password minimum of 8");
					}
					u.setPassword(password);

					try {
						String type = emsdaoi.login(name, password);
						if (type.equals("admin")) {
							System.out.println();
							System.out.println("SUCCESS : ");
							System.out.println("Logged in as ADMIN");
							Menu.adminMenu();


						} else if (type.equals("user")) {
							System.out.println();
							System.out.println("SUCCESS : ");
							System.out.println("Logged in as USER");
							Menu.users();

						} else {
							System.out.println("Invalid UserName / PassWord");
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println();
						System.out.println("ALERT : ");
						System.out.println("Invalid username/password...");
						System.out.println();
					}
					break;
			case 2:
				System.out.println("Enter User Name ?");
				String namee = sc.next();

				while (!Pattern.matches("[a-zA-Z]{1,14}", namee)) {
					System.err.println("please enter the valid username with in the range of 1-14 ");
					// name = sc.next();
				}
				u.setUsername(namee);

				System.out.println("Enter Password ?");
				String passwordd = sc.next();
				while (!Pattern.matches("[0-9a-zA-Z]{1,8}", passwordd)) {

					System.err.println("please enter valid password max of 8 characters");
					// password = sc.next();
				}
				u.setPassword(passwordd);

				System.out.println("Enter type?");
				u.setType(sc.next());

				String message = emsdaoi.register(u);
				System.out.println(message);
				
				break;
			case 3:
				System.out.println("-------THANK YOU--------");
				System.exit(0);
				break;
			default:
				System.out.println("ALERT : Choose from range 1-3.");

				
				
				
			}
		}
	}
}

