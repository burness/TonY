/**
 * Copyright 2019 LinkedIn Corporation. All rights reserved. Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.tony;

import com.linkedin.tony.rpc.TaskUrl;
import org.apache.hadoop.yarn.api.records.ApplicationId;

import java.util.Set;

/**
 * ClientCallbackHandler is used to get callbacks from TonyClient when some
 * asynchronous information becomes available.
 */
public interface ClientCallbackHandler {
<<<<<<< HEAD
    // Called when TonyClient gets an application id response from RM.
    public void onApplicationIdReceived(ApplicationId appId);

    // Called when TonyClient gets a set of taskUrls from TonyAM.
    public void onTaskUrlsReceived(Set<TaskUrl> taskUrlSet);
=======
    public void onApplicationIdReceived(ApplicationId appId);
    public void onTaskUrlReceived(Set<TaskUrl> taskUrlSet);
>>>>>>> Make interface methods public
}
