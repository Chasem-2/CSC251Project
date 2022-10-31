public class PolicyHolder {

     //Variables
     private int PolicyHolderNumber, PHage;
     private double PHheight,PHweight;
     private String PHproviderName, PHFname, PHLname, PHsmoker;

    //Constructor for a Policy Holder
     public PolicyHolder(int policyNumber, String providerName, String phFname, String phLname, Integer age, String smoker, double height, double weight){
        this.PolicyHolderNumber = policyNumber;
        this.PHproviderName = providerName;
        this.PHFname = phFname;
        this.PHLname = phLname;
        this.PHage = age;
        this.PHsmoker = smoker;
        this.PHheight = height;
        this.PHweight = weight;
    }


    //return Policy Holders number
    public int getPNumber(){
        return PolicyHolderNumber;
    }
    //Set Policy Holders number
    public void setpNumber(int policyNumber){
        this.PolicyHolderNumber = policyNumber;
    }
    //Return Policy Holders Name
    public String getName(){
        return PHproviderName;
    }
    //Set Policy Holders 
    public void setName(String providerName){
        this.PHproviderName = providerName;
    }
    public String getphFname(){
        return PHFname;
    }
    public void setphFname(String phFname){
        this.PHFname = phFname;
    }
    public String getphLname(){
        return PHLname;
    }
    public void setphLname(String phLname){
        this.PHLname = phLname;
    }
    public Integer getAge(){
        return PHage;
    }
    public void setAge(int age){
        this.PHage = age;
    }
    public String isSmoker(){
        return PHsmoker;
    }
    public void setSmoker(String smoker){
        this.PHsmoker = smoker;
    }
    public double getHeight(){
        return PHheight;
    }
    public void setHeight(double height){
        this.PHheight = height;
    }
    public double getWeight(){
        return PHweight;
    }
    public void setWeight(double weight){
        this.PHweight = weight;
    }
     

}