package GUI;

import Controller.QuanLyChatLieuController;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ChatLieuGUI extends javax.swing.JPanel {

      /**
     * Creates new form NhanVienGUI1
     */
    
 
    public ChatLieuGUI() {
        initComponents();
        
        QuanLyChatLieuController controller = new QuanLyChatLieuController( 
                jpnView,btnThem,btnSua, btnXoa,btnCapNhat,
                btnThoat,  jtfTimKiem, btnTimKiem,
                jtfMacl,jtfMaloai,jtfMahang,jtfTenhang,
                jlbThongBao);
        

        controller.setDataToTable();
        controller.setEvent();
    
 
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn1 = new javax.swing.JPanel();
        jtfTimKiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jlbMacl = new javax.swing.JLabel();
        jlbMaloai = new javax.swing.JLabel();
        jlbMahang = new javax.swing.JLabel();
        jlbTenhang = new javax.swing.JLabel();
        jtfMacl = new javax.swing.JTextField();
        jtfMaloai = new javax.swing.JTextField();
        jtfMahang = new javax.swing.JTextField();
        jtfTenhang = new javax.swing.JTextField();
        jlbThongBao = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        jpnView = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1050, 720));

        jpn1.setForeground(java.awt.Color.red);
        jpn1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jpn1.setPreferredSize(new java.awt.Dimension(1050, 720));

        jtfTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jtfTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTimKiemActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(153, 153, 153));
        btnThem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(null);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(153, 153, 153));
        btnSua.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorder(null);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(153, 153, 153));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorder(null);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(153, 153, 153));
        btnCapNhat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setBorder(null);
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(153, 153, 153));
        btnThoat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setBorder(null);

        jlbMacl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlbMacl.setText("Mã chất liệu");
        jlbMacl.setToolTipText("");

        jlbMaloai.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlbMaloai.setText("Mã loại");
        jlbMaloai.setToolTipText("");

        jlbMahang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlbMahang.setText("Mã hàng");
        jlbMahang.setToolTipText("");

        jlbTenhang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlbTenhang.setText("Tên hàng");
        jlbTenhang.setToolTipText("");

        jtfMacl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jtfMacl.setToolTipText("");
        jtfMacl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMaclActionPerformed(evt);
            }
        });

        jtfMaloai.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jtfMaloai.setToolTipText("");

        jtfMahang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jtfMahang.setToolTipText("");

        jtfTenhang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jtfTenhang.setToolTipText("");
        jtfTenhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTenhangActionPerformed(evt);
            }
        });

        jlbThongBao.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlbThongBao.setForeground(java.awt.Color.red);

        btnTimKiem.setBackground(new java.awt.Color(153, 153, 153));
        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setBorder(null);
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jpnView.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách chất liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 0, 51))); // NOI18N
        jpnView.setPreferredSize(new java.awt.Dimension(1350, 500));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpn1Layout = new javax.swing.GroupLayout(jpn1);
        jpn1.setLayout(jpn1Layout);
        jpn1Layout.setHorizontalGroup(
            jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addGroup(jpn1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn1Layout.createSequentialGroup()
                        .addGroup(jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbMahang)
                            .addComponent(jlbMaloai)
                            .addComponent(jlbMacl)
                            .addComponent(jlbTenhang))
                        .addGap(18, 18, 18)
                        .addGroup(jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMaloai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfMacl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfMahang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTenhang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpn1Layout.createSequentialGroup()
                        .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpn1Layout.createSequentialGroup()
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlbThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );
        jpn1Layout.setVerticalGroup(
            jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn1Layout.createSequentialGroup()
                        .addComponent(jlbMacl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jlbMaloai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbMahang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jlbTenhang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn1Layout.createSequentialGroup()
                        .addGroup(jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfTenhang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpn1Layout.createSequentialGroup()
                                .addComponent(jtfMacl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jtfMaloai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfMahang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)))
                        .addGap(18, 18, 18)))
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn1, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed

    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

    }//GEN-LAST:event_btnThemActionPerformed

    private void jtfTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTimKiemActionPerformed

    }//GEN-LAST:event_jtfTimKiemActionPerformed

    private void jtfTenhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTenhangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTenhangActionPerformed

    private void jtfMaclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMaclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMaclActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jlbMacl;
    private javax.swing.JLabel jlbMahang;
    private javax.swing.JLabel jlbMaloai;
    private javax.swing.JLabel jlbTenhang;
    private javax.swing.JLabel jlbThongBao;
    private javax.swing.JPanel jpn1;
    private javax.swing.JPanel jpnView;
    private javax.swing.JTextField jtfMacl;
    private javax.swing.JTextField jtfMahang;
    private javax.swing.JTextField jtfMaloai;
    private javax.swing.JTextField jtfTenhang;
    private javax.swing.JTextField jtfTimKiem;
    // End of variables declaration//GEN-END:variables
}