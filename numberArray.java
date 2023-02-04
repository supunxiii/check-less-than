import java.util.Scanner;
public class numberArray{
  public static void main(String args[]){
    int value = 40;
    int count = 0;
    int[] numArry = new int[10];
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter your mark: ");
    for (int i = 0; i < 10; i++){
      numArry[i] = userinput.nextInt();
    }for (int a = 0; a < numArry.length; a++){
      if (numArry[a] < value){
        System.out.println("Mark "+numArry[a]+ " is less than 40.");
        count++;
      }
    }
    System.out.println("Number of students who got less than 40 are "+count+".");
  }
}
