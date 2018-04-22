package nlp.week2.Tokenization;

import edu.stanford.nlp.trees.TypedDependency;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    if(regex_list.getSelectedValue() == null){
        JOptionPane.showMessageDialog(null,"Please select Regex");
    }else if("".equals(textbox.getText())){
        JOptionPane.showMessageDialog(null,"Please enter text");
    }else{
     Tokenize tk = new Tokenize();
     regEx reg = new regEx();
     List<TypedDependency> tdl = tk.cutter(textbox.getText());
     validateRes_textArea.setText("");
     
         validateRes_textArea.append("Text : "+textbox.getText()+
                                     "\nRegex : " +reg.regEx(regex_list.getSelectedIndex())+
                                     "\n =========== \n");
         
         
          for (TypedDependency tdl_token : tdl){
              
              String w = tdl_token.dep().word();
               validateRes_textArea.append(w+" : "+ reg.checkRegEx(w,regex_list.getSelectedIndex())+"\n");   
    /* if(regex_list.getSelectedValue() == "Student ID pattern"){
        String Student_ID_pattern = "B[0-9]+";
        
        Pattern pattern=Pattern.compile(Student_ID_pattern);
        Matcher regexMatcher = pattern.matcher(textbox.getText());
        validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +Student_ID_pattern+
                                                              "\n =========== \n StudentID: "+regexMatcher.matches() );
       }
       else if(regex_list.getSelectedValue() == "Password pattern"){
           String Password_Pattern = "([\\w]{8,})+([\\.\\+\\-\\*\\/]{2})";
           
            Pattern pattern=Pattern.compile(Password_Pattern);
            Matcher regexMatcher = pattern.matcher(textbox.getText());
             validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +Password_Pattern+
                                          "\n =========== \n Password: "+regexMatcher.matches() );
       }
       else if(regex_list.getSelectedValue() == "Identification pattern"){
           String Identification_Pattern = "[\\dA-Z]{9,13}";
           
            Pattern pattern=Pattern.compile(Identification_Pattern);
            Matcher regexMatcher = pattern.matcher(textbox.getText());
            validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +Identification_Pattern+
                                          "\n =========== \n Identification: "+regexMatcher.matches() );
          
       }
       else if(regex_list.getSelectedValue() == "PostCode pattern"){
           String PostCode_pattern = "[\\d]{5}";
           
            Pattern pattern=Pattern.compile(PostCode_pattern);
            Matcher regexMatcher = pattern.matcher(textbox.getText());
            validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +PostCode_pattern+
                                          "\n =========== \n PostCode: "+regexMatcher.matches() );
          
       }
       else if(regex_list.getSelectedValue() == "PhonNumber pattern"){
           String PhonNumber_pattern = "[\\d]{3}-[\\d]{7}";
           
            Pattern pattern=Pattern.compile(PhonNumber_pattern);
            Matcher regexMatcher = pattern.matcher(textbox.getText());
            validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +PhonNumber_pattern+
                                          "\n =========== \n PhonNumber: "+regexMatcher.matches() );
          
       }
        else if(regex_list.getSelectedValue() == "Email Pattern"){
           String Email_pattern = "^(.+)@(.+)$";
           
            Pattern pattern=Pattern.compile(Email_pattern);
            Matcher regexMatcher = pattern.matcher(textbox.getText());
            validateRes_textArea.setText("Text : "+textbox.getText()+
                                          "\nRegex : " +Email_pattern+
                                          "\n =========== \n Email: "+regexMatcher.matches() );
          
       }  
        else {JOptionPane.showMessageDialog(null, "Please select Regex" );}*/
          }   
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
