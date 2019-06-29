<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/6/18
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <<title>订单处理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="description" content=""/>
    <meta name="format-detection" content="telephone=no"/>
    <meta name=""/>

    <link rel="stylesheet" href="css/tasp.css"/>
    <link href="css/orderconfirm.css" rel="stylesheet"/>

    <style>
        #page {
            width: auto;
        }

        #comm-header-inner, #content {
            width: 950px;
            margin: auto;
        }

        #logo {
            padding-top: 26px;
            padding-bottom: 12px;
        }

        #header .wrap-box {
            margin-top: -67px;
        }

        #logo .logo {
            position: relative;
            overflow: hidden;
            display: inline-block;
            width: 140px;
            height: 35px;
            font-size: 35px;
            line-height: 35px;
            color: #f40;
        }

        #logo .logo .i {
            position: absolute;
            width: 140px;
            height: 35px;
            top: 0;
            left: 0;
            background: url(http://a.tbcdn.cn/tbsp/img/header/logo.png);
        }
    </style>

</head>
<body data-spm="1">
<div id="page">
    <div id="content" class="grid-c">
        <div id="address" class="address" style="margin-top: 20px;" data-spm="2">
            <form action="push.action" method="get">
            <div>
                <h3 class="dib">确认订单信息</h3>
                    <table cellspacing="0" cellpadding="0" class="order-table" id="J_OrderTable" summary="统一下单订单信息区域">
                    <caption style="display: none">统一下单订单信息区域</caption>
                    <thead>
                    <tr>
                        <th class="s-title">店铺宝贝
                            <hr/>
                        </th>
                        <th class="s-price">单价(元)
                            <hr/>
                        </th>
                        <th class="s-amount">数量
                            <hr/>
                        </th>
                        <th class="s-agio">地址
                            <hr/>
                        </th>
                        <th class="s-total">电话
                            <hr/>
                        </th>
                    </tr>
                    </thead>
                    <tbody data-spm="3" class="J_Shop" data-tbcbid="0" data-outorderid="47285539868" data-isb2c="false"
                           data-postMode="2" data-sellerid="1704508670">
                    <tr class="first">
                        <td colspan="5"></td>
                    </tr>
                    <tr class="shop blue-line">
                        <td colspan="2" class="promo">
                            <div>
                                <ul class="scrolling-promo-hint J_ScrollingPromoHint">
                                </ul>
                            </div>
                        </td>
                    </tr>
                    <tr class="item" data-lineid="19614514619:31175333266:35612993875" data-pointRate="0">
                            <td class="s-title">
                                <a href="#" target="_blank" title="${goodname}" class="J_MakePoint"
                                   data-point-url="http://log.mmstat.com/buy.1.5">
                                    <img src="${param.src}"
                                         class="itempic"><span class="title J_MakePoint"data-point-url="http://log.mmstat.com/buy.1.5"><input name="account" type="hidden" value="${param.goodname}">${param.goodname}</span></a>
                                <a title="消费者保障服务，卖家承诺商品如实描述" href="#" target="_blank">
                                    <%--<img src="http://img03.taobaocdn.com/tps/i3/T1bnR4XEBhXXcQVo..-14-16.png"/>--%>
                                </a>
                                <div>
                                    <span style="color:gray;">卖家承诺72小时内发货</span>
                                </div>
                            </td>
                            <td class="s-price">
                                <span class='price '>
                                    <em class="style-normal-small-black J_ItemPrice">${param.price}.00</em>
                                </span>
                                <input name="price" type="hidden"  value="${param.price}" class="J_CostPrice"/>
                            </td>
                            <td class="s-amount" data-point-url="">
                                <input type="hidden" class="J_Quantity" value="${param.mun}" name="mun"/>${param.mun}

                            </td>
                            <td class="s-agio">
                                <div class="J_Promotion promotion" data-point-url="">
                                    <input type="text" name="address">
                                </div>
                            </td>
                            <td class="s-total">
                                <span class='price '>
                                    <em class="style-normal-bold-red J_ItemTotal ">
                                        <input type="text" name="phone">
                                    </em>
                                </span>
                                <input id="furniture_service_list_b_47285539868" type="hidden"/>
                            </td>


                </tr>
                    <tr class="item-service">
                        <td colspan="5" class="servicearea" style="display: none"></td>
                    </tr>

                    <tr class="blue-line" style="height: 2px;">
                        <td colspan="5"></td>
                    </tr>
                    <tr class="other other-line">
                        <td colspan="5">
                            <ul class="dib-wrap">
                                <li class="dib user-info">
                                    <ul class="wrap">
                                        <li>
                                            <div class="field gbook">
                                                <label class="label">给卖家留言：</label>
                                                <textarea style="width:350px;height:80px;"
                                                          title="选填：对本次交易的补充说明（建议填写已经和卖家达成一致的说明）"
                                                          name=""></textarea>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                                <li class="dib extra-info">

                                    <div class="shoparea">
                                        <ul class="dib-wrap">
                                            <li class="dib title">店铺优惠：</li>
                                            <li class="dib sel">
                                                <div class="J_ShopPromo J_Promotion promotion clearfix"
                                                     data-point-url="http://log.mmstat.com/buy.1.16"></div>
                                            </li>
                                            <li class="dib fee">
                                                <span class='price '>
                                                    <em class="style-normal-bold-black J_ShopPromo_Result">0.00</em>
                                                </span>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="shoppointarea"></div>
                                    <div class="farearea">
                                        <ul class="dib-wrap J_farearea">
                                            <li class="dib title">运送方式：</li>
                                            <li class="dib sel"
                                                data-point-url="http://log.mmstat.com/jsclick?cache=*&tyxd=wlysfs">
                                                <input type="hidden"  value="0"
                                                       class="J_ActualPaidFee"/>
                                                <input type="hidden" value="true"/>
                                                <input type="hidden" value=""
                                                       class="J_CodSellerFareFee"/>
                                                <input type="hidden" value=""
                                                       class="J_CodServiceFeeRate"/>
                                                <input type="hidden"  value="0"
                                                       class="J_CodPostFee"/>
                                                <select name="1704508670:2|post" class="J_Fare">
                                                    <option data-fare="1500" value=" 2 " data-codServiceType="2"
                                                            data-level="">
                                                        快递 15.00元
                                                    </option>
                                                    <option data-fare="2500" value=" 7 " data-codServiceType="7"
                                                            data-level="">
                                                        EMS 25.00元
                                                    </option>
                                                    <option data-fare="1500" value=" 1 " data-codServiceType="1"
                                                            data-level="">
                                                        平邮 15.00元
                                                    </option>
                                                    <option selected="selected" data-fare="1500" value=" 1 "
                                                            data-codServiceType="1"
                                                            data-level="">
                                                        包邮
                                                    </option>
                                                </select>
                                                <em tabindex="0" class="J_FareFree" style="display: none">免邮费</em>
                                            </li>
                                            <li class="dib fee">
                                                <span class='price '>
                                                    <em class="style-normal-bold-red J_FareSum"></em>
                                                </span>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="extra-area">
                                        <ul class="dib-wrap">
                                            <li class="dib title">发货时间：</li>
                                            <li class="dib content">卖家承诺订单在买家付款后，72小时内<a href="#">发货</a></li>
                                        </ul>
                                    </div>
                                    <div class="extra-area">
                                        <ul class="dib-wrap">
                                            <li class="dib title">总价：</li>
                                            <li class="dib content" id="sum">${param.price*param.mun}</li>
                                        </ul>
                                        <%--<script>
                                            var price=parseFloat("")
                                            var num=parseInt("${}");
                                            var all=price*num;
                                            var priceall=all.toString();
                                            if (price.indexOf(".")!=-1){
                                                document.getElementById("sum").innerHTML=priceall.substring(0,price.indexOf(".")+3)+"元";
                                            }else{
                                                document.getElementById("sum").innerHTML=priceall+"元";
                                            }
                                        </script>--%>
                                    </div>

                                    <div class="servicearea" style="display: none"></div>
                                </li>
                            </ul>
                        </td>
                    </tr>
                    <tr class="shop-total blue-line">

                    </tr>
                    </tbody>
                    <tfoot>
                    <tr>
                        <td colspan="5">
                            <div class="order-go" data-spm="4">
                                <div class="J_AddressConfirm address-confirm">
                                    <div class="kd-popup pop-back" style="margin-bottom: 40px;">
                                        <a href="goods.jsp"
                                           class="back J_MakePoint" target="_top"
                                           data-point-url="">再想想</a>
                                        <input type="submit" id="J_Go" class=" btn-go" data-point-url="" tabindex="0" value="提交订单" title="点击此按钮，提交订单。"/>
                                        <div class="msg" style="clear: both;">
                                            <p class="tips naked" style="float:right;padding-right: 0">
                                                若价格变动，请在提交订单后联系卖家改价，并查看已买到的宝贝</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </td>
                    </tr>

                    </tfoot>
                </table>

            </div>
            </form>
            <input type="hidden" id="J_useSelfCarry" name="useSelfCarry" value="false"/>
            <input type="hidden" id="J_selfCarryStationId" name="selfCarryStationId" value="0"/>
            <input type="hidden" id="J_useMDZT" name="useMDZT" value="false"/>
            <input type="hidden" name="useNewSplit" value="true"/>
            <input type="hidden" id="J_sellerIds" name="allSellIds" value="1704508670"/>

        </div>

        <div id="footer"></div>
    </div>
    <div style="text-align:center;">
    </div>
</div>
<%--<div align="center">
<form action="/add.action" method="post">
  商品名:<input type="text" name="account" value="${param.goodname}" readonly="readonly"/><br>
  地  址:<input type="text" name="address"/><br>
  电  话:<input type="text" name="phone"/><br>
  价  格:<input type="text" name="price" value="${param.price}" readonly="readonly"/><br>
  个  数:<input type="text" name="mun" value="${param.mun}" readonly="readonly"/><br>
  <input type="submit" value="添加">
</form>
</div>
</body>--%>
</html>
