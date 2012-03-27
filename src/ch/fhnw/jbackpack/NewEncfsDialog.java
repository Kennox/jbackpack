/**
 * NewEncfsDialog.java
 *
 * Copyright (C) 2010 imedias
 *
 * This file is part of JBackpack.
 *
 * JBackpack is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option) any
 * later version.
 *
 * JBackpack is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * Created on Apr 27, 2010, 3:05:35 PM
 */
package ch.fhnw.jbackpack;

import java.util.Arrays;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 * A dialog for creating a new encfs.
 *
 * @author Ronny Standtke <ronny.standtke@fhnw.ch>
 */
public class NewEncfsDialog extends javax.swing.JDialog {

    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle(
            "ch/fhnw/jbackpack/Strings");
    private int selectedOption = JOptionPane.CANCEL_OPTION;

    /**
     * Creates new form NewEncfsDialog
     *
     * @param parent the parent frame
     */
    public NewEncfsDialog(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        infoLabel.setIcon(IconManager.WARNING_ICON);
        pack();
        setLocationRelativeTo(parent);
    }

    /**
     * shows the dialog
     *
     * @return the selected option
     */
    public int showDialog() {
        setVisible(true);
        return selectedOption;
    }

    /**
     * returns the password with characters escaped shell characters
     *
     * @return the password with characters escaped shell characters
     */
    public String getPassword() {
        return validateInput(passwordField1.getPassword());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        infoLabel = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        passwordLabel2 = new javax.swing.JLabel();
        passwordField2 = new javax.swing.JPasswordField();
        timeInfoLabel = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ch/fhnw/jbackpack/Strings"); // NOI18N
        setTitle(bundle.getString("NewEncfsDialog.title")); // NOI18N
        setName("NewEncfsDialog"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        infoLabel.setText(bundle.getString("NewEncfsDialog.infoLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        getContentPane().add(infoLabel, gridBagConstraints);

        passwordLabel1.setText(bundle.getString("NewEncfsDialog.passwordLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 5);
        getContentPane().add(passwordLabel1, gridBagConstraints);

        passwordField1.setName("passwordField1"); // NOI18N
        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 5);
        getContentPane().add(passwordField1, gridBagConstraints);

        passwordLabel2.setText(bundle.getString("NewEncfsDialog.passwordLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 5);
        getContentPane().add(passwordLabel2, gridBagConstraints);

        passwordField2.setName("passwordField2"); // NOI18N
        passwordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 5);
        getContentPane().add(passwordField2, gridBagConstraints);

        timeInfoLabel.setText(bundle.getString("NewEncfsDialog.timeInfoLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 0, 10);
        getContentPane().add(timeInfoLabel, gridBagConstraints);

        buttonPanel.setLayout(new java.awt.GridBagLayout());

        okButton.setText(bundle.getString("NewEncfsDialog.okButton.text")); // NOI18N
        okButton.setName("okButton"); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        buttonPanel.add(okButton, gridBagConstraints);

        cancelButton.setText(bundle.getString("NewEncfsDialog.cancelButton.text")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        buttonPanel.add(cancelButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        getContentPane().add(buttonPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        checkInput();
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        selectedOption = JOptionPane.CANCEL_OPTION;
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
        passwordField2.requestFocusInWindow();
    }//GEN-LAST:event_passwordField1ActionPerformed

    private void passwordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField2ActionPerformed
        checkInput();
    }//GEN-LAST:event_passwordField2ActionPerformed

    private void checkInput() {
        char[] password1 = passwordField1.getPassword();
        if (password1.length == 0) {
            JOptionPane.showMessageDialog(this,
                    BUNDLE.getString("Error_No_Password"),
                    BUNDLE.getString("Error"),
                    JOptionPane.ERROR_MESSAGE);
            retry();
            return;
        }

        char[] password2 = passwordField2.getPassword();
        if (Arrays.equals(password1, password2)) {
            selectedOption = JOptionPane.OK_OPTION;
            dispose();
        } else {
            JOptionPane.showMessageDialog(this,
                    BUNDLE.getString("Passwords_Mismatch"),
                    BUNDLE.getString("Error"),
                    JOptionPane.ERROR_MESSAGE);
            retry();
        }
    }

    private void retry() {
        passwordField1.setText(null);
        passwordField2.setText(null);
        passwordField1.requestFocusInWindow();
    }

    /**
     * Mask bash control characters (e.g. $,",`)
     *
     * @param charInput char [] to be fixed
     * @return fixed String
     */
    private String validateInput(char[] charInput) {
        String input = "";
        for (char c : charInput) {
            input += c;
        }
        String escapedInput = input.replace("\"", "\\\"");
        escapedInput = escapedInput.replace("`", "\\`");
        escapedInput = escapedInput.replace("$", "\\$");
        return escapedInput;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JLabel timeInfoLabel;
    // End of variables declaration//GEN-END:variables
}
