package com.example.uddishverma.currencyconverter.rest;



/**
 * Created by mayankaggarwal on 12/02/17.
 */

public class Data {

/*    public static void bootup(final Activity activity, final UpdateCallback updateCallback) {
        BootUp bootup = new BootUp(updateCallback);
        bootup.execute(activity);
    }



    public static class BootUp extends AsyncTask<Activity, Void, Integer> {

        UpdateCallback updateCallback;
        int error = 0;

        BootUp(UpdateCallback updateCallback) {
            this.updateCallback = updateCallback;
        }

        @Override
        protected Integer doInBackground(Activity... params) {
            final Activity activity = params[0];

            ApiInterface apiInterface = new ApiClient().getClient(activity).create(ApiInterface.class);
            BootupRequest bootupRequest = new BootupRequest();
            String android_id = Settings.Secure.getString(activity.getContentResolver(), Settings.Secure.ANDROID_ID);

            Payload payload = new Payload();
            payload.deviceid = String.valueOf(android_id);
            payload.osType = Globals.appOS;
            payload.fcmToken = FirebaseInstanceId.getInstance().getToken();
//            payload.fcmToken="";
            bootupRequest.payload = payload;

            Header header = new Header();
            header.requestId = Globals.randomAlphaNumeric(10);
            header.appVersion = Globals.appVersion;
            if (!(Prefs.getPrefs("crewid", activity).equals("notfound"))) {
                header.crewId = Prefs.getPrefs("crewid", activity);
            } else {
                header.crewId = "";
            }
            header.wprToken = "";
            bootupRequest.header = header;

            final Call<BootupResponse> bootupRes = apiInterface.bootup(bootupRequest);

            try {
                BootupResponse bootupResponse = bootupRes.execute().body();
                if (bootupResponse.success) {
                    Prefs.setPrefs("wpr_token", bootupResponse.payload.wprToken, activity);
                    Prefs.setPrefs("crewid", bootupResponse.payload.crewid, activity);
                    Prefs.setPrefs("shift_refresh_frequency_rate", bootupResponse.payload.shiftRefreshFrequencyRate, activity);
                    Prefs.setPrefs("local_shift_refresh_frequency_rate", bootupResponse.payload.localShiftRefreshFrequencyRate, activity);
                    Prefs.setPrefs("location_refresh_frequency_rate", bootupResponse.payload.locationRefreshFrequencyRate, activity);
                    error = 0;
                } else {
                    Globals.errorRes = bootupResponse.error.message;
                    error = 1;
                }
            } catch (Exception e) {
                error = 1;
                Globals.errorRes = "No Internet Connection!";
                e.printStackTrace();
            }
            return 0;
        }

        @Override
        protected void onPostExecute(Integer integer) {
            if (error == 0) {
                updateCallback.onUpdate();
            } else {
                updateCallback.onFailure();
            }
        }
    }
*/

}
