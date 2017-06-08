package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;
// 乱数を生成する機能を読み込む
import java.util.Random;

/*** クラス ******************************/
// carクラスを設定する
class Car {
	/*** field ***********************/
	// タンク容量を設定する
	private int fuelCapacity = 211;
	// 燃費を設定する
	private int fuelEfficiency = 20;
	// 燃料の量を保持するフィールドを設定する
	private float fuel;
	// 走行距離を保持するフィールドを設定する
	private int mileage;
	// 車の状態を保持するフィールドを設定する
	private int status;

	/*** 数値型定数設定 ***********************/
	// 運転することを示す値を設定する
	private final int NUMBER_STATUS_DRIVE = 1;
	// 駐車することを示す値を設定する
	private final int NUMBER_STATUS_PARK = 0;
	// アクセルと踏むコマンドを設定する
	private final int NUMBER_STEP_ON_COMMAND = 1;
	// 給油するコマンドを設定する
	private final int NUMBER_REFUEL_COMMAND = 2;
	// ガソリン残量を出力するコマンドを設定する
	private final int NUMBER_OUTPUT_MILEAGE_COMMAND = 3;
	// 駐車する(終了する)コマンドを設定する
	private final int NUMBER_PARK_COMMAND = 4;
	// 走行距離を決定する範囲を設定する
	private final int NUMBER_MILEAGE_RANGE = 100;
	// 乱数の範囲を出力用の表示に変換する値を設定する
	private final int NUMBER_FORMATING_OUTPUT_RANDOM = 1;

	/*** 文字列型定数設定 ***********************/
	// 運転を開始することを示すメッセージを設定する
	private static String MESSAGE_START_DRIVE = "車の運転を開始します";
	// 給油することを促すメッセージを表示する
	private static String MESSAGE_REQUEST_REFUEL = "どのくらい給油しますか？";
	// 走行距離を出力するためのフォーマットを設定する
	private static String FORMAT_OUTPUT_MILEAGE = "%d Km\n";
	// 給油を促すメッセージを設定する
	private static String CAUTION_REQUEST_REFUEL = "!!!!!!!!!!!!!!!!!!!!!!!!!!!\n"
												 + "燃料が足りません 給油してください\n"
												 + "!!!!!!!!!!!!!!!!!!!!!!!!!!!"; 
	// ガソリンの残量を表示するためのフォーマットを設定する
	private static String FORMAT_OUTPUT_FUEL = "ガソリンの残量 : %5.2f L\n";
	// 操作の選択を求めるメッセージを選択する
	private static String MESSAGE_REQUEST_COMMAND = "操作を選択してください";
	// 実行可能なコマンドを表示するためのフォーマットを設定する
	private static String FORMAT_OUTPUT_COMMANDS = "1:%s  2:%s  3:%s  4:%s";
	// テキスト「走行する」を設定する
	private static String TEXT_STEP_ON = "走行する";
	// テキスト「給油する」を設定する
	private static String TEXT_REFUEL = "給油する";
	// テキスト「走行距離を見る」を設定する
	private static String TEXT_OUTPUT_MILEAGE = "走行距離を確認する";
	// テキスト「駐車（終了）する」を設定する
	private static String TEXT_PARK = "駐車（終了)する";
	//　読み取れないコマンドが入力された場合のメッセージを設定する
	private static String CAUTION_NOT_COMMAND = "コマンドが読み取れません。もう一度入力してください";
	// 運転を終了するメッセージを設定する
	private static String MESSAGE_END_DRIVE = "運転を終了します";

	/*** スキャナーを設定する ***********************/
	// 入力を受け取るためのスキャナーを設定する
	private Scanner scannerInput = new Scanner(System.in);
	// 走行距離を決定するオブジェクトを作成する
	private Random generateMileage = new Random();
	
	/*** コンストラクタ ***********************/
	// 燃料をセットして車オブジェクトを作成する
	Car (int fuel){
		/*** instance variable *********************/
		// 燃料をセットする
		this.fuel = (float)fuel;			
	}
	
	/*** セッター ***********************/
	// 燃料を追加するメソッドを設定する
	private void setFuel (float setFuel){
		// 設定された燃料を加算する
		this.fuel += setFuel;
	}
	// 駐車する(終了)メソッドを設定する
	private void setParkStatus(){
		// 車の状態を「駐車」に変更する
		this.status = NUMBER_STATUS_PARK;
	}
	/*** メソッド ***********************/
	// 総走行距離を出力するメソッドを設定する
	private void outputMileage(){
		// 総走行距離を出力する
		System.out.printf(FORMAT_OUTPUT_MILEAGE,this.mileage);
	}
	// 燃料を消費するメソッドを設定する
	private void reduceFuel(float usedFuel){
		// 燃料が使用量以上あった場合の処理を行う
		if ( usedFuel <= this.fuel){
			// 使用された燃料分だけ残量を減らす
			this.fuel -= usedFuel;
		// 燃料が使用量に満たない場合の処理を行う
		} else {
			// 給油することを促すメッセージを表示する
			System.out.println(CAUTION_REQUEST_REFUEL);
		}
	}
	// 残燃料を表示するメソッドを設定する
	private void outputFuelIndicator() {
		System.out.printf(FORMAT_OUTPUT_FUEL, this.fuel);
	}
	// 走行するメソッドを設定する
	private void stepOn(){
		/*** 変数設定 *********************************/
		// 使用する燃料を設定する変数を宣言する
		float usedFuel;
		// 1km ~ 10km までのランダムな走行距離を設定する
		int mileageValue = generateMileage.nextInt(NUMBER_MILEAGE_RANGE) + NUMBER_FORMATING_OUTPUT_RANDOM;
		/*** 処理 *********************************/
		// 距離を走行距離に設定する 
		this.mileage += mileageValue;
		// 距離に応じた量の燃料を設定する
		usedFuel = (float)mileageValue/this.fuelEfficiency;
		// 設定した燃料を減らす
		this.reduceFuel(usedFuel);
	}
	// 給油するメソッドを設定する
	private void refuel(){
		/*** 変数設定 *********************************/
		// 給油量を設定する変数を宣言する
		int refuel;
		/*** 処理 *********************************/
		// 現在の燃料の残量を出力する
		this.outputFuelIndicator();
		// 給油量の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_REFUEL);
		// 設定された給油量を保持する
		refuel = scannerInput.nextInt();
		// 設定された量がタンク容量以内だった場合の処理を行う
		if ( refuel < (this.fuelCapacity - this.fuel) ){
			// 燃料を設定されたぶんだけ追加する
			this.fuel += refuel;
		// 設定された量がタンク量量を超えた場合の処理を行う
		} else {
			// タンク容量を表示する
			System.out.printf("タンク容量は %d です\n",this.fuelCapacity);
			// 満タンにすることをメッセージで出力する
			System.out.println("満タンにします");
			// 燃料を満タンにする
			this.setFuel(this.fuelCapacity);
		}
	}
	// 駐車するメソッドを設定する
	private void park() {
		// 運転を終了するメッセージを出力する
		System.out.println(MESSAGE_END_DRIVE);
		this.setParkStatus();
	}
	// 実行可能なコマンドを出力する
	private void outputCommands(){
		// 操作の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_COMMAND);
		// 実行できるコマンドを表示する
		System.out.printf(FORMAT_OUTPUT_COMMANDS,
				TEXT_STEP_ON, TEXT_REFUEL, TEXT_OUTPUT_MILEAGE, TEXT_PARK);
	}
	// 車の操作を行うメソッドを設定する
	private void controlCar(int command){
		// コマンド毎に処理を振り分ける
		switch (command) {
			// 走行する　コマンドが入力された場合の処理を行う
			case NUMBER_STEP_ON_COMMAND :
				// 走行するメソッドを実行する
				this.stepOn();
				// スイッチ文を終了する
				break;
			// 給油する　コマンドが入力された場合の処理を行う
			case NUMBER_REFUEL_COMMAND :
				// 給油するメソッドを実行する
				this.refuel();
				// スイッチ文を終了する
				break;
			// 走行距離をみる　コマンドが入力された場合の処理を行う
			case NUMBER_OUTPUT_MILEAGE_COMMAND :
				// 現在の総走行距離を出力する
				this.outputMileage();
				// スイッチ文を終了する
				break;
			// 停車する　コマンドが入力された場合の処理を行う
			case NUMBER_PARK_COMMAND :
				// 停車するコマンドを実行する
				this.park();
				// スイッチ文を終了する
				break;
			// 実行可能なコマンド以外が入力された場合の処理を行う
			default :
				// コマンドが読み取れないことを表示する
				System.out.println(CAUTION_NOT_COMMAND);
		}
	}
	// 運転するメソッドを設定する
	protected void drive(){
		// 車の状態を保持する変数を設定する
		this.status = NUMBER_STATUS_DRIVE;
		// 車を運転することを示すメッセージを出力する
		System.out.println(MESSAGE_START_DRIVE);
		// 運転を継続する
		do {
			// 現在の燃料を表示する
			this.outputFuelIndicator();
			// 入力できるコマンドを出力する
			this.outputCommands();
			// 入力されたコマンドを実行する
			this.controlCar( scannerInput.nextInt() );
		// 駐車するまで運転を続ける
		} while ( this.status != NUMBER_STATUS_PARK);
		// 入力用ストリームを閉じる
		this.scannerInput.close();
	}
}

/*** クラス ******************************/
// Carクラスからインスタンスを作成してメソッドを実行するクラス
public class E8_2_CarClass {

	/*** メインメソッド ******************************/
	// Carクラスからインスタンスを作成してメソッドを実行する処理を行う
	public static void main(String[] arg){

		/*** オブジェクト作成 ******************************/
		// Carオブジェクト を作成する
		Car myCar = new Car(200);
		
		/*** 処理 ******************************/
		// 車を運転する
		myCar.drive();
	}
}
