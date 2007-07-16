/*
 * Copyright 2005-2007 the original author or authors.
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
package net.sf.dozer.util.mapping.recursive;

/**
 */
public class TestClassBPrime {
  /** */
  private String rue;

  /** */
  private String ville;

  /** */
  private TestClassAPrime parent;

  /** */
  private int prime = 31;

  /** {@inheritDoc} */
  public TestClassAPrime getParent() {
    return this.parent;
  }

  /** {@inheritDoc} */
  public void setParent(final TestClassAPrime parent) {
    this.parent = parent;
  }

  /** {@inheritDoc} */
  public String getRue() {
    return this.rue;
  }

  /** {@inheritDoc} */
  public void setRue(final String rue) {
    this.rue = rue;
  }

  /** {@inheritDoc} */
  public String getVille() {
    return this.ville;
  }

  /** {@inheritDoc} */
  public void setVille(final String ville) {
    this.ville = ville;
  }

  /** {@inheritDoc} */
  public int hashCode() {
    int result = 1;
    result = prime * result + ((this.rue == null) ? 0 : this.rue.hashCode());
    return result;
  }

  /** {@inheritDoc} */
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (this.getClass() != obj.getClass()) {
      return false;
    }
    final TestClassBPrime other = (TestClassBPrime) obj;
    if (this.rue == null) {
      if (other.rue != null) {
        return false;
      }
    } else if (!this.rue.equals(other.rue)) {
      return false;
    }
    return true;
  }
}