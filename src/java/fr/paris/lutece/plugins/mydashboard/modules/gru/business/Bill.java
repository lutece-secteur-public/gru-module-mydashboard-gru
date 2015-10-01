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
 * Bill Object
 */
public class Bill
{
    // Variables declarations 
    private String _strSubject;
    private String _strBillingDate;
    private String _strPaymentDueDate;
    private String _strInvoiceAmount;
    private String _strDocumentUrl;
    private String _strPaymentUrl;

    /**
     * Returns the Subject
     * @return The Subject
     */
    public String getSubject(  )
    {
        return _strSubject;
    }

    /**
     * Sets the Subject
     * @param strSubject The Subject
     */
    public void setSubject( String strSubject )
    {
        _strSubject = strSubject;
    }

    /**
     * Returns the BillingDate
     * @return The BillingDate
     */
    public String getBillingDate(  )
    {
        return _strBillingDate;
    }

    /**
     * Sets the BillingDate
     * @param strBillingDate The BillingDate
     */
    public void setBillingDate( String strBillingDate )
    {
        _strBillingDate = strBillingDate;
    }

    /**
     * Returns the PaymentDueDate
     * @return The PaymentDueDate
     */
    public String getPaymentDueDate(  )
    {
        return _strPaymentDueDate;
    }

    /**
     * Sets the PaymentDueDate
     * @param strPaymentDueDate The PaymentDueDate
     */
    public void setPaymentDueDate( String strPaymentDueDate )
    {
        _strPaymentDueDate = strPaymentDueDate;
    }

    /**
     * Returns the InvoiceAmount
     * @return The InvoiceAmount
     */
    public String getInvoiceAmount(  )
    {
        return _strInvoiceAmount;
    }

    /**
     * Sets the InvoiceAmount
     * @param strInvoiceAmount The InvoiceAmount
     */
    public void setInvoiceAmount( String strInvoiceAmount )
    {
        _strInvoiceAmount = strInvoiceAmount;
    }

    /**
     * Returns the DocumentUrl
     * @return The DocumentUrl
     */
    public String getDocumentUrl(  )
    {
        return _strDocumentUrl;
    }

    /**
     * Sets the DocumentUrl
     * @param strDocumentUrl The DocumentUrl
     */
    public void setDocumentUrl( String strDocumentUrl )
    {
        _strDocumentUrl = strDocumentUrl;
    }

    /**
     * Returns the PaymentUrl
     * @return The PaymentUrl
     */
    public String getPaymentUrl(  )
    {
        return _strPaymentUrl;
    }

    /**
     * Sets the PaymentUrl
     * @param strPaymentUrl The PaymentUrl
     */
    public void setPaymentUrl( String strPaymentUrl )
    {
        _strPaymentUrl = strPaymentUrl;
    }
}
