package pet;

/**
 * ペットを作成するクラスです<br>
 * ペットは地震の名前と飼い主の名前を持ちます
 * @author wakkky05
 *
 */
public class Pet {

	/************************************************************
	 	インスタンス変数
	************************************************************/
	private String mName;		// 名前フィールドを設定する
	private String mMasterName;	// 飼い主の名前フィールドを設定する

	/************************************************************
	 	定数(String)
	************************************************************/
	// 自己紹介をするテキストフォーマットを設定する
	private static final String FORMAT_GREET = "僕の名前は %s です";
	// 飼い主の紹介をするテキストフォーマットを設定する
	private static final String FORMAT_INTRODUCE_MASTER = "ご主人様は %s です";
	
	/************************************************************
	 	コンストラクタ
	************************************************************/
	/**
	 * 名前と飼い主の名前を設定します
	 * @param name
	 * @param masterName
	 */
	public Pet(String name, String masterName){
		// 名前を設定する
		mName = name;
		// 飼い主の名前を設定する
		mMasterName = masterName;
	}

	/************************************************************
	 	クラスメソッド
	************************************************************/
	/**
	 * 自身の名前を返します
	 * @return mName
	 */
	public String mGetName() {
		// 名前を返す
		return mName;
	}
	/**
	 * 飼い主の名前を返します
	 * @return mMasterName
	 */
	public String mGetMasterName() {
		// 飼い主の名前を返す
		return mMasterName;
	}
	/**
	 * 自己紹介メッセージを出力します
	 */
	public void mIntroduce() {
		// 自分の名前を出力する
		System.out.printf(FORMAT_GREET, mName);
		// 飼い主の名前を出力する
		System.out.printf(FORMAT_INTRODUCE_MASTER, mMasterName);
	}
}
