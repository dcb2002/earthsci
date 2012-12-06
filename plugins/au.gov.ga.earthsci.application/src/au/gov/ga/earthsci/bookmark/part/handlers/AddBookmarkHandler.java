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
package au.gov.ga.earthsci.bookmark.part.handlers;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;

import au.gov.ga.earthsci.bookmark.BookmarkFactory;
import au.gov.ga.earthsci.bookmark.model.IBookmark;
import au.gov.ga.earthsci.bookmark.model.IBookmarks;
import au.gov.ga.earthsci.bookmark.properties.camera.CameraProperty;

/**
 * A command handler for adding new bookmarks from the current world state
 * 
 * @author James Navin (james.navin@ga.gov.au)
 */
public class AddBookmarkHandler
{
	@Inject
	private IBookmarks bookmarks;
	
	@Execute
	public void execute()
	{
		IBookmark b = BookmarkFactory.createBookmark(CameraProperty.TYPE);
		System.out.println(bookmarks);
		bookmarks.getDefaultList().getBookmarks().add(b);
		System.out.println(b);
	}
}
