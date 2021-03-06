/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.fluent;

import org.drools.fluent.standard.FluentStandardSimulation;


public interface FluentPath<T, S> extends FluentBase, FluentTest<T> {
    S newStep(long distance);
    
//    FluentPath newPath(String name); // ends current path and creates a new one
    
//    BU newKnowledgeBuilder();
//    BA newKnowledgeBase();
//    S newStatefulKnowledgeSession();
//
//    BU getKnowledgeBuilder();
//    BA getKnowledgeBase();
//    S getStatefulKnowledgeSession();        
//    
//    BU getKnowledgeBuilder(String name);
//    BA getKnowledgeBase(String name);
//    S getStatefulKnowledgeSession(String name);  

}
