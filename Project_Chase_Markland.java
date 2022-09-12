import java.util.Scanner;


public class Project_Chase_Markland {
    public static void main(String[] args){
        //declare variables
        int policyNumber, age;
        double height, weight;
        String providerName, phFname, phLname, issmoker;

        //create an instance of scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Policy Number: ");
        policyNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Please enter the Provider Name: ");
        providerName = sc.nextLine();
        System.out.print("Please enter the Policyholder's First Name: ");
        phFname = sc.nextLine();
        System.out.print("Please enter the Policyholder's Last Name: ");
        phLname = sc.nextLine();
        System.out.print("Please enter the Policyholder's Age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smoker = sc.nextLine();
        if(smoker.equals("smoker"))
        issmoker = "Smoker";
        else
        issmoker = "Non-Smoker";
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        height = sc.nextDouble();
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        weight = sc.nextDouble();
        //Creates a new instance of the policy class with the given user input
        Policy policy = new Policy(policyNumber, providerName, phFname, phLname, age, issmoker, height, weight);
        //Outputs information from the policy class
        System.out.printf("Poilcy Number: %d\n",policy.getPNumber());
        System.out.printf("Provider Name: %s\n",policy.getName());
        System.out.printf("Policyholder's First Name: %s\n", policy.getphFname());
        System.out.printf("Policyholder's Last Name: %s\n",policy.getphLname());
        System.out.printf("Policyholder's Age: %d\n",policy.getAge());
        System.out.printf("Policyholder's Smoking Status: $s\n",policy.isSmoker());
        System.out.printf("Policyholder's Height: %.2f\n",policy.getHeight());
        System.out.printf("Policyholder's Weight: %.2f\n",policy.getWeight());
        System.out.printf("Policyholder's BMI: %.2f\n",policy.getBMI());
        System.out.printf("Policy Price: $%.2f\n",policy.PolicyTotal());
    }    
}
