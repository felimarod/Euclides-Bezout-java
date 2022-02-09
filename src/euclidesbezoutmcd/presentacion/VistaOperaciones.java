/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidesbezoutmcd.presentacion;

import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class VistaOperaciones extends javax.swing.JFrame {
    /**
     * Creates new form VistaOperaciones
     */
    public VistaOperaciones() {
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

        jpTitulo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jpResultados = new javax.swing.JPanel();
        jlResultadoCL = new javax.swing.JLabel();
        jlResultadoMCD = new javax.swing.JLabel();
        jpAlgoritmoEuclides = new javax.swing.JPanel();
        jlTitEuclides = new javax.swing.JLabel();
        jlAEuclides = new javax.swing.JLabel();
        jpIdentidadBezout = new javax.swing.JPanel();
        jlTitBezout = new javax.swing.JLabel();
        jlIBezout = new javax.swing.JLabel();
        jpRLineal = new javax.swing.JPanel();
        jlTitRLineal = new javax.swing.JLabel();
        jlRLineal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("<html> <h1> Titulo </h1> </html> ");

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addContainerGap())
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addContainerGap())
        );

        jpResultados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlResultadoCL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlResultadoCL.setText("<html> <h3>Combinación lineal</h3> </html> ");

        jlResultadoMCD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlResultadoMCD.setText("<html> <h3> MCD</h3> </html> ");

        javax.swing.GroupLayout jpResultadosLayout = new javax.swing.GroupLayout(jpResultados);
        jpResultados.setLayout(jpResultadosLayout);
        jpResultadosLayout.setHorizontalGroup(
            jpResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlResultadoCL)
                    .addComponent(jlResultadoMCD))
                .addContainerGap())
        );
        jpResultadosLayout.setVerticalGroup(
            jpResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlResultadoMCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlResultadoCL)
                .addContainerGap())
        );

        jpAlgoritmoEuclides.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTitEuclides.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitEuclides.setText("<html> <h3> Algoritmo de Euclides</h3> </html>");

        jlAEuclides.setToolTipText("");
        jlAEuclides.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jpAlgoritmoEuclidesLayout = new javax.swing.GroupLayout(jpAlgoritmoEuclides);
        jpAlgoritmoEuclides.setLayout(jpAlgoritmoEuclidesLayout);
        jpAlgoritmoEuclidesLayout.setHorizontalGroup(
            jpAlgoritmoEuclidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAlgoritmoEuclidesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAlgoritmoEuclidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlAEuclides, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlTitEuclides, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpAlgoritmoEuclidesLayout.setVerticalGroup(
            jpAlgoritmoEuclidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlgoritmoEuclidesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitEuclides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlAEuclides, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpIdentidadBezout.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTitBezout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitBezout.setText("<html> <h3> Identidad de Bezout</h3> </html>");

        jlIBezout.setToolTipText("");
        jlIBezout.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jpIdentidadBezoutLayout = new javax.swing.GroupLayout(jpIdentidadBezout);
        jpIdentidadBezout.setLayout(jpIdentidadBezoutLayout);
        jpIdentidadBezoutLayout.setHorizontalGroup(
            jpIdentidadBezoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIdentidadBezoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpIdentidadBezoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitBezout, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jlIBezout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpIdentidadBezoutLayout.setVerticalGroup(
            jpIdentidadBezoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIdentidadBezoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitBezout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlIBezout, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpRLineal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTitRLineal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitRLineal.setText("<html> <h3> Regresión Lineal</h3> </html>");

        jlRLineal.setToolTipText("");
        jlRLineal.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jpRLinealLayout = new javax.swing.GroupLayout(jpRLineal);
        jpRLineal.setLayout(jpRLinealLayout);
        jpRLinealLayout.setHorizontalGroup(
            jpRLinealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRLinealLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRLinealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitRLineal, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jlRLineal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpRLinealLayout.setVerticalGroup(
            jpRLinealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRLinealLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitRLineal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlRLineal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpAlgoritmoEuclides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpIdentidadBezout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpRLineal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpIdentidadBezout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpAlgoritmoEuclides, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpRLineal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getJlIBezout() {
        return jlIBezout;
    }

    public JLabel getJlResultadoCL() {
        return jlResultadoCL;
    }

    public JLabel getJlResultadoMCD() {
        return jlResultadoMCD;
    }

    public JLabel getJlTitBezout() {
        return jlTitBezout;
    }

    public JLabel getJlTitEuclides() {
        return jlTitEuclides;
    }

    public JLabel getJlAEuclides() {
        return jlAEuclides;
    }

    public JLabel getJlTitulo() {
        return jlTitulo;
    }

    public JLabel getJlRLineal() {
        return jlRLineal;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlAEuclides;
    private javax.swing.JLabel jlIBezout;
    private javax.swing.JLabel jlRLineal;
    private javax.swing.JLabel jlResultadoCL;
    private javax.swing.JLabel jlResultadoMCD;
    private javax.swing.JLabel jlTitBezout;
    private javax.swing.JLabel jlTitEuclides;
    private javax.swing.JLabel jlTitRLineal;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpAlgoritmoEuclides;
    private javax.swing.JPanel jpIdentidadBezout;
    private javax.swing.JPanel jpRLineal;
    private javax.swing.JPanel jpResultados;
    private javax.swing.JPanel jpTitulo;
    // End of variables declaration//GEN-END:variables
}