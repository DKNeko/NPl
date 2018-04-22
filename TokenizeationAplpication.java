package nlp.week2.Tokenization;

import edu.stanford.nlp.trees.TypedDependency;
import java.util.List;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class TokenizeationAplpication extends javax.swing.JFrame {

    public TokenizeationAplpication() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        regex_list = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        validateRes_textArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        run_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textbox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Regex and Tokenize");

        jLabel2.setText("Select Regex:");

        regex_list.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Student ID pattern", "Password pattern", "Identification pattern", "PostCode pattern", "PhonNumber pattern", "Email pattern", "License Plate pattern" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(regex_list);

        validateRes_textArea.setColumns(20);
        validateRes_textArea.setRows(5);
        jScrollPane2.setViewportView(validateRes_textArea);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        run_btn.setText("Run");
        run_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run_btnActionPerformed(evt);
            }
        });

        jLabel3.setText("Validate result");

        jLabel1.setText("Input a text : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(220, 220, 220)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(run_btn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(run_btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        textbox.setText("");
        validateRes_textArea.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void run_btnActionPerformed(java.awt.event.ActionEvent evt) {
        
        
//GEN-FIRST:event_run_btnActionPerformed
       if(regex_list.getSelectedValue() == "Student ID pattern"){
        String Student_ID_pattern = "[BMD][0-9]+";
        
        Pattern pattern=Pattern.compile(Student_ID_pattern);
        Matcher regMatcher = pattern.matcher(textbox.getText());
        validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +Student_ID_pattern+ "\n =========== \n  ");
       }
       else if(regex_list.getSelectedValue() == "Password pattern"){
           String Password_Pattern = "([\\w]{8,})+([\\.\\+\\-\\*\\/]{2})";
           
            Pattern pattern=Pattern.compile(Password_Pattern);
            Matcher regMatcher = pattern.matcher(textbox.getText());
             validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +Password_Pattern + "\n =========== \n " );
       }
       else if(regex_list.getSelectedValue() == "Identification pattern"){
           String Identification_Pattern = "[\\dA-Z]{9,13}";
           
            Pattern pattern=Pattern.compile(Identification_Pattern);
            Matcher regMatcher = pattern.matcher(textbox.getText());
            validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +Identification_Pattern + "\n =========== \n " );
          
       }
       else if(regex_list.getSelectedValue() == "PostCode pattern"){
           String PostCode_pattern = "[\\d]{5}";
           
            Pattern pattern=Pattern.compile(PostCode_pattern);
            Matcher regMatcher = pattern.matcher(textbox.getText());
            validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +PostCode_pattern + "\n =========== \n ");
          
       }
       else if(regex_list.getSelectedValue() == "PhonNumber pattern"){
           String PhonNumber_pattern = "[\\d]{3}-[\\d]{7}";
           
            Pattern pattern=Pattern.compile(PhonNumber_pattern);
            Matcher regMatcher = pattern.matcher(textbox.getText());
            validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +PhonNumber_pattern +"\n =========== \n " );
          
       }
        else if(regex_list.getSelectedValue() == "Email pattern"){
           String Email_pattern = "^(.+)@(.+)$";
           
            Pattern pattern=Pattern.compile(Email_pattern);
            Matcher regMatcher = pattern.matcher(textbox.getText());
            validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +Email_pattern + "\n =========== \n ");
          
       }  
       else if(regex_list.getSelectedValue() == "License Plate pattern"){
           String LP_pattern = "[A-Z]{3}+[0-9]{3}";
           
            Pattern pattern=Pattern.compile(LP_pattern);
            Matcher regMatcher = pattern.matcher(textbox.getText());
            validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +LP_pattern + "\n =========== \n ");
          
       }  
        else {JOptionPane.showMessageDialog(null, "Please select Regex" );}
         Tokenize token = new Tokenize();
         List<TypedDependency> split = token.cutter(textbox.getText());
         regEx regular = new regEx();
         for (TypedDependency split_token : split){
              //name of boolean is checkRegEx
              String word = split_token.dep().word();
               validateRes_textArea.setText(word+" : "+ regular.checkRegEx(word,
                       regex_list.getSelectedIndex())+"\n");   
          }    
         
         
        
    }//GEN-LAST:event_run_btnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TokenizeationAplpication().setVisible(true);
            }
        });
        
      
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JList regex_list;
    private javax.swing.JButton run_btn;
    private javax.swing.JTextField textbox;
    private javax.swing.JTextArea validateRes_textArea;
    // End of variables declaration//GEN-END:variables
}
