<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ page
	import="com.jshop.action.backstage.thirdpartyplatform.tenpay.*"%>
<%@ page import="com.jshop.action.backstage.tools.Md5Util"%>
<%@ include file="config.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%
	//---------------------------------------------------------
	//财付通支付应答（处理回调）示例，商户按照此文档进行开发即可 该页面反馈给用户看
	//---------------------------------------------------------
	
	//创建支付应答对象
	ResponseHandler resHandler = new ResponseHandler(request, response);
	resHandler.setKey(TenPayConfig.key);
	
	System.out.println("前台回调返回参数:"+resHandler.getAllParameters());
	
	//判断签名
	if(resHandler.isTenpaySign()) {
	
	    //通知id
		String notify_id = resHandler.getParameter("notify_id");
		//商户订单号
		String out_trade_no = resHandler.getParameter("out_trade_no");
		//财付通订单号
		String transaction_id = resHandler.getParameter("transaction_id");
		//金额,以分为单位
		String total_fee = resHandler.getParameter("total_fee");
		//如果有使用折扣券，discount有值，total_fee+discount=原请求的total_fee
		String discount = resHandler.getParameter("discount");
		//支付结果
		String trade_state = resHandler.getParameter("trade_state");
		//交易模式，1即时到账，2中介担保
		String trade_mode = resHandler.getParameter("trade_mode");
		//获取附加的参数这里是手机号
		String attach=resHandler.getParameter("attach");
		
		String attachstrs[]=attach.split(",");
		
		if("1".equals(trade_mode)){       //即时到账 
			if( "0".equals(trade_state)){
				//这里可以进行财付通反馈后的前台信息提示，主要给用户看
				
				//获取附加的参数这里判断是否虚拟电话充值卡
				//if("3".equals(attachstrs[1].toString())){//表示订单类型3是虚拟充值卡订单
					//RequestHandler reqHandler = new RequestHandler(request, response);
					//调用欧非充值接口
					//这里在计算返回金额进行换算后和欧非集成
					//String cardnum="";
					//int inttotal_fee=Integer.parseInt(total_fee);
					//if(1==(inttotal_fee/100)){
					//	cardnum="0.2";
					//}
					//reqHandler.setParameter("userid","A728995");
					//reqHandler.setParameter("userpws",Md5Util.getMd5("62672849"));
					//reqHandler.setParameter("cardid","140101");
					//reqHandler.setParameter("cardnum",cardnum);
					//reqHandler.setParameter("sporder_id",out_trade_no);
					//reqHandler.setParameter("sporder_time",TenpayUtil.getCurrTime());
					//reqHandler.setParameter("game_userid",attachstrs[0].toString());
					//reqHandler.setParameter("md5_str",Md5Util.getMd5("userid+userpws+cardid+cardnum+sporder_id+sporder_time+game_userid").toUpperCase());
					//reqHandler.setParameter("ret_url","http://www.google.com");
					//reqHandler.setParameter("version","4.0");
					//response.sendRedirect(reqHandler.getRequestURLforof());
				//}
		        //------------------------------
				//即时到账处理业务开始
				//------------------------------
				
	
				//注意交易单不要重复处理
				//注意判断返回金额
				
				//------------------------------
				//即时到账处理业务完毕
				//------------------------------
				
				out.println("即时到帐付款成功");
				System.out.println("即时到帐付款成功");
			}else{
				out.println("即时到帐付款失败");
				System.out.println("即时到帐付款失败");
			}
		}else if("2".equals(trade_mode)){    //中介担保
			if( "0".equals(trade_state)){
				//------------------------------
				//中介担保处理业务开始
				//------------------------------
				
	
				//注意交易单不要重复处理
				//注意判断返回金额
			
				//------------------------------
				//中介担保处理业务完毕
				//------------------------------
				
				out.println("中介担保付款成功");
				System.out.println("中介担保付款成功");
			}else{
				out.println("trade_state=" + trade_state);
			}
		}
	} else {
		out.println("认证签名失败");
	}
	
	//获取debug信息,建议把debug信息写入日志，方便定位问题
	String debuginfo = resHandler.getDebugInfo();
	System.out.println("debuginfo:" + debuginfo);
	//out.print("sign_String:  " + debuginfo + "<br><br>");
	
	%>







