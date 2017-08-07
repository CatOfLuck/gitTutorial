public class calculator{
//результат вічисления.
	private int result;
//суммируем аргументы 
//парам и парамс - аргументы суммирования
	public void add(int ... params){
		for(Integer param : params){
			this.result += param;		
		}
	}
//take the result
	public int getResult(){
		return this.result;
	}
//clear the calculating result
	public void cleanResult(){
		this.result = 0;
	}
}