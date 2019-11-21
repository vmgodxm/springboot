
$(function(){
    $('#btnReservation').on('click',function(e){
        $('#contents').load('./hair/hairStyles-rev.html');
        // e.preventDefault();
    });
});

// $(function(){
//     $('#btnRev').on('click',function(e){
//         $('#contents').load('./hair/hairStyles-done.html');
//         //e.preventDefault();
//     });
// });

function hairStyle_body(){
    $('#contents').load('./hair/hairStyles-body.html');
}
function designer(){
    $('#btnDesigner').on('click',function(){
        $('#contents').load('./desinger/designers.html');
    });
}



