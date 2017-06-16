package kensyu01;

/*** クラス *********************************************/
// 作成したインスタンスの数をカウントするクラス
public class Id {

	/*** 定数設定 ************************/
	// 数値型変数を 0 で初期化するための値を設定する
	public static final int INITIALIZE_ZERO = 0;
	
	/*** クラス変数 ************************/
	protected static int sInstanceCounter = INITIALIZE_ZERO;

	/*** フィールド ************************/
	// 識別IDフィールドを設定する
	private int mId;

	/*** コンストラクタ ************************/
	public Id() {
		this.mId = ++sInstanceCounter;
	}

	/*** ゲッター ************************/
	// インスタンスを作成した回数を取得する
	static int getMaxId(){
		return sInstanceCounter;
	}
	// インスタンスの識別IDを取得する
	protected int getId(){
		return mId;
	}
}
