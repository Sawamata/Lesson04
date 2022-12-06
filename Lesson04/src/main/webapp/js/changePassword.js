/**
 * 出勤ボタン押下時
 */
function changePass() {

    
 // ハッシュ化回数が数値でない場合はエラーメッセージを表示する　①bと②d
 	var HashCount = document.forms[0].HashCount.value
 
    if (HashCount) {
        alert("ハッシュ化回数は、数値で入力してください。");
        return false;
    }
	
	// アクションのセット
	document.forms[0].action = "/Lesson04/changePassword/passCheck";

	// メソッドのセット
	document.forms[0].method = "post";

	// submit
	document.forms[0].submit();
}

