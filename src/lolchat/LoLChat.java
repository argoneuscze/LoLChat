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

package lolchat;

import lolchat.login.*;

/**
 * Main program class
 */
public class LoLChat
{
    /**
     * Main entry point for the application
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        LoginForm login = new LoginForm();
        login.CreateForm();
    }
}
