/**
 * 出勤ボタン押下時
 */
function login() {

    // 社員IDが未入力の場合
    if (document.forms[0].employeeId.value == '') {
        alert("社員IDを入力してください");
        return false;
    }
	
	// アクションのセット
	document.forms[0].action = "/Lesson04/login/loginCheck";

	// メソッドのセット
	document.forms[0].method = "post";

	// submit
	document.forms[0].submit();
}

