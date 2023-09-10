package javanetwork;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import loginMain.record101_login;
import recordinfoDAO.RecordInfoDAO;
import recordinfoVO.RecordInfoVO;

public class RecordSearch extends JFrame {

	
	private JPanel contentPane;
	public JTextField searchTxt; //////////// DAO�� ���� �Ķ���ͷ� �Ѱ�����ؼ�
	public JTextField buySet;	 //////////// public ���� ����� �Ѵ�.
	public JTextField whoBuy;  //////////// 

	public String cd; // ��� : ������ ���� �̸�
	public int sooBuy;	  // �ϴ� : ������ ���� ����
	public String orderWho;  // �ϴ� : � �����İ� ���� â
	
	public int ddefault; // ���� ���� ����
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					RecordSearch frame = new RecordSearch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public RecordSearch() throws ClassNotFoundException, SQLException {
		
		RecordInfoDAO reDao = new RecordInfoDAO();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 935, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//--------------------- Scroll ������
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(353, 246, 459, 169);
		contentPane.add(scrollPane);
		
		//--------------------- table
		Object record[] = new Object[10]; //----- 10�������� ��µǰ� �ض�� �� (�������� 10�� �̻� ��ġ�� �����Ŷ� ��������)
		String [] field = {"������", "����", "����", "�����", "���"}; //------ ��� ������ ù �� �ʵ�
		DefaultTableModel tableModel = new DefaultTableModel(field, 0);
		table = new JTable(tableModel);
		  
		table.addMouseListener(new MouseAdapter() {
			@Override
				/*////////////////////////////////////////////////////////
				 * table �� Ŭ���� ����
				 */////////////////////////////////////////////////////////
				public void mouseClicked(MouseEvent e) {

				  int row = table.getSelectedRow();
				  int col = table.getSelectedColumn();
//				table.selectAll();
				System.out.println();
				TableModel model = table.getModel();
				((DefaultTableModel) model).setNumRows(0);
				// ���������� �ʱ�ȭ
				System.out.println("���õ� row ::: " + row); // �� �� ���� 2 ���

					  ArrayList<RecordInfoVO> recordArr = null;
					try {
						recordArr = reDao.getAllInfo(cd);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
//						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
//						e1.printStackTrace();
					} 
					  for (int i = 0; i < recordArr.size(); i++) {
					  
							RecordInfoVO vo = recordArr.get(i);
							// 0�ڸ��� ������, 1�ڸ��� ������, 2�ڸ��� ����
							// 3�ڸ��� �����, 4�ڸ��� ������ �־��
							record[0] = vo.getCdName();
							record[1] = vo.getCdOrder();
							record[2] = vo.getCdPrice();
							record[3] = vo.getCdDate();
							record[4] = vo.getCdSoo();
							tableModel.addRow(record);
							  
							System.out.println("$$$$$$$$$  "+vo.getCdOrder()); // �ܼ� Ȯ�ο�
								
						}
					  String str = (String) table.getValueAt(row, 1);
					  whoBuy.setText(str); // --> �ϴ� ������ �̸� �� !!!!!!!
				}
			});/////////////////////////////////////////////////////////
		scrollPane.setViewportView(table);

		//--------------------- CD�� �Է�
		JLabel searchCd = new JLabel("CD \uBA85 \uC785\uB825 : ");
		searchCd.setFont(new Font("����", Font.PLAIN, 15));
		searchCd.setBounds(303, 134, 97, 35);
		contentPane.add(searchCd);
		
		//--------------------- �˻��Է�â
		searchTxt = new JTextField(cd);
		searchTxt.setBounds(402, 134, 286, 35);
		contentPane.add(searchTxt);
		searchTxt.setColumns(10);

		//--------------------- �˻� ��ư
		JButton searchBtn = new JButton("\uAC80\uC0C9");
		searchBtn.addMouseListener(new MouseAdapter() { //////////////////////////////////////////////////////
			@Override
			public void mouseClicked(MouseEvent e) {
				// �˻� ��ư ������ ���� textarea �ʱ�ȭ //////////////////////////////////////
//				table.selectAll();
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.setNumRows(0);
				// ������ ���� �ʱ�ȭ
				
				table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				// �� �ุ ���� �����ϰ� 

				//RecordInfoDAO reDao = new RecordInfoDAO();
				/*//////////////////////////////////////////////////////////////////////
				 * �˻���ư mouseClicked --> �ϴܿ� ���������� ��µǰ� �Ѵ�
				 *//////////////////////////////////////////////////////////////////////
				
				cd = searchTxt.getText(); //--------------------- cd���� �Է� �޴´�..........
				
				System.out.println("ȭ�鿡�� �Է¹��� : " + cd);
				// ����ó��
				if (cd.length() < 2) {
					JOptionPane.showMessageDialog(null,"2�� �̻� �Է����ּ���.", "Error", JOptionPane.ERROR_MESSAGE);
					System.out.println("2�� �̻� �Է����ּ���.");
				} 
				else {// ���Ű� �����Ҷ�

					try {
						// �Ӽ����� ����ִ� VO�� 'recordArr' ���� ����Ʈ�� ������ش�
						// Dao���� ��µǴ� ��� cd(������)���� recordArr�� ����
						// ���ʷ� ���� �ִٸ� ���.......
						// 
						ArrayList <RecordInfoVO> recordArr = reDao.getAllInfo(cd); 
						for(RecordInfoVO imsi : recordArr) {
//							RecordInfoVO vo = recordArr.get(imsi);
							
							record[0] = imsi.getCdName();
							record[1] = imsi.getCdOrder();
							record[2] = imsi.getCdPrice();
							record[3] = imsi.getCdDate();
							record[4] = imsi.getCdSoo();
							tableModel.addRow(record);
							
							}
						} 
						
					 catch (SQLException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
				}
				
				//---------------------------------------------------------------
			}
		});///////////////////////////////////////////////////////////////////////////////////////////////////
		searchBtn.setFont(new Font("����", Font.PLAIN, 18));
		searchBtn.setBounds(693, 133, 119, 37);
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(searchBtn);
		
		//--------------------- ��� ����
		JToolBar header = new JToolBar();
		header.setBounds(68, 98, 114, 91);
		contentPane.add(header);
		//--------------------- ��� ���Ƿΰ�
		JButton musicLogo = new JButton("");
		musicLogo.setIcon(new ImageIcon("D:\\hyeri_java0308\\workspace\\lastdance_JT\\src\\javanetwork\\music.png"));
		header.add(musicLogo);
		
		JToolBar contents = new JToolBar();
		contents.setBounds(122, 265, 177, 150);
		contentPane.add(contents);

		//--------------------- ���� �̹���
		JButton cdLogo = new JButton("");
		contents.add(cdLogo);
		cdLogo.setIcon(new ImageIcon("D:\\hyeri_java0308\\workspace\\lastdance_JT\\src\\javanetwork\\cdLogo.png"));
		
		//--------------------- ���Ź�ư
		
		JButton buyBtn = new JButton("\uAD6C\uB9E4");
		buyBtn.addMouseListener(new MouseAdapter() {//////////////////////////////////////////////////////
			@Override
			public void mouseClicked(MouseEvent e) {

				/*//////////////////////////////////////////////////////////////////////
				 * ���Ź�ư mouseClicked 
				 *//////////////////////////////////////////////////////////////////////

				  int row = table.getSelectedRow();
				  int col = table.getSelectedColumn();

				// ����ó��
				// InputMismatchException : �ڷ��� ����
				try {
					cd = searchTxt.getText();//--------------------- cd�̸��� �Է� �޴´�..........
					sooBuy = Integer.parseInt(buySet.getText()); //--------------------- ������ cd������ �Է� �޴´�..........
					orderWho = whoBuy.getText(); //--------------------- � ���� ��������� �Է� �޴´�..........

				    int soooo = (int) table.getValueAt(row, 4); // db���� �������� �ܿ� ���� ����
				    
					System.out.println("�����Ҷ� ���� : " + cd + " �����ϴ� ���� : " + sooBuy + " �����̸� : " + orderWho + " ::: "+soooo);
					boolean update=false;
					ArrayList <RecordInfoVO> recordArr = reDao.getAllInfo(cd); 
/////////////////////////////////////////////
/////////////////////////////////////////////
					for(RecordInfoVO imsi : recordArr) {
						
						 int firstIndex = 0;
					     int lastIndex = recordArr.size(); // recordArr ��� �� ����

					     
					     
						// 0. 0���� ���� ���� �Է����� ��
						if (sooBuy < 1) {//sooBuy < 1		//1���� ū ���� �Է��� �ּ���.
							JOptionPane.showMessageDialog(null,"1���� ū ���� �Է��� �ּ���.", "Error", JOptionPane.ERROR_MESSAGE);	
							break;
						}
						// 1. ��� ���� �� sooBuy = ����°� // ?? = ��� --> ��� ���� �ɵ�..?
						else if(soooo <= 0) {
							JOptionPane.showMessageDialog(null,"��� �����ϴ�.", "Error", JOptionPane.ERROR_MESSAGE);
							break;
						}
						// 2. ���ż����� ����� ���� ��
						else if(sooBuy > soooo) {
							JOptionPane.showMessageDialog(null,"���� �������� ��� �����ϴ�.", "Error", JOptionPane.ERROR_MESSAGE);
							break;
						}
						// 4. ������ ��ġ == ���ſϷ�
						else if(table.getValueAt(row, 1).equals(orderWho)){
							
							update = reDao.update_soo(sooBuy, cd, orderWho); // ���ż���, ������, ������
							if(update) {
								JOptionPane.showMessageDialog(null,"���� ����");
							}
							break;
						}
//						// 4. ������ ����ġ
						else if(!table.getValueAt(row, 1).equals(orderWho)){
							JOptionPane.showMessageDialog(null,"������ ����ġ", "Error", JOptionPane.ERROR_MESSAGE);
							break;
						}
							
/////////////////////////////////////////////
//						System.out.println("ù��°��~  "+firstIndex);
//
//						System.out.println("������°��~  "+lastIndex);
/////////////////////////////////////////////
					}
				}
				//�ڷ��� ����
				catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null,"�ùٸ� ��ġ�� �Է����ּ���!", "Error", JOptionPane.ERROR_MESSAGE);	
				}
			}
		});
		
		buyBtn.setFont(new Font("����", Font.PLAIN, 15));
		buyBtn.setBounds(715, 433, 97, 35);
		contentPane.add(buyBtn);

		//--------------------- ���� �� �Է�â
		whoBuy = new JTextField();
		whoBuy.setText("\uAC00\uC218\uBA85 \uC785\uB825");
		whoBuy.setColumns(10);
		whoBuy.setBounds(503, 433, 97, 35);
		contentPane.add(whoBuy);

		//--------------------- ���ż����Է�â
		buySet = new JTextField();
		buySet.setText("\uAD6C\uB9E4\uC218\uB7C9 \uC785\uB825");
		buySet.setBounds(605, 433, 97, 35);
		contentPane.add(buySet);
		buySet.setColumns(10);

		//--------------------- �α׾ƿ� ��ư
		JButton logoutBtn = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logoutBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "�α׾ƿ��մϴ�.");
				dispose();
				setVisible(false);
				try {
					new record101_login().setVisible(true);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				new clientsrcMain/* �α���ȭ�� */().setVisible(true);
			}
		});
		logoutBtn.setFont(new Font("����", Font.PLAIN, 12));
		logoutBtn.setBounds(715, 76, 97, 23);
		contentPane.add(logoutBtn);
		
	}
}
