<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Grade Analyse</title>

<script src="WebContent/js/echarts-gl.min.js"></script>
<script src="jquery/jquery-1.7.2.min.js"></script>

</head>

<body>
<script type="text/javascript">
<!--    $(function(){
        //获得后台数据
        var category_data;//类型信息
        var soft_data;//软件部销售数据
        var net_data;//网络部销售数据
        var mobile_data;//移动事业部销售数据
        $.ajax({
            url:'/src/com/servlet/EChartsServelt',
            async:false,
            success: function(data){
                category_data=data.sName;
                soft_data=data.uGrade;
                net_data=data.fGrade;
                mobile_data=data.pGrade;}
            })-->
        var grade=['王强',60,80,90,50,90];
        var book=['操作系统','数据挖掘','项目管理','计算机网络','软件测试'];
        // 路径配置
        require.config({
            paths: {
                echarts: 'WebContent/js'
            }
        });    
          require(
            [
                'echarts',
                'WebContent/js/bar', // 使用柱状图就加载bar模块，按需加载
                'WebContent/js/line',
                'WebContent/js/legend'
                
            ],
            function (ec) {
                // 基于准备好的dom，初始化echarts图表
                var myChart = ec.init(document.getElementById('main')); 
                var option = {
                    tooltip: {//提示框，鼠标悬浮交互时的信息提示
                        show: true
                    },
                    
                    toolbox:{//定义工具按钮
                        show : true,
                        feature : {
                        dataView : {show: true, readOnly: false},//数据信息按钮
                        magicType : {show: true, //显示折线、柱状图等切换按钮
                        type: ['line', 'bar','stack', 'tiled']}
                        }
                    },
                    legend: {//图例
                        data:['操作系统','计算机网络','数据挖掘','项目管理','软件测试']
                    },
                    xAxis : [//x轴设置
                        {
                            type : 'category',//x轴显示类别
                            data : book //成绩
                        }
                    ],
                    yAxis : [//y轴设置
                        {
                            type : 'value' //y轴显示数据值
                        }
                    ],
                    series : [
                        {
                            "name":"操作系统",
                            "type":"bar",
                           // "data":soft_data //[80, 300, 200, 100]
                        },
                         {
                            "name":"计算机网络",
                            "type":"bar",
                           // "data":net_data //[50, 200, 120, 200]
                        },
                         {
                            "name":"数据挖掘",
                            "type":"bar",
                            //"data":mobile_data //[20, 60, 30, 15]
                        },
                        {
                            "name":"项目管理",
                            "type":"bar",
                            //"data":mobile_data //[20, 60, 30, 15]
                        },
                        {
                            "name":"软件测试",
                            "type":"bar",
                            //"data":mobile_data //[20, 60, 30, 15]
                        }
                    ]
                };
        
                // 为echarts对象加载数据 
                myChart.setOption(option); 
            }
        );
    </script>

    <div id="main" style="height:600px"></div>
</body>
</html>




