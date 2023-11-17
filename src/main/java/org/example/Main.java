package org.example;

import java.io.IOException;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
     Customer customer1 = new Customer("Ayoub1");
     Customer customer2 = new Customer("Ayoub2");
     Employee employee1 = new Employee("Employee1");
     Employee employee2 = new Employee("Employee2");
     Bank bank1 = new Bank("bank1");
     Bank bank2 = new Bank("bank2");
     Account account1 = new Account(customer2,7000000,bank1);
     Account account2 = new Account(customer1,1000000,bank2);
     Transaction transaction1 = new Transaction(account1,account2,4400);
     boolean a = transaction1.approveTransaction();
     int b=5;
     b= (b=10)+b;
     System.out.println(b);
     b+=(b=10);
     System.out.println(b);
     /*if(a){
      transaction1.serializeToFile("transactions.json");

     }
     /*if(a){

      // Create an ObjectMapper
      ObjectMapper mapper = new ObjectMapper();
      String json = mapper.writeValueAsString(transaction1);
      File file = new File("transactions.json");
      // Write the JSON to a file
      mapper.writeValue(file, transaction1);;
      if (file.exists() && file.length() > 0) {
       System.out.println("Transaction data written to file");
      } else {
       System.out.println("Transaction data not written to file");
      }
     }
     /*transaction1.TransactionDecision();
     System.out.println("The transaction status is  :" + transaction1.getStatus());
     //int c = System.in.read();
     employee2.validate(transaction1);
     transaction1.getValidators();
     System.out.println("The transaction status is  :" + transaction1.getStatus());
     employee1.validate(transaction1);
     int c = System.in.read();
     System.out.println("The transaction status is  :" + transaction1.getStatus());
     System.out.println("The validitors of the Transaction are : ");
     transaction1.getValidators();
     System.out.println("the transaction type is " + transaction1.getType());
     transaction1.approveTransaction();
     System.out.println("The amount of the source account after Transaction is " + account1.getBalance());
     System.out.println("The amount of the Target account after Transaction is " + account2.getBalance());
*/

    }
}