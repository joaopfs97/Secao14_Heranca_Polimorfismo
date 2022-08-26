package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        /*
        Account acc1 = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(500.00, 1002, "Marcia", 0.0);
        
        // UPCASTING
        Account acc2 = bacc;
        Account acc3 = new BusinessAccount(200.00, 1003, "João", 0.0);
        Account acc4 = new SavingAccount(0.1, 1004, "Pedro", 0.0);
        
        // DOWNCASTING
        BusinessAccount acc5 = (BusinessAccount)acc3;
        acc5.setLoanLimit(1000.00);
        
        //BusinessAccount acc6 = (BusinessAccount)acc4;
        if(acc4 instanceof BusinessAccount){
            BusinessAccount acc6 = (BusinessAccount)acc4;
            acc6.setLoanLimit(1000.00);
            System.out.println("Loan!");
        }
        
        if(acc4 instanceof SavingAccount){
            SavingAccount acc6 = (SavingAccount) acc4;
            acc6.updateBalance();
            System.out.println("Update!");
        }
        
        //Override
        Account acc10 = new Account(1001, "Alex", 1000.00);
        acc10.withdraw(200.00);
        System.out.println(acc10.getBalance());
        
        Account acc11 = new SavingAccount(0.01, 1002, "Maria", 1000.00);
        acc11.withdraw(200.00);
        System.out.println(acc11.getBalance());
        
        Account acc12 = new BusinessAccount(500.00, 1002, "Maria", 1000.00);
        acc12.withdraw(200.00);
        System.out.println(acc12.getBalance());
        */
        
        /*
        //Exercicio Polimorfismo
        
        List<Employee> list = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Oursourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(ch == 'y'){
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(additionalCharge, name, hours, valuePerHour));
            } else{
                list.add(new Employee(name, hours, valuePerHour));
            }
        }
        
        System.out.println();
        System.out.println("PAYMENTS");
        for (Employee emp : list){
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }
        
        
        */
        /*
        // Exercicio fixação polimorfismo
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Custom fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(customsFee, name, price));
            }
            if(ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                String date = sc.nextLine();
                LocalDate manufactureDate = LocalDate.parse(date.substring(6) +
                        "-" +
                        date.substring(3, 5) +
                        "-" +
                        date.substring(0,2));
                list.add(new UsedProduct(manufactureDate, name, price));
            }
            if(ch == 'c'){
                list.add(new Product(name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        
        for(Product p : list){
            System.out.println(p.priceTag());
        }
        */
     
        // Classes e metodos abstratos
        
        List<Contribuinte> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double gastosSaude = sc.nextDouble();
                list.add(new PessoaFisica(gastosSaude, name, rendaAnual));
            }
            else{
                System.out.print("Number of employees: ");
                int numeroFunc = sc.nextInt();
                list.add(new PessoaJuridica(numeroFunc, name, rendaAnual));
            }
        }
        
        System.out.println();
        double sum = 0;
        for(Contribuinte c : list){
            System.out.println(c.getNome() + ": $ " + String.format("%.2f", c.impostoPago()));
            sum += c.impostoPago();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f",sum));    
        
        sc.close();
        
    }
    
}
