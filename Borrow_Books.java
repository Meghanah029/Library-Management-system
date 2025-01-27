import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Borrow_Books extends javax.swing.JFrame
{
    
    String url = "jdbc:mysql://localhost:3306/dbms_project?zeroDateTimeBehavior=CONVERT_TO_NULL";
    //"jdbc:MySQL://localhost:3306/dbms_project";//?useSSL=false
     String mysql_user="root";
     String mysqlpswrd="9740637090";

   
    public Borrow_Books(){
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_books = new javax.swing.JTable();
        view_books_ = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        book_id = new javax.swing.JTextField();
        cancel_ = new javax.swing.JButton();
        issue_ = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        username_ = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-: Select Books to Borrow :- ");

        table_books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK_ID", "TITLE", "AUTHOR_NAME", "PUBLISHER_NAME", "Number_of_Copies"
            }
        ));
        jScrollPane1.setViewportView(table_books);

        view_books_.setBackground(new java.awt.Color(204, 255, 255));
        view_books_.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        view_books_.setText("VIEW");
        view_books_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_books_ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter ID of the book to Borrow");

        book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_idActionPerformed(evt);
            }
        });

        cancel_.setBackground(new java.awt.Color(204, 255, 255));
        cancel_.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        cancel_.setText("CANCEL");
        cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ActionPerformed(evt);
            }
        });

        issue_.setBackground(new java.awt.Color(204, 255, 255));
        issue_.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        issue_.setText("ISSUE BOOK");
        issue_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issue_ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLabel3.setText("Enter Username of the Borrower");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(view_books_, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_)
                            .addComponent(book_id, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addGap(60, 60, 60))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(issue_, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(view_books_, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(issue_, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void view_books_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_books_ActionPerformed
        // TODO add your handling code here:
        try
        {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/dbms_project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                    //"jdbc:MySQL://localhost:3306/dbms_project";//?useSSL=false
            String mysql_user="root";
            String mysqlpswrd="9740637090";
            
            DefaultTableModel model =(DefaultTableModel)table_books.getModel();
            
            String query=("select * from books");
            Connection conn  = DriverManager.getConnection(url,mysql_user,mysqlpswrd);
            Statement stm=conn.createStatement();
            ResultSet rs=stm.executeQuery(query);
            
            while(rs.next())
            {
                String BOOK_ID = rs.getString("BOOK_ID");
                String TITLE = rs.getString("TITLE");
                String AUTHOR_NAME = rs.getString("AUTHOR_NAME");
                String PUBLISHER_NAME = rs.getString("PUBLISHER_NAME");
                String Number_of_Copies = rs.getString("Number_of_Copies");
                model.addRow(new Object[] {BOOK_ID,TITLE,AUTHOR_NAME,PUBLISHER_NAME,Number_of_Copies});
            }
            rs.close();
            stm.close();

            
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(View_Books.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(View_Books.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_view_books_ActionPerformed

    private void book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_idActionPerformed

    private void cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dashboard dsh = new Dashboard();
        dsh.setVisible(true);
        
    }//GEN-LAST:event_cancel_ActionPerformed

    private void issue_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issue_ActionPerformed
        // ISSUE BOOKS
         try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/dbms_project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                    //"jdbc:MySQL://localhost:3306/dbms_project";//?useSSL=false
            String mysql_user="root";
            String mysqlpswrd="9740637090";
            String TITLE="";
            
            String fetchTitle = "SELECT TITLE FROM books WHERE BOOK_ID = ?";          
            String query = "insert into books_lending values(?,?,?,?,?)";          
            int BOOK_ID = Integer.parseInt(book_id.getText());
            String username = new String(username_.getText());        
            Connection conn  = DriverManager.getConnection(url,mysql_user,mysqlpswrd);       
            PreparedStatement fetchTitle_ = conn.prepareStatement(fetchTitle);
            fetchTitle_.setInt(1,BOOK_ID);
            ResultSet rs = fetchTitle_.executeQuery();
            if (rs.next())
            {
                TITLE = rs.getString("TITLE"); 
             } 
            else 
                JOptionPane.showMessageDialog(this, "No book found with the given BOOK_ID");
        
    
            PreparedStatement stm1 = conn.prepareCall(query);
               
            stm1.setInt(1,BOOK_ID);
            
            stm1.setString(2,TITLE);
              stm1.setString(3,username);
            stm1.setDate(4, new java.sql.Date(System.currentTimeMillis()));
            
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new java.util.Date());
            calendar.add(Calendar.DATE, 15);
            stm1.setDate(5, new java.sql.Date(calendar.getTime().getTime()));
            
            
            stm1.execute();
                
            JOptionPane.showMessageDialog(this,"One book lent successfully");
            
            book_id.setText(null);
            username_.setText(null);
            
           
                
        }
        catch(Exception e) 
        {
              JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        
        
        
    }//GEN-LAST:event_issue_ActionPerformed


   public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrow_Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField book_id;
    private javax.swing.JButton cancel_;
    private javax.swing.JButton issue_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_books;
    private javax.swing.JTextField username_;
    private javax.swing.JButton view_books_;
    // End of variables declaration//GEN-END:variables
}
