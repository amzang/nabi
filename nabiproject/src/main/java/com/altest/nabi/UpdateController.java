package test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import test.dao.MemDAO;
import test.dto.MemDTO;

public class UpdateController implements Controller{
 private MemDAO dao;
 public void setDao(MemDAO dao) {
  this.dao = dao;
 }
 @Override
 public ModelAndView handleRequest(HttpServletRequest request,
   HttpServletResponse response) throws Exception {
  //�Ķ���ͷ� �Ѿ�� ȸ����ȣ �о����
  int num = Integer.parseInt(request.getParameter("num"));
  //ȸ�� �Ѹ��� ���� ������
  MemDTO dto = dao.getData(num);
  //�����ڷ� �ʿ��� ������ �Ѱ��ְ� ��ü ������ �Ŀ� ����
  ModelAndView mv = new ModelAndView("updateForm", "dto", dto);
  return mv;
 }
 
 
 
}

