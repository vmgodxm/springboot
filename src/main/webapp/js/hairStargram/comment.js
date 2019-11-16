//댓글 불러오기
$(function () {
    $('#send').on('click', function (e) {
        $.ajax({
            url: 'http://localhost/review',
            type: 'GET',
            data: $('#review').serialize(),
            dataType: 'application/json'
        }).then(function (data) {
            console.log(data);
        });
    })
});