
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jofie
 */
public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    Graphics dibujo;
    int arreglo[] = new int[20];

    public ventana() {
        initComponents();
        dibujo = canvas1.getGraphics();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        bGenerarArreglo = new javax.swing.JButton();
        bInsertion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bSelection = new javax.swing.JButton();
        bQuick = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bGenerarArreglo.setText("Generar Arreglo");
        bGenerarArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGenerarArregloActionPerformed(evt);
            }
        });

        bInsertion.setText("Insertion");
        bInsertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertionActionPerformed(evt);
            }
        });

        jLabel1.setText("Metodos de ordenamiento:");

        bSelection.setText("Selection");
        bSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelectionActionPerformed(evt);
            }
        });

        bQuick.setText("Quick");
        bQuick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bInsertion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(bSelection)
                        .addGap(18, 18, 18)
                        .addComponent(bQuick, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bGenerarArreglo)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bGenerarArreglo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bInsertion)
                            .addComponent(bSelection)
                            .addComponent(bQuick))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bGenerarArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGenerarArregloActionPerformed
        dibujo.clearRect(0, 0, 200, 120);
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
        dibujarArreglo(arreglo);
    }//GEN-LAST:event_bGenerarArregloActionPerformed

    private void bSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelectionActionPerformed
        dibujo.clearRect(0, 0, 200, 120);
        selectionSort(arreglo);
        dibujarArreglo(arreglo);
        arreglo = new int[20];
    }//GEN-LAST:event_bSelectionActionPerformed

    private void bInsertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertionActionPerformed
        dibujo.clearRect(0, 0, 200, 120);
        insertionSort(arreglo);
        dibujarArreglo(arreglo);
        arreglo = new int[20];
    }//GEN-LAST:event_bInsertionActionPerformed

    private void bQuickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuickActionPerformed
        dibujo.clearRect(0, 0, 200, 120);
        quickSort(arreglo);
        dibujarArreglo(arreglo);
        arreglo = new int[20];
    }//GEN-LAST:event_bQuickActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    public void dibujarArreglo(int a[]) {
        for (int i = 0; i < a.length; i++) {
            dibujo.drawRect(10 * i, 101-arreglo[i], 8, arreglo[i]);
            dibujo.fillOval((10 * i)+1, 99-arreglo[i], 7, 7);
        }
    }
    //METODO PARA INTERCAMBIAR LOS VALORES EN LOS ARRAY

    public void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    //METODO DE ORDENAMIENTO SELECTION SORT
    public void selectionSort(int[] Arreglo) {
        for (int i = 0; i < Arreglo.length; i++) {
            int min = Arreglo[i];
            int pM = i;
            for (int j = i + 1; j < Arreglo.length; j++) {
                if (Arreglo[j] < min) {
                    min = Arreglo[j];
                    pM = j;
                }
            }
            Arreglo[pM] = Arreglo[i];
            Arreglo[i] = min;

            dibujo.clearRect(0, 0, 200, 120);
            dibujarArreglo(Arreglo);
            try {
                Thread.sleep(500); //detiene el programa medio segundo, cantidad a su criterio.
            } catch (InterruptedException ex) {
            }
        }
    }

    //METODO DE ORDENAMIENTO INSERTION
    public void insertionSort(int[] a) {
        int i, j;
        int aux;
        for (i = 1; i < a.length; i++) {

            /* indice j es para explorar la sublista a[i-1]..a[0] buscando la
            posicion correcta del elemento destino*/
            j = i;
            aux = a[i];

            // se localiza el punto de inserción explorando hacia abajo
            while (j > 0 && aux < a[j - 1]) {

                // desplazar elementos hacia arriba para hacer espacio
                a[j] = a[j - 1];
                j--;
            }

            a[j] = aux;
            dibujo.clearRect(0, 0, 200, 120);
            dibujarArreglo(a);
            try {
                Thread.sleep(500); //detiene el programa medio segundo, cantidad a su criterio.
            } catch (InterruptedException ex) {
            }
        }
    }

    //METODO DE ORDENAMIENTO QUICK
    public void quickSort(int a[]) {
        quick(a, 0, a.length - 1);
    }

    private void quick(int a[], int primero, int ultimo) {
        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = a[central];
        i = primero;
        j = ultimo;

        do {
            while (a[i] < pivote) {
                i++;
            }
            while (a[j] > pivote) {
                j--;
            }
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
                dibujo.clearRect(0, 0, 200, 120);
                dibujarArreglo(a);
                try {
                    Thread.sleep(500); //detiene el programa medio segundo, cantidad a su criterio.
                } catch (InterruptedException ex) {
                }
            }
        } while (i <= j);

        if (primero < j) {
            quick(a, primero, j); // mismo proceso con sublista izqda
        }

        if (i < ultimo) {
            quick(a, i, ultimo); // mismo proceso con sublista drcha
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGenerarArreglo;
    private javax.swing.JButton bInsertion;
    private javax.swing.JButton bQuick;
    private javax.swing.JButton bSelection;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
