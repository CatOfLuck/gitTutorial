import java.lang.Math.*;
public class calculator{
//результат вічисления.
	public double result;
//суммируем аргументы 
//парам и парамс - аргументы суммирования
	public void plus(double ... params){
		for(Double param : params){
			this.result += param;		
		}
	}
//minuse action
	public void minuse(double ... params){
		for(Double param : params){
			this.result -= param;
		}
	}
//multiplication action
	public void mult(double ... params){
		for(Double param : params){
			this.result *= param;
		}
	}
//division action
	public void div(double ... params){
		for(Double param : params){
			this.result /= param;
		}
	}
//Exponentiation action
	public void exp(double ... params){
		for(Double param : params){
			this.result = Math.pow(result, param);
		}
	}
//take the result
	public double getResult(){
		return this.result;
	}
//clear the calculating result
	public void cleanResult(){
		this.result = 0;
	}
}