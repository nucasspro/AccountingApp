package common;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 * Class store general configurations, constants
 * 
 * @author ducnh
 * create: 12-05-2017
 */
public class Constants {

    // app icon
    private static URL url = ClassLoader.getSystemResource("res/icon.png");
    private static Toolkit kit = Toolkit.getDefaultToolkit();
    public static Image appIcon = kit.createImage(url);
    
    // Font configuration
    public static final String globalFontName = "Monospace";
    
    // Button size configuration template
    public static final Dimension buttonSizeBg = new Dimension(120, 50);
    public static final Dimension buttonSizeMd = new Dimension(90, 32);
    public static final Dimension buttonSizeMld = new Dimension(120, 32);
    public static final Dimension buttonSizeSm = new Dimension(50, 25);
    
    // Font size configuration template
    public static final Font fontSizeMd = new Font(globalFontName, Font.PLAIN, 13);
    public static final Font fontSizeSm = new Font(globalFontName, Font.PLAIN, 11);
    public static final Font fontSizeBg = new Font(globalFontName, Font.BOLD, 18);
    
    // Observable change code
    public static final short OBSERVABLE_STATE_CHANGED = 1;

    // Border style
    public static final Border BORDER_LINE = BorderFactory.createLineBorder(Color.gray);
    public static final Border NO_BORDER_LINE = BorderFactory.createEmptyBorder();
    
    // pay log types
    public static final String[] PAY_LOG_TYPES = {
            "Nhập mua hàng hóa",
            "Hóa đơn bán hàng hóa",
            "Thu tiền mặt",
            "Chi tiền mặt",
            "Thu ngân hàng",
            "Chi ngân hàng",
            "Phiếu kế toán kết chuyển"
    };
    // pay log type codes
    public static final String[] PAY_LOG_TYPE_CODES = {
        "NHH",
        "BHH",
        "TTM",
        "CTM",
        "TNH",
        "CNH",
        "KTM"
    };

    // action occur command
    public static final String ACTION_NEW_CUSTOMMER = "new-customer";
    public static final String ACTION_SELECT_CUSTOMER = "select-customer";
    public static final String ACTION_EXIT = "close-this-window";
    public static final String ACTION_CANCEL = "action-canceled";
    public static final String ACTION_DONE = "action-no-error";
    public static final String ACTION_ADD_COACC = "add-co_relate-account";
    public static final String ACTION_DEL_COACC = "del-co_relate-account";
    public static final String ACTION_SELECT_MAIN_ACC = "select-main-acc";
    public static final String ACTION_EXPORT = "export-command";
    
    // alert mode
    public static final short ALERT_MODE_SUCCESS = 0;
    public static final short ALERT_MODE_WARNING = 1;
    public static final short ALERT_MODE_ERROR = 2;
    
    // alert title
    public static final String ALERT_TITLE_SUCCESS = "Done!";
    public static final String ALERT_TITLE_WARNING = "Notice!";
    public static final String ALERT_TITLE_ERROR = "Error!";

    public static final Map<String, String> datePart = new HashMap<>();
    public static final Map<String, String> extractCode = new HashMap<>();

    static {
        datePart.put("Năm", "Y");
        datePart.put("Quý", "Q");
        datePart.put("Tháng","MON");
        datePart.put("Tuần","WW");
        datePart.put("Ngày","J");

        for (int i = PAY_LOG_TYPES.length - 1; i >= 0; i--) {
            extractCode.put(
                    PAY_LOG_TYPE_CODES[i],
                    PAY_LOG_TYPES[i]
            );
        }
    }
}
