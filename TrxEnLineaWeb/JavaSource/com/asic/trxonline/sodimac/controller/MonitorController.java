package com.asic.trxonline.sodimac.controller;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.author.manager.request.RequestsHandler;
//import com.ibm.db2.jcc.a.bi;

/**
 * @version 	1.0
 * @author
 */
public class MonitorController extends HttpServlet implements Servlet {
	/**************************************************************
	* Initializes the servlet
	* @param config The servlets configuration information
	*/
	

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		LogWriter.getLog().log(
		this,
		LogWriter.WARNING,
		"execute: trx monitor starting:");

		//Place code here to be done when the servlet is initialized
	}

	/***************************************************************
	* Destroy the Servlet
	*/
	public void destroy() {
		//Place code here to be done when the servlet is shutdown
		//Destroy the database connection
	}

	/***************************************************************
	* This method is run once for each request.
	* @param request The incoming request information
	* @param response The outgoing response information
	*/
	public void performServices(
		HttpServletRequest request,
		HttpServletResponse response) {
		//Place any code here that you would like to run on every request
		//Logging, Authentication, Debugging...
	}

	/***************************************************************
	* Process both HTTP GET and HTTP POST methods
	* @param request The incoming request information
	* @param response The outgoing response information
	*/
	public void performTask(
		HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException {
		try {
//			InputStream is_ = request.getInputStream();
//			InputStreamReader isr_ = new InputStreamReader(is_);
//			BufferedReader br_ = new BufferedReader(isr_);
//			String st= br_.readLine();
			
//			
			ObjectInputStream bufferentrada =
				new ObjectInputStream(request.getInputStream());
			Object obj_ =  bufferentrada.readObject();
			//System.out.println("Object received: " + obj_);

			//Object[] objArray_ = (Object[]) obj_;
			String st= (String) obj_;
			//String st= (String) objArray_[0];
			RequestsHandler hd=new RequestsHandler(st);
			Object answer_=hd.process();
			if (response!=null){ //&& answer_ != null){
				ObjectOutputStream ou_=null;
				try {
					ou_ = new ObjectOutputStream(response.getOutputStream());
					ou_.writeObject(answer_);
					ou_.flush();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (ou_ != null) {
						try {
							ou_.close();
						} catch (IOException e3) {
							e3.printStackTrace();
						}
					}
				}
			}			
			System.out.println("Respuesta->"+answer_);
			System.out.println("Trama Procesada->"+st);
			System.out.println("Después de salir");
		} catch (Exception e) {
			System.out.println("Exception found in performTask method in the MonitorController servlet: "+e);
			e.printStackTrace();
		}

	}

	/***************************************************************
	* Process incoming requests for a HTTP GET method
	* @param request The incoming request information
	* @param response The outgoing response information
	*/
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		performTask(request, response);
	}

	/***************************************************************
	* Process incoming requests for a HTTP POST method
	* @param request The incoming request information
	* @param response The outgoing response information
	*/
	public void doPost(
		HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException {
		performTask(request, response);

	}

	/****************************************************************
	* Dispatches to the next page
	* @param request The incoming request information
	* @param response The outgoing response information
	* @param nextPage The page to dispatch to 
	*/
	public void dispatch(
		HttpServletRequest request,
		HttpServletResponse response,
		String nextPage)
		throws ServletException, IOException {
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
		System.out.println("Desde el dispatch");
	}

}