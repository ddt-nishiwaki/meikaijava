package pet;

/**
 * ロボットペットを作成するクラスです
 * ペットクラスを継承します
 * @author wakkky05
 * @see Pet
 * @see Skinnable
 *
 */
public class RobotPet extends Pet implements Skinnable{

	/************************************************************
	 	定数(String)
	************************************************************/
	// 自己紹介をするテキストフォーマットを設定する
	private static final String FORMAT_GREET = "私はロボット。名前は %s です。スキンは%sです\n";
	// 飼い主の紹介をするテキストフォーマットを設定する
	private static final String FORMAT_INTRODUCE_MASTER = "ご主人様は %s です\n";
	// 行う家事の種類を出力するテキストフォーマットを設定する
	private static final String FORMAT_OUTPUT_WORK = "%sします。\n";
	// スキンを変更したことを示すテキストフォーマットを設定する
	private static final String FORMAT_OUTPUT_CHANGE_COLOR = "スキンを %s に変更します\n";

	private static final int NUMBER_DEFAULT_COLOR = 0;
	/************************************************************
	 	インスタンス変数
	************************************************************/
	private String mSkin;		// スキンフィールドを設定する

	// 家事コマンドに対応する家事の種類をテキストで設定する
	private String[] TEXT_LIST_HOWSWORKS = {
			"掃除",		// 0:掃除 を設定
			"洗濯",		// 1:洗濯 を設定
			"炊事"		// 2:炊事 を設定
	};

	private String[] TEXT_MY_COLOR = {
			"黒",
			"赤",
			"緑",
			"青",
			"豹"
	};
	
	/************************************************************
	 	コンストラクタ
	************************************************************/
	/**
	 * 名前と飼い主の名前を設定します
	 * @param Pet.name
	 * @param Pet.masterName
	 */
	public RobotPet(String name, String masterName){
		// 名前と主人の名前を設定する
		super(name, masterName);
		// 色を設定する
		mSetSkin(NUMBER_DEFAULT_COLOR);
	}

	/************************************************************
	 	継承メソッド
	************************************************************/
	/**
	 * 自己紹介メッセージを出力します
	 */
	@Override public void mIntroduce() {
		// 自分の名前を出力する
		System.out.printf(FORMAT_GREET, mGetName(), mGetSkin());
		// 飼い主の名前を出力する
		System.out.printf(FORMAT_INTRODUCE_MASTER, mGetMasterName());
	}

	/************************************************************
	 	インターフェース実装
	************************************************************/
	/*
	 * 着せ替えを行います
	 * colorフィールドを入力された値に応じて設定します
	 * 
	 */
	public void mChangeSkin(int skin){
		// 色を設定する
		mSetSkin(skin);
		// 変更した色を示すメッセージを表示する
		System.out.printf(FORMAT_OUTPUT_CHANGE_COLOR, mSkin);
	};
	
	/************************************************************
	 	インスタンスメソッド
	************************************************************/
	/**
	 * スキンを取得して返します
	 * @param skin
	 * @return String
	 */
	public String mGetSkin(){
		// スキンを返す
		return mSkin;
	}
	/**
	 * スキンを設定します
	 * 設定可能な数値はSkinnable参照
	 * @param skin 色を示す文字列
	 * @set Skinnable
	 */
	public void mSetSkin(int skin){
		// 引数に応じてスキンを設定する
		mSkin = TEXT_MY_COLOR[skin];
	}

	/**
	 * 家事をするメソッド
	 * コマンドに応じた家事を行うことをメッセージで出力する
	 */
	public void mWork(int command){
		// 行う家事の種類を出力する
		System.out.printf(FORMAT_OUTPUT_WORK, TEXT_LIST_HOWSWORKS[command]);
	}
}
