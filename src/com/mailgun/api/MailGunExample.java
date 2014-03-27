package com.mailgun.api;

import com.mailgun.api.exceptions.MailGunException;
import com.mailgun.api.resources.instances.MessageInstance;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.core.MediaType;


public class MailGunExample {

	public static void main (String args[]) throws Exception, MailGunException {

    	// test mailgun api key
		MailGunClient client = new MailGunClient("key-8dslt0mt58yi1r9wl63e44wru0f2vt71","mail.66pu.net");

		String to = "oday0311@hotmail.com";
		String from = "51476460@qq.com";
		String subject = "a hello world";
		String body = " “比价袋”是一款淘宝返现比较工具，直接安装在浏览器上，当您在浏览淘宝商品时，自动提示商品返现， 并比较多家返利网站的返现比例。<br>我们的努力让你的网购更方便、更省钱！再也不会忘记返现！<br><br>\n" +
                "\t\t<img src=\"http://42.121.120.144:83/controller/email_stat_v2.php?stat_id=5&amp;email_id=3&amp;mailbox=342396263%40qq.com&amp;type=open&amp;auth=8744f6d116cf3a7ce0b77dd83f6096cc\" height=\"0\" border=\"0\" width=\"0\">\n" +
                "\t\t<a href=\"http://42.121.120.144:83/controller/email_stat_v2.php?stat_id=5&amp;email_id=3&amp;mailbox=342396263%40qq.com&amp;type=click&amp;url=http%3A%2F%2Fwww.bijiadai.com&amp;auth=2cf559ccd4adfa7b9f1c3abb06c9ad3f\" target=\"_blank\"><img src=\"http://42.121.120.144:83/tpl/images/BiJiaDai.jpg\" style=\"width:600px;\" alt=\"“比价袋”是一款淘宝返现比较工具，直接安装在浏览器上，当您在浏览淘宝商品时，自动提示商品返现， 并比较多家返利网站的返现比例。我们的努力让你的网购更方便、更省钱！再也不会忘记返现！\"></a>";
		Email email = new Email(to, from, body, subject);
		MessageInstance msg = client.sendSimpleEmail(email);

	}


}

