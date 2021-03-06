/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vuvantu
 */
public class System_QLDanhSach extends javax.swing.JFrame implements Runnable{
    
    private QLDanhSachInterface qldsi;
    private String path="sinhVien.txt";
    /**
     * Creates new form System_QLDanhSach
     */
    public System_QLDanhSach() {
        initComponents();
        setLocationRelativeTo(null);
        this.reSet();
        qldsi = new QLDanhSach();
        this.showTable();
        
        Thread t=new Thread(this);
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtNapTien = new javax.swing.JTextField();
        radioNam = new javax.swing.JRadioButton();
        radioNu = new javax.swing.JRadioButton();
        cbQueQuan = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnDocFile = new javax.swing.JButton();
        btnLammoi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lbTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        tblSinhVien.setForeground(new java.awt.Color(204, 204, 0));
        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Họ Tên", "Giới Tính", "Quê Quán", "Địa Chỉ", "Số Dư"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 255));
        jLabel1.setText("Quản Lý Sinh Viên");

        jLabel2.setText("Họ Tên:");

        jLabel3.setText("Mã Sinh Viên:");

        jLabel4.setText("Giới Tính:");

        jLabel5.setText("Quê Quán:");

        jLabel6.setText("Địa Chỉ:");

        jLabel7.setText("Nạp Tiền:");

        txtNapTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNapTienActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioNam);
        radioNam.setText("Nam");

        buttonGroup1.add(radioNu);
        radioNu.setText("Nữ");

        cbQueQuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thành phố Hà Nội", "Thành phố Hồ Chí Minh", "Tỉnh An Giang", "Tỉnh Bà Rịa - Vũng Tàu", "Tỉnh Bạc Liêu", "Tỉnh Bắc Giang", "Tỉnh Bắc Kạn", "Tỉnh Bắc Ninh", "Tỉnh Bến Tre", "Tỉnh Bình Dương", "Tỉnh Bình Định", "Tỉnh Bình Phước", "Tỉnh Bình Thuận", "Tỉnh Cao Bằng", "Tỉnh Cà Mau", "Thành phố Cần Thơ", "Thành phố Hải Phòng", "Thành phố Đà Nẵng", "Tỉnh Gia Lai", "Tỉnh Hòa Bình", "Tỉnh Hà Giang", "Tỉnh Hà Nam", "Tỉnh Hà Tĩnh", "Tỉnh Hưng Yên", "Tỉnh Hải Dương", "Tỉnh Hậu Giang", "Tỉnh Điện Biên", "Tỉnh Đắk Lắk", "Tỉnh Đắk Nông", "Tỉnh Đồng Nai", "Tỉnh Đồng Tháp", "Tỉnh Khánh Hòa", "Tỉnh Kiên Giang", "Tỉnh Kon Tum", "Tỉnh Lai Châu", "Tỉnh Long An", "Tỉnh Lào Cai", "Tỉnh Lâm Đồng", "Tỉnh Lạng Sơn", "Tỉnh Nam Định", "Tỉnh Nghệ An", "Tỉnh Ninh Bình", "Tỉnh Ninh Thuận", "Tỉnh Phú Thọ", "Tỉnh Phú Yên", "Tỉnh Quảng Bình", "Tỉnh Quảng Nam", "Tỉnh Quảng Ngãi", "Tỉnh Quảng Ninh", "Tỉnh Quảng Trị", "Tỉnh Sóc Trăng", "Tỉnh Sơn La", "Tỉnh Thanh Hóa", "Tỉnh Thái Bình", "Tỉnh Thái Nguyên", "Tỉnh Thừa Thiên - Huế", "Tỉnh Tiền Giang", "Tỉnh Trà Vinh", "Tỉnh Tuyên Quang", "Tỉnh Tây Ninh", "Tỉnh Vĩnh Long", "Tỉnh Vĩnh Phúc", "Tỉnh Yên Bá" }));
        cbQueQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQueQuanActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnDocFile.setText("Đọc");
        btnDocFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocFileActionPerformed(evt);
            }
        });

        btnLammoi.setText("Làm Mới");
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lbTime.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lbTime.setText("00:00:00 AM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNapTien, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioNu))
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDocFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLammoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTime)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioNam)
                    .addComponent(radioNu)
                    .addComponent(btnXoa))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cbQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDocFile))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLammoi))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnThoat))))
                    .addComponent(txtNapTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbQueQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQueQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbQueQuanActionPerformed

    private void txtNapTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNapTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNapTienActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        // TODO add your handling code here:
        this.reSet();
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String ma = this.txtMa.getText();
        String hoTen = this.txtHoTen.getText();
        String gioiTinh = "";
        String queQuan = this.cbQueQuan.getSelectedItem().toString();
        String diaChi = this.txtDiachi.getText();
        String napTien = this.txtNapTien.getText();
        
        if (ma.length() != 0 && hoTen.length() != 0 && diaChi.length() != 0 && napTien.length() != 0) {
            try {
                Double napTienDouble = Double.parseDouble(napTien);
                this.txtNapTien.setBackground(Color.white);
                if (radioNam.isSelected() == true) {
                    gioiTinh = "Nam";
                } else {
                    gioiTinh = "Nữ";
                }
                SinhVien sinhVien = new SinhVien(hoTen, gioiTinh, queQuan, diaChi, ma, napTienDouble);
                this.qldsi.insert(sinhVien);
                this.showTable();
                this.reSet();
                JOptionPane.showMessageDialog(this, "Thêm Thành Công");
                
            } catch (NumberFormatException e) {
                e.printStackTrace();
                this.txtNapTien.setBackground(Color.yellow);
                JOptionPane.showMessageDialog(this, "Nhập sai định dang tiền!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        // TODO add your handling code here:
        this.showDetail();
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int row = this.tblSinhVien.getSelectedRow();
        String ma = this.txtMa.getText();
        String hoTen = this.txtHoTen.getText();
        String gioiTinh = "";
        String queQuan = this.cbQueQuan.getSelectedItem().toString();
        String diaChi = this.txtDiachi.getText();
        String napTien = this.txtNapTien.getText();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn bên dưới bảng để cập nhật mới!");
            return;
        }
        
        if (ma.length() != 0 && hoTen.length() != 0 && diaChi.length() != 0 && napTien.length() != 0) {
            try {
                Double napTienDouble = Double.parseDouble(napTien);
                this.txtNapTien.setBackground(Color.white);
                if (radioNam.isSelected() == true) {
                    gioiTinh = "Nam";
                } else {
                    gioiTinh = "Nữ";
                }
                SinhVien sinhVien = new SinhVien(hoTen, gioiTinh, queQuan, diaChi, ma, napTienDouble);
                this.qldsi.update(row, sinhVien);
                this.showTable();
                this.reSet();
                JOptionPane.showMessageDialog(this, "Sửa Thành Công");
                
            } catch (NumberFormatException e) {
                e.printStackTrace();
                this.txtNapTien.setBackground(Color.yellow);
                JOptionPane.showMessageDialog(this, "Nhập sai định dang tiền!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = this.tblSinhVien.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn bên dưới bảng để xoá bản ghi!");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá bạn ghi này không??");
        System.out.println(confirm);
        if (confirm == JOptionPane.YES_OPTION) {
            this.qldsi.delete(row);
            this.showTable();
            this.reSet();
            JOptionPane.showMessageDialog(this, "Xoá thành công!");
        } else if (confirm == JOptionPane.NO_OPTION) {
            
        } else if (confirm == JOptionPane.CANCEL_OPTION) {
            
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát chương chình này không??");
        System.out.println(confirm);
        if (confirm == JOptionPane.YES_OPTION) {
            XFile.XFile.writeFile(path, this.qldsi.getList());
            System.exit(0);
            JOptionPane.showMessageDialog(this, "Lưu vào bản ghi thành công!");
        } else if (confirm == JOptionPane.NO_OPTION) {
            
        } else if (confirm == JOptionPane.CANCEL_OPTION) {
            
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocFileActionPerformed
        // TODO add your handling code here:
        this.qldsi.setList((List<Nguoi>)XFile.XFile.readFile(path));
        this.showTable();
        JOptionPane.showMessageDialog(this, "Đọc File thành công");
    }//GEN-LAST:event_btnDocFileActionPerformed
    
    public void reSet() {
        this.txtMa.setText("");
        this.txtHoTen.setText("");
        this.radioNam.setSelected(true);
        this.cbQueQuan.setSelectedIndex(0);
        this.txtNapTien.setText("");
        this.txtDiachi.setText("");
    }
    
    public void showTable() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblSinhVien.getModel();
        
        dtm.setRowCount(0);
        
        List<Nguoi> listSinhvien = this.qldsi.getList();
        
        for (int i = 0; i < listSinhvien.size(); i++) {
            SinhVien sinhVien = (SinhVien) listSinhvien.get(i);
            
            Object[] o = new Object[]{
                sinhVien.getMaSV(),
                sinhVien.getHoTen(),
                sinhVien.getGioiTinh(),
                sinhVien.getQueQuan(),
                sinhVien.getDiaChi(),
                sinhVien.getNapTien()
            };
            dtm.addRow(o);
        }
        
    }
    
    public void showDetail() {
        int row = this.tblSinhVien.getSelectedRow();
        if (row == -1) {
            return;
        }
        String ma = this.tblSinhVien.getValueAt(row, 0).toString();
        String hoTen = this.tblSinhVien.getValueAt(row, 1).toString();
        String gioiTinh = this.tblSinhVien.getValueAt(row, 2).toString();
        String queQuan = this.tblSinhVien.getValueAt(row, 3).toString();
        String diaChi = this.tblSinhVien.getValueAt(row, 4).toString();
        String sodu = this.tblSinhVien.getValueAt(row, 5).toString();
        
        if (gioiTinh.equals("Nam")) {
            this.radioNam.setSelected(true);
        } else {
            this.radioNu.setSelected(true);
        }
        this.txtMa.setText(ma);
        this.txtHoTen.setText(hoTen);
        this.cbQueQuan.setSelectedItem(queQuan);
        this.txtDiachi.setText(diaChi);
        this.txtNapTien.setText(sodu);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(System_QLDanhSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(System_QLDanhSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(System_QLDanhSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(System_QLDanhSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new System_QLDanhSach().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocFile;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbQueQuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTime;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNapTien;
    // End of variables declaration//GEN-END:variables
    private void showTime(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat();
        sdf.applyPattern("hh:mm:ss aa");
        String time=sdf.format(date);
        this.lbTime.setText(time);
    }
    @Override
    public void run() {
        while (true) {            
            this.showTime();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
