package kensyu01;

/*** クラス ***********************/
//Characterクラスを設定する
class Character {
	/*** field ***********************/
	private String name;		// 名前フィールドを設定する
	private float height;		// 身長フィールドを設定する
	private float weight;		// 体重フィールドを設定する

	/*** コンストラクター ***********************/
	// 名前と身長と体重をセットするコンストラクタを設定する
	Character ( String name, float height, float weight){
		/*** instance variable *********************/
		this.name = name;			// 名前をセットする
		this.height = height;		// 高さをセットする
		this.weight = weight;		// 体重をセットする
	}
	
	/*** メソッド ***********************/
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


/*** メインクラス ***********************/
// Characterクラス型の配列を作成するクラス
public class E9_1_ArrayHumanClass {

	/*** 文字列型定数設定 ***********************/
	// 名前を出力する際のフォーマットを設定する
	private static final String FORMAT_OUTPUT_NAME = "名前: %s\n";
	// 身長を出力する際のフォーマットを設定する
	private static final String FORMAT_OUTPUT_HEIGHT = "身長: %3.1f cm\n";
	// 体重を出力する際のフォーマットを設定する
	private static final String FORMAT_OUTPUT_WEIGHT = "体重: %3.1f kg\n";
	// 表示するデータ内容を示すフォーマットを設定する
	private static final String FORMAT_MESSAGE_HUMANS_LIST = "-------------------------\n%s一覧を表示する\n-------------------------\n";
	// テキスト「男性」を設定する
	private static final String TEXT_MENS = "男性";
	// テキスト「女性」を設定する
	private static final String TEXT_WOMEN = "女性";
	// テキスト「亜人」を設定する
	private static final String TEXT_DEMI_HUMAN = "亜人";
	
	/*** 数値型型定数設定 ***********************/
	// 亜人の人数を設定する
	private static final int NUMBER_OF_DEMI_HUMAN = 3;
	// 一人目の亜人のIDを設定する
	private static final int ID_FIRST_DEMI_HUMAN = 0;
	// 二人目の亜人のIDを設定する
	private static final int ID_SECOND_DEMI_HUMAN = 1;
	// 三人目の亜人のIDを設定する
	private static final int ID_THIRD_DEMI_HUMAN = 2;

	/*** キャラクター用定数設定 ***********************/
	// ボブの名前を設定する
	private static String NUMBER_BOBS_NAME = "bob";
	// ボブの身長を設定する
	private static int NUMBER_BOBS_HEIGHT = 170;
	// ボブの体重を設定する
	private static int NUMBER_BOBS_WEIGHT = 65;
	// アベルの名前を設定する
	private static String NUMBER_ABELS_NAME = "abel";
	// アベルの身長を設定する
	private static int NUMBER_ABELS_HEIGHT = 165;
	// アベルの体重を設定する
	private static int NUMBER_ABELS_WEIGHT = 50;
	// コリーの名前を設定する
	private static String NUMBER_CORY_NAME = "cory";
	// コリーの身長を設定する
	private static int NUMBER_CORY_HEIGHT = 167;
	// コリーの体重を設定する
	private static int NUMBER_CORY_WEIGHT = 100;
	// カーラの名前を設定する
	private static String NUMBER_CARLA_NAME = "carla";
	// カーラの身長を設定する
	private static int NUMBER_CARLA_HEIGHT = 150;
	// カーラの体重を設定する
	private static int NUMBER_CARLA_WEIGHT = 45;
	// ケイシーの名前を設定する
	private static String NUMBER_CASEY_NAME = "casey";
	// ケイシーの身長を設定する
	private static int NUMBER_CASEY_HEIGHT = 170;
	// ケイシーの体重を設定する
	private static int NUMBER_CASEY_WEIGHT = 50;
	// ジュディの名前を設定する
	private static String NUMBER_JUDY_NAME = "judy";
	// ジュディの身長を設定する
	private static int NUMBER_JUDY_HEIGHT = 140;
	// ジュディの体重を設定する
	private static int NUMBER_JUDY_WEIGHT = 42;
	// ハマーの名前を設定する
	private static String NUMBER_HUMMER_NAME = "hummer";
	// ハマーの身長を設定する
	private static int NUMBER_HUMMER_HEIGHT = 222;
	// ハマーの体重を設定する
	private static int NUMBER_HUMMER_WEIGHT = 80;
	// リカルドの名前を設定する
	private static String NUMBER_RICHARDO_NAME = "richardo";
	// リカルドの身長を設定する
	private static int NUMBER_RICHARDO_HEIGHT = 300;
	// リカルドの体重を設定する
	private static int NUMBER_RICHARDO_WEIGHT = 200;
	// ハンスの名前を設定する
	private static String NUMBER_HANS_NAME = "hans";
	// ハンスの身長を設定する
	private static int NUMBER_HANS_HEIGHT = 50;
	// ハンスの体重を設定する
	private static int NUMBER_HANS_WEIGHT = 10;

	
	/*** メソッド ***********************/
	// 作成した'人間'の情報を出力するメソッドを設定する
	private static final void outputCharacterInformation(Character human){
		/*** 変数宣言 ***********************/
		String humansName;		// humanの名前を取得するための変数を宣言する
		float humansHeight;		// humanの身長を取得するための変数を宣言する
		float humansWeight;		// humanの体重を取得するための変数を宣言する
		
		/*** humanのデータ取得 ***********************/
		// humanの名前を取得する
		humansName = human.getName();
		// humanの身長を取得する
		humansHeight = human.getHeight();
		// humanの体重を取得する
		humansWeight = human.getWeight();

		/*** humanのデータ出力 ***********************/
		// humanの名前を出力する
		System.out.printf(FORMAT_OUTPUT_NAME,humansName);
		// humanの身長を出力する
		System.out.printf(FORMAT_OUTPUT_HEIGHT,humansHeight);
		// humanの体重を出力する
		System.out.printf(FORMAT_OUTPUT_WEIGHT,humansWeight);
		
	}
	/*** メインメソッド ***********************/
	// Characterクラスを定義するして設定したインスタンスから値を取り出す処理を行う
	public static void main (String[] arg){
		
		/*** 人間クラスの配列作成( 生成時に配列要素を初期化する ) ***********************/
		// 人間(男性)配列を作成する
		Character[] mensList = {
			// bobを作成する
			new Character(NUMBER_BOBS_NAME,NUMBER_BOBS_HEIGHT,NUMBER_BOBS_WEIGHT),		
			// abelを作成する
			new Character(NUMBER_ABELS_NAME ,NUMBER_ABELS_HEIGHT,NUMBER_ABELS_WEIGHT),	
			// coryを作成する
			new Character(NUMBER_CORY_NAME,NUMBER_CORY_HEIGHT,NUMBER_CORY_WEIGHT)		
		};
		
		/*** 人間クラスの配列作成( 生成後の配列要素に値を代入する ) ***********************/
		// 人間(女性)配列を作成する
		Character[] womenList;
		// 人間(女性)配列を作成する
		womenList = new Character[] {
			// carlaを作成する
			new Character(NUMBER_CARLA_NAME,NUMBER_CARLA_HEIGHT,NUMBER_CARLA_WEIGHT),
			// caseyを作成する
			new Character(NUMBER_CASEY_NAME ,NUMBER_CASEY_HEIGHT,NUMBER_CASEY_WEIGHT),		
			// judyを作成する
			new Character(NUMBER_JUDY_NAME,NUMBER_JUDY_HEIGHT,NUMBER_JUDY_WEIGHT)			
		};

		/*** 人間クラスの配列作成( 長さを設定した配列に 変数を代入する ) ***********************/
		// 人間(亜人)配列を作成する
		Character[] demiHumanList = new Character[NUMBER_OF_DEMI_HUMAN];
		// ハマーを作成する
		Character hummer = new Character(NUMBER_HUMMER_NAME,NUMBER_HUMMER_HEIGHT,NUMBER_HUMMER_WEIGHT);
		// リカルドを作成する
		Character richardo = new Character(NUMBER_RICHARDO_NAME,NUMBER_RICHARDO_HEIGHT,NUMBER_RICHARDO_WEIGHT);
		// ハンスを作成する
		Character hans = new Character(NUMBER_HANS_NAME,NUMBER_HANS_HEIGHT,NUMBER_HANS_WEIGHT);

		// 一人目の亜人にハマーを設定する
		demiHumanList[ID_FIRST_DEMI_HUMAN] = hummer;
		// 二人目の亜人にリカルドを設定する
		demiHumanList[ID_SECOND_DEMI_HUMAN] = richardo;
		// 三人目の亜人にハンスを設定する
		demiHumanList[ID_THIRD_DEMI_HUMAN] = hans;
		

		/*** 人間クラスの配列作成( 生成後の配列要素に値を代入したデータ ) ***********************/
		// 人間(男性)一覧の数を取得する
		int lengthMens = mensList.length;
		// 人間(男性)一覧の情報を出力する
		System.out.printf(FORMAT_MESSAGE_HUMANS_LIST,TEXT_MENS);
		// 人間(男性)一覧の各データにアクセスする
		for ( int indexCount = 0; indexCount < lengthMens; indexCount++ ){
			// 各データの情報を出力する
			outputCharacterInformation(mensList[indexCount]);
			// 改行を出力する
			System.out.println();
		}

		/*** 人間クラスの配列データ出力( 生成後の配列要素に値を代入したデータ ) ***********************/
		// 人間(女性)一覧の数を取得する
		int lengthWomen = womenList.length;
		// 人間(女性)一覧の情報を出力する
		System.out.printf(FORMAT_MESSAGE_HUMANS_LIST,TEXT_WOMEN);
		// 人間(女性)一覧の各データにアクセスする
		for ( int indexCount = 0; indexCount < lengthWomen; indexCount++ ){
			// 各データの情報を出力する
			outputCharacterInformation(womenList[indexCount]);
			// 改行を出力する
			System.out.println();
		}

		/*** 人間クラスの配列作成( 長さを設定した配列に変数を代入したデータ ) ***********************/
		// 人間(亜人)一覧の数を取得する
		int lengthDemiHumans = demiHumanList.length;
		// 人間(亜人)一覧の情報を出力する
		System.out.printf(FORMAT_MESSAGE_HUMANS_LIST,TEXT_DEMI_HUMAN);
		// 人間(男性)一覧の各データにアクセスする
		for ( int indexCount = 0; indexCount < lengthDemiHumans; indexCount++ ){
			// 各データの情報を出力する
			outputCharacterInformation(demiHumanList[indexCount]);
			// 改行を出力する
			System.out.println();
		}
	}
}
