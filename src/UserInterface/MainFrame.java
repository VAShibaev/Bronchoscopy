/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import javaapplication4.*;

import java.awt.*;

/**
 *
 * @author Dima
 */
public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
    }
    
    String path = "";
    Boolean language = false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<String>();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jButtonBuild = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonDelete = new javax.swing.JButton();
        jLabelLoad = new javax.swing.JLabel();
        jLabelPath = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSettings = new javax.swing.JMenu();
        MenuItemChangeLanguage = new javax.swing.JMenuItem();
        jMenuProgram = new javax.swing.JMenu();
        jMenuItemBuildModel = new javax.swing.JMenuItem();
        jMenuItemClear = new javax.swing.JMenuItem();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 450));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iLungHelper v2.0");

        jButtonBuild.setText("Start work");
        jButtonBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuildActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 450));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButtonDelete.setText("Delete model");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabelLoad.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabelLoad.setText("Loaded model:");

        jLabelPath.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabelPath.setText("nothing uploaded");

        jMenuSettings.setText("Settings");

        MenuItemChangeLanguage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK));
        MenuItemChangeLanguage.setText("Сhange language");
        MenuItemChangeLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemChangeLanguageActionPerformed(evt);
            }
        });
        jMenuSettings.add(MenuItemChangeLanguage);

        jMenuBar1.add(jMenuSettings);

        jMenuProgram.setText("Program");

        jMenuItemBuildModel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemBuildModel.setText("Build Model");
        jMenuItemBuildModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuildModelActionPerformed(evt);
            }
        });
        jMenuProgram.add(jMenuItemBuildModel);

        jMenuItemClear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemClear.setText("Clear ");
        jMenuItemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClearActionPerformed(evt);
            }
        });
        jMenuProgram.add(jMenuItemClear);

        jMenuBar1.add(jMenuProgram);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLoad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPath)
                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuild)
                    .addComponent(jButtonDelete)
                    .addComponent(jLabelLoad)
                    .addComponent(jLabelPath))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuildActionPerformed
        BuildModel();
    }//GEN-LAST:event_jButtonBuildActionPerformed

    private void jMenuItemBuildModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuildModelActionPerformed
        BuildModel();
    }//GEN-LAST:event_jMenuItemBuildModelActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        ClearModel();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jMenuItemClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClearActionPerformed
        ClearModel();
    }//GEN-LAST:event_jMenuItemClearActionPerformed

    private void MenuItemChangeLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemChangeLanguageActionPerformed
        //изменить язык
        Translater();
    }//GEN-LAST:event_MenuItemChangeLanguageActionPerformed

    private void Translater()
    {
        if(!language){
            MenuItemChangeLanguage.setText("Изменить язык");
            jButtonBuild.setText("Начать работу");
            jButtonDelete.setText("Очистить ");
            jLabelLoad.setText("Загруженная модель : ");
            jMenuItemBuildModel.setText("Построить модель");
            jMenuItemClear.setText("Очистить");
            jMenuProgram.setText("Программа");
            jMenuSettings.setText("Настройки");
            UpdatePathLabel();
            language = true;
        }
        else{
            MenuItemChangeLanguage.setText("Change language");
            jButtonBuild.setText("Start work");
            jButtonDelete.setText("Clean");
            jLabelLoad.setText("Loaded model: ");
            jMenuItemBuildModel.setText("Build");
            jMenuItemClear.setText("Clear");
            jMenuProgram.setText("Programm");
            jMenuSettings.setText("Settings");
            UpdatePathLabel();
            language = false;
        }
    }  
    
    private void BuildModel()
    {
        LoadFrame load = new LoadFrame();
        path = load.GetPath();
        UpdatePathLabel();

        final Canvas canvas = new  javaapplication4.SliceDrower(this, Ren.arr);
        this.add(canvas);

        Ren.getScene(path);
        //javaapplication4.SliceDrower drower = new javaapplication4.SliceDrower(this, canvas1, Ren.arr);
        //бэкграундворкер
//        Background back = new Background (this, jPanel1, canvas1, path);
//        back.execute();
        //прямой вызов
        //javaapplication4.Ren.main(this, jPanel1,path);
        jButtonBuild.setEnabled(false);
        jMenuItemBuildModel.setEnabled(false);
    }
    
    private void ClearModel()
    {
        jButtonBuild.setEnabled(true);        
        jMenuItemBuildModel.setEnabled(true);
        path = "";
        UpdatePathLabel();
        jPanel1.removeAll();
    }
   
    private void UpdatePathLabel()
    {
        if("".equals(path))
        {
            if(jLabelLoad.getText().charAt(0) != 'З'){
                jLabelPath.setText(" nothing uploaded");
            }
            else
            {
                jLabelPath.setText(" ничего не загруженно");
            }
            
        }
        else
        {
            jLabelPath.setText(path);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemChangeLanguage;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButtonBuild;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabelLoad;
    private javax.swing.JLabel jLabelPath;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemBuildModel;
    private javax.swing.JMenuItem jMenuItemClear;
    private javax.swing.JMenu jMenuProgram;
    private javax.swing.JMenu jMenuSettings;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}