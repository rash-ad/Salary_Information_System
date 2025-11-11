import java.util.*;
class Tax_calculation{
	public static void withHoldingTax(){
		Scanner s=new Scanner(System.in);
		String homepage="";
		
		int choice=0;
		int option=0;
			// Big while loop for 1,2,3,4.This  do while loop.
		
				do{
			
					clearConsole();
					System.out.println("+-------------------------------------------------------------------+");
					System.out.println("|\t \t  Witholding Tax \t\t                    |");
					System.out.println("+-------------------------------------------------------------------+");
					
					System.out.println("\t[1] Rent Tax\n\n \t[2]Bank Interest Rate \n\n\t[3] Dividend Tax\n\n\t[4] Exit\n");
					System.out.print("Enter an Option to continue -> ");
					choice=s.nextInt();
				 	
						L2:do{
							
							
						   if(choice==1){
							clearConsole();
							System.out.println("+-------------------------------------------------------------------+");
							System.out.println("|\t \t  Rent   Tax \t\t                            |");
							System.out.println("+-------------------------------------------------------------------+");
					
							System.out.print("\nEnter your Rent: ");
							double  rent =s.nextDouble();
							
							if(rent>100000){
								rent*=0.1;
								System.out.println("\nYou have to pay rent: "+rent);
								System.out.println("DO you want to Calculate another tax(Y/N): ");
									s.nextLine();
									homepage=s.nextLine();
									if(homepage.equalsIgnoreCase("n")){
										withHoldingTax();	
									}
							}
							
							
							else if (rent<=100000 && rent>0){
									System.out.println("\nYou don't have to pay Rent Tax...");
									System.out.println("DO you want to Calculate another tax(Y/N): ");
									s.nextLine();
									homepage=s.nextLine();
									if(homepage.equalsIgnoreCase("n")){
										withHoldingTax();	
									}
									
							}
							
							
							
							
							
								else if (rent < 0 ){
									
									System.out.println("Invalid input...");
									System.out.print("DO you want to Calculate another tax(Y/N): ");
									s.nextLine();
									homepage=s.nextLine();
								}
								
							}
							if(homepage.equalsIgnoreCase("n")){
								home();
								
							}
							
						}while(homepage.equalsIgnoreCase("y"));	
							
						
						
						
						
						
					
					
						
						do{
						  if(choice==2){
							clearConsole();
							System.out.println("+-------------------------------------------------------------------+");
							System.out.println("|\t \t  BANK INTEREST Tax \t\t                    |");
							System.out.println("+-------------------------------------------------------------------+");
							System.out.print("Enter your bank interest per year : ");
							double bankInterest=s.nextDouble();
							bankInterest*=0.05;
							System.out.println("Bank interest : "+bankInterest);
						
							System.out.print("DO you want to Calculate another tax(Y/N): ");
							s.nextLine();
							homepage=s.nextLine();
						}	
						}while(homepage.equalsIgnoreCase("y"));
					
					
					L4:do{
						if(choice==3){
								clearConsole();
								System.out.println("+-------------------------------------------------------------------+");
								System.out.println("|\t \t  DIVIDEND Tax \t\t                            |");
								System.out.println("+-------------------------------------------------------------------+");
								System.out.print("\nEnter your bank interest per year: ");
								float dividendTax=s.nextFloat();
								if(dividendTax>100000){
									dividendTax*=0.14;
									System.out.println("\nYou have to pay Dividend Tax…"+dividendTax);
									
								}
								
								else if(dividendTax<=100000){
									System.out.println("You don\'t have to pay Dividend Tax ");
							
						
								}
								System.out.print("Do you want to calculate another Tax (Y/N)? ");
								s.nextLine();
								homepage=s.nextLine();
							
						
						}
					
					 

				}while(homepage.equalsIgnoreCase("y"));
				
				 if(choice==4){
					home();
				}
				}while(homepage.equalsIgnoreCase("n"));
				
			
		}
							
					
			
			
			
		
		
		
		public static void payableTax(){
			Scanner s= new Scanner(System.in);
			String homepage="";
		L8:do{
			clearConsole();
			System.out.println("+-------------------------------------------------------------------+");
			System.out.println("|\t \t  Payable  Tax \t\t                            |");
			System.out.println("+-------------------------------------------------------------------+");
			System.out.print("Enter Employee Payment Per Month: ");
			int payment=s.nextInt();
			

			int payableTax=0;
			int tax=0;
		
		if(payment<100000){
			System.out.println("You don't have  to pay Payable Tax");
			
			
			}
		
		   if(payment<=141667){
			tax+=(payment-100000)*0.06;
			System.out.println(tax);
		
			}
		   else if(payment<=183333){
			tax+=2500+(payment-141666)*0.12;
			System.out.println(tax);
				}
		    else if(payment<225000){
				tax+=7500+(payment-183332)*0.18;
				System.out.println(tax);
				
			}
		    else if(payment<=266667){
				tax+=15000+(payment-224999)*0.24;
				System.out.println(tax);
			}
			else if (payment<=308333){
				
					tax+=25000+(payment-266666)*0.3;
					System.out.println(tax);
				}
			else if(payment >308333){
				tax+=37500+(payment-308332)*0.36;
				System.out.println(tax);
				}
			System.out.print("\nDO you want to Calculate another Tax? (Y/N)  ");
			s.nextLine();
			
			homepage=s.nextLine();
			
				
		}while(homepage.equalsIgnoreCase("y"));
		if(homepage.equalsIgnoreCase("n")){
			home();
			}
		
	

		}
	
		
		
		public static void incomeTax(){
		Scanner s=new Scanner(System.in);
		double tax=0;
		String homepage="";
		do{
			clearConsole();
			System.out.println("+-------------------------------------------------------------------+");
			System.out.println("|\t \t  Income  Tax \t\t                            |");
			System.out.println("+-------------------------------------------------------------------+");
		
		System.out.print("Enter Your Total income Per Year: ");
		int incomeTax=s.nextInt();
		if(incomeTax<=1200000){
				System.out.println("You don\'nt have to Pay Income Tax ");
		}
		else if (incomeTax<=1700000){
				tax=(incomeTax-1200000)*0.06;
				System.out.println(tax);
		}
		else if (incomeTax<=2200000){
				tax=30000+(incomeTax-1700000)*0.12;
				System.out.println(tax);
		}
		else if (incomeTax<=2700000){
				tax=120000+(incomeTax-2200000)*0.18;
				System.out.println(tax);
		}
		else if (incomeTax<3200000){
				tax=(incomeTax-2700000)*0.24;
				System.out.println(tax);
		}
		else if (incomeTax<3700000){
				tax=(incomeTax-3200000)*0.3;
				System.out.println(tax);
		}
		else if (incomeTax>=3700000){
				tax=(incomeTax-2600000)*0.36;
				System.out.println(tax);
		}
			System.out.print("\nDo You want to Calculate another Income Tax (Y/N)");
			s.nextLine();
			homepage=s.nextLine();
			
			//return to Homepage.......
			if(homepage.equalsIgnoreCase("n")){
				home();
			}
		}while(homepage.equalsIgnoreCase("y"));
			}
	public static void LeasingPayment(){
			
				Scanner s=new Scanner(System.in);
				String homepage="";
				double annualInterestRate=0,leaseAmount=0,n=0,monthlyInstallment=0;
				
		
		L2:do{
			clearConsole();
			System.out.println("+-------------------------------------------------------------------+");
			System.out.println("|\t \t  Leasing  Payment \t\t                    |");
			System.out.println("+-------------------------------------------------------------------+");
			System.out.print("\t[1]Calculate Monthly Installment \n\n\t[2]Search Leasing Category \n\n\t[3]Find Leasing Amount \n\n\t[4] Exit\n\n ");
			System.out.print("Enter an Option to Continue -> ");
			int option=s.nextInt();
			
				
		L3:do{
			
			if(option==1){
				
					clearConsole();
					System.out.println("+-------------------------------------------------------------------+");
					System.out.println("|\t \t  Calculate Leasing Payment   \t\t            |");
					System.out.println("+-------------------------------------------------------------------+");
					
					
					System.out.print("Enter Lease Amount ");
					 leaseAmount=s.nextInt();
					System.out.print("Enter Annual Interest Rate ");
					 annualInterestRate=s.nextInt()/12.0/100.0;
					
					
					System.out.print("Enter Year: ");
					  int year=s.nextInt();
					
						n=year*12;
						while(year>=6){
							if(year>=6){
						
								System.out.print("Invalid Input Year.... Enter the Correct value again  ");
								System.out.print("\nEnter Year: ");
								year=s.nextInt();
							}
						}	
					
						
						 monthlyInstallment=leaseAmount*annualInterestRate/(1-(1/Math.pow(1+annualInterestRate,n)));
						 System.out.println("Your Monthly Installment: "+monthlyInstallment);
						 System.out.print("\nDo Yo want to Calculate another Monthy Installment: (Y/N) ");
						 s.nextLine();
						 homepage=s.nextLine();
			}
					if(homepage.equalsIgnoreCase("n")){
							break;
					}
					
				 }while(homepage.equalsIgnoreCase("y"));
		  do{ 
		 if(option==2){
			clearConsole();
			System.out.println("+-------------------------------------------------------------------+");
			System.out.println("|\t \t  Search Leasing Category   \t\t            |");
			System.out.println("+-------------------------------------------------------------------+");
			System.out.print("Enter Lease Amount : ");
			leaseAmount=s.nextInt();
			
			System.out.print("Enter Annual Interest Rate ");
			annualInterestRate=s.nextInt()/12.0/100.0;
			n=12*3;
			monthlyInstallment=leaseAmount*annualInterestRate/(1-(1/Math.pow(1+annualInterestRate,n)));
			
			System.out.print("Your Monthly Installment for 3 Year Leasing plan - ");
			
			System.out.println(monthlyInstallment);
			n=12*4;
			monthlyInstallment=leaseAmount*annualInterestRate/(1-(1/Math.pow(1+annualInterestRate,n)));
			System.out.println("Your Monthly Installment for 4 Year Leasing plan - "+monthlyInstallment);
			n=12*5;
			monthlyInstallment=leaseAmount*annualInterestRate/(1-(1/Math.pow(1+annualInterestRate,n)));
			System.out.print("Your Monthly Installment for 5 Year Leasing plan - "+monthlyInstallment);
			System.out.print("\n\n Do you want to Search another category (Y/N)");					
			s.nextLine();
			homepage=s.nextLine();
		}
		}while(homepage.equalsIgnoreCase("y"));
		
			do{	
				 if (option==3){
					clearConsole();
					System.out.println("+-------------------------------------------------------------------+");
					System.out.println("|\t \t  Find Leasing Amount   \t\t            |");
					System.out.println("+-------------------------------------------------------------------+");
					System.out.print("Enter the Monthly Lease Amount that Yu can Afford: ");
					leaseAmount=s.nextInt();
					System.out.println("Enter Annual Interest Rate: ");
					annualInterestRate=s.nextInt()/12.0;
					
					s.nextLine();
					while(annualInterestRate<0){
						if(annualInterestRate<0){
						
						System.out.print("Invalid Input Year.... Enter the Correct value again  ");
						System.out.print("\nEnter Annual Interest Rate: ");
						annualInterestRate=s.nextInt();
					}
				}
					
					
					System.out.print("Enter Year: ");
					int year=s.nextInt();
					while(year>=6){
						if(year>=6){
						
						System.out.print("Invalid Input Year.... Enter the Correct value again  ");
						System.out.print("\nEnter Year: ");
						year=s.nextInt();
						n=12*year;
					}
				}
					//System.out.println(annualInterestRate);
					double leaseAmount1=leaseAmount*annualInterestRate/(1-(1/Math.pow(1+annualInterestRate,n)));
					System.out.println(leaseAmount1);
					System.out.print("\nDo You want to Calculate another Monthy Installment: (Y/N) ");
					s.nextLine();
					homepage=s.nextLine();
					
				}
				
				
				}while(homepage.equalsIgnoreCase("y"));
				if(option==4){
					home();
				}
				
		}while(homepage.equalsIgnoreCase("n"));	
		
	}

	public static void sslTax(){
			Scanner s=new Scanner(System.in);
			String homepage="";
			L4:do{
					clearConsole();
					System.out.println("+-------------------------------------------------------------------+");
					System.out.println("|\t \t SOCIAL SECURTIY CONTRUBUTION  LEVY (SSCL) Tax \t    |");
					System.out.println("+-------------------------------------------------------------------+");
					
								
					System.out.print("Enter a Value of Good or Service ");
					double valueOfGoods=s.nextInt();
					double salesTax=valueOfGoods*0.025;
					
					
					double vat=(salesTax+valueOfGoods)*0.15;
					
					double totalSslTax=vat+salesTax;
					System.out.println("\nYou have to pay SSL Tax: "+totalSslTax);
					System.out.print("\nDO you want to Calculate another Tax? (Y/N)  ");
					s.nextLine();
					homepage=s.nextLine();
					
					
			}while(homepage.equalsIgnoreCase("y"));
				
				if(homepage.equalsIgnoreCase("n")){
					home();
				}
			
			}
			
			
			//CLEAR CONSOLE METHOD...
	public static void clearConsole(){
		try{
			final String os=System.getProperty("os.name");
			if(os.contains("Windows")){
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}else{
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		}catch(final Exception e){
			e.printStackTrace();
			//Handle any exceptions.
		}
	}
	public static void home(){
		Scanner s= new Scanner(System.in);
		String homepage="";
		int option=0;
		do{
				clearConsole();
				System.out.println("\t\t\t ___  _____  _________ _________");
				System.out.println("\t\t\t|   \\/     \\|                   \\");
				System.out.println("\t\t\t \\$|  $$$$$$  $$$$$$$$  \\$$$$$$$$");
				System.out.println("\t\t\t|  | $$   \\$  $$___       | $$");
				System.out.println("\t\t\t| $| $$     | $$   \\      | $$");
				System.out.println("\t\t\t| $| $$   __| $$$$$       | $$");
				System.out.println("\t\t\t| $| $$__/  | $$_______   | $$");
				System.out.println("\t\t\t| $$\\ $$   $  $$     \\    | $$");
				System.out.println("\t\t\t \\$$ \\$$$$$$ \\ $$$$$$$$|   \\$$");
				
				System.out.println("\n");
				System.out.println("\t _______              __   __       _____                _         _____   _    _    _                 _______   ____    _____");
				System.out.println("\t|__   __|     /\\      \\ \\ / /      / ____|      /\\      | |       / ____| | |  | |  | |          /\\   |__   __| / __ \\  |  __ \\"   );
				System.out.println("\t   | |       /  \\      \\ V /      | |          /  \\     | |      | |      | |  | |  | |         /  \\     | |   | |  | | | |__) |");
				System.out.println("\t   | |      / /\\ \\      > <       | |         / /\\ \\    | |      | |      | |  | |  | |        / /\\ \\    | |   | |  | | |  _  /");
				System.out.println("\t   | |	   / ____ \\    / . \\      | |____    / ____ \\   | |____  | |____  | |__| |  | |____   / ____ \\   | |   | |__| | | | \\ \\");
				System.out.println("\t   |_|	  /_/    \\_\\  /_/ \\_\\      \\_____|  /_/    \\_\\  |______|  \\_____|  \\____/   |______| /_/    \\_\\  |_|    \\____/  |_|  \\_\\ ");
				System.out.println("\t  ");
				System.out.println("");
				System.out.println("===================================================================================================================================================");
				System.out.println(" [1] withholding Tax \n\n [2] Payable Tax \n\n [3] Income Tax \n\n [4]Social Security Contrubution (SSL) Tax \n\n [5] Leasing Payment \n\n [6] Exit");
				System.out.print("\nEnter an option to continue -> ");
				option=s.nextInt();
				if(option==1){
						withHoldingTax();
				}
				
				else if(option==2){
						payableTax();
				}
				else if(option==3){
						incomeTax();
				}
				
				else if(option==4){
						sslTax();
				}
				else if(option==5){
						LeasingPayment();	
				}
				else if(option==6){
					clearConsole();
					System.out.println("You Exited...");
					return;
				}
						
				else{
					clearConsole();
					System.out.println("Wrong Input... Try again");
					System.out.print("\nDO you want to Calculate another Tax? (Y/N)  ");
					s.nextLine();
					
					homepage=s.nextLine();
						
					}
						
					if(homepage.equalsIgnoreCase("n")){
						clearConsole();
						System.out.println("You exited.. \n Thank You for using this App.... ");
						return;
					}
		}while(homepage.equalsIgnoreCase("y"));					
		
	  }
	
	//main Method....
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		String homepage="";
		
		home();
		
	}
	
}
