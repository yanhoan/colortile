/**
 *
 */
//TagNameメソッドで指定されたcanvasのコンテキストタイプ指定(この場合2D)
window.onload = function(){
	 var context = document.getElementsByTagName('canvas')[0].getContext('2d');

	 var lastX = context.canvas.width * Math.random();
	 var lastY = context.canvas.height * Math.random();
	 var hue = 0;
	 function line() {


	   context.save();

	   //移動
	   context.translate(context.canvas.width/2, context.canvas.height/2);
	   //拡大縮小
	   context.scale(0.9, 0.9);
	   //
	   context.translate(-context.canvas.width/2, -context.canvas.height/2);
	   //パス()の開始
	   context.beginPath();

	   //描画される線の幅
	   context.lineWidth = 1 + Math.random() * 10;
	   //次に動かす線の始点
	   context.moveTo(lastX, lastY);

	   lastX = context.canvas.width * Math.random();
	   lastY = context.canvas.height * Math.random();

	   //ベジェ曲線
	   context.bezierCurveTo(context.canvas.width * Math.random(),
	                         context.canvas.height * Math.random(),
	                         context.canvas.width * Math.random(),
	                         context.canvas.height * Math.random(),
	                         lastX, lastY);

	   //色の指定
	   hue = hue + 10 * Math.random();
	   //hsl=色相・彩度・輝度(RGBでもよい)
	   context.strokeStyle = 'hsl(' + hue + ', 50%, 50%)';

	   //線の影を設定する,色・ブラー(ぼかし)
	   context.shadowColor = 'white';
	   context.shadowBlur = 5;

	   context.stroke();
	   context.restore();
	 }
	 //描画する内容・タイミング
	 setInterval(line, 200);

	 function blank() {
		 //塗りつぶし//RGB+alpha(透明度)
		 rgb="33,33,33";
		 context.fillStyle = 'rgba('+rgb+',0.1)';
		 //canvasの背景色を塗りつぶしている
		 context.fillRect(0, 0, context.canvas.width, context.canvas.height);
		 }
	 //
	 setInterval(blank, 100);
	}