package com.coforge.Assignment_7July26;

public class CustomExceptionDemo {
	public static void checkWithdrawal(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Transaction Denied, Insufficient Balance" );
        }
        System.out.println("Withdrawal Successful");
    }

    public static void verifyPasswords(String password, String confirmPassword) throws PasswordMatchException {
        if (!password.equals(confirmPassword)) {
            throw new PasswordMatchException("Registration Failed, Passwords do not match.");
        }
        System.out.println("Password verification passed");
    }

    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new InvalidEmailException("Invalid Email Format");
        }
        System.out.println("Email address format is valid.");
    }

    public static void processOrder(int availableStock, int requestedQuantity) throws StockOutOfBoundsException {
        if (requestedQuantity > availableStock) {
            throw new StockOutOfBoundsException("Order Rejected, Less than requested left in stock.");
        }
        System.out.println("Order processed! ");
    }

    public static void main(String[] args) 
    {

        try {
            Students s = new Students("Bob");
            s.setMarks(125); // Invalid range
        } catch (InvalidMarksException e) {
            System.out.println("Caught " + e.getMessage());
        }

        try {
            checkWithdrawal(300.00, 500.00); 
        } catch (InsufficientBalanceException e) {
        	System.out.println("Caught " + e.getMessage());
        }

        try {
            verifyPasswords("Bjpparker", "Bjppeter");
        } catch (PasswordMatchException e) {
        	System.out.println("Caught " + e.getMessage());
        }

        try {
            validateEmail("user_at_domain.com"); 
        } catch (InvalidEmailException e) {
        	System.out.println("Caught " + e.getMessage());
        }

        try {
            processOrder(5, 12); 
        } catch (StockOutOfBoundsException e) {
        	System.out.println("Caught " + e.getMessage());
        }

    }
}
