/*
 * Copyright (C) 2014 Pietro Rampini - PiKo Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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
package com.rampo.updatechecker;

/**
 * Interface to compare the versionDownloadable obtained with the version installed.
 *
 * @author Pietro Rampini (rampini.pietro@gmail.com)
 */
public interface UpdateCheckerResult {
    /**
     * mVersionDonwloadable isn't equal to manifest versionName -> New update available.
     * Show the Notice because it's the first time or the number of the checks made is a multiple of the argument of setSuccessfulChecksRequired(int) method. (If you don't call setSuccessfulChecksRequired(int) the default is 5).
     *
     * @param mVersionDonwloadable version downloadable from the Store.
     * @see com.rampo.updatechecker.UpdateChecker#setSuccessfulChecksRequired(int)
     */
    public void foundUpdateAndShowIt(String mVersionDonwloadable);

    /**
     * mVersionDonwloadable isn't equal to manifest versionName -> New update available.
     * Show the Notice because it's the first time or the number of the checks made is a multiple of the argument of setSuccessfulChecksRequired(int) method. (If you don't call setSuccessfulChecksRequired(int) the default is 5).
     *
     * @param mVersionDonwloadable version downloadable from the Store.
     * @see com.rampo.updatechecker.UpdateChecker#setSuccessfulChecksRequired(int)
     */
    public void foundUpdateAndDontShowIt(String mVersionDonwloadable);

    /**
     * mVersionDonwloadable is equal to manifest versionName -> No new update available.
     * Don't show the Notice
     *
     * @param mVersionDonwloadable version downloadable from the Store.
     */
    public void upToDate(String mVersionDonwloadable);
}
