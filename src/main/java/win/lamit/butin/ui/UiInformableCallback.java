package win.lamit.butin.ui;

public interface UiInformableCallback<T> extends UiCallback<T> {
    void inform(String text);
}
