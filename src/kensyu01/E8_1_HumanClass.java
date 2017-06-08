package kensyu01;

/*** class ***********************/
// Humanクラスを設定する
class Human {
	/*** field ***********************/
	private String name;		// 名前フィールドを設定する
	private float height;		// 身長フィールドを設定する
	private float weight;		// 体重フィールドを設定する

	/*** constractor ***********************/
	// 名前と身長と体重をセットするコンストラクタを設定する
	Human ( String name, float height, float weight){
		/*** instance variable *********************/
		this.name = name;			// 名前をセットする
		this.height = height;		// 高さをセットする
		this.weight = weight;		// 体重をセットする
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
}

/*** main class ***********************/
// Humanクラスを定義するクラス
public class E8_1_HumanClass {

	/*** 定数設定 ***********************/
	private static final String FORMAT_OUTPUT_NAME = "名前: %s\n";
	private static final String FORMAT_OUTPUT_HEIGHT = "身長: %3.1f cm\n";
	private static final String FORMAT_OUTPUT_WEIGHT = "体重: %3.1f kg\n ";
	
	/*** メインメソッド ***********************/
	// Humanクラスを定義するして設定したインスタンスから値を取り出す処理を行う
	public static void main (String[] arg){
		// bobの名前を取得するための変数を宣言する
		String bobsName;
		// bobの身長を取得するための変数を宣言する
		float bobsHeight;
		// bobの体重を取得するための変数を宣言する
		float bobsWeight;
		
		/*** オブジェクト作成 ***********************/
		// bobを設定する
		Human bob = new Human("bob",167,56);

		/*** bobのデータ取得 ***********************/
		// bobの名前を取得する
		bobsName = bob.getName();
		// bobの身長を取得する
		bobsHeight = bob.getHeight();
		// bobの体重を取得する
		bobsWeight = bob.getWeight();
		
		/*** bobのデータ出力 ***********************/
		// bobの名前を出力する
		System.out.printf(FORMAT_OUTPUT_NAME,bobsName);
		// bobの身長を出力する
		System.out.printf(FORMAT_OUTPUT_HEIGHT,bobsHeight);
		// bobの体重を出力する
		System.out.printf(FORMAT_OUTPUT_WEIGHT,bobsWeight);
	}
}
