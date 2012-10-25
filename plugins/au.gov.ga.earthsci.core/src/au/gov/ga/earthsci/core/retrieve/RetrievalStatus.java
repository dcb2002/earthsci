/*******************************************************************************
 * Copyright 2012 Geoscience Australia
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package au.gov.ga.earthsci.core.retrieve;

import org.eclipse.core.runtime.jobs.Job;

/**
 * The status of a {@link RetrievalJob}. This is the status of the retrieval itself, and is not to be confused with the
 * state of the job as returned by {@link Job#getState()}.
 * 
 * @author James Navin (james.navin@ga.gov.au)
 */
public enum RetrievalStatus
{
	/** Resource retrieval has not yet started */
	NOT_STARTED, 
	
	/** Resource retrieval has begun */
	STARTED,
	
	/** Attempting to connect to the URL endpoint */
	CONNECTING,
	
	/** Succesfully connected to the URL endpoint */
	CONNECTED,
	
	/** A connection has been made and the content is being read */
	READING,
	
	/** Connection has been interrupted */
	INTERRUPTED,
	
	/** An error occurred during retrieval and could not be completed */
	ERROR,
	
	/** Retrieval completed successfully */
	SUCCESS
}
