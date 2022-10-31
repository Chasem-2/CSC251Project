public class Policy {

    //Variables
    private int policyNumber, age;
    private double height,weight;
    private String providerName, phFname, phLname, smoker;

    /**
     * Constructor that does not accept arguments
     * 
     */
    public Policy(){
        policyNumber = 0;
        providerName = "";
        phFname = "";
        phLname = "";
        age = 0;
        smoker = "";
        height = 0;
        weight = 0;
     }


    /**
     * Policy constructor
     * @param policyNumber Integer for the Policy Number
     * @param providerName String for the name of the policy provider
     * @param phFname String for the Policy Holders first name
     * @param phLname String for the Policy holders last name
     * @param age Integer for the policy holders age
     * @param smoker String for if the policy holder is a smoker or not
     * @param height Double for the policy holders height
     * @param weight Double for the policy holders weight
     */
    public Policy(int policyNumber, String providerName, String phFname, String phLname, Integer age, String smoker, double height, double weight){
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.phFname = phFname;
        this.phLname = phLname;
        this.age = age;
        this.smoker = smoker;
        this.height = height;
        this.weight = weight;
    }
    /**
     * Method for determining the BMI of the policy holder
     * @return The total BMI of the policy holder
     */
    public double getBMI(){
        return (weight * 703)/(height*height);
    }

    /**
     * Method to determine the total policy cost
     * @return The total policy cost
     */
    public double PolicyTotal(){
        double policyCost = 0;
        int BASE = 600;
        int ADDFEE = 75;
        int SMOKERFEE = 100;

        policyCost = policyCost + BASE;
        //Check Age
        if(age>50)
        policyCost = policyCost+ADDFEE;
        //Check if Smoker
        if(smoker.equals("smoker"))
        policyCost = policyCost + SMOKERFEE;
        //Check BMI
        if(getBMI()>35)
        policyCost = policyCost +((getBMI() - 35)*20);



        // return Policy Cost
        return policyCost;
    }

    public int getPNumber(){
        return policyNumber;
    }
    public void setpNumber(int policyNumber){
        this.policyNumber = policyNumber;
    }
    public String getName(){
        return providerName;
    }
    public void setName(String providerName){
        this.providerName = providerName;
    }
    public String getphFname(){
        return phFname;
    }
    public void setphFname(String phFname){
        this.phFname = phFname;
    }
    public String getphLname(){
        return phLname;
    }
    public void setphLname(String phLname){
        this.phLname = phLname;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String isSmoker(){
        return smoker;
    }
    public void setSmoker(String smoker){
        this.smoker = smoker;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public String toString(){
        String str = "Policy Number: " + policyNumber + 
        "\nProvider Name: " + providerName + 
        "\nPolicyholder's First Name: " + phFname + 
        "\nPolicyholder's Last Name: " + phLname + 
        "\nPolicyholder's Smoking Status: " + smoker + 
        "\nPolicyholder's Age: " + age +
        "\nPolicyholder's Weight" + weight + 
        "\nPolicyholder's Height" + height;
        return str;
    }
}
