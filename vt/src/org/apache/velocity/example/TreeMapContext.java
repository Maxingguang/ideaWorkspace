package org.apache.velocity.example;
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.velocity.context.AbstractContext;
import org.apache.velocity.context.Context;

import java.util.Set;
import java.util.TreeMap;

/**
 *   Example context impl that uses a TreeMap
 *
 *   Not much point other than to show how easy it is.
 *
 *   This is unsupported, example code.
 *
 * @author <a href="mailto:geirm@optonline.net">Geir Magnusson Jr.</a>
 * @version $Id: TreeMapContext.java 1780314 2017-01-26 02:28:46Z cbrisson $
 */

public class TreeMapContext extends AbstractContext
{
    private TreeMap context = new TreeMap();

    public TreeMapContext()
    {
        super();
    }

    public TreeMapContext( Context inner )
    {
        super( inner );
    }

    public Object internalGet( String key )
    {
        return context.get( key );
    }

    public Object internalPut( String key, Object value )
    {
        return context.put( key, value );
    }

    public  boolean internalContainsKey(String key)
    {
        return context.containsKey( key );
    }

    public  String[] internalGetKeys()
    {
        Set<String> keys = context.keySet();
        return keys.toArray(new String[keys.size()]);
    }

    public  Object internalRemove(String key)
    {
        return context.remove( key );
    }
}

