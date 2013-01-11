package test.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import test.dao.MemDAO;
import test.dto.MemDTO;

public class ListController implements Controller{
 //MemDAO ��ü�� ���Թޱ� ����
 private MemDAO dao;
 public void setDao(MemDAO dao) {
  this.dao = dao;
 }
 
 @Override
 public ModelAndView handleRequest(HttpServletRequest arg0,
   HttpServletResponse arg1) throws Exception {
  ArrayList<MemDTO> list=dao.getList();
  ModelAndView mv = new ModelAndView();
  //�������� ����
  mv.setViewName("showList");
  //������ �� �����͸� ���
  mv.addObject("list", list);
  //��ü�� �����Ѵ�.
  return mv;
 }

}

