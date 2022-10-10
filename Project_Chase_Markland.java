import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Project_Chase_Markland {
    public static void main(String[] args){
        //declare variables
        int policyNumber, age;
        double height, weight;
        String providerName, phFname, phLname, issmoker;
        //create a scanner instance to import the file
        Scanner file;
        //create array list to store policy objects loaded from file
        ArrayList<Policy> policyarray=new ArrayList<Policy>();

        //import information policy
        try {
            file = new Scanner(new File("PolicyInformation.txt"));
            while(file.hasNext()){
                policyNumber = file.nextInt();
                providerName = file.nextLine();
                phFname = file.nextLine();
                phLname = file.nextLine();
                age = file.nextInt();
                issmoker = file.nextLine();
                height = file.nextDouble();
                weight = file.nextDouble();
                //catch empty line between value sets
                if(file.hasNext()){
                    file.nextLine();
                }
                //creates policy object
                Policy policy = new Policy(policyNumber, providerName, phFname, phLname, age, issmoker, height, weight);
                //adds object to policyarray
                policyarray.add(policy);


                //Outputs information from the policy class
                System.out.printf("Poilcy Number: %d\n",policy.getPNumber());
                System.out.printf("Provider Name: %s\n",policy.getName());
                System.out.printf("Policyholder's First Name: %s\n", policy.getphFname());
                System.out.printf("Policyholder's Last Name: %s\n",policy.getphLname());
                System.out.printf("Policyholder's Smoking Status: $s\n",policy.isSmoker());
                System.out.printf("Policyholder's Age: %d\n",policy.getAge());
                System.out.printf("Policyholder's Weight: %.2f\n",policy.getWeight());
                System.out.printf("Policyholder's Height: %.2f\n",policy.getHeight());
                System.out.printf("Policy Price: $%.2f\n",policy.PolicyTotal());
                System.out.printf("Policyholder's BMI: %.2f\n",policy.getBMI());


            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



        
    }    
}
