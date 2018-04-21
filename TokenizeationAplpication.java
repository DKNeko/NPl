package nlp.week2.Tokenization;

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
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Select Regex:");

        regex_list.setBackground(new java.awt.Color(0, 0, 0));
        regex_list.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        regex_list.setForeground(new java.awt.Color(0, 255, 0));
        regex_list.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Email Pattern", "Password pattern", "Student ID pattern", "Username pattern", "URL pattern", "Identification pattern", "PostCode pattern", "PhoneNumber pattern" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(regex_list);

        validateRes_textArea.setBackground(new java.awt.Color(0, 0, 0));
        validateRes_textArea.setColumns(20);
        validateRes_textArea.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        validateRes_textArea.setForeground(new java.awt.Color(0, 255, 0));
        validateRes_textArea.setLineWrap(true);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Input a text : ");

        textbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(220, 220, 220)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textbox)
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(run_btn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(run_btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
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
        String Student_ID_pattern = "[MBD][0-9]{7}$";
        
        Pattern pattern=Pattern.compile(Student_ID_pattern);
        Matcher regMatcher = pattern.matcher(textbox.getText());
        if(!regMatcher.matches()){
             validateRes_textArea.setText(" Text : "+textbox.getText()+
                                          "\n Regex : " +Student_ID_pattern+
                                          "\n =========== \n StudentID: false" );
        }
        else{
            validateRes_textArea.setText(" Text : "+textbox.getText()+
                                        "\n Regex : " +Student_ID_pattern+
                                        "\n =========== \n StudentID: True" );}
       
       }
       
       if(regex_list.getSelectedValue() == "Password pattern"){
        String Password_pattern = "^[a-zA-Z]\\w{8,24}$";
        
        Pattern pattern=Pattern.compile(Password_pattern);
        Matcher regMatcher = pattern.matcher(textbox.getText());
        if(!regMatcher.matches()){
             validateRes_textArea.setText(" Text : "+textbox.getText()+
                                          "\n Regex : " + Password_pattern +
                                          "\n =========== \n Password: false" );
        }
        else{
            validateRes_textArea.setText(" Text : "+textbox.getText()+
                                        "\n Regex : " + Password_pattern +
                                        "\n =========== \n Password: True" );}
       
       }
       
       if(regex_list.getSelectedValue() == "Identification pattern"){
        String Identification_pattern = "^[1-8]{1}[1-9]{4}[0-9]{5}[0-9]{2}[0-9]{1}$";
        
        Pattern pattern=Pattern.compile(Identification_pattern);
        Matcher regMatcher = pattern.matcher(textbox.getText());
        if(!regMatcher.matches()){
             validateRes_textArea.setText(" Text : " + textbox.getText()+
                                          "\n Regex : " + Identification_pattern +
                                          "\n =========== \n Thai Identification: false" );
        }
        else{
            validateRes_textArea.setText(" Text : "+textbox.getText()+
                                        "\n Regex : " + Identification_pattern +
                                        "\n =========== \n Thai Identification: True" );}
       
       }
       
       if(regex_list.getSelectedValue() == "PostCode pattern"){
        String PostCode_pattern = "^[1-9]{1}[0-9]{3}[0]{1}$";
        
        Pattern pattern=Pattern.compile(PostCode_pattern);
        Matcher regMatcher = pattern.matcher(textbox.getText());
        if(!regMatcher.matches()){
             validateRes_textArea.setText(" Text : " + textbox.getText()+
                                          "\n Regex : " + PostCode_pattern +
                                          "\n =========== \n Thailand PostCode: false" );
        }
        else{
            validateRes_textArea.setText(" Text : "+textbox.getText()+
                                        "\n Regex : " + PostCode_pattern +
                                        "\n =========== \n Thailand PostCode: True" );}
       
       }
       
       if(regex_list.getSelectedValue() == "URL pattern"){
        String URL_pattern = "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";
        
        Pattern pattern=Pattern.compile(URL_pattern);
        Matcher regMatcher = pattern.matcher(textbox.getText());
        if(!regMatcher.matches()){
             validateRes_textArea.setText(" Text : " + textbox.getText()+
                                          "\n Regex : " + URL_pattern +
                                          "\n =========== \n URL: false" );
        }
        else{
            validateRes_textArea.setText(" Text : "+textbox.getText()+
                                        "\n Regex : " + URL_pattern +
                                        "\n =========== \n URL: True" );}
       
       }
       
       
       if(regex_list.getSelectedValue() == "PhoneNumber pattern"){
        String PhoneNumber_pattern = "^[0-9\\-\\+]{9,15}$";
        
        Pattern pattern=Pattern.compile(PhoneNumber_pattern);
        Matcher regMatcher = pattern.matcher(textbox.getText());
        if(!regMatcher.matches()){
             validateRes_textArea.setText(" Text : " + textbox.getText()+
                                          "\n Regex : " + PhoneNumber_pattern +
                                          "\n =========== \n PhoneNumber: false" );
        }
        else{
            validateRes_textArea.setText(" Text : "+textbox.getText()+
                                        "\n Regex : " + PhoneNumber_pattern +
                                        "\n =========== \n PhoneNumber: True" );}
       
       }
       
       if(regex_list.getSelectedValue() == "Username pattern"){
        String Username_pattern = "^(\\w|\\d){6,12}$";
        
        Pattern pattern=Pattern.compile(Username_pattern);
        Matcher regMatcher = pattern.matcher(textbox.getText());
        if(!regMatcher.matches()){
             validateRes_textArea.setText(" Text : " + textbox.getText()+
                                          "\n Regex : " + Username_pattern +
                                          "\n =========== \n Username: false" );
        }
        else{
            validateRes_textArea.setText(" Text : "+textbox.getText()+
                                        "\n Regex : " + Username_pattern +
                                        "\n =========== \n Username: True" );}
       
       }
       if(regex_list.getSelectedValue() == "Email Pattern"){
        String Email_Pattern = "^(([^<>()\\[\\]\\\\.,;:\\s@\"]+(\\.[^<>()\\[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        
        Pattern pattern=Pattern.compile(Email_Pattern);
        Matcher regMatcher = pattern.matcher(textbox.getText());
        if(!regMatcher.matches()){
             validateRes_textArea.setText(" Text : " + textbox.getText()+
                                          "\n Regex : " + Email_Pattern +
                                          "\n =========== \n Email: false" );
        }
        else{
            validateRes_textArea.setText(" Text : "+textbox.getText()+
                                        "\n Regex : " + Email_Pattern +
                                        "\n =========== \n Email: True" );}
       
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
