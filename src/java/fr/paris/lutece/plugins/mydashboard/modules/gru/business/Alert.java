/*
 * Copyright (c) 2002-2015, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */

package fr.paris.lutece.plugins.mydashboard.modules.gru.business;

/**
 * Alert
 */
public class Alert 
{

    private String _strName;
    private String _strCategory;
    private int _nRegistered;
    private int _nSubscribersCount;
    
    
       /**
        * Returns the Name
        * @return The Name
        */ 
    public String getName()
    {
        return _strName;
    }
    
       /**
        * Sets the Name
        * @param strName The Name
        */ 
    public void setName( String strName )
    {
        _strName = strName;
    }
    
       /**
        * Returns the Category
        * @return The Category
        */ 
    public String getCategory()
    {
        return _strCategory;
    }
    
       /**
        * Sets the Category
        * @param strCategory The Category
        */ 
    public void setCategory( String strCategory )
    {
        _strCategory = strCategory;
    }
    
       /**
        * Returns the Registered
        * @return The Registered
        */ 
    public int getRegistered()
    {
        return _nRegistered;
    }
    
       /**
        * Sets the Registered
        * @param nRegistered The Registered
        */ 
    public void setRegistered( int nRegistered )
    {
        _nRegistered = nRegistered;
    }
    
       /**
        * Returns the SubscribersCount
        * @return The SubscribersCount
        */ 
    public int getSubscribersCount()
    {
        return _nSubscribersCount;
    }
    
       /**
        * Sets the SubscribersCount
        * @param nSubscribersCount The SubscribersCount
        */ 
    public void setSubscribersCount( int nSubscribersCount )
    {
        _nSubscribersCount = nSubscribersCount;
    }

}
