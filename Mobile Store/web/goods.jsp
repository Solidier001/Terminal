<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/6/21
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>物品详情</title>
    <link rel="stylesheet" href="css/shouye.css">
    <link rel="stylesheet" href="css/xiaomi.css"/>
    <script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
    <script src="js/jquery.animate-colors-min.js"></script>
    <script src="js/jquery-1.10.2.js"></script>
    <script   src="js/modernizr-custom-v2.7.1.min.js"></script>
</head>
<body>
<div class="head_box">
    <div id="head_wrap">
        <div id="head_nav">
            <a class="head_nav_a">黑米商城</a>
            <span>|</span>
            <a class="head_nav_a">MIUI</a>
            <span>|</span>
            <a class="head_nav_a">小智语音助手</a>
            <span>|</span>
            <a class="head_nav_a">游戏</a>
            <span>|</span>
            <a class="head_nav_a">阅读</a>
            <span>|</span>
            <a class="head_nav_a">云服务</a>
            <span>|</span>
            <a class="head_nav_a">企业资质</a>
            <span>|</span>
            <a class="head_nav_a">问题反馈</a>
            <span>|</span>
            <a class="head_nav_a" id="Select_Region_but">Select Region</a>
        </div>
        <div id="head_right">
            <div id="head_landing">
                <a class="head_nav_a">支付</a>
            </div>
            <div id="head_car">
                <a class="head_car_text">购物车（0）</a>
                <div id="car_content" style="height: 0px;width:0px ;background-color: #edffc6;z-index: 999">
                    <a class="car_text"></a>
                </div>
            </div>
        </div>
    </div>
</div>
<div id="main_head_box">
    <div id="menu_wrap">
        <div id="menu_logo">
            <img src="img/xiaomi_logo.png">
        </div>
        <div id="menu_nav">
            <ul>
                <li class="menu_li" control="xiaomiphone">小米手机</li>
                <li class="menu_li" control="hongmiphone">红米</li>
                <li class="menu_li" control="pingban">电视</li>
                <li class="menu_li" control="tv">笔记本</li>
                <li class="menu_li" control="tv">家电</li>
                <li class="menu_li" control="luyou">路由器</li>
                <li class="menu_li" control="yingjian">智能硬件</li>
                <li><a>服务</a></li>
                <li><a>社区</a></li>
            </ul>
        </div>
        <div id="find_wrap">
            <div id="find_bar">
                <input type="text" id="find_input">
            </div>
            <div id="find_but">GO</div>
        </div>
    </div>
</div>
<div class="Xcontent">
    <ul class="Xcontent01">
        <div class="Xcontent06"><img src="${param.src}"></div>
        <ol class="Xcontent08">
            <div class="Xcontent07"><img src="${param.src}"></div>
            <div class="Xcontent09"><img src="${param.src}"></div>
            <div class="Xcontent10"><img src="${param.src}"></div>
            <div class="Xcontent11"><img src="${param.src}"></div>
            <div class="Xcontent12"><img src="${param.src}"></div>
        </ol>
        <ol class="Xcontent13">
            <div class="Xcontent14"><a href="#"><p>${param.goodname}</p></a></div>
            <!--<div class="Xcontent15"><img src="images/shangpinxiangqing/X11.png"></div>-->
            <div class="Xcontent16"><p>${param.describe}</p></div>
            <div class="Xcontent17">
                <p class="Xcontent18">售价</p>
                <p class="Xcontent19">￥<span>${param.price}</span></p>
                <div class="Xcontent20">
                    <p class="Xcontent21">促销</p>
                    <!--<img src="images/shangpinxiangqing/X12.png">-->
                    <p class="Xcontent22">领610元新年礼券，满再赠好礼</p>
                </div>
                <div class="Xcontent23">
                    <p class="Xcontent24">服务</p>
                    <p class="Xcontent25">30天无忧退货&nbsp;&nbsp;&nbsp;&nbsp;       48小时快速退款 &nbsp;&nbsp;&nbsp;&nbsp;        满88元免邮</p>
                </div>
            </div>
            <div class="Xcontent26">
                <p class="Xcontent27">颜色</p>
                <div class="Xcontent28"><img  src="${param.src}"></div>
                <div class="Xcontent29"><img  src="${param.src}"></div>
            </div>
            <div class="Xcontent30">
                <p class="Xcontent31">数量</p>
                <div class="Xcontent32"><img onclick="m()" src="images/shangpinxiangqing/X15.png"></div>
                <form>
                    <input class="input" value="1" id="num">
                </form>
                <div class="Xcontent33"><img onclick="plus()" src="images/shangpinxiangqing/16.png"></div>

            </div>
            <div class="Xcontent34"><a><img src="images/shangpinxiangqing/X17.png"></a></div>
            <div class="Xcontent35"><a ><img src="images/shangpinxiangqing/X18.png"></a></div>
        </ol>
    </ul>
</div>
<div id="foot_box">
    <div id="foot_wrap">
        <div class="foot_top">
            <ul>
                <li>1小时快修服务</li>
                <li class="font_top_i">|</li>
                <li>7天无理由退货</li>
                <li class="font_top_i">|</li>
                <li>15天免费换货</li>
                <li class="font_top_i">|</li>
                <li>满150元包邮</li>
                <li class="font_top_i">|</li>
                <li>520余家售后网点</li>
            </ul>
        </div>
        <div class="foot_bottom">
            <div class="foot_bottom_l">
                <dl>
                    <dt>帮助中心</dt>
                    <dd>购物指南</dd>
                    <dd>支付方式</dd>
                    <dd>配送方式</dd>
                </dl>
                <dl>
                    <dt>服务支持</dt>
                    <dd>售后政策</dd>
                    <dd>自助服务</dd>
                    <dd>相关下载</dd>
                </dl>
                <dl>
                    <dt>大米之家</dt>
                    <dd>大米之家</dd>
                    <dd>服务网点</dd>
                    <dd>预约亲临到店服务</dd>
                </dl>
                <dl>
                    <dt>关注我们</dt>
                    <dd>新浪微博</dd>
                    <dd>大米部落</dd>
                    <dd>官方微信</dd>
                </dl>
            </div>
            <div class="foot_bottom_r">
                <a>400-100-5678</a>
                <a>周一至周日 8:00-18:00</a>
                <a>（仅收市话费）</a>
                <span> 24小时在线客服</span>
            </div>
        </div>
    </div>
    <div class="foot_note_box">
        <div class="foot_note_wrap">
            <div class="foot_note_con">
                <span class="foot_logo"><img src="img/mi-logo.png" width="38px" height="38px"></span>
                <span class="foot_note_txt">
							<a>大米网</a><h>|</h><a>MIUI</a><h>|</h><a>米聊</a><h>|</h><a>多看书城</a><h>|</h><a>大米路由器</a><h>|</h><a>大米后院</a><h>|</h><a>大米天猫店</a><h>|</h><a>大米淘宝直营店</a><h>|</h><a>大米网盟</a><h>|</h><a>问题反馈</a><h>|</h><a>Select Region</a>
						    <a> 5555555号</a>
						</span>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    function plus() {
        var input=document.getElementById("num");
        num=input.value;
        input.value=parseInt(num)+1;
        $(".Xcontent34").children("a").attr("href",encodeURI("DetermineLogin.action?dir=Xcontent34&&goodname=${param.goodname}&&price=${param.price}&&mun="+input.value+"&&src=${param.src}"));
        $(".Xcontent35").children("a").attr("href",encodeURI("DetermineLogin.action?dir=Xcontent35&&account=${param.goodname}&&price=${param.price}&&mun="+input.value+"&&src=${param.src}"));
    }
    function m() {
        var input=document.getElementById("num");
        num=input.value;
        input.value=parseInt(num)-1;
        $(".Xcontent34").children("a").attr("href",encodeURI("DetermineLogin.action?dir=Xcontent34&&goodname=${param.goodname}&&price=${param.price}&&mun="+input.value+"&&src=${param.src}"));
        $(".Xcontent35").children("a").attr("href",encodeURI("DetermineLogin.action?dir=Xcontent35&&account=${param.goodname}&&price=${param.price}&&mun="+input.value+"&&src=${param.src}"));
    }
    var input=document.getElementById("num");
    $(".Xcontent34").children("a").attr("href",encodeURI("DetermineLogin.action?dir=Xcontent34&&goodname=${param.goodname}&&price=${param.price}&&mun="+input.value+"&&src=${param.src}"));
    $(".Xcontent35").children("a").attr("href",encodeURI("DetermineLogin.action?dir=Xcontent35&&account=${param.goodname}&&price=${param.price}&&mun="+input.value+"&&src=${param.src}"));
</script>
</body>
</html>
