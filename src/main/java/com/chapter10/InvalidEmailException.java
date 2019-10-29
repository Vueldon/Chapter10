/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chapter10;

/**
 *
 * @author 0788763
 */
public class InvalidEmailException extends Exception
{
    public InvalidEmailException(String message)
    {
        super(message);
    }
}
