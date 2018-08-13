/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import KMeans.KMeans;
import Point.Point;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    private int numP;
    private int numC;
    private Point[] cent;
    private ChartPanel cp;
    private Random r = new Random(System.currentTimeMillis());

    public Main() {
        initComponents(); 
        setTable();
        getContentPane().setBackground(Color.DARK_GRAY);
        setVisible(true);

    }

    private void setTable() {
        DefaultTableModel mdl = new DefaultTableModel();
        String tit[] = {"X", "Y"};
        mdl.setColumnIdentifiers(tit);
        jTable1.setModel(mdl);
    }

    private void setTable(int rows) {
        DefaultTableModel mdl = (DefaultTableModel) jTable1.getModel();
        mdl.setRowCount(rows);
        jTable1.setModel(mdl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        patrones = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        classes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Número de Patrones: ");

        patrones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patronesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número de Clases: ");

        classes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classesActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Atractores:");

        jButton1.setText("Generar Centroides");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 51, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(604, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patrones, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(patrones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(classes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton1)
                .addContainerGap(247, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void classesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classesActionPerformed
        try {
            numC = Integer.parseInt(classes.getText());
            setTable(numC);
            System.out.println(numC);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Solo se admiten números");
        }
    }//GEN-LAST:event_classesActionPerformed

    private void patronesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patronesActionPerformed
        try {
            numP = Integer.parseInt(patrones.getText());
            System.out.println(numP);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Solo se admiten números");
        }
    }//GEN-LAST:event_patronesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        cent = new Point[numC];
        try {
            numP = Integer.parseInt(patrones.getText());
            numC = Integer.parseInt(classes.getText());
            DefaultTableModel mdl = (DefaultTableModel) jTable1.getModel();
            for (int i = 0; i < mdl.getRowCount(); i++) {
                cent[i] = new Point(300+Integer.parseInt("" + mdl.getValueAt(i, 0))
                        , 300-Integer.parseInt("" + mdl.getValueAt(i, 1)));
                cent[i].setColor(new Color(90+r.nextInt(250+1-90),90+r.nextInt(250+1-90), 90+r.nextInt(250+1-90)));
                System.out.println(""+cent[i].getX()+" "+cent[i].getY());
            }
            KMeans km = new KMeans();
            km.configure(numP, cent);
            km.run();
            cp = new ChartPanel(km.getCentroid(), km.getAleatoryPoints());
            cp.setBounds(0, 0, 600, 600);
            add(cp);
            
            cp.updateUI();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Asegusese de configurar la clase KMeans", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        /*Point[] cent = new Point[2];
        try {
            Random r = new Random();
            for (int i = 0; i < 2; i++) {
                cent[i] = new Point(r.nextInt(600),r.nextInt(600));
                cent[i].setColor(new Color(r.nextInt(200), r.nextInt(200), r.nextInt(200)));
            }
            KMeans km = new KMeans();
            km.configure(500, cent);
            km.run();
            jPanel1 = new ChartPanel(km.getCentroid(), km.getAleatoryPoints());
            jPanel1.setBounds(0, 0, 600, 600);
            add(jPanel1);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Asegusese de configurar la clase KMeans", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        new Main();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField classes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField patrones;
    // End of variables declaration//GEN-END:variables
}
