package filter;
public class CellMaker {

	//わたってきた値を使っていろいろな設定を行うクラス

	//値はString型なのでint型に変換するためのメソッド
	public int StrToInt(String str,int intValue) {
		try {
			intValue=Integer.parseInt(str);
		}catch(NumberFormatException nfe){
			//万が一ドロップダウンリストの値がおかしいとき
			intValue=3;//初期値(3)を設定
		}
		return intValue;
	}
/*
	//わたってきた値をもとに配列を作成するメソッド
	public void createCell(int intValue){

		//マップを作製し、セルと値を紐づけて認識させる(セルを呼んで値が出てくる)
		//いくつ配列を用意するか
		int cellnumber=intValue*intValue;//ドロップダウンリストより選択した行・列数

		Map<Integer,Integer> cellMap=new HashMap<>();
		for(int i=0;i<cellnumber;i++) {
			cellMap.put(i+1,cellList);//行列を指定するリストと紐づけ


		}
	}
*/



}
