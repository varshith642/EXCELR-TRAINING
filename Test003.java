import java.util.Scanner;
class Test003{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Happy sankranthi");
        System.out.println("No of employees: ");
        int emp=scanner.nextInt();
        for(int user=1;user<=emp;user++){ 
            System.out.println("Are you a member?");
                String reply=scanner.next();
        if(reply.equals("yes")){

             System.out.println("Happie happiee");
        }
    else{
        System.out.println("Error");
        break;
    }
}}
}