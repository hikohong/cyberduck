package ch.cyberduck.core.dropbox;

/*
 * Copyright (c) 2002-2016 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.Path;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.features.Directory;

import com.dropbox.core.DbxException;

public class DropboxDirectoryFeature implements Directory {

    private DropboxSession session;

    public DropboxDirectoryFeature(DropboxSession session) {
        this.session = session;
    }

    @Override
    public void mkdir(final Path file) throws BackgroundException {
        this.mkdir(file, null);
    }

    @Override
    public void mkdir(final Path file, final String region) throws BackgroundException {
        try {
            session.getClient().files().createFolder(file.getAbsolute());
        }
        catch(DbxException e) {
            throw new DropboxExceptionMappingService().map(e);
        }
    }
}
