public class calculate{
	public static void main(String[] arg){
		if(arg.length == 2){
			System.out.println("Calculate...");
			int first = Integer.valueOf(arg[0]);
			int second = Integer.valueOf(arg[1]);
			calculator calc = new calculator();
			calc.add(first,second);
			System.out.println("Summ " + calc.getResult());		
		}else{
			System.out.println("Input two parameters");
			}
	}
}