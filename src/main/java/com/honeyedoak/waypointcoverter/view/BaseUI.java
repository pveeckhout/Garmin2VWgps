/*
 * The MIT License
 *
 * Copyright 2013 Pieter Van Eeckhout.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.honeyedoak.waypointcoverter.view;

import com.honeyedoak.waypointcoverter.util.BaseObserver;
import com.honeyedoak.waypointcoverter.controller.DomainFacade;
import com.honeyedoak.waypointcoverter.controller.waypoint.WaypointRepository;
import com.honeyedoak.waypointcoverter.model.WaypointUI;

import java.util.List;

/**
 * BaseUI.java (UTF-8)
 *
 * <p>Abstract class for OOP purposes, defines the functions and some default
 * behaviour of the UI implementations.</p>
 *
 * 2013/06/08
 *
 * @author Pieter Van Eeckhout <vaneeckhout.pieter@gmail.com>
 * @since 1.0.0
 * @version 1.0.1
 */
public abstract class BaseUI extends BaseObserver<WaypointRepository, List<WaypointUI>> {
    
    protected DomainFacade domainFacade;

    /**
     * Constructor
     * 
     * @param domainFacade
     */
    public BaseUI(DomainFacade domainFacade) {
        this.domainFacade = domainFacade;
    }

    public void setDomainFacade(DomainFacade domainFacade) {
        this.domainFacade = domainFacade;
    }
}
