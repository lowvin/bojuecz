/**
 * Created by 罗文 on 2017/5/27.
 */
var app = angular.module('content', []);
app.controller('cont',function($scope,$http){
    $scope.title = "内容";
    alert("123");
    $http.get('/bojue/content', {

    }).then(function (result) {//正确请求成功时处理
        alert("成功");
    }).catch(function (result) { //捕捉错误处理
        //错误内容

    });
});