﻿// 
// Copyright (c) 2010-2013 Yves Langisch. All rights reserved.
// http://cyberduck.ch/
// 
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
// 
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.
// 
// Bug fixes, suggestions and comments should be sent to:
// yves@cyberduck.ch
// 

using ch.cyberduck.core;
using ch.cyberduck.core.transfer;
using org.apache.log4j;

namespace Ch.Cyberduck.Ui.Controller
{
    internal class DownloadPromptModel : TransferPromptModel
    {
        private static readonly Logger Log = Logger.getLogger(typeof (DownloadPromptModel).Name);

        public DownloadPromptModel(TransferPromptController controller, Transfer transfer) : base(controller, transfer)
        {
            ;
        }

        public override object GetSize(Path path)
        {
            return path.getLocal().attributes().getSize();
        }

        public override object GetWarningImage(Path path)
        {
            if (path.attributes().isFile())
            {
                if (path.attributes().getSize() == 0)
                {
                    return AlertIcon;
                }
                if (path.getLocal().attributes().getSize() > path.attributes().getSize())
                {
                    return AlertIcon;
                }
            }
            return null;
        }
    }
}