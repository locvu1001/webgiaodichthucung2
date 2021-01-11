package com.laptrinhjavaweb.controller.web;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.model.AccountModel;
import com.laptrinhjavaweb.service.IAccountService;
import com.laptrinhjavaweb.service.ILoaiService;
import com.laptrinhjavaweb.utils.FormUtil;
import com.laptrinhjavaweb.utils.SessionUtil;

@WebServlet(urlPatterns = { "/trang-chu", "/dang-nhap", "/dang-ky", "/thoat","/dang-tin"})
public class HomeController extends HttpServlet {

	@Inject
	private ILoaiService loaiService;

	@Inject
	private IAccountService accountService;

	private static final long serialVersionUID = 2686801510274002166L;

	ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			String message = request.getParameter("message");
			String alert = request.getParameter("alert");
			if (message != null && alert != null) {
				request.setAttribute("message", resourceBundle.getString(message));
				request.setAttribute("alert", alert);
			}
			RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
			rd.forward(request, response);
		} else if (action != null && action.equals("dangtin")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/dangtin.jsp");
			rd.forward(request, response);
		} else if (action != null && action.equals("logout")) {
			SessionUtil.getInstance().removeValue(request, "ACCOUNTMODEL");
			response.sendRedirect(request.getContextPath() + "/trang-chu");
		} else if (action != null && action.equals("register")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/dangki.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("loai", loaiService.findAll());
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			AccountModel model = FormUtil.toModel(AccountModel.class, request);
			model = accountService.findByTendangnhapAndMatkhauAndTrangthai(model.getTentaikhoan(), model.getMatkhau(),1);
			if (model != null) {
				SessionUtil.getInstance().putValue(request, "ACCOUNTMODEL", model);
				if (model.getRole().getCode().equals("USER")) {
					response.sendRedirect(request.getContextPath() +"/trang-chu");
				} else if (model.getRole().getCode().equals("ADMIN")) {
					response.sendRedirect(request.getContextPath() +"/admin-home");
				}
			} else {
				response.sendRedirect(request.getContextPath() +"/dang-nhap?action=login&message=username_password_invalid&alert=danger");
			}

		}
	}
}
