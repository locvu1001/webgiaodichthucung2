package com.laptrinhjavaweb.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjavaweb.model.AccountModel;
import com.laptrinhjavaweb.model.PetModel;
import com.laptrinhjavaweb.service.IPetService;
import com.laptrinhjavaweb.utils.HttpUtil;
import com.laptrinhjavaweb.utils.SessionUtil;

@WebServlet(urlPatterns = {"/api-admin-new"})
public class NewAPI extends HttpServlet {
	
	private static final long serialVersionUID = -8657438797497742570L;
	@Inject
	private IPetService newService;


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		PetModel newModel =  HttpUtil.of(request.getReader()).toModel(PetModel.class);
		newModel.setCreatedBy(((AccountModel) SessionUtil.getInstance().getValue(request, "ACCOUNTMODEL")).getTentaikhoan());
		newModel = newService.save(newModel);
		mapper.writeValue(response.getOutputStream(), newModel);
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		PetModel updateNew =  HttpUtil.of(request.getReader()).toModel(PetModel.class);
		updateNew.setModifiedBy(((AccountModel) SessionUtil.getInstance().getValue(request, "ACCOUNTMODEL")).getTentaikhoan());
		updateNew = newService.update(updateNew);
		mapper.writeValue(response.getOutputStream(), updateNew);
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		PetModel newModel =  HttpUtil.of(request.getReader()).toModel(PetModel.class);
		newService.delete(newModel.getIds());
		mapper.writeValue(response.getOutputStream(), "{}");
	}
}
