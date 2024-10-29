//TCS IPA sample questions

package b1.Exercise;

import java.util.Scanner;

class Projector{
    private int projectorId;
    private String projectorName;
    private int price;
    private int rating;
    private String availableIn;

    public Projector(int projectorId,String projectorName,int price,int rating,String availableIn){
        this.projectorId=projectorId;
        this.projectorName=projectorName;
        this.price=price;
        this.rating=rating;
        this.availableIn=availableIn;
    }
    public int getProjectorId(){
        return projectorId;
    }
    public String getProjectorName(){
        return projectorName;
    }
    public int getPrice(){
        return price;
    }
    public int getRating(){
        return rating;
    }
    public String getAvailableIn(){
        return availableIn;
    }

}

public class IPA {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Projector[] proj = new Projector[4];
        for(int i=0;i<4;i++){
            int projectorId = sc.nextInt();
            sc.nextLine();
            String projectorName = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            int rating = sc.nextInt();
            sc.nextLine();
            String availableIn = sc.nextLine();
            proj[i] = new Projector(projectorId,projectorName,price,rating,availableIn);
        }
        int newRating = sc.nextInt();
        sc.close();
        int result = findMaximumPriceByRating(proj,newRating);

        if(result == 0){
            System.out.println("No Such projector");
        }
        else{
            System.out.println(result);
        }


    }

    private static int findMaximumPriceByRating(Projector[] proj,int newRating) {
        int max = 0;
        int prId = 0;

        for(Projector projector:proj){
            if(projector.getRating()>newRating && projector.getAvailableIn().equalsIgnoreCase("TataCliq")){
                if(projector.getPrice()>max){
                    max = projector.getPrice();
                    prId = projector.getProjectorId();
                }

            }


        }
        return prId;

    }
}
