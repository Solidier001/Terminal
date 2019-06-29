package util;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

public class RequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        ((HttpServletRequest)sre.getServletRequest()).getSession();
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {

    }
}
