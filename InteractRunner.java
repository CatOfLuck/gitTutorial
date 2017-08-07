import java.util.Scanner;
public class InteractRunner {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		try{
			calculator calc = new calculator();
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Enter first arg : ");
				String first = in.next();
				System.out.println("Enter second arg : ");
				String second = in.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result : "+ calc.getResult());
				calc.cleanResult();
				System.out.println("Exit : yes/no");
				exit=in.next();
			}
		}finally {
			in.close();
		}
	}	
}