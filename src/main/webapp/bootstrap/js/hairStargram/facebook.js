function checkLoginState() {               // Called when a person is finished with the Login Button.
    FB.getLoginStatus(function (response) {   // See the onlogin handler
        var authInfo = response.authResponse;
        if (authInfo != null) {
            FB.api('/' + authInfo.userID + '/?fields=id,name,email', 'GET', {},
                function (response) {
                    var loginInfo = {
                        userId: response.email,
                        apiKey: authInfo.accessToken,
                        userLevel: 1
                    };

                    // // 사용자 email을 받아왔다면 서버에 저장한다.
                    $.ajax({
                        url: "http://localhost/user/login",
                        type: "POST",
                        data: JSON.stringify(loginInfo),
                        dataType: 'json',
                        accept : 'application/json',
                        contentType: 'application/json;charset=utf-8'
                    }).done(function (responseData) {
                        // 성공 시 처리되는 함수
                        if (responseData.isSuccess != null) {
                            setCookie('userId', responseData.data, 1);
                            window.location.href = 'index.html';
                        } else {
                            alert('로그인 실패');
                        }
                    }).fail(function (jqXHR, textStatus, errorThrown) {
                        // 실패 시 처리되는 함수
                        console.log(jqXHR.responseText);
                        if (jqXHR.status == '404') {
                            // 서버에 사용자 정보가 없으므로, 사용자에게 회원가입 여부를 물어본다.
                            var result = confirm("회원정보가 없습니다. 회원가입을 하시겠습니까?");
                            if (result == true) {
                                window.location.href = 'register.html';
                            }
                        }
                    });
                }
            );
        }
    });
}

function setCookie(cookieName, value, days) {
    var exdate = new Date();
    exdate.setDate(exdate.getDate() + days);
    // 설정 일수만큼 현재시간에 만료값으로 지정

    var cookie_value = escape(value) + ((days == null) ? '' : ';    expires=' + exdate.toUTCString());
    document.cookie = cookieName + '=' + cookie_value;
}

function getCookie(cookieName) {
    var x, y;
    var val = document.cookie.split(';');

    for (var i = 0; i < val.length; i++) {
        x = val[i].substr(0, val[i].indexOf('='));
        y = val[i].substr(val[i].indexOf('=') + 1);
        x = x.replace(/^\s+|\s+$/g, ''); // 앞과 뒤의 공백 제거하기
        if (x == cookieName) {
            return unescape(y); // unescape로 디코딩 후 값 리턴
        }
    }
}

window.fbAsyncInit = function () {
    FB.init({
        appId: '2470564943187606',
        cookie: true,                     // Enable cookies to allow the server to access the session.
        xfbml: true,                     // Parse social plugins on this webpage.
        version: 'v5.0'           // Use this Graph API version for this call.
    });


    FB.getLoginStatus(function (response) {   // Called after the JS SDK has been initialized.
        statusChangeCallback(response);        // Returns the login status.
    });
};


(function (d, s, id) {                      // Load the SDK asynchronously
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "https://connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));