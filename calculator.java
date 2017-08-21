import java.lang.Math.*;
public class calculator{
//результат вічисления.
	public int result;
//суммируем аргументы 
//парам и парамс - аргументы суммирования
	public void plus(int ... params){
		for(Integer param : params){
			this.result += param;		
		}
	}
//minuse action
	public void minuse(int ... params){
		for(Integer param : params){
			this.result -= param;
		}
	}
//multiplication action
	public void mult(int ... params){
		for(Integer param : params){
			this.result *= param;
		}
	}
//division action
	public void div(int ... params){
		for(Integer param : params){
			this.result /= param;
		}
	}
//Exponentiation action
	public void exp(int ... params){
		for(Integer param : params){
			this.result = Math.pow(result, param);
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