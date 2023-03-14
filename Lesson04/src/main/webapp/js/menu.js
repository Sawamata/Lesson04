/**
 * ルーム作成画面ボタン押下時
 */
function ptMakeRoom() {
	
	// アクションのセット
	document.forms[0].action = "/Lesson04/menu/makeRoom";

	// メソッドのセット
	document.forms[0].method = "post";

	// submit
	document.forms[0].submit();
}

