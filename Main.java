import java.util*;

public class Main{
    public static void main (String[] args){
        College UF = new College("The University of Florida", "public", "large", "Gainseville, Florida");
        System.out.println(UF);

        Scanner yesOrNo = new Scanner;
        System.out.println("Will you be applying for the 2020-2021 application cycle?");
        String yesOrNo = inputYesOrNo.nextLine();

        if (yesOrNo.equals("yes") || yesOrNo.equals("Yes")){
            System.out.println("Great!");
        }
    }
}