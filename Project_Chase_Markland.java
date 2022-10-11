import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Project_Chase_Markland {
    public static void main(String[] args){
        //declare variables
        int policyNumber, age, smoker_total = 0, non_smoker_total = 0;
        double height, weight;
        String providerName, phFname, phLname, smoker;
        //create a scanner instance to import the file
        Scanner file;
        //create array list to store policy objects loaded from file
        ArrayList<Policy> policyarray=new ArrayList<Policy>();

        //import information policy
        try {
            file = new Scanner(new File("PolicyInformation.txt"));
            while(file.hasNext()) {
                policyNumber = file.nextInt();
                providerName = file.next();
                phFname = file.next();
                phLname = file.next();
                age = Integer.parseInt(file.next());
                smoker = file.next();
                //file.nextLine();
                height = file.nextDouble();
                weight = file.nextDouble();
                
                //catch empty line between value sets
                if(file.hasNext()){
                    file.nextLine();
                }
                //creates policy object
                Policy policy = new Policy();
                policy.setpNumber(policyNumber);
                policy.setName(providerName);
                policy.setphFname(phFname);
                policy.setphLname(phLname);
                policy.setAge(age);
                policy.setSmoker(smoker);
                policy.setHeight(height);
                policy.setWeight(weight);
                //adds object to policyarray
                policyarray.add(policy);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }

        for(int i=0; i < policyarray.size(); i++){
            //Outputs information from the policy class
            System.out.printf("Poilcy Number: %d\n",policyarray.get(i).getPNumber());
            System.out.printf("Provider Name: %s\n",policyarray.get(i).getName());
            System.out.printf("Policyholder's First Name: %s\n", policyarray.get(i).getphFname());
            System.out.printf("Policyholder's Last Name: %s\n",policyarray.get(i).getphLname());
            System.out.printf("Policyholder's Smoking Status: %s\n",policyarray.get(i).isSmoker());
            System.out.printf("Policyholder's Age: %d\n",policyarray.get(i).getAge());
            System.out.printf("Policyholder's Weight: %.2f\n",policyarray.get(i).getWeight());
            System.out.printf("Policyholder's Height: %.2f\n",policyarray.get(i).getHeight());
            System.out.printf("Policy Price: $%.2f\n",policyarray.get(i).PolicyTotal());
            System.out.printf("Policyholder's BMI: %.2f\n",policyarray.get(i).getBMI());
            System.out.println();
            }
        for(int i=0; i<policyarray.size(); i++){
            if(policyarray.get(i).isSmoker().equalsIgnoreCase("smoker")){
                smoker_total++;
            } else{ non_smoker_total++;}
        }
        System.out.println("The number of policies with a smoker is: " + smoker_total);
        System.out.println("The number of policies with a non-smoker is: " + non_smoker_total);

    }    
}
