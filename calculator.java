public class calculator{
//��������� ���������.
	private int result;
//��������� ��������� 
//����� � ������ - ��������� ������������
	public void plus(int ... params){
		for(Integer param : params){
			this.result += param;		
		}
	}
	public void minuse(int ... params){
		for(Integer param : params){
			this.result -= param;
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