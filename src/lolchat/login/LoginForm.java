/*
 * Copyright (C) 2012 Tomáš 'argoneus' Drbota
 *
 * This file is part of LoLChat.
 *
 * LoLChat is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * LoLChat is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with LoLChat.  If not, see <http://www.gnu.org/licenses/>.
 */

package lolchat.login;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;

/**
 * Form representing the Login screen
 */
public class LoginForm
{
    /**
     * Creates and shows the login form
     */
    public void CreateForm()
    {
        JFrame frame = new JFrame();
        MigLayout loginLayout = new MigLayout("fill, ins 15 30 15 30, gapy 0", "[left]", "[][][][][][17!][17!][17!][]");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel login = new JPanel(loginLayout);
        login.add(new JLabel("Username"), "wrap");
        login.add(new JTextField(""), "h :10:, w :170:");
        login.add(new JLabel("Password"), "newline, wrap");
        login.add(new JTextField(""), "h :10:, w :170:, wrap");
        
        login.add(new JSeparator(), "gaptop 5, gapbottom 5, growx, wrap");
        login.add(new JCheckBox("Save username"), "wrap");
        login.add(new JCheckBox("Save password"), "wrap");
        login.add(new JCheckBox("Auto-login"), "wrap");
        
        login.add(new JButton("Login"), "split, center, gaptop 5");
        login.add(new JButton("Quit"));
        
        frame.add(login);
        
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
