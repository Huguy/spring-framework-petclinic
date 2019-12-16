/*
 * Copyright 2002-2013 the original author or authors.
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
package org.springframework.samples.petclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Simple JavaBean domain object with an id property. Used as a base class for objects needing this property.
 *
 * @author Ken Krebs
 * @author Juergen Hoeller
 */
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        return this.id == null;
    }
    
    public void func1() {
        let arr = ["a", "b", "c"];

        let expectedValue = "b";
        if (expectedValue in arr) { // Noncompliant, will be always false
            return expectedValue + " found in the array";
        } else {
            return expectedValue + " not found";
        }
    }

    public void func2() {
        let arr = ["a", "b", "c"];

        let expectedValue = "1"; // index #1 is corresponding to the value "b"
        if (expectedValue in arr) { // Noncompliant, will be always true because the array is made of 3 elements and the #1 is always there whatever its value
            return expectedValue + " found in the array";
        } else {
            return expectedValue + " not found";
        }
    }
}
