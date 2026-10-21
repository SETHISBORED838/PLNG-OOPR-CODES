import java.util.ArrayList;
import java.util.Scanner;

class Date {
    int day;
    int month;
    int year;

    private int getValidInt(Scanner scanner, String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("   [Error] Please enter a value between " + min + " and " + max + ".");
            } else {
                System.out.println("   [Error] Please enter a valid number.");
                scanner.next(); 
            }
        }
    }

    public void inputDate(Scanner scanner) {
        this.year = getValidInt(scanner, "   Enter Year (1900-5000): ", 1900, 5000);
        this.month = getValidInt(scanner, "   Enter Month (1-12): ", 1, 12);
        
   
        int maxDays = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30;
        } else if (month == 2) {
        
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                maxDays = 29;
            } else {
                maxDays = 28;
            }
        }
        this.day = getValidInt(scanner, "   Enter Day (1-" + maxDays + "): ", 1, maxDays);
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

class Patient {
    protected String name;
    protected Date dateOfAdmission = new Date();
    protected String disease;
    protected Date dateOfDischarge = new Date();

    public void enterInfo(Scanner scanner) {
        scanner.nextLine(); 
   
        while (true) {
            System.out.print("@ Name of the patient: ");
            this.name = scanner.nextLine().trim();
            
            if (name.isEmpty()) {
                System.out.println("[Error] Patient name cannot be blank.");
            } else if (name.matches(".*\\d.*")) { 
                System.out.println("[Error] Patient name cannot contain numbers.");
            } else {
                break;
            }
        }

        System.out.println("@ Date of admission:");
        this.dateOfAdmission.inputDate(scanner);

        scanner.nextLine(); 
        while (true) {
            System.out.print("@ Disease: ");
            this.disease = scanner.nextLine().trim();
            if (!disease.isEmpty()) {
                break;
            }
            System.out.println("[Error] Disease profile cannot be blank.");
        }

        System.out.println("@ Date of discharge:");
        this.dateOfDischarge.inputDate(scanner);
    }

    public void displayInfo() {
        System.out.println("\nName: " + name);
        System.out.println("Date of Admission: " + dateOfAdmission);
        System.out.println("Disease: " + disease);
        System.out.println("Date of Discharge: " + dateOfDischarge);
    }
}


class DetailedPatient extends Patient {
    private int age;

    public void enterInfo(Scanner scanner) {
        super.enterInfo(scanner); 
  
        while (true) {
            System.out.print("5. Age (0-150): ");
            if (scanner.hasNextInt()) {
                this.age = scanner.nextInt();
                if (age >= 0 && age <= 150) {
                    break;
                }
                System.out.println("[Error] Age must be a reasonable value between 0 and 150.");
            } else {
                System.out.println("[Error] Age must be an integer.");
                scanner.next(); 
            }
        }
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Age: " + age);
        System.out.println("-----------------------------------");
    }

    public int getAge() {
        return age;
    }
}

public class OOPRMidtermLabAct6Week10HospitalManagement {
    public static void main(String[] args) {
        ArrayList<DetailedPatient> database = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Pokecenter Medical Hospital ---");
            System.out.println("1. Insert New Patient");
            System.out.println("2. Display all Patient");
            System.out.println("3. Display pediatric patient");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
       
            while (!scanner.hasNextInt()) {
                System.out.println("[Error] Please enter a structural number from 1 to 4.");
                System.out.print("Enter your choice (1-4): ");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    DetailedPatient p = new DetailedPatient();
                    System.out.println("\n--- Insert New Patient ---");
                    p.enterInfo(scanner);
                    database.add(p);
                    System.out.println("\nPatient added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Displaying All Patients ---");
                    if (database.isEmpty()) {
                        System.out.println("No patient records found.");
                    } else {
                        for (DetailedPatient patient : database) {
                            patient.displayInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Displaying Pediatric Patients (< 12 Years) ---");
                    boolean found = false;
                    for (DetailedPatient patient : database) {
                        if (patient.getAge() < 12) {
                            patient.displayInfo();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No pediatric patients found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting system");
                    break;

                default:
                    System.out.println("[Error] Please select an option between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
