

    $(function() {
        $.ajax({
            url:"http://localhost/reservation",
            Type:"GET",
            dataType:"json"
        }).then(function(data){
            $("#revtable").append('<thead><tr><th>번호</th><th>예약일</th><th>예약시간</th><th>디자이너</th><th>연락처</th><th>헤어스타일</th><th>요청사항</th></tr></thead>');    
            $.each(data,function(i,v){
             $('#resNo').text(data[i].resNo);    		
             $('#beginDay').text(data[i].beginDay);    		
             $('#beginHour').text(data[i].beginHour);    		
             $('#beginMinute').text(data[i].beginMinute);    		
             $('#desinerId').text(data[i].desinerId);    		
             $('#styleNo').text(data[i].styleNo);    		
             $('#useComment').text(data[i].useComment);    		
            //$("#revtable").append('<tr><th id="resNo"></th><th id="beginDay"></th><th id="beginHour"></th><th id="beginMinute"></th><th id="desinerId"></th><th id="styleNo"></th><th id="useComment"></th></tr>');    
            $("#revtable").append('<tbody><tr><th>'+data[i].resNo+'</th><th>'+data[i].beginDay+'</th><th>'+data[i].beginHour+'</th><th>'+data[i].beginMinute+'</th><th>'+data[i].desinerId+'</th><th>'+data[i].styleNo+'</th><th>'+data[i].useComment+'</th></tr></tbody>');    
            
            });
        });
    });;
