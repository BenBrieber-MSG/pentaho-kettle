
/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2024 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.connections.utils;

/**
 * This class contains options that control the testing of VFS Connection.
 */
public class VFSConnectionTestOptions {

  private boolean ignoreRootPath;

  public VFSConnectionTestOptions() {
  }

  public VFSConnectionTestOptions( boolean ignoreRootPath ) {
    this.ignoreRootPath = ignoreRootPath;
  }

  /**
   * Indicates if the root path should be ignored when testing the connection.
   * @return {@code true}, if the root path should be ignored; {@code false}, otherwise.
   */
  public boolean isIgnoreRootPath() {
    return ignoreRootPath;
  }


  /**
   * Sets if the root path should be ignored when testing the connection.
   * @param ignoreRootPath The ignore root path flag.
   * {@code true} to ignore the root path; {@code false}, otherwise.
   */
  public void setIgnoreRootPath( boolean ignoreRootPath ) {
    this.ignoreRootPath = ignoreRootPath;
  }
}
