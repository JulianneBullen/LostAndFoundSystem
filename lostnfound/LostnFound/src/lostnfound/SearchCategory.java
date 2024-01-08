
package lostnfound;

import java.awt.Image;
import javax.swing.ImageIcon;

public class SearchCategory extends javax.swing.JFrame {
        private Panel panelReference;
    public SearchCategory() {
        initComponents();
    }

public SearchCategory(Panel panelReference) {
        initComponents();
        this.panelReference = panelReference;
    }
@Override
    public void setDefaultCloseOperation(int operation) {
        // Instead of closing, just hide the SearchCategory frame
        if (operation == DISPOSE_ON_CLOSE) {
            setVisible(false);
            return;
        }
        super.setDefaultCloseOperation(operation);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelimageSearch = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabelLocationSearch = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabelTimeSearch = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabelItem = new javax.swing.JLabel();
        jLabelColorSearch = new javax.swing.JLabel();
        jLabelCapacitySearch = new javax.swing.JLabel();
        jLabelDetailsSearch = new javax.swing.JLabel();
        jLabelCategorySearch = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(15, 32, 42));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(240, 231, 213));
        jLabel30.setText("Location Lost :");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 231, 213));
        jLabel20.setText("Item Name :");

        jLabelimageSearch.setBackground(new java.awt.Color(240, 231, 213));
        jLabelimageSearch.setForeground(new java.awt.Color(240, 231, 213));
        jLabelimageSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 231, 213), 2));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(240, 231, 213));
        jLabel21.setText("Color : ");

        jLabel33.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(240, 231, 213));
        jLabel33.setText("Time Lost :");

        jLabelLocationSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelLocationSearch.setForeground(new java.awt.Color(240, 231, 213));
        jLabelLocationSearch.setText("6");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(240, 231, 213));
        jLabel28.setText("Category :");

        jLabelTimeSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelTimeSearch.setForeground(new java.awt.Color(240, 231, 213));
        jLabelTimeSearch.setText("7");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 231, 213));
        jLabel24.setText("Additional Details : ");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 231, 213));
        jLabel25.setText("Size : ");

        jLabelItem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelItem.setForeground(new java.awt.Color(240, 231, 213));
        jLabelItem.setText("1");

        jLabelColorSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelColorSearch.setForeground(new java.awt.Color(240, 231, 213));
        jLabelColorSearch.setText("2");

        jLabelCapacitySearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCapacitySearch.setForeground(new java.awt.Color(240, 231, 213));
        jLabelCapacitySearch.setText("3");

        jLabelDetailsSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelDetailsSearch.setForeground(new java.awt.Color(240, 231, 213));
        jLabelDetailsSearch.setText("5");

        jLabelCategorySearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCategorySearch.setForeground(new java.awt.Color(240, 231, 213));
        jLabelCategorySearch.setText("4");

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelimageSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel25)
                    .addComponent(jLabel20)
                    .addComponent(jLabel24)
                    .addComponent(jLabel30)
                    .addComponent(jLabel33)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelColorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCapacitySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDetailsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLocationSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTimeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelColorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCapacitySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDetailsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLocationSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTimeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelimageSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void setInfo(String itemName, String itemColor, String itemCapacity, String additionalDetails, String category, String locationLost, String timeLost, ImageIcon imageIcon) {
    jLabelItem.setText(itemName);
    jLabelColorSearch.setText(itemColor);
    jLabelCapacitySearch.setText(itemCapacity);
    jLabelDetailsSearch.setText(additionalDetails);
    jLabelCategorySearch.setText(category);
    jLabelLocationSearch.setText(locationLost);
    jLabelTimeSearch.setText(timeLost);

    // Set the image received to the label
    Image img = imageIcon.getImage();
    Image newImg = img.getScaledInstance(jLabelimageSearch.getWidth(), jLabelimageSearch.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledImage = new ImageIcon(newImg);
    jLabelimageSearch.setIcon(scaledImage);

    // Set other labels with received information...
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(SearchCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(SearchCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(SearchCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(SearchCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
      java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            SearchCategory searchCategoryFrame = new SearchCategory();
            searchCategoryFrame.setLocationRelativeTo(null); // Center the frame on the screen
            searchCategoryFrame.setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabelCapacitySearch;
    private javax.swing.JLabel jLabelCategorySearch;
    private javax.swing.JLabel jLabelColorSearch;
    private javax.swing.JLabel jLabelDetailsSearch;
    private javax.swing.JLabel jLabelItem;
    private javax.swing.JLabel jLabelLocationSearch;
    private javax.swing.JLabel jLabelTimeSearch;
    private javax.swing.JLabel jLabelimageSearch;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
