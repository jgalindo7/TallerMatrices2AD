/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setRowCount(0);
        tm.setColumnCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }

    public static void letraB(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {

                aux = (int) TablaInicial.getValueAt(i, j);
                if (j == 0 || i == 0 && j != nFilas-1 || i == nFilas/2 || i == nFilas-1 || j == (nColumnas-1)) {
                    TablaResultado.setValueAt(aux, i, j);
                }

            }

        }
    }


    public static void letraK(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if (j == nColumnas / 2 || i + j == nFilas - 1 && i <= j || i == j && i + j > nFilas) {
                    TablaResultado.setValueAt(aux, i, j);
                }

            }

        }
    }

    public static void letraM(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if ((i + j == nFilas - 1 && i <= j) || (i == j && i + j <= nFilas) || j == 0 || j == nColumnas - 1) {
                    TablaResultado.setValueAt(aux, i, j);
                }

            }

        }
    }

    public static void letraW(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if ((i + j == nFilas - 1 && i >= j) || (i == j && i + j >= nFilas) || j == 0 || j == nColumnas - 1) {
                    TablaResultado.setValueAt(aux, i, j);
                }

            }

        }
    }

    public static void letraQ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 && j != 0 && j != nf - 1 || (j == 0 && i <= nf / 2 && i != 0) || (((nf / 2 + 1) == i && j != 0 && j != nf - 1)) || (j == nc - 1 && i <= nf / 2 && i != 0) || (i == j && i > nf / 2)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

  
    public static void letraJ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == nc / 2 || i == nf - 1 && j < nc / 2 || j == 0 && i > nf / 2) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraG(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || i == 0 || i == nf - 1 || j == nc - 1 && j / i <= 2 || i == nf / 3 || (j == nc - 1 && j / i >= nc - 1)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraR(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((j == 0 || i == 0 || i == nf / 2) || (j == nc - 1 && j / i >= 2) || (i == j && i + j >= nf)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }
}
