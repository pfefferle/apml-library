/*	
 *  APMLStream: Java library for APML serialization/deserialization
 *	By:  Tim Schultz
 *
 *	Licensed under the Apache License, Version 2.0 (the "License"); 
 *	you may not use this file except in compliance with the License. 
 *	You may obtain a copy of the License at 
 *
 *	http://www.apache.org/licenses/LICENSE-2.0 
 *
 *	Unless required by applicable law or agreed to in writing, software 
 *	distributed under the License is distributed on an "AS IS" BASIS, 
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 *	See the License for the specific language governing permissions and 
 *	limitations under the License.
 *
 */

package org.apml.base.exceptions;

/**
 * <p>Thrown when a specified Profile name cannot be found</p> 
 * @author Tim Schultz
 */
public class ProfileNotFoundException extends Exception
{
	public ProfileNotFoundException()
	{
		super();
	}
	
	public ProfileNotFoundException(String msg)
	{
		super(msg);
	}
}
