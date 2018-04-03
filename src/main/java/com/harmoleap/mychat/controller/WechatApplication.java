package com.harmoleap.mychat.controller;


import com.harmoleap.mychat.dispatcher.EventDispatcher;
import com.harmoleap.mychat.dispatcher.MsgDispatcher;
import com.harmoleap.mychat.util.MessageUtil;
import com.harmoleap.mychat.util.SignUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@Controller
@SpringBootApplication
public class WechatApplication {
	private static  final String TOKEN="123po";
	//private static Logger loger = Logger.getLogger(WechatApplication.class);
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public void doGet(HttpServletRequest req, HttpServletResponse response){
		String signature = req.getParameter("signature");
		String timestamp = req.getParameter("timestamp");
		String nonce = req.getParameter("nonce");
		String echostr = req.getParameter("echostr");
		if (SignUtil.checkSignature(signature,timestamp,nonce)) {
			PrintWriter pw = null;
			try {
				pw = response.getWriter();
				pw.print(echostr);
				pw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				if (pw!=null)
					pw.close();
			}
		}
	}

	@RequestMapping(value = "/",method = RequestMethod.POST)
	public void doPost(HttpServletRequest request,HttpServletResponse response){

		System.out.println("这是 post 方法！");
        PrintWriter pw =null;
		try{
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			Map<String, String> map= MessageUtil.parseXml(request);
			String msgType = map.get("MsgType");

            if(MessageUtil.REQ_MESSAGE_TYPE_EVENT.equals(msgType)){
				String res = EventDispatcher.processEvent(map);
				pw = response.getWriter();
				pw.print(res);
				pw.flush();

			}else {

				String respXML = MsgDispatcher.processMessage(map); //
                System.out.print(respXML);
				pw = response.getWriter();
				pw.print(respXML);
				pw.flush();

			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
		    if (pw!=null)
		        pw.close();
        }
    }


	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return "hello Spring boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(WechatApplication.class, args);
	}
}
