package win.lamit.butin.utils;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import win.lamit.butin.Config;
import win.lamit.butin.entities.Account;
import win.lamit.butin.ui.ConversationsActivity;
import win.lamit.butin.ui.EnterPhoneNumberActivity;
import win.lamit.butin.ui.StartConversationActivity;
import win.lamit.butin.ui.TosActivity;
import win.lamit.butin.ui.VerifyActivity;

public class SignupUtils {

    public static Intent getSignUpIntent(Activity activity) {
        final Intent intent = new Intent(activity, EnterPhoneNumberActivity.class);
        return intent;
    }

    public static Intent getRedirectionIntent(ConversationsActivity activity) {
        final Intent intent;
        final Account account = AccountUtils.getFirst(activity.xmppConnectionService);
        if (account != null) {
            if (account.isOptionSet(Account.OPTION_UNVERIFIED)) {
                intent = new Intent(activity, VerifyActivity.class);
            } else {
                intent = new Intent(activity, StartConversationActivity.class);
            }
        } else {
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(activity);
            if (preferences.getBoolean("tos",false)) {
                intent = getSignUpIntent(activity);
            } else {
                intent = new Intent(activity, TosActivity.class);
            }

        }
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        return intent;
    }
}