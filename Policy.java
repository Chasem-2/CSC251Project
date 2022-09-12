public class Policy {

    //Private variables
    private int policyNumber, age;
    private double height,weight;
    private String providerName, phFname, phLname, smoker;

    //Constructor arugment
    public Policy(int policyNumber, String providerName, String phFname, String phLname, int age, String smoker, double height, double weight){
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.phFname = phFname;
        this.phLname = phLname;
        this.age = age;
        this.smoker = smoker;
        this.height = height;
        this.weight = weight;
    }

    //Determine BMI
    public double getBMI(){
        return (weight * 703)/(height*height);
    }

    //Determine Policy Price
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
        if(smoker.equals("Smoker"))
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
    public int getAge(){
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
}
