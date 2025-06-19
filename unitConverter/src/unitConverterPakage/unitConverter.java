package unitConverterPakage;

import java.util.Scanner;

public class unitConverter {
	
	static Scanner sc = new Scanner(System.in);
	
	//this function is used to get the input data to convert into the other units of length, weight or temperature
	public static double gettingInput() {
		double data = 0;
		boolean valid = true;
		while(valid) {
			try {
				System.out.println("\nEnter the number to convert: ");
				data = Double.parseDouble(sc.nextLine());
				valid = false;
			}
			catch(NumberFormatException e) {
				System.out.println("Enter the correct number bro!");
				continue;
			}
		}
		return data;
	}
	
	
	// the next functions are made for length conversions
	public static Double miliToCenti(double data) {
		return data/10;
	}
	
	public static Double miliToMeter(double data) {
		return data/1000;
	}

	public static Double miliToKilo(double data) {
		return data/1000000;
	}
	
	public static Double centiToMeter(double data) {
		return data/100;
	}
	
	public static Double centiToKilo(double data) {
		return data/100000;
	}
	
	public static Double meterToKilo(double data) {
		return data/1000;
	}
	
	public static Double kiloToMeter(double data) {
		return data * 1000;
	}


	
	// the next functions are made for weight conversions
	public static double gramToKilogram(double data2) {
		return data2/10000;
	}

	public static double kilogramToGram(double data2) {
		return data2*1000;
	}

	public static double gramToTone(double data2) {
		return data2/1000000;
	}

	public static double toneToGram(double data2) {
		return data2 * 1000000;
	}

	public static double kilogramToTone(double data2) {
		return data2/1000;
	}

	public static double toneToKilogram(double data2) {
		return data2*1000;
	}


	
	//The next funcitons are made for converting Temperature into its different units
	public static double kelvinToFahrenheit(double data3) {
		return (data3 - 273.15) * 9/5 +32;
	}

	public static double fahrenheitToKelvin(double data3) {
		return (data3 - 32)/1.8 + 273.15;
	}

	public static double kelvinToCelsius(double data3) {
		return (data3 - 273.15);
	}

	public static double celsiusToKelvin(double data3) {
		return (data3 + 273.15);
	}

	public static double fahrenheitToCelsius(double data3) {
		return (data3 - 32) * 5/9;
	}

	public static double celsiusToFahrenheit(double data3) {
		return (data3 * 9/5) + 32;
	}


	// this is the main funtion
	public static void main(String[] args) {
		
		System.out.println("!!! UNIT CONVERTER !!!");
		
		boolean valid = true;
		while(valid) {
			boolean valid1 = true;
			String input = "";
			
			// this while loop is used to take the input from the user to know what type of conversion they want to do
			while(valid1) {
				try {
					System.out.println("MENU: \nType 1 for Lenght Converter"
							+ "\nType 2 for Weight Converter"
							+ "\nType 3 for Temperature Converter");
					
					input = sc.nextLine();
					
					if(!input.matches("[123]")) {
						throw new NumberFormatException();
					}
					valid1 = false;
				}
				catch(NumberFormatException e) {
					System.out.println("\nEnter the right number! \n");
				}
			}
			
			
	//		once the type of conversion is choosed then this switch statement is used to take another
	//		input that which type of conversion they want to do in length, weight or temperature conversion.
			switch(input) {
				case "1" :
					String unit1 = "";
					boolean valid2 = true;
					while(valid2) {
						try {
							System.out.println("\nChoose the conversion: "
									+ "\n1. milimeter to centimeter "
									+ "\n2. milimeter to meter "
									+ "\n3. milimeter to kilometer"
									+ "\n4. centimeter to meter"
									+ "\n5. centimeter to kilomeeter"
									+ "\n6. meter to kilometer"
									+ "\n7. kilometer to meter");
							
							unit1 = sc.nextLine();
							
							if(!unit1.matches("[1234567]")) {
								throw new NumberFormatException();
							}
							valid2 = false;
						}
						catch(NumberFormatException e) {
							System.out.println("\nEnter the right number bro!\n");
						}
					}
					
					double data1 = gettingInput(); // Taking the data as input from the user
					
					switch(unit1) {
						case "1":
							System.out.println(data1 + " in Centimeter: " + miliToCenti(data1));
							break;
						case "2":
							System.out.println(data1 + "in Meter: " + miliToMeter(data1));
							break;
						case "3":
							System.out.println(data1 + " in Kilometer: " + miliToKilo(data1));
							break;
						case "4":
							System.out.println(data1 + " in Meter: " + centiToMeter(data1));
							break;
						case "5":
							System.out.println(data1 + " in Kilometer: " + centiToKilo(data1));
							break;
						case "6":
							System.out.println(data1 + " in Kilometer: " + meterToKilo(data1));
							break;	
						case "7":
							System.out.println(data1 + " in Meter: " + kiloToMeter(data1));
							break;
					}
					break;
				
					
				case "2":
					String unit2 = "";
					boolean valid3 = true;
					while(valid3) {
						try {
							System.out.println("\nChoose the conversion: "
									+ "\n1. Gram to Kilogram. "
									+ "\n2. KiloGram to Gram."
									+ "\n3. Gram to Tone."
									+ "\n4. Tone to Gram."
									+ "\n5. KiloGram to Tone."
									+ "\n6. Tone to KiloGram");
							
							unit2 = sc.nextLine();
							
							if(!unit2.matches("[123456]")) {
								throw new NumberFormatException();
							}
							valid3 = false;
						}
						catch(NumberFormatException e) {
							System.out.println("\nEnter the right number bro!\n");
						}
					}
					
					double data2 = gettingInput();
				
					switch(unit2) {
						case "1":
							System.out.println(data2 +" in Kilogams: " + gramToKilogram(data2));
							break;
						case "2":
							System.out.println(data2 +" in Grams: " + kilogramToGram(data2));
							break;
						case "3":
							System.out.println(data2 +" in Tones: " + gramToTone(data2));
							break;
						case "4":
							System.out.println(data2 +" in Grams: " + toneToGram(data2));
							break;
						case "5":
							System.out.println(data2 +" in Tones: " + kilogramToTone(data2));
							break;
						case "6":
							System.out.println(data2 +" in Kilogams: " + toneToKilogram(data2));
							break;	
					}
					break;
					
				
				case "3":
					String unit3 = "";
					boolean valid4 = true;
					while(valid4) {
						try {
							System.out.println("\nChoose the conversion: "
									+ "\n1. Kelvin To Fahrenheit. "
									+ "\n2. Fahrenheit to Kelvin."
									+ "\n3. Kelvin to Celsius."
									+ "\n4. Celsius to Kelvin."
									+ "\n5. Fahrenheit to Celsius."
									+ "\n6. Celsius to Fahrenheit");
							
							unit3 = sc.nextLine();
							
							if(!unit3.matches("[123456]")) {
								throw new NumberFormatException();
							}
							valid4 = false;
						}
						catch(NumberFormatException e) {
							System.out.println("\nEnter the right number bro!\n");
						}
					}
					
					double data3 = gettingInput();
				
					switch(unit3) {
						case "1":
							System.out.println(data3 + " in Fahrenheit: " + kelvinToFahrenheit(data3));
							break;
						case "2":
							System.out.println(data3 + " in Kelvin: " + fahrenheitToKelvin(data3));
							break;
						case "3":
							System.out.println(data3 + " in Celsius: " + kelvinToCelsius(data3));
							break;
						case "4":
							System.out.println(data3 + " in Kelvin: " + celsiusToKelvin(data3));
							break;
						case "5":
							System.out.println(data3 + " in Celsius: " + fahrenheitToCelsius(data3));
							break;
						case "6":
							System.out.println(data3 + " in Fahrenheit: " + celsiusToFahrenheit(data3));
							break;	
					}
					break;
			}
			System.out.println("Do you want ot continue? Type \"exit\" to quit or press \"enter(write anything)\" to continue:");
			if(sc.nextLine().equalsIgnoreCase("exit")) {
				valid = false;
				System.out.println("Thanks!");
			}
		}
		sc.close();
	}
}