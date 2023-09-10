package adminUpdateDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import adminUpdateVO.AdminUpdateVO;
import record101DBConn.Record101DBConn;

public class AdminUpdateDAO {

	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Statement st = null;

	public AdminUpdateDAO() {
		try {
			con = new Record101DBConn().getConnection();
		} catch (Exception e) {
		}
	}

	public boolean cd_insert(String cdName, String cdOrder, int cdPrice, String cdDate, int cdSoo) {
																	// ����
		String sql = "insert into RECORD101 values(?, ?, ?, ?, ?)";

		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, cdName);
			pstmt.setString(2, cdOrder);
			pstmt.setInt(3, cdPrice);
			pstmt.setString(4, cdDate);
			pstmt.setInt(5, cdSoo);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("insertion error");
			return false;
		}

		return true;
	}// cd_insert-end

	public boolean cd_update(int updateSoo, String cdName) { // �̸� �˻����� ���� ����

		String sql = "update RECORD101 set cd_soo = ?" + " where lower(cd_name) = lower(?)";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, updateSoo);
			pstmt.setString(2, cdName);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("���� �߻�");
			return false;
		}
		return true;

	}// cd_update-end

	public boolean cd_delete(String cdName) {	// ����
		String sql = "delete from RECORD101 where lower(cd_name) = lower(?)";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, cdName);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("delete error");
			return false;
		}

		return true;
	}// cd_delete-end

	

	// ����or���� �˻����� ��� ����
	public ArrayList <AdminUpdateVO> searchEnbans(String cdname, String cdorder) throws SQLException, ClassNotFoundException {
		ArrayList <AdminUpdateVO> nArray = new ArrayList<AdminUpdateVO>();
		
		String sql = "select * from RECORD101"
				+ " where lower(cd_name) like '%' ||lower(?)|| '%'"
				+ " or lower(cd_order) like '%' ||lower(?)|| '%'";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, cdname);
		pstmt.setString(2, cdorder);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String cdName = rs.getString("cd_name");
			String cdOrder = rs.getString("cd_order");
			int cdPrice = rs.getInt("cd_price");
			String cdDate = rs.getString("cd_date");
			int cdSoo = rs.getInt("cd_soo");

			
			AdminUpdateVO auvo = new AdminUpdateVO(cdName, cdOrder, cdPrice, cdDate, cdSoo);
			nArray.add(auvo);
		}
		return nArray;
		
	}
	
	public ArrayList <AdminUpdateVO> getAllInfo() throws SQLException, ClassNotFoundException {
		ArrayList <AdminUpdateVO> infoArray = new ArrayList<AdminUpdateVO>();
		
		String sql = "select * from RECORD101";
		
		st = con.createStatement();
		rs = st.executeQuery(sql);
		
		while(rs.next()) {
			String cdName = rs.getString("cd_name");
			String cdOrder = rs.getString("cd_order");
			int cdPrice = rs.getInt("cd_price");
			String cdDate = rs.getString("cd_date");
			int cdSoo = rs.getInt("cd_soo");
			
			AdminUpdateVO info = new AdminUpdateVO(cdName, cdOrder, cdPrice, cdDate, cdSoo);
			infoArray.add(info);
		}
		
		return infoArray;
	}
	
	


}
