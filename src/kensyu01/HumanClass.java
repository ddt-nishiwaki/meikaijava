package kensyu01;

/*** class ***********************/
public class HumanClass {

	/*** デフォルト設定 ***********************/
	// デフォルトの名前を設定する
	private String DEFAULT_NAME = "defaultName";
	// デフォルトの身長を設定する
	private float DEFAULT_HEIGHT = 100;
	// デフォルトの体重を設定する
	private float DEFAULT_WEIGHT = 100;
	
	/*** フィールド ***********************/
	// 「名前」フィールドをデフォルトで初期化する
	private String name = DEFAULT_NAME;			// 名前フィールドを設定する
	// 「身長」フィールドをデフォルトで初期化する
	private float height = DEFAULT_HEIGHT;		// 身長フィールドを設定する
	// 「体重」フィールドをデフォルトで初期化する
	private float weight = DEFAULT_WEIGHT;		// 体重フィールドを設定する
	// 「誕生日」フィールドをデフォルトで初期化する
	private Day birthday = new Day();			// 誕生日フィールドを設定する

	/*** 出力フォーマット ***********************/
	// 設定を出力するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_SETTING = "名前 : %s\n身長 : %3.1f\n体重 : %3.1f\n誕生日 : %s\n";

	/*** コンストラクタ ***********************/
	// 名前と身長と体重をセットするコンストラクタを設定する
	HumanClass (){}
	// 名前と身長と体重をセットするコンストラクタを設定する
	HumanClass ( String name){
		/*** instance variable *********************/
		this.name = name;			// 名前をセットする
	}
	// 名前と身長と体重をセットするコンストラクタを設定する
	HumanClass ( String name, float height){
		/*** instance variable *********************/
		this.name = name;			// 名前をセットする
		this.height = height;		// 高さをセットする
	}	
	// 名前と身長と体重をセットするコンストラクタを設定する
	HumanClass ( String name, float height, float weight){
		/*** instance variable *********************/
		this.name = name;			// 名前をセットする
		this.height = height;		// 高さをセットする
		this.weight = weight;		// 体重をセットする
	}
	// 名前と身長と体重をセットするコンストラクタを設定する
	HumanClass ( String name, float height, float weight, Day birthday){
		/*** instance variable *********************/
		this.name = name;			// 名前をセットする
		this.height = height;		// 高さをセットする
		this.weight = weight;		// 体重をセットする
		this.birthday = birthday;	// 誕生日をセットする
	}
	
	/*** method ***********************/
	// 名前を取得するメソッドを設定する
	String getName(){
		// 名前を返す
		return this.name;
	}
	// 身長を取得するメソッドを設定する
	float getHeight(){
		// 身長を返す
		return this.height;
	}
	// 体重を取得するメドッドを設定する
	float getWeight(){
		// 体重を返す
		return this.weight;
	}
	// 誕生日を取得するメソッドを設定する
	Day getBirthday(){
		// 体重を返す
		return this.birthday;
	}
	// インスタンスの設定を出力するメソッドを設定する
	public String toString() {
		// 誕生日を文字列で取得する
		String birthDay = this.birthday.toString();
		// 各設定を出力する
		return String.format(FORMAT_OUTPUT_SETTING, this.name,this.height,this.weight,birthDay);
	}
}


	
	
