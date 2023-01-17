/**
 * 出勤ボタン押下時
 */
function changePass() {
	
 	
    // 現パスワードが未入力の場合
    if (document.forms[0].currentPass.value == '') {
        alert("現パスワードを入力してください");
        return false;
    }
    // 新パスワードが未入力の場合
    if (document.forms[0].newPass.value == '') {
        alert("新パスワードを入力してください");
        return false;
    }
    // 新パスワード（確認）が未入力の場合
    if (document.forms[0].newPassKknn.value == '') {
        alert("新パスワード（確認）を入力してください");
        return false;
    }

    
 // ハッシュ化回数が数値でない場合はエラーメッセージを表示する　①bと②d
 	var hashCount = document.forms[0].hashCount.value
 
    if (isNaN(hashCount)) {
        alert("ハッシュ化回数は、数値で入力してください。");
        return false;
    }
    // ハッシュ化回数が未入力の場合
    if (document.forms[0].hashCount.value == '') {
        alert("ハッシュ化回数を入力してください");
        return false;
    }
 
	
	// アクションのセット
	document.forms[0].action = "/Lesson04/changePassword/passCheck";
	

	// メソッドのセット
	document.forms[0].method = "post";

	// submit
	document.forms[0].submit();
}

