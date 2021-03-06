<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
	<%@ include  file="../template/head.jsp"%>
    <link rel="stylesheet" type="text/css" href="../../resources/css/startTask/startTask.css">
</head>
<body>
<%@ include  file="../template/title.jsp"%>
<%@ include  file="../template/menu.jsp"%>
<div class="menu_control">
    <div class="sm_bar">
        <img src="../../resources/image/util/white_arrow_left.png">
    </div>
</div>
<div class="content" ng-controller="tableCtrl_1">
    <div class="sub_title">
        <img src="../../resources/image/subTitle/sub_title.png" height="22" width="22">
       <div class="location" ng-controller="subTitleCtrl">
            <span>当前位置:</span>
            <span ng-repeat="span in spans"  ng-bind-html="span.name|trustHtml"></span>
        </div>
    </div>
    <div class="process_bar">
        <img src="../../resources/image/paocessBar/bar1.png">
    </div>
    <div class="search" id="search_require">
        <div class="search_title">
            <span>筛选条件</span>
            <span class="arrow" data-show="yes"></span>
        </div>
        <div class="search_body">
            <form class="form-inline">
                <div class="search_line">
                    <div class="form-group">
                        <label for="property">案件性质:</label>
                        <input type="text" name="property" class="form-control" id="property" placeholder="民事">
                    </div>
                    <div class="form-group">
                        <label for="process">审判程序:</label>
                        <input type="text" name="process" class="form-control" id="process" placeholder="二审">
                    </div>
                    <div class="form-group">
                        <label for="reason">案由:</label>
                        <input type="text" name="reason" class="form-control" id="reason" placeholder="知识产权纠纷">
                    </div>
                    <div class="form-group">
                        <label for="director">承办人:</label>
                        <input type="text" name="director" class="form-control" id="director" placeholder="张三丰">
                    </div>
                </div>
                <div class="search_line">
                    <div class="form-group">
                        <label for="court">法院:</label>
                        <input type="text" name="court" class="form-control" id="court" placeholder="定西市中级人民法院">
                    </div>
                    <div class="form-group">
                        <label for="room">庭室:</label>
                        <input type="text" name="room" class="form-control" id="room" placeholder="全部">
                    </div>
                    <div class="form-group">
                        <label for="start_date1">立案日期:</label>
                        <input type="text" name="start_date1" class="form-control" id="start_date1" style="width: 90px !important;">
                        <label for="start_date2" class="spe_label">至</label>
                        <input type="text" name="start_date2" class="form-control" id="start_date2" style="width: 90px !important;">
                    </div>
                    <div class="form-group">
                        <label for="end_date1">立案日期:</label>
                        <input type="text" name="end_date1" class="form-control" id="end_date1" style="width: 90px !important;">
                        <label for="end_date2" class="spe_label">至</label>
                        <input type="text" name="end_date2" class="form-control" id="end_date2" style="width: 90px !important;">
                    </div>
                </div>
                <div class="buttons">
                    <button type="button" class="btn btn-default">保存</button>
                    <button type="button" class="btn btn-default">重置</button>
                    <button type="button" class="btn btn-primary" ng-click="searchAJ()">查询</button>
                </div>
            </form>
        </div><!-- search_body -->
    </div><!-- search -->
    <div class="search">
        <div class="search_title">
            <span>查询结果</span>
        </div>
        <div class="result">
            <div class="teble">
                <table class="table table-striped table-hover table-bordered">
                    <thead>
                    <tr>
                    	<th><input type='checkbox' style='margin-right: 10px' ng-model='selectAll'>全选</th>
                        <th ng-repeat="s in th" ng-bind-html="s.name|trustHtml"></th>
                    </tr>
                    </thead>
                    <tbody>
                     <tr ng-repeat="c in content">
                        <td><input type="checkbox" ng-checked="selectAll"></td>
                        <td>{{c.t1}}</td>
                        <td class="no-left">{{c.t2}}</td>
                        <td>{{c.t3}}</td>
                        <td>{{c.t4}}</td>
                        <td>{{c.t5}}</td>
                        <td>{{c.t6}}</td>
                        <td>{{c.t7}}</td>
                    </tr> 
                    </tbody>
                </table>
                <div class="table_footer">
                    <div class="total">
                        <span>共计</span><span> 2 </span><span>条，</span>
                        <span>每页显示</span><span> 10 </span><span>条，</span>
                        <span>共</span><span> 2 </span><span>页。</span>
                    </div>
                    <div class="output">
                        <span>列表：</span>
                        <button type="button" class="btn btn-default">导出</button>
                        <button type="button" class="btn btn-default">打印</button>
                    </div>
                    <div class="change_page">
                        <span> 首页 </span>
                        <span> 上一页 </span>
                        <span> 第</span>
                        <select class="form-control">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                        <span>页 </span>
                        <span> 下一页 </span>
                        <span> 尾页 </span>
                    </div>
                </div>
            </div><!-- table -->
            <div class="buttons">
                <button type="button" class="btn btn-default">取消</button>
                <button type="button" class="btn btn-primary">下一步</button>
            </div>
        </div>
    </div>

</div>
<script type="text/javascript" src="../../resources/js/startCheck/startCheck.js"></script>
<%@ include  file="../template/footer.jsp"%>