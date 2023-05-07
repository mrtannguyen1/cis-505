/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
// This class defines a finance calculator
public class FinanceCalculator {
		// The number of months in a year
		private static int MONTHS_IN_YEAR = 12;
		//Calculates the future value of a loan with given monthly payment, interest rate and years
		public static double calculateFutureValue(double monthlyPayment, double rate, int years) {
			// Calculate the number of months
			int months = years * MONTHS_IN_YEAR;
		
			// Calculate the interest rate
			double interestRate = 1 + rate / 100;
		
			// Calculate the present value
			double presentValue = monthlyPayment * months;
		
			// Calculate the future value using the present value and interest rate
			double futureValue = presentValue * (Math.pow(interestRate, months));
		
			// Return the calculated future value
			return futureValue;
		}
}