<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/6/18
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>订单界面</title>
    <link href="css/public.css" type="text/css" rel="stylesheet"/>
    <link rel="stylesheet" type="text/css" href="css/base.css"/>
    <script type="text/javascript" src="js/jquery_cart.js"></script>
    <link rel="stylesheet" type="text/css" href="css/checkOut.css" />
</head>
<body>

<div class="border_top_cart">
    <div class="container">
        <div class="checkout-box">
            <form id="checkoutForm" action="pay.action" method="post">
                <div class="checkout-box-bd">
                    <!-- 地址状态 0：默认选择；1：新增地址；2：修改地址 -->
                    <input type="hidden" name="Checkout[addressState]" id="addrState"   value="0">
                    <!-- 收货地址 -->
                    <div class="xm-box">
                        <div class="box-hd ">
                            <h2 class="title">收货地址</h2>
                            <!---->
                        </div>
                        <div class="box-bd">
                            <div class="clearfix xm-address-list" id="checkoutAddrList">
                                <dl class="item" >
                                    <dt>
                                        <strong class="itemConsignee">请填写地址</strong>
                                    </dt>
                                    <dd>
                                        <p class="tel itemTel">
                                            地址：<input name="address" type="text"/>
                                        </p>
                                        <p class="itemRegion">
                                            电话：<input name="phone" type="text"/>
                                        </p>
                                    </dd>
                                    <dd style="display:none">
                                        <input type="radio" name="Checkout[address]" class="addressId"  value="10140916720030323">
                                    </dd>
                                </dl>
                            </div>
                            <input type="hidden" name="newAddress[type]" id="newType" value="common">
                            <input type="hidden" name="newAddress[consignee]" id="newConsignee">
                            <input type="hidden" name="newAddress[province]" id="newProvince">
                            <input type="hidden" name="newAddress[city]" id="newCity">
                            <input type="hidden" name="newAddress[district]" id="newCounty">
                            <input type="hidden" name="newAddress[address]" id="newStreet">
                            <input type="hidden" name="newAddress[zipcode]" id="newZipcode">
                            <input type="hidden" name="newAddress[tel]" id="newTel">
                            <input type="hidden" name="newAddress[tag_name]" id="newTag">
                            <div class="xm-edit-addr-backdrop" id="J_editAddrBackdrop"></div>
                        </div>
                    </div>

                    <div id="checkoutPayment">
                        <!-- 支付方式 -->
                        <div class="xm-box">
                            <div class="box-hd ">
                                <h2 class="title">支付方式</h2>
                            </div>
                            <div class="box-bd">
                                <ul id="checkoutPaymentList" class="checkout-option-list clearfix J_optionList">
                                    <li class="item selected">
                                        <input type="radio" name="Checkout[pay_id]" checked="checked" value="1">
                                        <p>
                                            在线支付                                <span></span>
                                        </p>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <!-- 支付方式 END-->
                        <div class="xm-box">
                            <div class="box-hd ">
                                <h2 class="title">配送方式</h2>
                            </div>
                            <div class="box-bd">
                                <ul id="checkoutShipmentList" class="checkout-option-list clearfix J_optionList">
                                    <li class="item selected">
                                        <input type="radio" data-price="0" name="Checkout[shipment_id]" checked="checked" value="1">
                                        <p>
                                            快递配送（免运费）                                <span></span>
                                        </p>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <!-- 配送方式 END-->                    <!-- 配送方式 END-->
                    </div>
                </div>
                <div class="checkout-box-ft">
                    <!-- 商品清单 -->
                    <div id="checkoutGoodsList" class="checkout-goods-box">
                        <div class="xm-box">
                            <div class="box-hd">
                                <h2 class="title">确认订单信息</h2>
                            </div>
                            <div class="box-bd">
                                <dl class="checkout-goods-list">
                                    <dt class="clearfix">
                                        <span class="col col-1">商品名称</span>
                                        <span class="col col-2">购买价格</span>
                                        <span class="col col-3">购买数量</span>
                                    </dt>
                                    <script>
                                        var bc=0.0;
                                        var n;
                                    </script>
                                    <s:iterator var="orderList" value="#session.OrderList">
                                    <dd class="item clearfix">
                                            <div class="item-row">
                                            <div class="col col-1">
                                                <div class="g-info">
                                                    <a href="#">
                                                        <s:property value="#orderList.account"/> </a>
                                                </div>
                                            </div>
                                            <div class="col col-2"><s:property value="#orderList.price"/>元</div>
                                                <script>
                                                    n=parseFloat("<s:property value='#orderList.price'/>");
                                                    var mun=parseInt("<s:property value='#orderList.mun'/>");
                                                    bc=bc+n*mun;
                                                </script>
                                            <div class="col col-3"><s:property value="#orderList.mun"/></div>
                                        </div>
                                    </dd>
                                    </s:iterator>
                                </dl>
                                <div class="checkout-count clearfix">
                                    <div class="checkout-count-extend xm-add-buy">
                                        <h3 class="title">会员留言</h2></br>
                                            <input type="text" />

                                        </h3>
                                    </div>
                                    <!-- checkout-count-extend -->
                                    <div class="checkout-price">
                                        <ul>

                                            <li>
                                                订单总额：<span id="sun"></span>
                                            </li>
                                            <li>
                                                运费：<span id="postageDesc">0元</span>
                                            </li>
                                        </ul>
                                        <p class="checkout-total">应付总额：<span><strong id="totalPrice">244</strong>元</span></p>
                                        <script>
                                            var price=bc.toString();
                                            if (price.indexOf(".")!=-1){
                                                document.getElementById("totalPrice").innerText=price.substring(0,price.indexOf(".")+3);
                                                document.getElementById("sun").innerText=price.substring(0,price.indexOf(".")+3)+"元";
                                            }else{
                                                document.getElementById("totalPrice").innerText=price;
                                                document.getElementById("sun").innerText=price+"元";
                                            }
                                        </script>
                                    </div>
                                </div>
                               <div id="sum"></div>
                                <script>
                                </script>
                            </div>
                            <input type="hidden" id="couponType" name="Checkout[couponsType]">
                            <input type="hidden" id="couponValue" name="Checkout[couponsValue]">
                            <div class="checkout-confirm">
                                <a href="index.jsp" class="btn btn-lineDakeLight btn-back-cart">再逛逛</a>
                                <input type="submit" class="btn btn-primary" value="立即付款" id="checkoutToPay"/>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <div class="promise_box">
            <div class="w">
                <ul>
                    <li><img src="images/promise_img01.jpg"><span>365天不打烊</span></li>
                    <li><img src="images/promise_img02.jpg"><span>无理由退换货</span></li>
                    <li><img src="images/promise_img03.jpg"><span>担保交易</span></li>
                    <li><img src="images/promise_img04.jpg"><span>先行赔付</span></li>
                    <li><img src="images/promise_img05.jpg"><span>支持定制</span></li>
                </ul>
            </div>
        </div>
    </div>
</div>
<%--
<div align="center">
    &lt;%&ndash;<a href="/searchOrders.jsp"> 查询 </a>&ndash;%&gt;
    <a href="/index.jsp"> 再逛逛 </a>
</div>
<div align="center">
    <table width="55%" height="210" border="1" cellpadding="0">
<tr align="center">
    <td>商品名</td>
    <td>地址</td>
    <td>电话</td>
    <td>价格</td>
    <td>个数</td>
</tr>
<s:iterator var="orderList" value="#session.OrderList">
    <tr align="center">
        <td><s:property value="#orderList.account"/></td>
        <td><s:property value="#orderList.address"/></td>
        <td><s:property value="#orderList.phone"/></td>
        <td><s:property value="#orderList.price"/></td>
        <td><s:property value="#orderList.mun"/></td>
        <td>
        </td>
    </tr>
</s:iterator>
    </table>
</div>
--%></body>
</html>
