/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.activiti5.engine.impl.persistence;

import org.activiti5.engine.impl.interceptor.Session;
import org.activiti5.engine.impl.interceptor.SessionFactory;
import org.activiti5.engine.impl.persistence.entity.GroupEntityManager;
import org.activiti5.engine.impl.persistence.entity.GroupIdentityManager;


/**
 * @author Joram Barrez
 */
public class GroupEntityManagerFactory implements SessionFactory {

  public Class< ? > getSessionType() {
    return GroupIdentityManager.class;
  }

  public Session openSession() {
    return new GroupEntityManager();
  }

}
