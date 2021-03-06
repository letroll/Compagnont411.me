package fr.lepetitpingouin.android.t411;

public class Default {
    public static final String IP_T411 = "www.t411.io";

    public static final String T411_TOP_100 = "http://www.t411.io/top/100/";
    public static final String T411_TOP_TODAY = "http://www.t411.io/top/today/";
    public static final String T411_TOP_WEEK = "http://www.t411.io/top/week/";
    public static final String T411_TOP_MONTH = "http://www.t411.io/top/month/";

    public static final String URL_FRIENDS = "http://www.t411.io/my/friends/";
    public static final String URL_CHATI = "http://www.t411.io/chati/index.php?room=support";
    public static final String URL_MESSAGE_DEL = "http://www.t411.io/mailbox/delete/?id=";//+ID
    public static final String URL_MESSAGE_ARC = "http://www.t411.io/mailbox/archive/?id=";//+ID
    public static final String URL_OTHERAPPS = "https://play.google.com/store/search?q=pub:Gr%C3%A9gory+Meyer";
    // Fr�quence de mise � jour par d�faut (en minutes)
    public static String UpdateFreq = "60";
    public static String timeout = "25";
    public static String URL_VERSIONS = "http://www.mediafire.com/folder/8961s22215ot3/t411-android";
    public static String Appwidget_flag_updating = "intent.WIDGET_FLAG_UPDATING";
    public static String Appwidget_update = "android.appwidget.action.APPWIDGET_UPDATE_t411";
    public static String Appwidget_clock_update = "intent.t411_CLOCK_UPDATE";
    public static String URL_INDEX = "http://www.t411.io";
    public static String URL_USERPROFILE = "http://www.t411.io/users/profile/";
    public static String URL_MAILS = "http://www.t411.io/mailbox/";
    public static String URL_LOGIN = "http://www.t411.io/users/login/?returnto=%2Fusers%2Flogin%2F";
    public static String URL_LOGOUT = "http://www.t411.io/users/logout/";
    public static String URL_SEARCH = "http://www.t411.io/torrents/search/?name="; // + terms
    public static String URL_SAY_THANKS = "http://www.t411.io/torrents/thanks/?id="; //+ ID
    public static String URL_SHARE = "http://www.t411.io/t/"; //+ ID
    public static String URL_MESSAGE = "http://www.t411.io/mailbox/mail/?id=";//+ID
    ///chati/index.php
    public static String URL_SHOUTBOX = "http://www.t411.io/users/login/?returnto=%2Fchati%2F"; //+ ID
    // Messagerie //
    public static String MSG_SEPARATOR = "\\s*.*Message.*origine.*\\S";
    public static String MSG_REPLACEMENT = "<div class='msg_origine'><i>Message précédent :</i><br/>";
    public static String URL_GET_PREZ = "http://www.t411.io/torrents/torrents/?id="; //+ ID
    public static String URL_GET_SUBCAT = "http://www.t411.io/torrents/search/?search=@@@@@&cat="; //+ ID
    public static String URL_GET_TORRENT = "http://www.t411.io/torrents/download/?id="; //+ ID
    public static String URL_THREAD = "http://www.t411.io/forum.php#/discussion/35195";
    public static String URL_DONATE = "http://www.t411.io/bonus/";
    public static String URL_CREATE_ACCOUNT = "http://www.t411.io/users/signup/";
    public static String URL_BOOKMARKS = "http://www.t411.io/my/bookmarks/";
    public static String URL_BOOKMARK = "http://www.t411.io/my/bookmarks/?add="; //+ ID
    public static String URL_UNBOOKMARK = "http://www.t411.io/my/bookmarks/"; // Authentification requise au préalable
    public static String URL_SEARCH_SAVE = "http://www.t411.io/my/search-save/"; //+ ID // Authentification requise au préalable
    public static String URL_SEARCH_GET = "http://www.t411.io/my/search/";
    public static String URL_UNFAVORITE = "http://www.t411.io/my/search-delete/"; // Authentification requise au préalable
    public static String URL_SENDMAIL = "http://www.t411.io/mailbox/compose/"; // Authentification requise au préalable
    public static String URL_STATS = "http://www.t411.io/users/daily-stats/?id=";
    public static String URL_UPLOADS = "http://www.t411.io/my/torrents/?order=added&type=desc";
    public static String Intent_Update_News = "android.appwidget.action.UPDATE_NEWS";
    public static String Intent_Refresh_Newspaper = "android.appwidget.action.REFRESH_NEWSPAPER";

    //public static String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.95 Safari/537.36";
    public static String USER_AGENT = "Android (Custom browser) WebKit/Based Compagnon/t411";
    ;

    public static String BITCOIN_ADDRESS = "1Mp5oQy5BR4gvDkdZW5RUtpP3HTUcaZcBC";
}
