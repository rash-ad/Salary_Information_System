import java.util.Scanner;
class Flowcontrol{
	public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			System.out.println("----------------------------------------------");
			System.out.println("| \t SALARY INFORMATION SYSTEM\t     |");
			System.out.println("----------------------------------------------");
			
			System.out.println("\n\t[1] Calculate Income Tax    \n\t[2] Calculate Annual Bonus \n\t[3] Calculate Loan Amount  \n ");
			
			System.out.print("Enter an option to Continue > ");
			int option=s.nextInt();
			int incomeTax;
			
			
			if(option==1){
					System.out.println("----------------------------------------------");
					System.out.println("| \t Calculate Income Tax\t             |");
					System.out.println("----------------------------------------------");
					System.out.print("Input  Employee name: ");
					String employeeName=s.nextLine();
					s.nextLine();
					System.out.print("Input  Employee Salary: ");
					int employeeSalary=s.nextInt();
					double tax=0;
						if(employeeSalary<=100000){
							tax=0;
							System.out.println("No tax Charged");
						}
						else if(employeeSalary<=141667){
							tax=(employeeSalary-100000)*0.06;
							System.out.println("You have  to pay income tax per month: "+(int)tax);
			
						}
			
			
					else if(employeeSalary<=183333){
							tax=2500+(employeeSalary-141666)*0.12;
							System.out.println("You have  to pay income tax per month: "+(int)tax);
			
					}
					else if(employeeSalary<=225000){
							tax=2500+5000+(employeeSalary-183332)*0.18;
							System.out.println("You have  to pay income tax per month: "+(int)tax);
			
					}
					else if(employeeSalary<=266667){
							tax=2500+5000+7500+(employeeSalary-224999)*0.24;
							System.out.println("You have  to pay income tax per month: "+(int)tax);
			
					}
					else if(employeeSalary<=308333){
							tax=2500+5000+7500+5000+5000+(employeeSalary-266666)*0.3;
							System.out.println("You have  to pay income tax per month: "+(int)tax);
			
					}
					else if(employeeSalary>308333){
						
							tax=37500+(employeeSalary-308332)*0.36;
							System.out.println("You have  to pay income tax per month: "+(int)tax);
			
			
				}
				else if(employeeSalary<308333){
						
							tax=37500+(employeeSalary-308332)*0.36;
							System.out.println("You have  to pay income tax per month: "+(int)tax);
			
			
					}
					
				
		}
		//Annual Bonus
		
		if(option==2){
			System.out.println("----------------------------------------------");
			System.out.println("| \t CALCULATE ANNUAL BONUS\t             |");
			System.out.println("----------------------------------------------");
			
			System.out.print("Enter Employee Name - ");
			String employeeName=s.nextLine();
			s.nextLine();
			
			System.out.print("Enter Employee Salary - ");
			double employeeSalary=s.nextDouble();
			
			if(employeeSalary<100000){
							System.out.println("Annual bonus - ");
							System.out.println(5000);
	
				}
			else if(employeeSalary <199999){
						System.out.print("Annual Bonus - ");
						System.out.print(employeeSalary*=0.1);
						
						
						
				}
			else if(employeeSalary<299999){
						System.out.print("Annual Bonus - ");
						System.out.println(employeeSalary*=0.15);
				}
			else if(employeeSalary<399999){
						System.out.print("Annual Bonus - ");
						System.out.println(employeeSalary*=0.2);
				}
				else if (employeeSalary>400000){
						System.out.print("Annual Bonus - ");
						System.out.println(employeeSalary*=0.35);
				
					}
				
				
			
			
			}
			//Loan Amount 
			if(option==3){
					System.out.println("----------------------------------------------");
					System.out.println("| \t CALCULATE LOAN AMOUNT \t             |");
					System.out.println("----------------------------------------------");
					System.out.print("Enter employee Name - ");
					String employeeName =s.nextLine();
					
					s.nextLine();
					
					System.out.print("Enter employee Salary - ");
					int employeeSalary =s.nextInt();
					
					
					double  loanAmount;
					double monthlyInstallment=employeeSalary*0.6;
					double annualInterest;
					annualInterest=0.15;
					int years;
					
					if(employeeSalary>50000 ){
							System.out.print("Enter Number of Year: ");
							years = s.nextInt();
							
							
							double monthlyRate=annualInterest/12;
							int numberOfMonths=years*12;
							double MonthInPower=Math.pow(1+ monthlyRate,numberOfMonths);
							
							double numerator=1-(1/MonthInPower);
							double denominator=annualInterest/12;
							loanAmount=monthlyInstallment*(numerator/denominator);
							
							if(years>5){
									System.out.println("Maximum year is 5");
								}
							System.out.print("You can get loan Amount");
							System.out.print((int)(loanAmount/1000)*1000);
							
				
							

						}
					else{
						System.out.println("You cannot get loan Amount because your salary is less than Rs. 50 000......");
						}
					
					
		
			
			
			
		}
	}
	
	
}
