import java.util.Date;

public class Account {
	//id的int类型私有数据域标识账号
	private int id = 0;
	//balance的double类型私有数据域
	private double balance = 0;
	//储存当前利率
	private double annualInterestRate = 0;
	//储存账户开户日期
	private Date dateCreated;
	
	//创建默认账户
	public Account(){
		dateCreated = new Date();
	}
	//创建具有指定id和初始余额的账户
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	//id访问器
	public int getId(){
		return id;
	}
	//id修改器
	public void setId(int id){
		this.id = id;
	}
	//balance访问器
	public double getBalance(){
		return balance;
	}
	//balance修改器
	public void setBalance(double balance){
		this.balance = balance;
	}
	//annualInterestRate访问器
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	//annualInterestRate修改器
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	//dateCreated访问器
	public Date getDateCreated(){
		return dateCreated;
	}
	//返回月利率
	public double getMonthlyInterestRate(){
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	//返回月利息
	public double getMonthlyInterest(){
		double monthlyInterest = balance * annualInterestRate / 12;
		return monthlyInterest;
	}
	//从账户提取指定额度
	public void withDraw(double money){
		balance -= money;
	}
	//像账户存储指定额度
	public void deposit(double money){
		balance += money;
	}
}
