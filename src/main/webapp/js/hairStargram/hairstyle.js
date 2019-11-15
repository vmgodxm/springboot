
function hairStyle_body(){
    $('#contents').load('./hair/hairStyles-body.html');
}
function designer(){
    $('#btnDesigner').on('click',function(){
        $('#contents').load('./desinger/designers.html');
    });
}
function hairStyle_rev(){
    $('#btnReservation').on('click',function(){
        $('#contents').load('./hair/hairStyles-rev.html');
    });
}
function hairStyle_done(){
    $('#btnRev').on('click',function(){
        $('#contents').load('./hair/hairStyles-done.html');
    });
}
