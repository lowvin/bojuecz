/**
 * Created by 罗文 on 2017/5/17.
 */
var app = angular.module('index', ['ui.router','ui.bootstrap']);
app.config(['$stateProvider','$urlRouterProvider', function ($stateProvider,$urlRouterProvider){
    $urlRouterProvider.otherwise('/') ;
    $stateProvider
        .state("/",{
            url: "/",
            templateUrl:'/bojue/page/index.html',
            cache:false
        })
        .state("/contotal", {
            url: "/contotal",
            templateUrl: "/bojue/page/content.html",
            cache:false,
            controller: function($scope,$http) {
                document.title='豪华酒店餐桌-伯爵酒店家具';
                $http({
                    method: "POST",
                    url:"/bojue/total"
                }).then(function (result) {//正确请求成功时处理
                    $scope.currentId = 0;
                    alert($scope.currentId);
                    console.log(result.data);
                }).catch(function (result) { //捕捉错误处理
                    //错误内容

                });
            }
        })
        .state("/cont", {
            url: "/cont/{id}/{page}",
            templateUrl: "/bojue/page/content.html",
            cache:false,
            controller: 'content'
        });
}]);
app.controller('myCtrl',function($scope,$http) {
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
    document.title='伯爵酒店家具-专业生产高档酒店餐桌';
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
app.controller('content',function($scope,$http,$stateParams) {
    if($stateParams.id==0){
        document.title='豪华电动餐桌-伯爵酒店家具';
    }
    else if($stateParams.id==1){
        document.title='豪华实木电动餐桌-伯爵酒店家具';
    }
    else if($stateParams.id==1){
        document.title='豪华实木火锅餐桌-伯爵酒店家具';
    }
    else if($stateParams.id==1){
        document.title='豪华实木手动餐桌-伯爵酒店家具';
    }
    else if($stateParams.id==1){
        document.title='豪华手动火锅餐桌-伯爵酒店家具';
    }else{
        document.title='豪华电动餐桌-伯爵酒店家具';
    };
    function content(id,page) {
        $http({
            method: "POST",
            url:"/bojue/con",
            params:{
                "czKind":id,
                "page":page
            }
        }).then(function (result) {//正确请求成功时处理
            $scope.currentId = $stateParams.id;
            console.log(result.data);
            $scope.kind = result.data.kind;
            $scope.totalItems = result.data.total;
            $scope.perPage = 6;
            $scope.currentPage = $stateParams.page+1;
            $scope.setPage = function (pageNo) {
                $scope.currentPage = pageNo;
            };

            $scope.pageChanged = function() {
                $stateParams.page = $scope.currentPage - 1;
                content($stateParams.id,$stateParams.page);
            };

            $scope.maxSize = 5;
            $scope.bigTotalItems = 5;
            $scope.bigCurrentPage = 1;

        }).catch(function (result) { //捕捉错误处理
            //错误内容

        });
    }
    content($stateParams.id,$stateParams.page);
});


