package Task4.Task4_1;

import java.time.LocalDate;

public class  SystemAlert {
    private AlertSeverity _severity;
    private String _message;
    private int _executionCode;
    private LocalDate _timestamp;
    private String _process;

    public SystemAlert() {
    }

    public SystemAlert(AlertSeverity _severity, String _message,
                       int _executionCode, LocalDate _timestamp,
                       String _process) {
        this._severity = _severity;
        this._message = _message;
        this._executionCode = _executionCode;
        this._timestamp = _timestamp;
        this._process = _process;
    }

    public AlertSeverity getSeverity() {
        return _severity;
    }

    public String getMessage() {
        return _message;
    }

    public int getExecutionCode() {
        return _executionCode;
    }

    public LocalDate getTimestamp() {
        return _timestamp;
    }

    public String getProcess() {
        return _process;
    }

    public void setSeverity(AlertSeverity _severity) {
        this._severity = _severity;
    }

    public void setMessage(String _message) {
        this._message = _message;
    }

    public void setExecutionCode(int _executionCode) {
        this._executionCode = _executionCode;
    }

    public void setTimestamp(LocalDate _timestamp) {
        this._timestamp = _timestamp;
    }

    public void setProcess(String _process) {
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
}
