//예약 불러오기
$(function () {
    $('#mypage').on('click', function (e) {
        $.ajax({
            url: 'http://localhost/reservation',
            type: 'GET',
            data: $('#revtable').serialize(),
            dataType: 'application/json'
        }).then(function (data) {
            console.log(data);
        });
    })
});

function reservationList() {
	$(function() {
        $.ajax({
            url:"http://localhost/review",
            Type:"GET",
            dataType:"json"
        }).then(function(data){
            $.each(data,function(i,v){
                var reviewList = data[i];
              
            //   $('#replyNo').text(reviewList[i].replyNo);    		
               //$('#title').text(reviewList[i].title);    		
               //$('#useContent').text(reviewList[i].useContent);    		
              // $('#writeTime').text(reviewList[i].writeTime);    		
             //  $('#designerId').text(reviewList[i].designerId);    		
            //  $('#userId').text(reviewList[i].userId);    		
            //   $('#styleNo').text(reviewList[i].styleNo);    		
            //  $('#resNo').text(reviewList[i].resNo);    		
            //   $('#reviewNo').text(data[i].replyNo);    		
            
                console.log('데이타 리플번호 -> '+data[i].replyNo);
                console.log('리스트타이틀-> '+reviewList.title);
                
              $("#revtable").append('<tr><td>'+data[i].replyNo+'</td><td>'+data[i].title+'</td><td>'+data[i].useContent+'</td><td>'+data[i].writeTime+'</td><td>'+data[i].designerId+'</td><td>'+data[i].userId+'</td><td>'+data[i].styleNo+'</td><td>'+data[i].resNo+'</td></tr>');
            });
        });
    });;
}