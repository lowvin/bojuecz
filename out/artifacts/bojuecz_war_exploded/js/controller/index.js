/**
 * Created by 罗文 on 2017/5/17.
 */
var app = angular.module('index', []);
app.controller('myCtrl', function($scope,$http) {
    $http.get('/bojue/getIndex', {

    }).then(function (result) {//正确请求成功时处理
        console.log(result);
        console.log(result.data.diandong);
        $scope.diandong = result.data.diandong;
        $scope.shoudong = result.data.shoudong;
        console.log($scope.diandong);
    }).catch(function (result) { //捕捉错误处理
        //错误内容

    });
    $(".btn_top").hide();
    var fixed = angular.element(document.getElementById("banner"));
    $(window).scroll(function () {                 //滚动时触发
        if ($(window).scrollTop() > 300){         //获取滚动条到顶部的垂直高度,到相对顶部300px高度显示
            fixed.addClass('fixed');
            $(".btn_top").show();
        }
        else{
            $(".btn_top").hide();
            fixed.removeClass('fixed');
        }
    });
    $(".btn_top").click(function(){
        $('html, body').animate({scrollTop: 0},300);return false;
    });
});