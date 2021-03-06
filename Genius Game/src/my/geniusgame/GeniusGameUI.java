/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.geniusgame;

/**
 *
 * @author oliviaye
 */
public class GeniusGameUI extends javax.swing.JFrame {

    /**
     * @param secretLetters     the array storing the secret randomly letters
     * @param guessLetters      the array storing the guessed letters from the player
     * @param numLetters        the number of letters randomly generated
     * @return                  the number of correct letters guessed
     */
    // Method to check the number of correct letters the player guessed
    // Called when the player presses the "guess" button
    private static int checkGuess(char[] secretLetters, char[] guessLetters, int numLetters) {
        int correct = 0;
        for (int count = 0; count < numLetters; count++) { // Determines the number of letters that are correct in the guess
            if (secretLetters[count] == guessLetters[count]) {
                correct++;
            }
        }
        return correct;
    }
    
    /**
     * @param stringLetters     the string of letters gotten from the UI interface
     * @param charLetters       the char array to store the letters
     * @param numLetters        the number of letters randomly generated
     * @return                  the array of chars
     */
    // Method to convert a string to a char array
    // Called when the player presses the "guess" button
    private static char [] stringToChar(String stringLetters, char [] charLetters, int numLetters) {
        for (int count = 0; count < numLetters; count++) { // Searches the letters at each point of the string and assigns that char to the char array
            char letter = stringLetters.charAt(count);
            switch (letter) {
                case 'r':
                    charLetters[count] = 'r';
                    break;
                case 'g':
                    charLetters[count] = 'g';
                    break;
                case 'b':
                    charLetters[count] = 'b';
                    break;
            }
        }
        return charLetters;
    }
            
    /**
     * Creates new form GeniusGameUI
     */
    public GeniusGameUI() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Genius Game", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N

        jLabel1.setText("Number of Letters:");

        jTextField1.setText(" ");

        jLabel2.setText("Secret Values:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Please enter a number of letters.");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("Game:");

        jButton1.setText("Guess");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Play Again");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Input");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Input your Guess:");

        jButton4.setText("Quit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(377, 377, 377)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addGap(230, 230, 230)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jButton1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int guesses = 0; // Number of guesses, the game begins with zero guesses
    int numLetters; // Number of randomly generated letters
    String displayText = (""); // The string that stores the text displayed in jtextArea1
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Guess button
        String allSecretLetters = jLabel3.getText(); // Gets the secret letters from the display
        char [] secretLetters = new char[numLetters];
        secretLetters = stringToChar(allSecretLetters, secretLetters, numLetters); // Calls the method that changes the secret letters string to a char array
        
        String allGuessLetters = jTextField2.getText(); // Gets the inputted guess letters from the player
        allGuessLetters = allGuessLetters.toLowerCase();
        char[] guessLetters = new char[numLetters];
        guessLetters = stringToChar(allGuessLetters, guessLetters, numLetters); // Calls the method that changes the guess letters string to a char array
        
        int correct; // Number of correct letters guessed
        correct = checkGuess(secretLetters, guessLetters, numLetters); // Calls the method that compares the secret array and guess array and determines number of correct letters guessed
        guesses++; // Adds one to the number of guesses
        
        // Next 4 lines are formatting the displayed text to show the result of that round
        displayText = displayText + "Round "+guesses+" :     ";
        for (int count = 0; count < numLetters; count++)
            displayText = displayText + "| " + guessLetters[count] + " ";
        displayText = displayText + "|        You have guessed " + correct + " letters correctly, and " + (numLetters - correct) + " incorrectly.\n";
        jTextArea1.setText(displayText); 
        jTextField2.setText(""); // Resets the guess letters textbox
        
        if (correct == numLetters) { // Checks to see if the number of correct guessed letters match the number of secret letters
            displayText = displayText + "\nYou have won in "+guesses+" rounds!\n\nIf you would like to play again, click the play again button.\nIf you would like to quit, click the quit button.\n";
            jTextArea1.setText(displayText); // Displays endgame text
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Number of letters button
        numLetters = (int) Double.parseDouble(jTextField1.getText()); // Gets the number of generated letters from the text field
        char [] secretLetters = new char[numLetters];
        for (int count = 0; count < numLetters; count++) { // Generates the required number of rbg
            int randLetterType;
            do { // Generates a random rgb
                randLetterType = (int) (Math.random() * 10);
            } while (randLetterType > 2 || randLetterType < 0);
            switch (randLetterType) { // Assigns this rbg to a specific point in the char array
                case 0:
                    secretLetters[count] = 'r';
                    break;
                case 1:
                    secretLetters[count] = 'g';
                    break;
                case 2:
                    secretLetters[count] = 'b';
                    break;
            }
        }
        String secretLettersOutput = ""; // Initializes the string that displays the secret rbg
        for (int count = 0; count < numLetters; count++) // Adds the secret rbg letters in order to the string
            secretLettersOutput = secretLettersOutput + secretLetters[count];
        jLabel3.setText(secretLettersOutput); // Displays the secret rbg
        displayText = jTextArea1.getText() + "\nPlease start inputting your guesses of "+numLetters+" letters.\n";
        jTextArea1.setText(displayText); // Displays text asking for player input
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Play again button
        // Clears all the textfields and the label displaying the secret array, resets guess number, asks for a new input of number of letters
        jTextField1.setText(""); 
        jLabel3.setText("");
        guesses = 0; 
        jTextArea1.setText("Please input a new number of letters."); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Quit button
        System.exit(0); // Exits the system
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(GeniusGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeniusGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeniusGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeniusGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeniusGameUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
