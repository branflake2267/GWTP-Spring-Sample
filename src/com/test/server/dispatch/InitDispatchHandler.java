/**
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.test.server.dispatch;

import org.springframework.stereotype.Component;

import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.AbstractActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;
import com.gwtplatform.dispatch.shared.NoResult;

import com.test.shared.dispatch.InitDispatchAction;

@Component
public class InitDispatchHandler extends 
		AbstractActionHandler<InitDispatchAction, NoResult> {

    public InitDispatchHandler() {
        super(InitDispatchAction.class);
    }

    @Override
    public NoResult execute(InitDispatchAction action, ExecutionContext context)
            throws ActionException {
        return new NoResult();
    }

    @Override
    public Class<InitDispatchAction> getActionType() {
        return InitDispatchAction.class;
    }

    @Override
    public void undo(InitDispatchAction action, NoResult result, ExecutionContext context)
            throws ActionException {
        // Not undoable
    }
}
