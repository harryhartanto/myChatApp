/*
 * @author harry.hartanto
 * Description : UI for Client App Chat allow user to Connect, Chat in Lobby and privately with other users.
 * Last Modified : 27-9-2016
 */
package mychatapp;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.*;

public class ClientFrame extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form ClientFrame
     */
    private Client client;
    private boolean connected;
    private SimpleDateFormat sdf;
    private ArrayList<JTextArea> listOfTabParties;
    public ClientFrame() {
        super("Client Chat");
        initComponents();
        listOfParties.setModel(new DefaultListModel());
        inputMessage.addActionListener(this);
        listOfTabParties = new ArrayList<JTextArea>();
        listOfTabParties.add(lobbyArea);
        sdf = new SimpleDateFormat("HH:mm:ss");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serverField = new javax.swing.JTextField();
        portField = new javax.swing.JTextField();
        connectBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        mainTab = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        lobbyArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        inputMessage = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listOfParties = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Server :");

        jLabel2.setText("Port :");

        serverField.setText("localhost");

        portField.setText("1000");

        connectBtn.setText("Connect");
        connectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Username :");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterUsername(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(serverField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(connectBtn)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(serverField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connectBtn))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mainTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabClick(evt);
            }
        });

        lobbyArea.setEditable(false);
        lobbyArea.setColumns(20);
        lobbyArea.setRows(5);
        jScrollPane1.setViewportView(lobbyArea);

        mainTab.addTab("Lobby", jScrollPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTab)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTab, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );

        inputMessage.setEditable(false);
        inputMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sendMessage(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputMessage)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Parties"));

        listOfParties.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listOfParties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doubleClick(evt);
            }
        });
        jScrollPane2.setViewportView(listOfParties);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectBtnActionPerformed
        // TODO add your handling code here:
        if(connectBtn.getText().equals("Disconnect"))
        {
            client.sendMessage(new Message(Message.LOGOUT, "","",""));
            connectBtn.setText("Connect");
            connected = false;
            return;
        }
        String username = usernameField.getText().trim();
        System.out.println("username : "+username);
        if(username.length()==0)
        {
            return;
        }
        String server =  serverField.getText().trim();
        System.out.println("server : "+server);
        if(server.length()==0)
        {
            return;
        }
        String portNumber = portField.getText().trim();
        System.out.println("portNumber : "+portNumber);
        if(portNumber.length()==0)
        {
            return;
        }
        int port;
        try
        {
            port= Integer.parseInt(portNumber);
        }        
        catch(Exception e)
        {
            return;
        }
        System.out.println("port: "+port);
        client = new Client(server, port, username, this);
        if(!client.start())
        {
            return;         //failed to start
        }
        connected = true;
        this.setTitle(username);
        connectBtn.setText("Disconnect");
        inputMessage.setEditable(true);
        usernameField.setEditable(false);
        Message m = new Message(Message.LOGIN, username,"","");
        System.out.println("m : "+m.getMessage());
        client.sendMessage(m);
        
    }//GEN-LAST:event_connectBtnActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void sendMessage(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sendMessage
        // TODO add your handling code here:      
       if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            String time = sdf.format(new Date());
            String target = mainTab.getTitleAt(mainTab.getSelectedIndex());     
            //message format : [time][username][message]
            String message= "["+time+"] "+client.getUsername()+" : "+inputMessage.getText()+"\n";
            inputMessage.setText("");            
            System.out.println(message);
            Message m = new Message(Message.MESSAGE, message,target,client.getUsername());
            append(m);
            client.sendMessage(m);
        }
    }//GEN-LAST:event_sendMessage

    private void doubleClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doubleClick
        // TODO add your handling code here:
        if(evt.getClickCount()==2)
        {
            String user = listOfParties.getSelectedValue().toString();
            System.out.println("user : "+user);
            //if user is not found in tab, create new text area
            if(!checkUserInMainTab(user))
            {
                System.out.println("user not found, create it");
                addNewTab(user);
                mainTab.setSelectedIndex((listOfTabParties.size()-1));
            }
        }
        
    }//GEN-LAST:event_doubleClick

    private void tabClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabClick
        // TODO add your handling code here:
        int selectedTab = mainTab.getSelectedIndex();
        String title = mainTab.getTitleAt(selectedTab);
        title = title.replace("*","");
        mainTab.setTitleAt(selectedTab, title);
    }//GEN-LAST:event_tabClick

    private void enterUsername(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterUsername
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            connectBtn.doClick();
        }        
    }//GEN-LAST:event_enterUsername

    public void append(Message message)
    {
        if(message.getType()!=0)
        {
            String target = message.getTarget();
            String sender = message.getSender();
            String msg = message.getMessage();
            //broadcast message
            if(target.equals("Lobby"))
            {
                lobbyArea.append(msg);
                lobbyArea.setCaretPosition(lobbyArea.getText().length() - 1);
                if(mainTab.getSelectedIndex()!=0)
                {
                    mainTab.setTitleAt(0, "Lobby*");
                }
            }
            else
            {
                //to update sender chat area
                if(sender.equals(client.getUsername()))
                {
                    int selectedTab = mainTab.getSelectedIndex();
                    listOfTabParties.get(selectedTab).append(msg);
                    listOfTabParties.get(selectedTab).setCaretPosition(listOfTabParties.get(selectedTab).getText().length() - 1);
                }
                else
                {
                    //to update target chat area
                    if(!checkUserInMainTab(sender))
                    {
                        addNewTab(sender);
                    }
                    for(int i = 1;i<mainTab.getTabCount();i++)
                    {
                        if(sender.equals(mainTab.getTitleAt(i)) || sender.equals(mainTab.getTitleAt(i).replace("*", "")))
                        {
                            if(mainTab.getSelectedIndex()!=i && !mainTab.getTitleAt(i).contains("*"))
                            {
                                mainTab.setTitleAt(i, (mainTab.getTitleAt(i)+"*"));
                            }
                            listOfTabParties.get((i)).append(msg);
                            listOfTabParties.get((i)).setCaretPosition(listOfTabParties.get((i)).getText().length() - 1);
                        }
                    }
                } 
            }
        }
        else
        {
            lobbyArea.append(message.getMessage());
            lobbyArea.setCaretPosition(lobbyArea.getText().length() - 1); 
            if(mainTab.getSelectedIndex()!=0)
            {
                mainTab.setTitleAt(0, "Lobby*");
            }
        }
    }
    
    private boolean checkUserInMainTab(String user)
    {
        //looping to check the name of the tab, skip Lobby
        boolean found = false;
        int index = 1;
        //stop looping either found or index reach to the max of tab
        while(!found && index<mainTab.getTabCount())
        {
            if(user.equals(mainTab.getTitleAt(index)) || user.equals(mainTab.getTitleAt(index).replace("*", "")))
            {
                found = true;
            }
            index++;
        }
        return found;
    }
    
    private void addNewTab(String user)
    {        
        JScrollPane scrollPane = new JScrollPane();
        JTextArea privateRoom = new JTextArea();
        privateRoom.setEditable(false);
        privateRoom.setColumns(20);
        privateRoom.setRows(5);
        scrollPane.setViewportView(privateRoom);
        listOfTabParties.add(privateRoom);
        mainTab.addTab(user, scrollPane);
    }
    
    public void connectionFailed() {
            connectBtn.setEnabled(true);
            usernameField.setText("");
            usernameField.setEditable(true);
            // reset port number and host name as a construction time
            portField.setText("" + 1000);
            serverField.setText("localhost");
            // let the user change them
            inputMessage.setEditable(false);
            // don't react to a <CR> after the username
            inputMessage.removeActionListener(this);
            connected = false;
            this.setTitle("Client Chat");
            connectBtn.setText("Connect");
            listOfParties.setModel(new DefaultListModel());
            listOfTabParties = new ArrayList<JTextArea>();
            listOfTabParties.add(lobbyArea);
            mainTab.removeAll();
            mainTab.addTab("Lobby", jScrollPane1);
	}
    
    public void updateListOfParties(String[] arrayOfList)
    {        
        DefaultListModel userList = new DefaultListModel();
        int listIndex = 0;
        for(int i = 0;i<arrayOfList.length;i++)
        { 
            if(!client.getUsername().equals(arrayOfList[i]))
            {
                userList.insertElementAt(arrayOfList[i], listIndex);
                listIndex++;
            }            
        }
        listOfParties.setModel(userList);
        
    }
    
    public void refreshMainTab()
    {
        for (int i = 1; i < mainTab.getTabCount(); i++) {
            mainTab.removeAll();
        }
    }
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
            java.util.logging.Logger.getLogger(ClientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectBtn;
    private javax.swing.JTextField inputMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listOfParties;
    private javax.swing.JTextArea lobbyArea;
    private javax.swing.JTabbedPane mainTab;
    private javax.swing.JTextField portField;
    private javax.swing.JTextField serverField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
    }
}