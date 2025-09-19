package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import vo.MemberVO;

public class MemberDAO {
//	연결
	Connection connection;
	
//	쿼리 실행
	PreparedStatement preparedStatement;
	
//	결과
	ResultSet resultSet;
	
//	4. 로그인시 공용 저장소 세션
	public static Long session;
	
//	1) 아이디 중복검사
	public boolean checkId(String memberEmail) {
//		연결
		connection = DBConnector.getConnect();
		
//		쿼리를 작성한다
//		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_EMAIL = \'" + memberEmail + "\'";
//		preparedStatement()
		String query = "SELECT ID, MEMBER_NAME FROM TBL_MEMBER WHERE MEMBER_EMAIL = ?";
		boolean check = false;
		
//		쿼리를 보낸다
//		쿼리는 try/catch를 강제한다
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberEmail);
//			결과가 있으면 .executeQuery()
//			결과가 없으면 .executeUpdate()
//			데이터를 받는다(VO)
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			Long id = resultSet.getLong(1);
			String memberName = resultSet.getString(2);
			System.out.println(id);
			System.out.println(memberName);
			
		} catch (SQLException e) {
//			못찾았으면 check = true
			check = true;
			System.out.println("checkId(String) Query문 오류");
			
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.err.println("리소스 해제 시 오류!");
				e.printStackTrace();
			}
		}
//		리턴
		return check;
	}
	
//  회원가입
  public void join(MemberVO memberVO) {
//     연결
     connection = DBConnector.getConnect();
//     쿼리 작성
     String query = "INSERT INTO TBL_MEMBER "
           + "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?, ?, ?)";
     
//     쿼리 담고
     try {
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, memberVO.getMemberEmail());
        preparedStatement.setString(2, memberVO.getMemberPassword());
        preparedStatement.setString(3, memberVO.getMemberName());
        preparedStatement.setInt(4, memberVO.getMemberAge());
        preparedStatement.setString(5, memberVO.getMemberAddress());
        
//        쿼리 실행
        preparedStatement.executeUpdate();
        
     } catch (SQLException e) {
        System.out.println("join(memberVO) query문 오류");
        e.printStackTrace();
     } finally {
//        리턴 없으면 리소스 해제
        try {
           if(preparedStatement != null) {
              preparedStatement.close();
           }
           if(connection != null) {
              connection.close();
           }
           
        } catch (SQLException e) {
           System.out.println("리소스 해제 오류");
           e.printStackTrace();
        }
     }
  }
  
//  로그인
  public boolean login(MemberVO memberVO) {
//	  연결
	  connection = DBConnector.getConnect();
//	  ID check
	  String query = "SELECT ID, MEMBER_NAME FROM TBL_MEMBER WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";
	  boolean isLogin = true;
	  
	  try {
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, memberVO.getMemberEmail());
		preparedStatement.setString(2, memberVO.getMemberPassword());
		
		resultSet = preparedStatement.executeQuery();
		
		resultSet.next();
		
		session = resultSet.getLong(1);
		
	} catch (SQLException e) {
		isLogin = false;
		e.printStackTrace();
	}finally {
		try {
			if(resultSet != null) {
				resultSet.close();
			}
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	  PW check
	  
//	  일치하면 로그인
	  return isLogin;
  }
  
//  마이페이지
  public Optional<MemberVO> findById() {
	  String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_AGE, MEMBER_ADDRESS " 
			  + "FROM TBL_MEMBER WHERE ID = ?";
	  
	  connection = DBConnector.getConnect();
	  
	  MemberVO memberVO = new MemberVO();
	  
	  try {
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setLong(1, session);
		
		resultSet = preparedStatement.executeQuery();
		resultSet.next();
		
		memberVO.setId(resultSet.getLong("ID"));
		memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
		memberVO.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
		memberVO.setMemberName(resultSet.getString("MEMBER_NAME"));
		memberVO.setMemberAge(resultSet.getInt("MEMBER_AGE"));
		memberVO.setMemberAddress(resultSet.getString("MEMBER_ADDRESS"));
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(resultSet != null) {
				resultSet.close();
			}
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	  return Optional.ofNullable(memberVO);
  }
  
//	로그아웃
  public void logout() {
//	  id = null
//	  session = null
	  session = null;
  }
  
//  비밂번호 변경
  public void changePassword(String password) {
	  connection = DBConnector.getConnect();
	  
	  String query = "UPDATE TBL_MEMBER " 
			  + "SET MEMBER_PASSWORD = ? " 
			  + "WHERE ID = ?";
	  
	  MemberVO memberVO = new MemberVO();
	  
	  try {
		preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, password);
		preparedStatement.setLong(2, session);
		
		memberVO.setMemberPassword(password);		
		
		preparedStatement.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
  }
  public boolean changePassword(MemberVO memberVO, String password) {
	  connection = DBConnector.getConnect();
	  
	  boolean check = true;
	  
	  String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";
	  String updateQuery = "UPDATE TBL_MEMBER SET MEMBER_PASSWORD = ? WHERE ID = ?";
	  try {
		preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, memberVO.getMemberEmail());
		preparedStatement.setString(2, memberVO.getMemberPassword());
		
		resultSet = preparedStatement.executeQuery();
		resultSet.next();
		Long foundId = resultSet.getLong("ID");
		
		preparedStatement = connection.prepareStatement(updateQuery);
		preparedStatement.setString(1, password);
		preparedStatement.setLong(2, memberVO.getId());
		
		preparedStatement.executeUpdate();
		
	} catch (SQLException e) {
		check = false;
		e.printStackTrace();
	}
	  
	  return check;
  }
  
//  회원정보 수정
  public void changeInfo(MemberVO memberVO) {
	  connection = DBConnector.getConnect();
	  
	  String query = "UPDATE TBL_MEMBER"
			  + "SET MEMBER_NAME = ? ,MEMBER_AGE = ? ,MEMBER_ADDRESS = ? "
			  + "WHERE ID = ?";
	  try {
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, memberVO.getMemberName());
		preparedStatement.setInt(2, memberVO.getMemberAge());
		preparedStatement.setString(3, memberVO.getMemberAddress());
		preparedStatement.setLong(4, session);
		
		preparedStatement.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
  }

//  회원 탈퇴
//  테이블에서 정보는 빠지면안되지만 
//  회원이지 않게 만들어야함
  public void unregister() {
	  connection = DBConnector.getConnect();
	  
	  String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";
	  
	  try {
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setLong(1, session);
		
		preparedStatement.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
  }
}
