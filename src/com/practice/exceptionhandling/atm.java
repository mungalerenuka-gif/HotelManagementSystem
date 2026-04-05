package com.practice.exceptionhandling;

import java.util.Scanner;

public class atm {
	int amount = 70000;
	String fixedPin = "9090";
	int attempt = 3;
	Scanner sc = new Scanner(System.in);

	void balanceCheck() {
		System.out.println("Enter your Pin ");
		String pin = sc.next();

		while (attempt > 0) {
			if (pin.length() == 4) {
			   if (pin.equals(fixedPin)) {
				   System.out.println(" Your current balance :" + amount);
				   System.out.println("Thank you !");
				   break;
			   } else {
				   attempt--;
				    if (attempt > 0) {
					System.out.println("invalid pin attempt left :" + attempt);
					pin = sc.next();
				} else if (attempt == 0) {
					System.out.println("Card Blocked");
					throw new CardBlockedException();
				}
			}
		}else {
			attempt--;
			if (attempt > 0) {
				System.err.println("Invalid Credential pin must be four digit attempts left: " + attempt);
				pin = sc.next();
			} else if (attempt == 0) {
				System.err.println("Card blocked");
				throw new CardBlockedException();

			}
		}
		}

	}

	void withdraw() {
		System.out.println("Enter Withdraw Amount:");
		int withdraw = sc.nextInt();

		System.out.println("Enter your pin:");
		String pin = sc.next();

		while (attempt > 0) {
			if (pin.length() == 4) {
				if (pin.equals(fixedPin)) {
					if (withdraw > amount) {
						System.out.println("Insufficient Balance");
						System.out.println("Balance :" + amount);
						throw new RuntimeException("Insufficient Balance");
					} else {
						amount = amount - withdraw;
						System.out.println("Withdrawal successful!! Your Account Balance : " + amount);
						System.out.println("Thank you !");
						break;
					}
				} else {
					attempt--;
					if (attempt > 0) {
						System.err.println("Invalid Pin, attempts left: " + attempt);
						System.out.println("Try again");
						pin = sc.next();

					} else if (attempt == 0) {
						System.err.println("Card blocked");
						throw new CardBlockedException();
					}
				}
			} else {
				attempt--;
				if (attempt > 0) {
					System.err.println("Invalid Credential pin must be four digit attempts left: " + attempt);
					pin = sc.next();
				} else if (attempt == 0) {
					System.err.println("Card blocked");
					throw new CardBlockedException();

				}
			}
		}
	}

	void deposite() {
		System.out.println("Enter your Pin ");
		String pin = sc.next();

		while (attempt > 0) {
			if(pin.length()==4) {
			if (pin.equals(fixedPin)) {
				System.out.println("Enter amount that you want to deposite");
				int deposite = sc.nextInt();

				amount = amount + deposite;
				System.out.println("Your Updated Account Balance :" + amount);
				System.out.println("Thank you !");
				break;
			} else {
				attempt--;
				if (attempt > 0) {
					System.out.println("invalid pin attempt left :" + attempt);
					pin = sc.next();
				} else if (attempt == 0) {
					System.out.println("Card Blocked");
					throw new CardBlockedException();
				}
			}
		}else {
			attempt--;
			if (attempt > 0) {
				System.err.println("Invalid Credential pin must be four digit attempts left: " + attempt);
				pin = sc.next();
			} else if (attempt == 0) {
				System.err.println("Card blocked");
				throw new CardBlockedException();
			}
		}
		}
	}

	void recept(int option) {
		if (option == 2) {
			System.out.println("================Payment Recept===================");
			System.out.println("   Tansaction Successfull, Amount Deposited");
			System.out.println("   Previous Bank Balance: " + 70000);
			System.out.println("   Updated Bank Balance :" + amount);
			System.out.println("                Thankyou!!                                   ");
			System.out.println("==================================================");
		} else if (option == 3) {
			System.out.println("================Payment Recept===================");
			System.out.println("   Tansaction Successfull, Amount Withdrown");
			System.out.println("   Previous Bank Balance: " + 70000);
			System.out.println("   Updated Bank Balance :" + amount);
			System.out.println("                Thankyou!!                                   ");
			System.out.println("==================================================");
		} else if (option == 1) {
			System.out.println("================Payment Recept===================");
			System.out.println("   Your Bank Balance: " + 70000);
			System.out.println("                Thankyou!!                                   ");
			System.out.println("==================================================");
		}

	}

	public static void main(String[] args) {
		atm sbi = new atm();
		System.out.println("=======================Welcome to RRM Bank=====================");
		System.out.println("We are here to help you.....!!!!");
		System.out.println("1.Check balance");
		System.out.println("2.Deposite amount");
		System.out.println("3.Withdrow amount");

		Scanner sc = new Scanner(System.in);
		System.out.println("select number for what you want:");
		int option = sc.nextInt();

		if (option == 1) {
			sbi.balanceCheck();
			System.out.println("Recept : ");
			System.out.println("if want Recept: Press 1");
			System.out.println("if dont want Recept: Press 2");
			int recept = sc.nextInt();

			if (recept == 1) {
				sbi.recept(option);
			} else if (recept == 2) {
				System.out.println("Thnak you for stying with us . visit again");
			}
		} else if (option == 3) {
			sbi.withdraw();
			System.out.println("Recept : ");
			System.out.println("if want Recept: Press 1");
			System.out.println("if dont want Recept: Press 2");
			int recept = sc.nextInt();

			if (recept == 1) {
				sbi.recept(option);
			} else if (recept == 2) {
				System.out.println("Thnak you for stying with us . visit again");
			}
		} else if (option == 2) {
			sbi.deposite();
			System.out.println("Recept : ");
			System.out.println("if want Recept: Press 1");
			System.out.println("if dont want Recept: Press 2");
			int recept = sc.nextInt();

			if (recept == 1) {
				sbi.recept(option);
			} else if (recept == 2) {
				System.out.println("Thnak you for stying with us . visit again");
			}
		} else {
			System.err.println("Project terminated");
			throw new CardBlockedException();
		}

	}
}