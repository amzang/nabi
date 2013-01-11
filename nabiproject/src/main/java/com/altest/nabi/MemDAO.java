package test.dao;

import java.util.ArrayList;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import test.dto.MemDTO;

/*
 * sqlMapClientTemplate 객체를 부모로부터 받기위해서
 * sqlMapClientDaoSupport 클래스를 상속 받아서 DAO를 만든다.
 * 자동으로 DB와 연결해주고 insert 메소드도 제공해준다.
 */
public class MemDAO extends SqlMapClientDaoSupport{
 //회원정보를 입력하는 메소드
 public void insert(MemDTO dto){
  //필요한 객체를 부모로부터 받아와서 DB에 저장하는 작업을 한다.
  getSqlMapClientTemplate().insert("insert", dto);
 }
 
 public ArrayList<MemDTO> getList(){
  return (ArrayList<MemDTO>)getSqlMapClientTemplate().queryForList("list");
 }
 //회원 한명의 정보를 리턴하는 메소드
 public MemDTO getData(int num){
  
  return (MemDTO)getSqlMapClientTemplate().queryForObject("getData", num);
 }
 //회원 한명의 정보를 업데이트
 public void update(MemDTO dto){
  getSqlMapClientTemplate().update("update", dto);
  
 }
 //회원 한명의 정보를 삭제하는 메소드
 public void delete(int num){
  getSqlMapClientTemplate().delete("delete", num);
  
  
  
 }
}
