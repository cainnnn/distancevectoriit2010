/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Menu.java
 *
 * Created on 2 nov. 2010, 21:49:34
 */

package ihm;

import distancevector.DistanceVector;
import distancevector.InvalidFileException;
import distancevector.Parser;
import distancevector.PrintShortestPath;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Klem
 */
public class Menu extends javax.swing.JFrame {
    private static String file;
private int[][] matrixInit;
private int[][] matrix;

private Boolean init= true;

    /** Creates new form Menu */
    public Menu() {
       
                this.initComponents();
                this.setVisible(true);
          
    }

    public Menu(String title) throws HeadlessException {
        super(title);
        this.initComponents();
         this.setVisible(true);
    }


private DefaultTableModel model;
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Distance Vector");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Router"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Shortest Path");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Path:");

        jLabel4.setText("Total cost:");

        jMenu1.setText("File");

        jMenu2.setText("Load");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        TxtFilter filter = new TxtFilter();
       JFileChooser chooser = new JFileChooser();
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(this);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
            Menu.file=chooser.getSelectedFile().getAbsolutePath();
         Parser test =new Parser(file);
            try {
                test.instantiateMatrice();
                this.showMatrix(test.getTaille_Matrice(), test.getMatrice());
                this.setComboboxes(test.getTaille_Matrice());
                matrixInit=test.getMatrice();

            } catch (FileNotFoundException ex) {
                invalidFile();
            }
         catch (InvalidFileException ex){
             invalidFile();
         }
    }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.copyMatrix();
DistanceVector test= new DistanceVector(matrix);
//PrintShortestPath test2 = new PrintShortestPath(matrix, test);
int [][] matrix2 = test.matrixForIhm(matrix, test.getNode());
this.showMatrix(matrix2.length,matrix2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

this.copyMatrix();
DistanceVector test= new DistanceVector(matrix);
PrintShortestPath test2 = new PrintShortestPath(matrix, test,jComboBox1.getSelectedIndex()+1,jComboBox2.getSelectedIndex()+1);
int [][] mat_res = test.matrixForIhm(matrix, test.getNode());
int [] test3= test2.getPath();





String pathString = "Path:";

int k=0;

   while (test3[k]!=0){
    pathString = pathString+ "  " + String.valueOf(test3[k]);
    k++;}
jLabel3.setText(pathString);
jLabel4.setText("Total cost: " + mat_res[jComboBox1.getSelectedIndex()][jComboBox2.getSelectedIndex()]);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    /**
    * @param args the command line arguments
    */

      public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables



public void invalidFile(){
        this.jLabel1.setText("Invalid .txt File");
        this.jLabel1.setForeground(Color.red);
}

public void showMatrix(int matrixLength, int[][] matrice){    
   if (init){
    for (int k=0;k<matrixLength; k++){
        addRow();
        addColumn();
    }
   }
   init= false;

for (int i=0;i<matrixLength; i++){
    for (int j=0;j<matrixLength; j++){
        
     jTable1.setValueAt(matrice[i][j], i, j+1);
    }
}
}
public void setComboboxes(int matrixLength){

    for (int j=2;j<matrixLength+1;j++){
        jComboBox1.addItem(j);
        jComboBox2.addItem(j);
    }
}

public void addRow(){
model= (DefaultTableModel) jTable1.getModel();
model.addRow(new Object[]{model.getRowCount()+1});
}
public void addColumn(){
model= (DefaultTableModel) jTable1.getModel();
model.addColumn(model.getColumnCount());
}


public void copyMatrix(){
    matrix = new int[matrixInit.length][matrixInit.length];
    for (int i=0;i<matrixInit.length;i++){
  for (int j=0;j<matrixInit.length;j++){
matrix[i][j]=matrixInit[i][j];
  }

}
}

}
