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

using System;
using Ch.Cyberduck.Ui.Controller;
using Ch.Cyberduck.Ui.Controller.Threading;
using ch.cyberduck.ui.action;

namespace ch.cyberduck.ui.controller.threading
{
    internal class WorkerBackgroundAction : BrowserBackgroundAction
    {
        private readonly Worker _worker;
        private Object _result;

        public WorkerBackgroundAction(BrowserController controller, Worker worker)
            : base(controller)
        {
            _worker = worker;
        }

        public override object run()
        {
            return _worker.run();
        }

        public override void cleanup()
        {
            _worker.cleanup(_result);
        }

        public override String getActivity()
        {
            return _worker.getActivity();
        }
    }
}