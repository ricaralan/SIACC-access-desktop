package com.uv.siacc.access.main;

import com.uv.siacc.access.views.MainView;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alan
 */
public class Main {
    
    private static MainView view = null;
    
    public static void main(String args[]) {
        view = new MainView();
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setVisible(true);
    }
    
}
