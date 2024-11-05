//TCS IPA Solutions
package b1.Exercise;

import java.util.Scanner;

class TravelAgencies{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType,int price, boolean flightFacility ){
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo(){
        return regNo;
    }
    public String getAgencyName(){
        return agencyName;
    }
    public String getPackageType(){
        return packageType;
    }
    public int getPrice(){
        return price;
    }
    public boolean getFlightFacility(){
        return flightFacility;
    }

}




public class IPA3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        TravelAgencies[] ta = new TravelAgencies[4];
        for(int i=0;i<4;i++){
            System.out.print("Enter the Registration No: ");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the Agency Name: ");
            String b = sc.nextLine();
            System.out.print("Enter the Package Type: ");
            String c = sc.nextLine();
            System.out.print("Enter the Price: ");
            int d = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the Flight Availability: ");
            boolean e = sc.nextBoolean();
            ta[i] = new TravelAgencies(a,b,c,d,e);
        }
        System.out.print("Enter the Registration No to search: ");
        int regNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Package Type to search: ");
        String packageType = sc.nextLine();

        int result = findAgencyWithHighestPackage(ta);
        TravelAgencies agency = agencyDetails(ta,regNo,packageType);

        System.out.println(result);

        if(agency != null){
            System.out.println(agency.getAgencyName()+":"+agency.getPrice());
        }
        else{
            System.out.println("Agency not found with given registration number and package type!");
        }


    }

    private static int findAgencyWithHighestPackage(TravelAgencies[] ta) {

        int maxPackage = 0;
        for(TravelAgencies agency:ta){
            if(agency.getPrice() > maxPackage){
                maxPackage = agency.getPrice();
            }
        }
        return maxPackage;
    }


    public static TravelAgencies agencyDetails(TravelAgencies[] ta, int regNo, String packageType){

        for(TravelAgencies agency: ta){
            if(regNo == agency.getRegNo() && packageType.equalsIgnoreCase(agency.getPackageType())){
                if(agency.getFlightFacility() == true){
                    return agency;
                }
            }

        }
        return null;

    }
}
