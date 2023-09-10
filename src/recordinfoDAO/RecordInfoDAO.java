package recordinfoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import record101DBConn.Record101DBConn;
//import recordinfoDBConn.RecordInfoDBConn;
import recordinfoVO.RecordInfoVO;

public class RecordInfoDAO {
	
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs1 = null;
	//-----------------------
	
	public RecordInfoDAO() throws ClassNotFoundException, SQLException {
		con = new Record101DBConn().getConnection();
	} // DAO-������-end
	

	//��ü ���-----------------------
	// db�� �ִ� ���� ���� ��� ArrayList�� ���� ��
	public ArrayList <RecordInfoVO> getAllInfo(String word) throws SQLException, ClassNotFoundException {
		// RecordSearch���� cd = searchTxt.getText(); �Է¹��� ������ �̸��� �Ķ���ͷ�~
		//  getAllInfo(String word) ���ڷ� �޴´�
		
		// RecordSearch.java > getAllInfo(cd)
		// --------> RecordInfoDAO.java > getAllInfo(String word)
		
		ArrayList<RecordInfoVO> recordArr = new ArrayList<RecordInfoVO>();
		// recordArr ��ü�� RecordInfoVO�� ��� �Ӽ��� ��´�
		
		String sql = "select * from RECORD101"
				+ " where lower(cd_name) like '%' ||?|| '%'";

		////////////////////////////////////////////////////////////////////////
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, word); // word == ������ �̸�
		rs1 = pstmt.executeQuery(); // ��¸� executeQuery ******** 1) ��ü ������ DB�ȿ� �ִ´�
		
		System.out.println("ȭ�鿡�� �Է¹޾� DAO ���� �Ѱ��ִ� �� : "+ word);
		

		while (rs1.next()) { // 2) rs1�� ���� �ִ� ����~ DB�ȿ��� ���� �ϳ��� ������ 
			
			String cdName = rs1.getString("cd_name");
			String cdOrder = rs1.getString("cd_order");
			String cdPrice = rs1.getString("cd_price");
			String cdDate = rs1.getString("cd_date");
			int cdSoo = rs1.getInt("cd_soo");
			
			// db�� �� ������ Ȯ��
			System.out.println( "DB�� ���� �� : " + 
					cdName + "\t" + cdOrder + "\t" + cdPrice  + "\t" + cdDate  + "\t" + cdSoo);
			
			RecordInfoVO record = new RecordInfoVO(cdName, cdOrder, cdPrice, cdDate, cdSoo); 
			// 3) record��ü �ȿ� 5������ �ʱ�ġ�� �־� RecordInfoVO�� ���ڰ� �ִ� �����ڷ� ����
			
			recordArr.add(record); // 4) record��ü(1���� ����)�� recordArr ����Ʈ�ȿ� �ִ´�
							 // 5) DB���� ������ �� �Ҷ� ���� �� �۾��� �ݺ��Ѵ�
							 //		ex) 100���̸� 100���� �۾��� ����Ʈ���� 100���� ������ ���� �ȴ�
		}

		return recordArr; // recordArr�� �Ѱ��ش�
		
	}	//��ü ���-end -----------------------

	
	//-- update : ���� --------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------------------
	
	public boolean update_soo (int soo, String word, String singer) {
		// 											�ܿ� ���� - ������ ���� = ������Ʈ!
		String sql = "update RECORD101 set cd_soo = cd_soo - ?"
				+ " where lower(cd_name) like '%' ||lower(?)|| '%'"
				+ " and lower(cd_order) like '%' ||lower(?)|| '%'";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, soo);
			pstmt.setString(2, word);
			pstmt.setString(3, singer);
			
			pstmt.executeUpdate(); // DB�� ���� ���
			
		} catch (SQLException e) {
			System.out.println("update error");
			return false;
		}		
		
		// error�� �ȳ��� true�� �ѱ� : boolen ���� �޼��带 ������ָ� return true/false �ʼ�
		return true;
	} // update-end
	

	//-- ã�ƶ�  --------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------------

	public boolean find_order (String singer) {
		// 											
		String sql = "select cd_order, count(*)"
				+ " from RECORD101"
				+ " where  lower(cd_order) like '%' ||lower(?)|| '%' group by cd_order";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, singer); // cd == ������ �̸�

			System.out.println( "DB�� ���� �� : " + 
					singer + "\t" );
			String no = "0";
			// ������ cnt ������ 0�̸� false �� �����ϴµ�..
			if(sql==no) {
				return false;
			}
			
			
			rs1 = pstmt.executeQuery(); // ��¸� executeQuery
			
			
			
			

			
			// 
		} catch (SQLException e) {
			System.out.println("find error");
			return false;
		}		
		
		// error�� �ȳ��� true�� �ѱ� : boolen ���� �޼��带 ������ָ� return true/false �ʼ�
		return true;
	} // update-end
	
	
	
	
	
	
	
	

} // RecordInfoDAO-end
