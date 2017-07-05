package kensyu01;

/****************************************************
	クラス
****************************************************/

/**
 * 人間を作成するクラスです。
 * 人間は名前と、身長と、体重を持ちます
 * それぞれのフィールドに対してアクセサが設定されています。
 * toStringメソッドを実装しています。
 * 
 * @author wakkky05
 *
 */
public class HumanClass {

	/****************************************************
		定数
	****************************************************/

	/**
	 * デフォルトの名前を設定する定数です。
	 */
	private static final String DEFAULT_NAME = "defaultName";
	/**
	 * デフォルトの身長を設定する定数です。
	 */
	private static final float DEFAULT_HEIGHT = 100;
	/**
	 * デフォルトの体重を設定する定数です。
	 */
	private static final float DEFAULT_WEIGHT = 100;
	

	/****************************************************
		インスタンス変数
	****************************************************/

	/**
	 *  「名前」フィールド<br>
	 *  デフォルトは DEFAULT_NAME を参照
	 */
	private String name = DEFAULT_NAME;			// 名前フィールドを設定する
	/**
	 *「身長」フィールド<br>
	 * デフォルトは DEFAULT_HEIGHT を参照
	 */
	private float height = DEFAULT_HEIGHT;		// 身長フィールドを設定する
	/**
	 * 「体重」フィールド<br>
	 * デフォルトは DEFAULT_WEIGHT を参照
	 */
	private float weight = DEFAULT_WEIGHT;		// 体重フィールドを設定する
	/**
	 * 「誕生日」フィールド<br>
	 * デフォルトは Day()
	 */
	private Day birthday = new Day();			// 誕生日フィールドを設定する


	/****************************************************
		出力フォーマット
	****************************************************/

	/**
	 * 人間の各フィールドを出力するためのフォーマット
	 * 名前 : String
	 * 身長 : float
	 * 体重 : float
	 * 誕生日 : String
	 */
	private static final String FORMAT_OUTPUT_SETTING = "名前 : %s\n身長 : %3.1f\n体重 : %3.1f\n誕生日 : %s\n";


	/****************************************************
		コンストラクタ
	****************************************************/

	/**
	 *  引数がない場合はデフォルト値が設定された状態となります
	 */
	HumanClass (){}
	/**
	 * 指定した名前を設定します。
	 * 他のフィールドはデフォルト値が設定された状態となります
	 * @param name 名前を設定するフィールド
	 */
	HumanClass ( String name ){
		this.name = name;			// 名前をセットする
	}
	/**
	 * 指定した名前と身長を設定します。
	 * @param name 名前を設定するフィールド
	 * @param height 身長を設定するフィールド
	 */
	HumanClass ( String name, float height){
		this.name = name;			// 名前をセットする
		this.height = height;		// 高さをセットする
	}	
	
	/**
	 * 名前と身長と体重を設定します。
	 * @param name 名前を設定するフィールド
	 * @param height 身長を設定するフィールド
	 * @param weight 体重を設定するフィールド
	 */
	HumanClass ( String name, float height, float weight){
		/*** instance variable *********************/
		this.name = name;			// 名前をセットする
		this.height = height;		// 高さをセットする
		this.weight = weight;		// 体重をセットする
	}
	/**
	 * 名前と身長と体重をセットするコンストラクタを設定する
	 * @param name 名前を設定するフィールド
	 * @param height 身長を設定するフィールド
	 * @param weight 体重を設定するフィールド
	 * @param birthday 誕生日を設定するフィールド
	 */
	HumanClass ( String name, float height, float weight, Day birthday){
		/*** instance variable *********************/
		this.name = name;			// 名前をセットする
		this.height = height;		// 高さをセットする
		this.weight = weight;		// 体重をセットする
		this.birthday = birthday;	// 誕生日をセットする
	}
	
	/****************************************************
		コンストラクタ
	****************************************************/

	/**
	 * 設定した名前を文字列で取得します
	 * @author wakkky05
	 * @return String
	 * 
	 */
	String getName(){
		// 名前を返す
		return this.name;
	}
	/**
	 * 設定した身長をfloat型で取得します
	 * @return float
	 */
	float getHeight(){
		// 身長を返す
		return this.height;
	}
	/**
	 * 設定した体重をfloat型で取得します
	 * @return float
	 */
	float getWeight(){
		// 体重を返す
		return this.weight;
	}
	/**
	 * 設定した誕生日を取得します
	 * @return Day
	 */
	Day getBirthday(){
		// 体重を返す
		return this.birthday;
	}
	/**
	 * インスタンスの設定を取得します
	 * 以下のフォーマット文字列を返します
	 * 名前 : %s\n身長 : %3.1f\n体重 : %3.1f\n誕生日 : %s\n
	 * @return String
	 */
	public String toString() {
		// 誕生日を文字列で取得する
		String birthDay = this.birthday.toString();
		// 各設定を出力する
		return String.format(FORMAT_OUTPUT_SETTING, this.name,this.height,this.weight,birthDay);
	}
}


	
	
