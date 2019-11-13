var designer = {
	data:'',	
	init: function() {
    	alert('init');
    	$.ajax({
			url:'http://localhost/dfavorite',
			method:'GET',
			async:false,
			data:null,
			dataType:'json',
			success:function(jsonArray){
				alert('success'+jsonArray);
			    designer.data = jsonArray;
			}
		});
    	this.list();
    },
    list: function() {
					var html="<ul>";
					for (var i = 0; i < designer.data.length; i++) {
						var jsonObject = designer.data[i];
						
						
						var designerId = jsonObject.designerId;
						var userId = jsonObject.userId;
						html+="<li>"+designerId+"["+userId+"]</li>";
					}
					
					html+="</ul>";
					document.getElementById('card-title').innerHTML=html;
	},
    view : function() {
    }
};
