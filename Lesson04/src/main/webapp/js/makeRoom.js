/**
 * ルーム作成ボタン押下時
 */
function makeRoom() {

    // ルーム名が未入力の場合
    if (document.forms[0].roomName.value == '') {
        alert("ルーム名を入力してください");
        return false;
    }
    // 参加メンバー一覧の社員IDが１つも入力されていない場合
    if (document.forms[0].firstUserId.value == ''
    	&& document.forms[0].secondUserId.value == ''
    	&& document.forms[0].thirdUserId.value == ''
    	&& document.forms[0].forthUserId.value == ''
    	&& document.forms[0].fifthUserId.value == '') {
        alert("社員IDを1つ以上入力してください");
        return false;
    }
	
	// アクションのセット
	document.forms[0].action = "/Lesson04/makeRoom/makeRoomSakusei";

	// メソッドのセット
	document.forms[0].method = "post";

	// submit
	document.forms[0].submit();
}

