// written by Nicholas Cubberly

package config;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HubInfoEdit extends javax.swing.JFrame {
    
    //Initializing Variables
    private javax.swing.JLabel fontSelection;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JButton delete;
    private javax.swing.JButton cancel;
    private javax.swing.JButton submit;
    private javax.swing.JTextField info;
    private javax.swing.JTextField subnet;
    private javax.swing.JTextField mask;

    public HubInfoEdit(applicationWindow main){
        Buttons();
        mainWindow = main;
    }

    applicationWindow mainWindow = null;
    //Hub hubNet = null;

    private void Buttons(){
        fontSelection = new javax.swing.JLabel(); //nameField
        text1 = new javax.swing.JLabel(); //Label1
        text2 = new javax.swing.JLabel(); //Label8
        text3 = new javax.swing.JLabel(); //Label9
        text4 = new javax.swing.JLabel(); //Label10
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        info = new javax.swing.JTextField(); //infField
        subnet = new javax.swing.JTextField();
        mask = new javax.swing.JTextField();
        
        fontSelection.setFont(new java.awt.Font("Times New Roman", 2, 16));
        text1.setText("HUB:");
        text2.setText("Info:");
        text3.setText("Subnet:");
        text4.setText("Mask:");
        submit.setText("Submit");
        cancel.setText("Cancel");
        delete.setText("Delete");

    }
    public static void main(String args[]){

    }

    /*public void setNet(Hub net){
        hubNet = net;
    }*/
    public void changeInfo(String newText){
        info.setText(newText);
    }
    public void changeSubnet(String newText){
        subnet.setText(newText);
    }
    public void changeMask(String newText){
        mask.setText(newText);
    }
}
