package Task7.Task7_1;

import java.time.LocalDate;

public class SystemAlert {
    private AlertSeverity _severity;
    private String _message;
    private int _executionCode;
    private LocalDate _timestamp;
    private String _process;

    public SystemAlert(AlertSeverity _severity, String _message,
                       int _executionCode, LocalDate _timestamp, String _process) {
        this._severity = _severity;
        this._message = _message;
        this._executionCode = _executionCode;
        this._timestamp = _timestamp;
        this._process = _process;
    }

    @Override
    public String toString() {
        return "SystemAlert{" +
                "_severity=" + _severity +
                ", _message='" + _message + '\'' +
                ", _executionCode=" + _executionCode +
                ", _timestamp=" + _timestamp +
                ", _process='" + _process + '\'' +
                '}';
    }

    public AlertSeverity get_severity() {
        return _severity;
    }

    public void set_severity(AlertSeverity _severity) {
        this._severity = _severity;
    }

    public String get_message() {
        return _message;
    }

    public void set_message(String _message) {
        this._message = _message;
    }

    public int get_executionCode() {
        return _executionCode;
    }

    public void set_executionCode(int _executionCode) {
        this._executionCode = _executionCode;
    }

    public LocalDate get_timestamp() {
        return _timestamp;
    }

    public void set_timestamp(LocalDate _timestamp) {
        this._timestamp = _timestamp;
    }

    public String get_process() {
        return _process;
    }

    public void set_process(String _process) {
        this._process = _process;
    }
}
