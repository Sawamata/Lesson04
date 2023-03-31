/**
 * ルーム作成ボタン押下時
 */
function nyushitsu() {
	
	// アクションのセット
	document.forms[0].action = "/Lesson04/roomView/checkin";

	// メソッドのセット
	document.forms[0].method = "post";

	// submit
	document.forms[0].submit();
}

