package objectClass; //은행 계좌 클래스

public class Account {
	//멤버 변수(필드, 속성)
	static final String BANKNAME="신한은행";
	public String accountNo; //계좌번호 변수
	public String ownerName; //예금주 이름 변수
	public int balance; //통장의 잔액
	
	//생성자
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		//위쪽 source -> Generate Constructor using fields로 생성자 자동 생성
	}

	public Account() { } // 예제 1 생성자로 인한 표기
	
	//예금 메소드
	public void deposit(int amount) { //다른 클래스에서 사용하기 위해 앞에 public을 따로 붙임
		balance+=amount; 
	}
	
	//인출 메소드
	public int withdraw(int amount) throws Exception{
		if(balance<amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance-=amount;
		return amount;
	}
}