public class calculator{
//��������� ���������.
	private int result;
//��������� ��������� 
//����� � ������ - ��������� ������������
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