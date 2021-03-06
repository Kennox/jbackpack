/**
 * SelectRestoreDirectoryDialog.java
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
 * Created on 17.07.2010, 10:43:30
 */
package ch.fhnw.jbackpack;

import ch.fhnw.jbackpack.chooser.NoHiddenFilesSwingFileFilter;
import ch.fhnw.util.FileTools;
import java.awt.Dimension;
import java.io.File;
import java.text.MessageFormat;
import java.util.ResourceBundle;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 * A dialog for selecting a restore directory
 *
 * @author Ronny Standtke <Ronny.Standtke@gmx.net>
 */
public class SelectRestoreDirectoryDialog extends javax.swing.JDialog {

    private static final ResourceBundle BUNDLE =
            ResourceBundle.getBundle("ch/fhnw/jbackpack/Strings");
    private static final FileFilter NO_HIDDEN_FILES_FILTER =
            NoHiddenFilesSwingFileFilter.getInstance();
    private File selectedDirectory;
    private boolean restore;

    /**
     * Creates new form SelectRestoreDirectoryDialog
     *
     * @param parent the parent frame
     */
    public SelectRestoreDirectoryDialog(java.awt.Frame parent) {

        super(parent, true);

        initComponents();

        warningLabel.setIcon(IconManager.WARNING_ICON);

        directoryChooser.addChoosableFileFilter(NO_HIDDEN_FILES_FILTER);
        directoryChooser.setFileFilter(NO_HIDDEN_FILES_FILTER);
        directoryChooser.setApproveButtonText(BUNDLE.getString("Restore"));

        pack();
        setLocationRelativeTo(parent);

        Dimension preferredSize = warningLabel.getPreferredSize();
        warningLabel.setMaximumSize(preferredSize);
        warningLabel.setMinimumSize(preferredSize);
    }

    /**
     * returns <tt>true</tt> if the user pressed the "restore" button,
     * <tt>false</tt> otherwise
     *
     * @return <tt>true</tt> if the user pressed the "restore" button,
     * <tt>false</tt> otherwise
     */
    public boolean restoreSelected() {
        return restore;
    }

    /**
     * returns the selected directory
     *
     * @return the selected directory
     */
    public File getSelectedDirectory() {
        return selectedDirectory;
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

        warningLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        directoryChooser = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ch/fhnw/jbackpack/Strings"); // NOI18N
        setTitle(bundle.getString("SelectRestoreDirectoryDialog.title")); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        warningLabel.setText(bundle.getString("SelectRestoreDirectoryDialog.warningLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        getContentPane().add(warningLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        getContentPane().add(jSeparator1, gridBagConstraints);

        directoryChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        directoryChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        directoryChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directoryChooserActionPerformed(evt);
            }
        });
        directoryChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                directoryChooserPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(directoryChooser, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void directoryChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directoryChooserActionPerformed
        if (evt.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
            selectedDirectory = directoryChooser.getSelectedFile();
            if (selectedDirectory == null) {
                showError(BUNDLE.getString("Error_No_Restore_Directory"));
                return;
            }

            // check that user can write into the selected directory
            if (!FileTools.canWrite(selectedDirectory)) {
                String errorMessage = BUNDLE.getString(
                        "Error_Restore_Directory_Unwritable");
                errorMessage = MessageFormat.format(
                        errorMessage, selectedDirectory);
                showError(errorMessage);
                return;
            }

            // check that user can change permissions of this directory
            if (selectedDirectory.setWritable(false)) {
                selectedDirectory.setWritable(true);
            } else {
                String errorMessage = BUNDLE.getString(
                        "Error_Restore_Directory_Unmodifiable");
                errorMessage = MessageFormat.format(
                        errorMessage, selectedDirectory);
                showError(errorMessage);
                return;
            }

            restore = true;
        }

        setVisible(false);
        dispose();
    }//GEN-LAST:event_directoryChooserActionPerformed

    private void directoryChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_directoryChooserPropertyChange
        if (evt.getPropertyName().equals(JFileChooser.FILE_FILTER_CHANGED_PROPERTY)) {
            directoryChooser.setFileHidingEnabled(
                    directoryChooser.getFileFilter() == NO_HIDDEN_FILES_FILTER);
            directoryChooser.rescanCurrentDirectory();
        }
    }//GEN-LAST:event_directoryChooserPropertyChange

    private void showError(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage,
                BUNDLE.getString("Error"), JOptionPane.ERROR_MESSAGE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser directoryChooser;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
