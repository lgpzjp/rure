<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../js/jquery/jquery.min.js" charset="UTF-8" type="text/javascript"></script>
</head>
<body>
<form name="user" id="user">
    username: <input type="text" name="username"><br/>
    password: <input type="text" name="password"><br/>
    <input id="addEnter" type="button" name="button" value="Enter"><br/>
</form>
<script type="text/javascript">
//$.fn.serializeObject = function() {
//    var o = {};
//    var a = this.serializeArray();
//    $.each(a, function() {
//        if (o[this.name]) {
//            if (!o[this.name].push) {
//                o[this.name] = [ o[this.name] ];
//            }
//            o[this.name].push(this.value || '');
//        } else {
//            o[this.name] = this.value || '';
//        }
//    });
//    return o;
//}

$(function(){
    $('#addEnter').on("click",function(){
        var data = $('#user').serialize();
        console.log("user serialize : ",data);
        $.ajax({
            type:'post',
            url:'save',
            data:data,
            dataType:'json',
            success:function (result) {
                console.info(result);
            }
        })
    });
})
</script>
</body>
</html>
