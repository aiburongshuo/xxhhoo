<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    
   
    %>
<!DOCTYPE html >
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/common.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
<script src="js/jquery.SuperSlide.2.1.1.js" type="text/javascript"></script>
<script src="js/common_js.js" type="text/javascript"></script>
<script src="js/footer.js" type="text/javascript"></script>
<title>添加店铺</title>
</head>
<body>
<head>
 <div id="header_top">
  <div id="top">
    <div class="Inside_pages">
      <div class="Collection"><a href="#" class="green">请登录</a> <a href="#" class="green">免费注册</a></div>
	<div class="hd_top_manu clearfix">
	  <ul class="clearfix">
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">首页</a></li> 
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"> <a href="#">我的小充</a> </li>
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">消息中心</a></li>
       <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">商品分类</a></li>
        <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">我的购物车<b>(23)</b></a></li>	
	  </ul>
	</div>
    </div>
  </div>
  <div id="header"  class="header page_style">
  <div class="logo"><a href="index.html"><img src="images/logo.png" /></a></div>
  <!--结束图层-->
  <div class="Search">
        <div class="search_list">
            <ul>
                <li class="current"><a href="#">产品</a></li>
                <li><a href="#">信息</a></li>
            </ul>
        </div>
        <div class="clear search_cur">
           <input name="searchName" id="searchName" class="search_box" onkeydown="keyDownSearch()" type="text">
           <input name="" type="submit" value="搜 索"  class="Search_btn"/>
        </div>
        <div class="clear hotword">热门搜索词：香醋&nbsp;&nbsp;&nbsp;茶叶&nbsp;&nbsp;&nbsp;草莓&nbsp;&nbsp;&nbsp;葡萄&nbsp;&nbsp;&nbsp;菜油</div>
</div>
 <!--购物车样式-->
 <div class="hd_Shopping_list" id="Shopping_list">
   <div class="s_cart"><a href="#">我的购物车</a> <i class="ci-right">&gt;</i><i class="ci-count" id="shopping-amount">0</i></div>
   <div class="dorpdown-layer">
    <div class="spacer"></div>
	 <!--<div class="prompt"></div><div class="nogoods"><b></b>购物车中还没有商品，赶紧选购吧！</div>-->
	 <ul class="p_s_list">	   
		<li>
		    <div class="img"><img src="images/tianma.png"></div>
		    <div class="content"><p class="name"><a href="#">产品名称</a></p><p>颜色分类:紫花8255尺码:XL</p></div>
			<div class="Operations">
			<p class="Price">￥55.00</p>
			<p><a href="#">删除</a></p></div>
		  </li>
		</ul>		
	 <div class="Shopping_style">
	 <div class="p-total">共<b>1</b>件商品　共计<strong>￥ 515.00</strong></div>
	  <a href="Shop_cart.html" title="去购物车结算" id="btn-payforgoods" class="Shopping">去购物车结算</a>
	 </div>	 
   </div>
 </div>
</div>
<!--菜单栏-->
	<div class="Navigation" id="Navigation">
		 <ul class="Navigation_name">
			<li><a href="Home.html">首页</a></li>
			<li><a href="#">你身边的超市</a></li>
			<li><a href="#">预售专区</a><em class="hot_icon"></em></li>
			<li><a href="products_list.html">商城</a></li>
			<li><a href="#">半小时生活圈</a></li>
			<li><a href="#">好评商户</a></li>
			<li><a href="#">热销活动</a></li>
			<li><a href="Brands.html">联系我们</a></li>
		 </ul>			 
		</div>
	<script>$("#Navigation").slide({titCell:".Navigation_name li",trigger:"click"});</script>
    </div>
</head>
<!--添加店铺样式-->
<div class="Inside_pages clearfix">
<div class="left_style">
  <!--列表-->
  <div class="menu_style">
   <ul class="menu_list">
    <li class="on"><em></em><a href="#">店铺专区</a></li>
    <li><em></em><a href="#">商品专区</a></li>
    <li><em></em><a href="#">订单专区</a></li>
    <li><em></em><a href="#">发货管理</a></li>
    <li><em></em><a href="#">收款账户</a></li>
    <li><em></em><a href="#">我的报表</a></li>
   </ul>
  </div>
</div>
<!--右侧内容样式-->
<div class="right_style">
  <!--内容详细-->
   <div class="title_style"><em></em>添加店铺</div>
   <div class="content_style">
   <ul class="add_shops_style">
   <form name="form0" id="form0" >
    <li><label>店铺/公司名称：</label><div class="add_right_style"><input name="" type="text"  class="text_name"/></div></li>
    <li><label>店铺/公司地址：</label><div class="add_right_style"><select size="1">
      <option value="1">省</option>
    </select></span>
    <select size="1">
      <option value="2">市</option>
    </select></span>
    <select size="1">
      <option value="3">县/区</option>
    </select>
    <p><input name="" type="text"  class="text_name"/></p>
    <p class="map_Callout">
                    	<a id="check_agreement" href="#" class="check_agreement">加入半小时经济圈</a>
                    	<input id="autoLoginCheck" type="hidden">
                    	<a id="agreement_tips" class="auto_tips" style="">地图标注</a>
                        </p>
    </div></li>
    <li><label>店铺门面图标：</label><div class="add_right_style">
      <div class="Facade_img">
       <p class="prompt">上传店铺门面图片（该图片将展示在顶部）</p>
       <div class="Upload_img">
			<div class="file-uploader-wrap"> 
　　　　　　<input type="file" class="file-uploader" name="uploadDataField" id="FileUploader"/> 
　　　　　　<div class="file-uploader-wrap-fake"> 
　　　　　　　　<input type="text" id="PathDisplayer" class="input-text" disabled /> 
　　　　　　　　<a href="javascript:void(0)" class="link-btn" >选择文件</a> 
　　　　　　</div> 
             <a href="#" class="yaoqiu">图片像素要求</a>
		</div></div>
       <img  id="showimg" src=""  alt="预览图片"  class="Preview showimg"/> 
      </div>
    </div>
    </li>
    <li><label>店铺/公司LOGO：</label><div class="add_right_style"> 
    <div class="Facade_img">
       <p class="prompt">上传店铺LOGO</p>
       <div class="Upload_img">

	    <div class="file-uploader-wrap"> 
　　　　　　<input type="file" class="file-uploader" name="uploadDataField" id="FileUploader"/> 
　　　　　　<div class="file-uploader-wrap-fake"> 
　　　　　　　　<input type="text" id="PathDisplayer" class="input-text" disabled /> 
　　　　　　　　<a href="javascript:void(0)" class="link-btn" >选择文件</a> 
　　　　　　</div>
         <a href="#" class="yaoqiu">图片像素要求</a>
		</div>
        </div>
       <img  id="showimg" src=""  alt="预览图片"  class="Preview showimg1"/> 
      </div>
      </div>
     </li>
    <li><label>店铺/公司简介：</label><div class="add_right_style">
    <textarea name="" cols="" rows="" class="textarea"></textarea>
    </div></li>
    <li><label>店铺宣传图片：</label><div class="add_right_style">
        <table>
         <tr>
           <td colspan="3"><input type="submit" value="添加"  class="Add_btn"/><input type="submit" value="删除"  class="delete_btn"/></td></tr>
         <tr class="label"><td  colspan="2">上传图片</td><td>是否展示</td></tr>
         <tr><td><input name="" type="checkbox" value="" /></td>
         <td>
         <div class="file-uploader-wrap"> 
　　　　　　<input type="file" class="file-uploader" name="uploadDataField" id="FileUploader"/> 
　　　　　　<div class="file-uploader-wrap-fake"> 
　　　　　　<input type="text" id="PathDisplayer" class="input-text" disabled /> 
　　　　　　　　<a href="javascript:void(0)" class="link-btn" >选择文件</a> 
　　　　　　</div> 
　　　　</div> 
</td><td><input name="" type="checkbox" value="" /></td></tr>
        </table>
    </div>
    </li>
    </form>
    <script type="text/javascript">
    window.onload = function(){ 
var fileUploader = document.getElementById('FileUploader'); 
var pathDisplayer = document.getElementById('PathDisplayer'); 
if(fileUploader.addEventListener){ 
fileUploader.addEventListener('change', fileUploaderChangeHandler, false); 
}else if(fileUploader.attachEvent){ 
fileUploader.attachEvent('onclick', fileUploaderClickHandler); 
}else{ 
fileUploader.onchange = fileUploaderChangeHandler; 
} 
function fileUploaderChangeHandler(){ 
pathDisplayer.value = fileUploader.value; 
} 
function fileUploaderClickHandler(){ 
setTimeout(function(){ 
fileUploaderChangeHandler(); 
}, 0); 
} 
} </script>
    <!--<script>	
$(".file0").change(function(){
	var objUrl = getObjectURL(this.files[0]) ;
	console.log("objUrl = "+objUrl) ;
	if (objUrl) {
		$(".showimg").attr("src", objUrl) ;
	}
}) ;
//建立一個可存取到該file的url
function getObjectURL(file) {
	var url = null ; 
	if (window.createObjectURL!=undefined) { // basic
		url = window.createObjectURL(file) ;
	} else if (window.URL!=undefined) { // mozilla(firefox)
		url = window.URL.createObjectURL(file) ;
	} else if (window.webkitURL!=undefined) { // webkit or chrome
		url = window.webkitURL.createObjectURL(file) ;
	}
	return url ;
}
</script> --> 
<a href="#" class="Next_btn">下一步，填写店铺及公司资质</a>
   </ul>
  </div>
  </div>
</div>
<!--网站地图-->
<div class="fri-link-bg clearfix">
    <div class="fri-link">
        <div class="logo left margin-r20"><img src="images/fo-logo.jpg" width="152" height="81" /></div>
        <div class="left"><img src="images/qd.jpg" width="90"  height="90" />
            <p>扫描下载APP</p>
        </div>
       <div class="">
    <dl>
	 <dt>新手上路</dt>
	 <dd><a href="#">售后流程</a></dd>
     <dd><a href="#">购物流程</a></dd>
     <dd><a href="#">订购方式</a> </dd>
     <dd><a href="#">隐私声明 </a></dd>
     <dd><a href="#">推荐分享说明 </a></dd>
	</dl>
	<dl>
	 <dt>配送与支付</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>
	<dl>
	 <dt>售后保障</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>
	<dl>
	 <dt>支付方式</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>	
    <dl>
	 <dt>帮助中心</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>
     <dl>
	 <dt>帮助中心</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>
     <dl>
	 <dt>帮助中心</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>	   
   </div>
    </div>
</div>
<!--网站地图END-->
<!--网站页脚-->
<div class="copyright">
    <div class="copyright-bg">
        <div class="hotline">为生活充电在线 <span>招商热线：****-********</span> 客服热线：400-******</div>
        <div class="hotline co-ph">
            <p>版权所有Copyright ©***************</p>
            <p>*ICP备***************号 不良信息举报</p>
            <p>总机电话：****-*********/194/195/196 客服电话：4000****** 传 真：********
                
                E-mail:****@****.gov.cn</p>
        </div>
    </div>
</div>
</body>
</html>
