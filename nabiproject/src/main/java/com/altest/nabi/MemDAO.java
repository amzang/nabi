package test.dao;

import java.util.ArrayList;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import test.dto.MemDTO;

/*
 * sqlMapClientTemplate ��ü�� �θ�κ��� �ޱ����ؼ�
 * sqlMapClientDaoSupport Ŭ������ ��� �޾Ƽ� DAO�� �����.
 * �ڵ����� DB�� �������ְ� insert �޼ҵ嵵 �������ش�.
 */
public class MemDAO extends SqlMapClientDaoSupport{
 //ȸ�������� �Է��ϴ� �޼ҵ�
 public void insert(MemDTO dto){
  //�ʿ��� ��ü�� �θ�κ��� �޾ƿͼ� DB�� �����ϴ� �۾��� �Ѵ�.
  getSqlMapClientTemplate().insert("insert", dto);
 }
 
 public ArrayList<MemDTO> getList(){
  return (ArrayList<MemDTO>)getSqlMapClientTemplate().queryForList("list");
 }
 //ȸ�� �Ѹ��� ������ �����ϴ� �޼ҵ�
 public MemDTO getData(int num){
  
  return (MemDTO)getSqlMapClientTemplate().queryForObject("getData", num);
 }
 //ȸ�� �Ѹ��� ������ ������Ʈ
 public void update(MemDTO dto){
  getSqlMapClientTemplate().update("update", dto);
  
 }
 //ȸ�� �Ѹ��� ������ �����ϴ� �޼ҵ�
 public void delete(int num){
  getSqlMapClientTemplate().delete("delete", num);
  
  
  
 }
}
