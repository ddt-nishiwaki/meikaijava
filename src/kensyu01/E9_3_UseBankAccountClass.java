package kensyu01;

/*** クラス ******************************************/
// 銀行口座クラスを使うクラス
public class E9_3_UseBankAccountClass {
	
	/*** ボブの情報設定 **************************/
	// 名義人「ボブ」を設定する
	private static final String NAME_BOB = "bob";

	/*** マイクの情報設定 **************************/
	// 名義人「マイク」を設定する
	private static final String NAME_MIKE = "mike";
	// マイクの口座番号を設定する
	private static final String MIKES_ACCOUNT = "1111111";

	/*** アベルの情報設定 **************************/
	// 名義人「アベル」を設定する
	private static final String NAME_ABEL = "abel";
	// アベルの口座番号を設定する
	private static final String ABELS_ACCOUNT = "2222222";
	// アベルの残高を設定する
	private static final long NUMBER_ABELS_BALANCE = 2000000;

	/*** シェリーの情報設定 **************************/
	// 名義人「シェリー」を設定する
	private static final String NAME_CHERIE = "cherie";
	// シェリーの口座番号を設定する
	private static final String CHERIES_ACCOUNT = "3333333";
	// シェリーの残高を設定する
	private static final long NUMBER_CHERIES_BALANCE = 3000000;
	// シェリーの口座開設日を設定する
	private static final Day DAY_OPENING_ACCOUNT_CHERIE = new Day(2003,3,3);

	/*** メインメソッド **************************/
	// 銀行口座クラスを使い、動作を確認する処理を行う
	public static void main(String[] arg){
		// デフォルト設定のインスタンスを作成する
		BankAccount defaultAccount = new BankAccount();
		// デフォルト設定のインスタンスの情報を確認する
		System.out.println(defaultAccount);

		// 引数を一つ設定したインスタンスを作成する
		BankAccount oneArgumentAccount = new BankAccount(NAME_BOB);
		// 引数を一つ設定したインスタンスの情報を確認する
		System.out.println(oneArgumentAccount);

		// 引数を二つ設定したインスタンスを作成する
		BankAccount twoArgumentAccount = new BankAccount(NAME_MIKE,MIKES_ACCOUNT);
		// 引数を二つ設定したインスタンスの情報を確認する
		System.out.println(twoArgumentAccount);

		// 引数を三つ設定したインスタンスを作成する
		BankAccount threeArgumentAccount = new BankAccount(NAME_ABEL,ABELS_ACCOUNT,NUMBER_ABELS_BALANCE);
		// 引数を三つ設定したインスタンスの情報を確認する
		System.out.println(threeArgumentAccount);

		// 引数を四つ設定したインスタンスを作成する
		BankAccount fourArgumentAccount = new BankAccount(NAME_CHERIE,CHERIES_ACCOUNT,NUMBER_CHERIES_BALANCE,DAY_OPENING_ACCOUNT_CHERIE);
		// 引数を四つ設定したインスタンスの情報を確認する
		System.out.println(fourArgumentAccount);
	}
}
