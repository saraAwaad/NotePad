/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package notepadwithSplitpane;

import com.jets.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoManager;


/**
 *
 * @author Sara
 */
public class Notepad extends javax.swing.JFrame {
        
    UndoManager undoManager = new UndoManager();
    String Bufferstr;
    Color fontColor=Color.black ;
    //Color bckgColor=Color.white ;
    int fsize=10;
    String TxtFont="PLAIN";
    String[] fontsNames={"Serif","SansSerif","Monospaced","DialogInput", "Dialog" };
    String[] colorsNames={"Red","Green","Blue"};
    final int MIN = 10;
    final int MAX = 60;
    final int INIT = 10; 
    final JSlider sizeSlider=new JSlider(JSlider.HORIZONTAL,MIN,MAX,INIT);
    final JList fonts=new JList(fontsNames);
    final JComboBox colors=new JComboBox(colorsNames);
    /**
     * Creates new form Notepad
     */
    public Notepad() {
        initComponents();
        jTextArea1.getDocument().addUndoableEditListener(
        new UndoableEditListener() {
          @Override
          public void undoableEditHappened(UndoableEditEvent e) {
            undoManager.addEdit(e.getEdit());
          }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jNewMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jUndoItem1 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("File");

        jNewMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jNewMenuItem1.setText("New");
        jNewMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jNewMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        EditMenu.setText("Edit");
        EditMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMenuActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Cut");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        EditMenu.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Copy");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        EditMenu.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Paste");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        EditMenu.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        jMenuItem8.setText("Delete");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        EditMenu.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("SelectAll");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        EditMenu.add(jMenuItem9);

        jUndoItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jUndoItem1.setText("Undo");
        jUndoItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUndoItem1ActionPerformed(evt);
            }
        });
        EditMenu.add(jUndoItem1);

        jMenuItem1.setText("Redo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        EditMenu.add(jMenuItem1);

        jMenuBar1.add(EditMenu);

        jMenu3.setText("Format");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu3KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        helpMenu.setText("Help");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNewMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewMenuItem1ActionPerformed
       //new
        String s=jTextArea1.getText();
        int res=0;
        if(s.length()>0)
        { 
            res=JOptionPane.showConfirmDialog(null,"Do you want to save changes ?","About", JOptionPane.YES_NO_CANCEL_OPTION);
            if(res ==0){//yes
                jTextArea1.setText("");
                Bufferstr="";
                // save
                JFileChooser chooser = new JFileChooser();
                int returnVal = chooser.showOpenDialog(this);
                if(returnVal == JFileChooser.APPROVE_OPTION) {
                    jTextArea1.append("\n You chose to save this file: "+
                    chooser.getSelectedFile().getPath());
                 }
            }
            else if(res ==1){//no
                 jTextArea1.setText("");
                  Bufferstr="";
            }
             else if(res==2)//cancel
                 jTextArea1.setText(s);
        }        
       // System.out.println(res);
    }//GEN-LAST:event_jNewMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //open
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
           jTextArea1.append("\n You chose to open this file: "+
           chooser.getSelectedFile().getPath());   
        }
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // save
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
           jTextArea1.append("\n You chose to save this file: "+
           chooser.getSelectedFile().getPath());
          // chooser.setVisible(false);
         }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
            // cut
            Bufferstr=jTextArea1.getText();
            jTextArea1.cut();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
            // copy
            Bufferstr=jTextArea1.getText();
            jTextArea1.copy();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
             //paste
             Bufferstr=jTextArea1.getText();
             jTextArea1.paste();             
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
            // delete
            Bufferstr=jTextArea1.getText();
            String s="";
            s=jTextArea1.getSelectedText();
            if(s == null)
             {
                 System.out.println("delete single char");
                 jTextArea1.replaceRange("",jTextArea1.getCaretPosition()-1,jTextArea1.getCaretPosition());
             }else
                 jTextArea1.replaceSelection("");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
             /*JOptionPane  */
            String s="version 1.6 \n copy write @ hjjhj \n just write what you want";
          //JOptionPane.showMessageDialog(null,s,"About", JOptionPane.OK_OPTION ,new ImageIcon("C:\\Users\\Sara\\Desktop\\notepadicon.png") );
           /* dialog*/
           final JDialog d=new JDialog(this,"About",true);
           d.setBounds(20, 20, 200, 200);
           d.setLocation(100,100);
           d.setLayout(new FlowLayout());
           JLabel l=new JLabel("<html><b>Notepad version 0.6<br><br>Open Source Software<br>"
					+ " by : Sara Hussien<br />"
					+ "Email        :Sara@gmail.com<br /></b></html>");
           
           JButton okbtn=new JButton("OK");
           JSeparator jSeparator1 = new JSeparator();
           okbtn.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e) {
                    d.dispose();
               }
           });  
           d.add(jSeparator1);
           d.add(l);
           d.add("South",okbtn);
           d.setVisible(true);
   
  
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void EditMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMenuActionPerformed
     
    }//GEN-LAST:event_EditMenuActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //exit
        String s=jTextArea1.getText();
        int res=0;
        if(s.length()>0)
        { 
            res=JOptionPane.showConfirmDialog(null,"Do you want to save changes ?","About", JOptionPane.YES_NO_CANCEL_OPTION);
            if(res ==0){//yes
                // save
                JFileChooser chooser = new JFileChooser();
                int returnVal = chooser.showOpenDialog(this);
                if(returnVal == JFileChooser.APPROVE_OPTION) {
                    jTextArea1.append("\n You chose to save this file: "+
                    chooser.getSelectedFile().getPath());
                 }
                 System.exit(0);
            }
            else if(res ==1)//no
                  System.exit(0);
             else if(res==2)//cancel
                 jTextArea1.setText(s);
        }else
            System.exit(0);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        //selectall
        jTextArea1.selectAll();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jUndoItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUndoItem1ActionPerformed
       // undo
      //  jTextArea1.setText(Bufferstr);
         try {
          undoManager.undo();
        } catch (CannotRedoException cre) {
          cre.printStackTrace();
        }
         setEnabled(undoManager.canUndo());   
    }//GEN-LAST:event_jUndoItem1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Redo
          try {
          undoManager.redo();
        } catch (CannotRedoException cre) {
          cre.printStackTrace();
        }
          setEnabled(undoManager.canRedo()); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu3KeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu3KeyPressed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:    
        final JDialog formatDialog=new JDialog(this,"Format",true);
        formatDialog.setBounds(20, 20, 500, 400);
        JSplitPane splitpane=new JSplitPane();
        splitpane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        
        JTabbedPane format=new JTabbedPane();
        JPanel formatPanel=new JPanel(new BorderLayout());
        JPanel buttonPanel=new JPanel();
        JPanel colorPanel =new JPanel();
        JPanel sizePanel =new JPanel();
        JButton apply=new JButton("Apply"); 
        JButton cancel=new JButton("Cancel");
        final JTextField l=new JTextField("Sample");

        //colors.setBackground(Color.red);
        //colors.setBackground(Color.CYAN);
       
        sizeSlider.addChangeListener(new ChangeListener(){

            @Override
            public void stateChanged(ChangeEvent e) {
               // fontColor=
                System.out.println(sizeSlider.getValue());
                l.setFont(new Font((String) fonts.getSelectedValue(), Font.PLAIN, sizeSlider.getValue()));
            }
        });
        colors.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                Color selColor=Color.BLACK;
                if(((String)colors.getSelectedItem()).equals("Red"))
                    selColor=Color.red;
                else if(((String)colors.getSelectedItem()).equals("Green"))
                    selColor=Color.green;
                else if(((String)colors.getSelectedItem()).equals("Blue"))
                    selColor=Color.blue;
              System.out.println(colors.getSelectedItem().toString());
              l.setForeground(selColor);
              colors.setBackground(selColor);
              MyRenderer m=new MyRenderer();
               colors.setRenderer(m);
            }
        });
        fonts.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println(fonts.getSelectedValue());
                l.setFont(new Font((String) fonts.getSelectedValue(), Font.PLAIN, sizeSlider.getValue()));
            }
        });
        apply.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Color selColor=Color.BLACK;
                if(((String)colors.getSelectedItem()).equals("Red"))
                    selColor=Color.red;
                else if(((String)colors.getSelectedItem()).equals("Green"))
                    selColor=Color.green;
                else if(((String)colors.getSelectedItem()).equals("Blue"))
                    selColor=Color.blue;
                jTextArea1.setFont(new Font((String) fonts.getSelectedValue(), Font.PLAIN, sizeSlider.getValue()));
                jTextArea1.setForeground(selColor);
                 formatDialog.dispose();
              /*  colors.setSelectedItem(selColor);
                fonts.setSelectedValue(fonts.getSelectedValue(), true);
                sizeSlider.setValue(sizeSlider.getValue());*/
               
            }
        });
        cancel.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                formatDialog.dispose();
            }
        
        });

        sizeSlider.setMajorTickSpacing(10);
        sizeSlider.setMinorTickSpacing(1);
        sizeSlider.setPaintTicks(true);
        sizeSlider.setPaintLabels(true);
        colorPanel.add(colors,"Center");
        sizePanel.add(sizeSlider);
        buttonPanel.add(apply,"Center");
        buttonPanel.add(cancel,"East");
        format.addTab("Font",fonts);
        format.addTab("Color",colorPanel);
        format.addTab("Size",sizePanel);

        formatPanel.add(l,"Center");
        formatPanel.add(buttonPanel,"South");
        
        splitpane.setLeftComponent(format);
        splitpane.setRightComponent(formatPanel);
        
        formatDialog.add(splitpane);
   
        formatDialog.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

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
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jNewMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem jUndoItem1;
    // End of variables declaration//GEN-END:variables
}
class MyRenderer implements ListCellRenderer{

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel cl=new JLabel();
        cl.setText((String)value);
        cl.setOpaque(true);
        if(isSelected){
        
            if(index==0)
                 cl.setBackground(Color.red);
            else if(index==1)
                 cl.setBackground(Color.green);
            else if(index==2)
                 cl.setBackground(Color.blue);
        }
        else 
            cl.setBackground(Color.white);
      
        return cl;
    }


}