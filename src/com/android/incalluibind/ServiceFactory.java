/*
 * Copyright (C) 2013 The Android Open Source Project
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
 * limitations under the License
 */

package com.android.incalluibind;

import android.content.Context;

import com.android.incallui.service.PhoneNumberService;
import com.android.incallui.service.PhoneNumberServiceImpl;

/**
 * Default static binder for services.
 */
public class ServiceFactory {

    public static PhoneNumberService newPhoneNumberService(Context context) {
        return (PhoneNumberService) new PhoneNumberServiceImpl(context);
    }
}
