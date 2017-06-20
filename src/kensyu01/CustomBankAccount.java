package kensyu01;

// インスタンス生成時にメッセージを出力するように改良した銀行口座クラス
public class CustomBankAccount {
	/*** 出力用定数 *********************************/
	private static final String MESSAGE_THANK_YOU = "明解銀行での口座開設ありがとうございます";
	
	/*** フィールド *********************************/
	// デフォルトの名前を設定する
	private String mName = "defaultName";
	// デフォルトの口座番号を設定する
	private String mAccountNumber = "0000000";
	// デフォルトの残高を設定する
	private long mBalance = 10;
	// デフォルトの口座開設日を設定する
	private Day mOpeningDate = new Day();
	
	/*** インスタンス初期化子 *********************************/
	{
		System.out.println(MESSAGE_THANK_YOU);
	}

	/*** コンストラクタ *********************************/
	CustomBankAccount(){ }
	// 引数一つのコンストラクタを設定する
	CustomBankAccount(String name){
		// 名前フィールドを設定する
		this.mName = name;
	}
	// 引数二つのコンストラクタを設定する
	CustomBankAccount(String name, String accountNumber){
		// 名前フィールドを設定する
		this.mName = name;
		// 口座番号フィールドを設定する
		this.mAccountNumber = accountNumber;
	}
	// 引数三つのコンストラクタを設定する
	CustomBankAccount(String name, String accountNumber, long balance){
		// 名前フィールドを設定する
		this.mName = name;
		// 口座番号フィールドを設定する
		this.mAccountNumber = accountNumber;
		// 残高フィールドを設定する
		this.mBalance = balance;
	}
	// 引数四つのコンストラクタを設定する
	CustomBankAccount(String name, String accountNumber, long balance, Day openingDate){
		// 名前フィールドを設定する
		this.mName = name;
		// 口座番号フィールドを設定する
		this.mAccountNumber = accountNumber;
		// 残高フィールドを設定する
		this.mBalance = balance;
		// 口座開設日フィールドを設定する
		this.mOpeningDate = new Day(openingDate);
	}
	
	/*** ゲッター ********************/
	// 名義の名前を取得するメソッドを設定する
	String getName(){
		// 名義の名前を返す
		return this.mName;
	}
	// 口座番号を取得するメソッドを設定する
	String getNo(){
		// 口座番号を返す
		return this.mAccountNumber;
	}
	// 残高を取得するメソッドを設定する
	long getBalance(){
		// 残高を返す
		return this.mBalance;
	}
	// 口座開設日を取得するメソッドを設定する
	Day getOpeningDate(){
		// 口座開設日を返す
		return new Day(this.mOpeningDate);
	}
	// 銀行口座の情報を取得するメソッドを設定する
	public String toString() {
		// 口座開設日の情報を取得する
		String openingDate = this.mOpeningDate.toString();
		// 銀行口座の情報を返す
		return String.format("名前 : %s\n口座番号 : %s\n入金額 : %d\n口座開設日 : %s\n", this.mName,this.mAccountNumber,this.mBalance,openingDate);
	}
	/*** セッター ********************/
	// 入金を行うメソッドを設定する
	void deposit(long cash){
		// 設定した金額を加算する
		mBalance += cash;
	}
	// 引き出しを行うメソッドを設定する
	void withdraw(long cash){
		// 設定した金額を減算する
		mBalance -= cash;
	}
}
