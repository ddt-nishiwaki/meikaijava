package pet;

/************************************************************
	 インポート
************************************************************/
// 全パッケージ共有のオブジェクトを読み込む
import static common.CommonObject.*;
/**
 * 着せ替えインターフェースを実装したロボットペットクラスのチェックを行うクラス
 * @author wakkky05
 *
 */
public class E14_2_RobotPetCheckerWithSkinnableInterface {
	
	/************************************************************
	 	定数(String)
	************************************************************/
	// 名前入力を求めるメッセージを設定する
	private static final String MESSAGE_INPUT_NAME = "名前を入力してください";
	// 主人の名前入力を求めるメッセージを設定する
	private static final String MESSAGE_INPUT_MASTER_NAME = "主人の名前を入力してください";
	// スキンの設定を求めるメッセージを設定する
	private static final String MESSAGE_INPUT_SKIN_COMMAND = "スキンを設定して下さい";
	// 設定可能なスキンとそのコマンドを示すメッセージを設定する
	private static final String MESSAGE_SIKINNABLE_COMMAND = "0...黒 / 1...赤 / 2...緑 / 3...青 / 4...豹";
	// ペットを作成することを示すメッセージを設定する
	private static final String MESSAGE_MAKE_PET = "ペットを作成します";
	// スキンの着せ替えを行うことを示すメッセージを設定する
	private static final String MESSAGE_CHANGE_SKIN = "スキンの着せ替えを行います";

	/************************************************************
	 	インスタンスメソッド
	************************************************************/
	/**
	 * ペットの作成を行います
	 * 名前と主人の名前の入力を求めます
	 * @return Pet
	 */
	public static RobotPet mMakeRobotPet(){
		String name;			// 名前入力を保持する変数を宣言する
		String masterName;		// 主人の名前入力を保持する変数を宣言する 
		// ペットを作成することをメッセージで出力する
		System.out.println(MESSAGE_MAKE_PET);
		// 名前の入力を行う
		name = mInputName();
		// 主人の名前の入力を行う
		masterName = mInputMasterName();
		// ロボットペットを作成して返す
		return new RobotPet(name,masterName);
	}
	/**
	 * 名前の入力を求めます
	 * return String
	 */
	private static String mInputName(){
		// 名前の入力を求める
		System.out.println(MESSAGE_INPUT_NAME);
		// 入力された名前を返す
		return sInputScanner.next();
	}
	/**
	 * 主人の名前の入力を求めます
	 * return String
	 */
	private static String mInputMasterName(){
		// 名前の入力を求める
		System.out.println(MESSAGE_INPUT_MASTER_NAME);
		// 入力された名前を返す
		return sInputScanner.next();
	}
	/**
	 * スキンの入力を求めます
	 * @param arg
	 */
	private static int mInputSkin(){
		// スキンの着せ替えを行うことをメッセージで出力する
		System.out.println(MESSAGE_CHANGE_SKIN);
		// スキンの入力を求める
		System.out.println(MESSAGE_INPUT_SKIN_COMMAND);
		// 設定できるスキンとそのコマンドを表示する
		System.out.println(MESSAGE_SIKINNABLE_COMMAND);
		// 入力されたコマンドを返す
		return sInputScanner.nextInt();
	}
	
	public static void main(String[] arg){
		/************************************************************
			 ペットの作成
		************************************************************/
		// ペットの作成を行う
		RobotPet petTester = mMakeRobotPet();

		/************************************************************
			 設定の確認
		************************************************************/
		// 設定確認のために挨拶を行う
		petTester.mIntroduce();

		/************************************************************
			 スキンの変更
		************************************************************/
		// インターフェースの確認のために着せ替えを行う
		petTester.mChangeSkin(mInputSkin());

		/************************************************************
			 着せ替え後の設定を確認
		************************************************************/
		// スキンフィールドが変更されているか挨拶コマンドで確認する
		petTester.mIntroduce();
	}
}
