/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerical;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Cyril
 */
public class CramersRule extends javax.swing.JFrame {

    /**
     * Creates new form CramersRule
     */
    public CramersRule() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_a1 = new javax.swing.JTextField();
        txt_c3 = new javax.swing.JTextField();
        txt_c1 = new javax.swing.JTextField();
        txt_b2 = new javax.swing.JTextField();
        txt_b3 = new javax.swing.JTextField();
        txt_a3 = new javax.swing.JTextField();
        txt_a2 = new javax.swing.JTextField();
        txt_b1 = new javax.swing.JTextField();
        txt_r3 = new javax.swing.JTextField();
        txt_r1 = new javax.swing.JTextField();
        txt_c2 = new javax.swing.JTextField();
        txt_r2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_solve = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_result = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cramer's Rule");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("a");

        txt_a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_a1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_c3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_c3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_c1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_c1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_b2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_b3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_b3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_a3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_a3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_a2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_b1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_r3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_r3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_r1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_r1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_c2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_c2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_r2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_r2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("b");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("c");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("a");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("b");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("a");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("b");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("=");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("=");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("=");

        btn_solve.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_solve.setText("Solve");
        btn_solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solveActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("c");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("c");

        btn_clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        txt_result.setEditable(false);
        txt_result.setColumns(20);
        txt_result.setRows(5);
        jScrollPane1.setViewportView(txt_result);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Result:");

        btn_save.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_save.setText("Save as PDF");
        btn_save.setEnabled(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Cramer's Rule");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_a1)
                                            .addComponent(txt_a2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                        .addComponent(txt_a3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_b2)
                                            .addComponent(txt_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txt_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_c2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel12))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel10)))))
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_r3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_r2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_solve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4)
                            .addComponent(txt_a1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(txt_b1)
                            .addComponent(jLabel2)
                            .addComponent(txt_c1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_solve)
                        .addComponent(txt_r1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_a3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel11)))
                                        .addGap(11, 11, 11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_r2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_r3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel12))))))
                    .addComponent(txt_b3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_solveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solveActionPerformed
        int a1 = Integer.parseInt(txt_a1.getText());
        int b1 = Integer.parseInt(txt_b1.getText());
        int c1 = Integer.parseInt(txt_c1.getText());
        
        int a2 = Integer.parseInt(txt_a2.getText());
        int b2 = Integer.parseInt(txt_b2.getText());
        int c2 = Integer.parseInt(txt_c2.getText());
        
        int a3 = Integer.parseInt(txt_a3.getText());
        int b3 = Integer.parseInt(txt_b3.getText());
        int c3 = Integer.parseInt(txt_c3.getText());
        
        int r1 = Integer.parseInt(txt_r1.getText());
        int r2 = Integer.parseInt(txt_r2.getText());
        int r3 = Integer.parseInt(txt_r3.getText());
        
        int m1=-1;
        int m2=1;
        int m3=-1;
        
        txt_result.setText("");
        
        txt_result.append("Equation: \n");
        
        if (b1>0&&c1>0)
            txt_result.append(a1 + "a +" + b1 + "b +" + c1 + "c = " +r1 + "\n");
        if (b1<0&&c1>0)
            txt_result.append(a1 + "a " + b1 + "b +" + c1 + "c = " +r1 + "\n");        
        if (b1>0&&c1<0)
            txt_result.append(a1 + "a +" + b1 + "b " + c1 + "c = " +r1 + "\n");
        if (b1<0&&c1<0) 
            txt_result.append(a1 + "a " + b1 + "b " + c1 + "c = " +r1 + "\n");
        if (b2>0&&c2>0)
            txt_result.append(a2 + "a +" + b2 + "b +" + c2 + "c = " +r2 + "\n");
        if (b2<0&&c2>0)
            txt_result.append(a2 + "a " + b2 + "b +" + c2 + "c = " +r2 + "\n");
        if (b2>0&&c2<0)
            txt_result.append(a2 + "a +" + b2 + "b " + c2 + "c = " +r2 + "\n");
        if (b2<0&&c2<0)
            txt_result.append(a2 + "a " + b2 + "b " + c2 + "c = " +r2 + "\n");        
        if (b3>0&&c3>0)
            txt_result.append(a3 + "a +" + b3 + "b +" + c3 + "c = " +r3 + "\n\n");
        if (b3<0&&c3>0)
            txt_result.append(a3 + "a " + b3 + "b +" + c3 + "c = " +r3 + "\n\n");
        if (b3>0&&c3<0)
            txt_result.append(a3 + "a +" + b3 + "b " + c3 + "c = " +r3 + "\n\n");
        if (b3<0&&c3<0)
            txt_result.append(a3 + "a " + b3 + "b " + c3 + "c = " +r3 + "\n\n");
//      computation for D
        int dr1=(m1*a2)*((b1*c3)-(b3*c1));
        txt_result.append("Computation for D\n");
        txt_result.append(a1 + "     " + b1 + "     " + c1 + "\n");
        txt_result.append(a2 + "     " + b2 + "     " + c2 + "\n");
        txt_result.append(a3 + "     " + b3 + "     " + c3 + "\n\n");
        txt_result.append("[ " + (m1*a2) + " (" + b1 + ")" + " (" + c3 + ")" + " -" +
                " (" + b3 +")" +" (" + c1 +") ]" + "\n");
        txt_result.append("[ "+(m1*a2)+" (" + (b1*c3) + ") - ("+(b3*c1)+") ]" + "\n");
        txt_result.append("[ "+(m1*a2)+" (" + ((b1*c3)-(b3*c1)) + ") ]" + "\n");
        txt_result.append(dr1 + "\n\n");
        
        int dr2=(m2*b2)*((a1*c3)-(a3*c1));
        txt_result.append(" [ " + (m2*b2) + " (" + a1 + ")" + " (" + c3 + ")" + " -" +
                " (" + a3 +")" +" (" + c1 +") ]" + "\n");
        txt_result.append("[ "+ (m2*b2) +" (" + (a1*c3) + ") - ("+(a3*c1)+") ]" + "\n");
        txt_result.append("[ "+ (m2*b2) +" ("+ ((a1*c3)-(a3*c1)) + ") ]" + "\n");
        txt_result.append(dr2 + "\n\n");
        
        int dr3=(m3*c2)*((a1*b3)-(a3*b1));
        txt_result.append("[ " + (m3*c2) + " (" + a1 + ")" + " (" + b3 + ")" + " -" +
                " (" + a3 +")" +" (" + b1 +") ]" + "\n");
        txt_result.append("[ " + (m3*c2) +" (" + (a1*b3)+") - ("+(a3*b1)+") ]" + "\n");
        txt_result.append("[ " + (m3*c2) +" ("+ ((a1*b3)-(a3*b1)) + ") ]" + "\n");
        txt_result.append(dr3 + "\n\n");
        
        int sumD = dr1+dr2+dr3;
        txt_result.append("(" + dr1 + ")" + " + " + "(" + dr2 + ")" + " + " + "(" + dr3 +")" + "\n");
        txt_result.append("D = " + sumD + "\n\n");
        
//      computation for A
        int ar1=(m1*r2)*((b1*c3)-(b3*c1));
        txt_result.append("Computation for A\n");
        txt_result.append(r1 + "     " + b1 + "     " + c1 + "\n");
        txt_result.append(r2 + "     " + b2 + "     " + c2 + "\n");
        txt_result.append(r3 + "     " + b3 + "     " + c3 + "\n\n");
        txt_result.append("[ " + (m1*r2) + " (" + b1 + ")" + " (" + c3 + ")" + " -" +
                " (" + b3 +")" + " (" + c1 + ") ]" + "\n");
        txt_result.append("[ "+ (m1*r2) +" (" + (b1*c3) + ") - (" + (b3*c1) + ") ]" + "\n");
        txt_result.append("[ "+ (m1*r2) +" (" + ((b1*c3)-(b3*c1)) + ") ]" + "\n");
        txt_result.append(ar1 + "\n\n");
        
        int ar2=(m2*b2)*((r1*c3)-(r3*c1));
        txt_result.append("[ " + (m2*b2) + " (" + r1 + ")" + " (" + c3 + ")" + " -" +
                " (" + r3 +")" +" (" + c1 +") ]" + "\n");
        txt_result.append("[ " + (m2*b2) + " (" + (r1*c3) + ") - ("+(r3*c1)+") ]" + "\n");
        txt_result.append("[ " + (m2*b2) + " (" + ((r1*c3)-(r3*c1)) + ") ]" + "\n");
        txt_result.append(ar2 + "\n\n");
        
        int ar3=(m3*c2)*((r1*b3)-(r3*b1));
        txt_result.append("[ " + (m3*c2) + " (" + r1 + ")" + " (" + b3 + ")" + " -" +
                " (" + r3 +")" +" (" + b1 +") ]" + "\n");
        txt_result.append("[ " + (m3*c2) + " (" + (r1*b3) + ") - ("+(r3*b1)+") ]" + "\n");
        txt_result.append("[ " + (m3*c2) + " (" + ((r1*b3)-(r3*b1)) + ") ]" + "\n");
        txt_result.append(ar3 + "\n\n");
        
        int sumA = ar1+ar2+ar3;
        txt_result.append("(" + ar1 + ")" + " +" + " (" + ar2 + ")" + " +" + " (" + ar3 +")" + "\n");
        txt_result.append(sumA + "/" + sumD + "\n");
        txt_result.append("A = " + sumA/sumD + "\n\n");
               
//      computation for B
        int br1=(m1*a2)*((r1*c3)-(r3*c1));
        txt_result.append("Computation for B\n");
        txt_result.append(a1 + "     " + r1 + "     " + c1 + "\n");
        txt_result.append(a2 + "     " + r2 + "     " + c2 + "\n");
        txt_result.append(a3 + "     " + r3 + "     " + c3 + "\n\n");
        txt_result.append("[ " + (m1*a2) + " (" + r1 + ")" + " (" + c3 + ")" + " -" +
                " (" + r3 +")" +" (" + c1 +") ]" + "\n");
        txt_result.append("[ " + (m1*a2) + " (" + (r1*c3) + ") - ("+(r3*c1)+") ]" + "\n");
        txt_result.append("[ " + (m1*a2)+ " (" + ((r1*c3)-(r3*c1)) + ") ]" + "\n");
        txt_result.append(br1 + "\n\n");
        
        int br2=(m2*r2)*((a1*c3)-(a3*c1));
        txt_result.append("[ " + (m2*r2) + " (" + a1 + ")" + " (" + c3 + ")" + " -" +
                " (" + a3 +")" +" (" + c1 + ") ]"+ "\n");
        txt_result.append("[ " + (m2*r2) + " (" + (a1*c3) + ") - (" + (a3*c1) + ") ]" + "\n");
        txt_result.append("[ " + (m2*r2) + " (" + ((a1*c3)-(a3*c1)) + ") ]" + "\n");
        txt_result.append(br2 + "\n\n");
        
        int br3=(m3*c2)*((a1*r3)-(a3*r1));
        txt_result.append("[ " + (m3*c2) + " (" + a1 + ")" + " (" + r3 + ")" + " -" +
                " (" + a3 +")" +" (" + r1 + ") ]" + "\n");
        txt_result.append("[ " + (m3*c2) + " (" + (a1*r3) + ") - ("+(a3*r1)+") ]" + "\n");
        txt_result.append("[ " + (m3*c2 )+ " (" + ((a1*r3)-(a3*r1)) + ") ]" + "\n");
        txt_result.append(br3 + "\n\n");
        
        int sumB = br1+br2+br3;
        txt_result.append("(" + br1 + ")" + " +" + " (" + br2 + ")" + " +" + " (" + br3 +")" + "\n");
        txt_result.append(sumB + "/" + sumD + "\n");
        txt_result.append("B = " + sumB/sumD + "\n\n");
        
//      computation for C
        int cr1=(m1*a2)*((b1*r3)-(b3*r1));
        txt_result.append("Computation for C\n");
        txt_result.append(a1 + "     " + b1 + "     " + r1 + "\n");
        txt_result.append(a2 + "     " + b2 + "     " + r2 + "\n");
        txt_result.append(a3 + "     " + b3 + "     " + r3 + "\n\n");
        txt_result.append("[ " + (m1*a2) + " (" + b1 + ")" + " (" + r3 + ")" + " -" +
                " (" + a3 + ")" + " (" + r1 +") ]" + "\n");
        txt_result.append("[ " + (m1*a2) + " (" + (b1*r3) + ") - ("+(a3*r1)+") ]" + "\n");
        txt_result.append("[ " + (m1*a2) + " (" + ((b1*r3)-(a3*r1)) + ") ]" + "\n");
        txt_result.append(cr1 + "\n\n");
        
        int cr2=(m2*b2)*((a1*r3)-(a3*r1));
        txt_result.append("[ " + (m2*b2) + " (" + a1 + ")" + " (" + r3 + ")" + " -" +
                " (" + a3 + ")" + " (" + r1 + ") ]" + "\n");
        txt_result.append("[ " + (m2*b2 )+ " (" + (a1*r3) + ") - (" + (a3*r1) + ") ]" + "\n");
        txt_result.append("[ " + (m2*b2) + " (" + ((a1*r3)-(a3*r1)) + ") ]" + "\n");
        txt_result.append(cr2 + "\n\n");
        
        int cr3=(m3*r2)*((a1*b3)-(a3*b1));
        txt_result.append("[ " + (m3*c2) + " (" + a1 + ")" + " (" + b3 + ")" + " -" +
                " (" + a3 + ")" + " (" + b1 +") ]" + "\n");
        txt_result.append("[ "+(m3*c2)+" ("+(a1*b3)+") - ("+(a3*b1)+") ]" + "\n");
        txt_result.append("[ "+(m3*c2)+" ("+ ((a1*b3)-(a3*b1)) + ") ]" + "\n");
        txt_result.append(cr3 + "\n\n");
        
        int sumC = cr1+cr2+cr3;
        txt_result.append("(" + cr1 + ")" + " +" + " (" + cr2 + ")" + " +" + " (" + cr3 +")" + "\n");
        txt_result.append(sumC + "/" + sumD + "\n");
        txt_result.append("C = " + sumC/sumD + "\n");
        
        btn_save.setEnabled(true);
    }//GEN-LAST:event_btn_solveActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        btn_save.setEnabled(false);
        txt_a1.setText("");
        txt_b1.setText("");
        txt_c1.setText("");
        txt_a2.setText("");
        txt_b2.setText("");
        txt_c2.setText("");
        txt_a3.setText("");
        txt_b3.setText("");
        txt_c3.setText("");
        
        txt_r1.setText("");
        txt_r2.setText("");
        txt_r3.setText("");
        
        txt_result.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File("/My Documents"));
        int return_val = jfc.showSaveDialog(rootPane);
        if (return_val == JFileChooser.APPROVE_OPTION) {
            Document doc = new Document();
            try {
                jfc.getSelectedFile();
                PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(jfc.getSelectedFile() + ".pdf"));
                doc.open();
                
                Font f = new Font(Font.FontFamily.TIMES_ROMAN,12.0f,Font.NORMAL,BaseColor.BLACK);
                Font f1 = new Font(Font.FontFamily.TIMES_ROMAN,18.0f,Font.BOLD,BaseColor.BLACK);
                
                Paragraph paragraph = new Paragraph(null, f);
                Paragraph title = new Paragraph(null, f1);
                title.add("Cramers Rule\n");
                
                paragraph.add(txt_result.getText());
                doc.add(title);
                doc.add(paragraph);
                doc.close();
                writer.close();
                
                JOptionPane.showMessageDialog(rootPane, "Successfully saved!");
            } catch (FileNotFoundException | DocumentException | HeadlessException e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

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
            java.util.logging.Logger.getLogger(CramersRule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CramersRule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CramersRule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CramersRule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CramersRule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_solve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_a1;
    private javax.swing.JTextField txt_a2;
    private javax.swing.JTextField txt_a3;
    private javax.swing.JTextField txt_b1;
    private javax.swing.JTextField txt_b2;
    private javax.swing.JTextField txt_b3;
    private javax.swing.JTextField txt_c1;
    private javax.swing.JTextField txt_c2;
    private javax.swing.JTextField txt_c3;
    private javax.swing.JTextField txt_r1;
    private javax.swing.JTextField txt_r2;
    private javax.swing.JTextField txt_r3;
    private javax.swing.JTextArea txt_result;
    // End of variables declaration//GEN-END:variables
}
