
/**
 *
 * @author Saleh Aldawlah, Paul
 */

package config;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class applicationWindow extends javax.swing.JFrame {

    public applicationWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        vmButton = new javax.swing.JButton();
        hubButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scrollPn = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menubarFile = new javax.swing.JMenu();
        fileItemImport = new javax.swing.JMenuItem();
        fileItemExport = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenuItem();
        mainP = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();


        jColorChooser1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(775, 500));
        setPreferredSize(new java.awt.Dimension(775, 500));
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        vmButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vmButton.setText("Add vm");
        vmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vmNewClicked(evt);
            }
        });

        hubButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hubButton.setText("Add hub");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Console:");

        jLabel2.setText(" ");

        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        menubarFile.setText("File");
        fileItemImport.setText("Import/Open");
        fileItemExport.setText("Export/Save");
        exitMenu.setText("Exit");
        helpMenu.setText("Help");
        aboutMenu.setText("About");

        menubarFile.add(fileItemImport);
        menubarFile.add(fileItemExport);
        menubarFile.add(exitMenu);
        jMenuBar1.add(menubarFile);
        helpMenu.add(aboutMenu);
        jMenuBar1.add(helpMenu);
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(mainP, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20, 20, 20)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(mainP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainP.setPreferredSize(new java.awt.Dimension(400, 32767));
        mainP.setLayout(new javax.swing.BoxLayout(mainP, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 117, Short.MAX_VALUE)
                        .addComponent(vmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(hubButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addComponent(scrollPn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hubButton)
                    .addComponent(vmButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }

    HashMap<String, VMs> vmMap = new HashMap<>();
    //HashMap<String, Hub> hubMap = new HashMap<>();
    HashMap<String, JButton> itemMap = new HashMap<>();
    ImageIcon vmImage = new javax.swing.ImageIcon(getClass().getResource("/config/images/vm.jpg"));
    ImageIcon hubImage = new javax.swing.ImageIcon(getClass().getResource("/config/images/hub.jpg"));
    
    public void createItem(String type, String name){
        switch (type) {
            case "VM": {
                VMs vm = new VMs(name);
                vmMap.put(name, vm);
                setVM(vm);
                break;
            }
        }
    }

    private void vmNewClicked(java.awt.event.ActionEvent evt) {
        // when new vm cliked
        JFrame vmFrame = new JFrame();
        String vmName = JOptionPane.showInputDialog(vmFrame, "Enter name: ");
        if(vmName != null && !vmName.equals("")){
            vmName = vmName.replaceAll("\\s", "");
            createItem("VM", vmName);
        }
    }

    public void setVM(VMs vm){
        JButton vmBtn = new JButton(vm.name);
        vmBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        vmBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
        vmBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        itemMap.put(vm.name, vmBtn);
        applicationWindow main = this;

        vmBtn.setIcon(vmImage);
        mainP.add(vmBtn);
        mainP.revalidate();
        validate();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(applicationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(applicationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(applicationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(applicationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new applicationWindow().setVisible(true);
            }
        });
    }
    private javax.swing.JButton vmButton;
    private javax.swing.JButton hubButton;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu menubarFile;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem fileItemImport;
    private javax.swing.JMenuItem fileItemExport;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenuItem aboutMenu;
    private javax.swing.JScrollPane scrollPn;
    private javax.swing.JPanel mainP;
    private javax.swing.JPanel panel;
}
