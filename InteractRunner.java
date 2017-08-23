import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        try{
            calculator calc = new calculator();
            String exit = "no";
            while(!exit.equals("yes")){
                if(calc.getResult() == 0){
                    System.out.println("Enter first arg : ");
                    String first = in.next();
                    System.out.println("Enter the action you want to do : ");
                    String action = in.next();
                    System.out.println("Enter second arg : ");
                    String second = in.next();
                    if(action.equals("+")){
                        calc.plus(Double.valueOf(first), Double.valueOf(second));
                        System.out.println("Result : "+ calc.getResult());
                    }else if(action.equals("-")){
			calc.result = Double.valueOf(first);
                        calc.minuse(Double.valueOf(second));
                        System.out.println("Result : "+ calc.getResult());
                    }else if(action.equals("*")){
			calc.result = Double.valueOf(first);
                        calc.mult(Double.valueOf(second));
                        System.out.println("Result : "+ calc.getResult());
                    }else if(action.equals("/")){
			calc.result = Double.valueOf(first);
                        calc.div(Double.valueOf(second));
                        System.out.println("Result : "+ calc.getResult());
                    }else if(action.equals("^")){
			calc.result = Double.valueOf(first);
                        calc.exp(Double.valueOf(second));
                        System.out.println("Result : "+ calc.getResult());
                    }
                    System.out.println("Exit : yes/no");
                    exit=in.next();
                }else{
		System.out.println("mistake? " + calc.getResult());
                String first = Double.toString(calc.getResult());
                    if(exit.equals("no")){
                        System.out.println("Countinue this example? yes/no");
                        String example = in.next();
                        if(example.equals("yes")){
                            System.out.println("Ok!");
                        }else{
                            calc.cleanResult();
                            System.out.println("Enter first arg : ");
                            first = in.next();
                        }
                    System.out.println("Enter the action you want to do : ");
                    String action = in.next();
                    System.out.println("Enter second arg : ");
                    String second = in.next();
                    if(action.equals("+")){
                        calc.plus(Double.valueOf(first), Double.valueOf(second));
                        System.out.println("Result : "+ calc.getResult());
                    }else if(action.equals("-")){
			calc.result = Double.valueOf(first);
                        calc.minuse(Double.valueOf(second));
                        System.out.println("Result : "+ calc.getResult());
                    }else if(action.equals("*")){
			calc.result = Double.valueOf(first);
                        calc.mult(Double.valueOf(second));
                        System.out.println("Result : "+ calc.getResult());
                    }else if(action.equals("/")){
			calc.result = Double.valueOf(first);
                        calc.div(Double.valueOf(second));
                        System.out.println("Result : "+ calc.getResult());
                    }else if(action.equals("^")){
			calc.result = Double.valueOf(first);
                        calc.exp(Double.valueOf(second));
                        System.out.println("Result : "+ calc.getResult());
                    }
                    System.out.println("Exit : yes/no");
                    exit=in.next();
                    }
                }
            }
        }finally {
            in.close();
        }
    }
}