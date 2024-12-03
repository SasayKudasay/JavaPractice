package Task4.Task4_1;

import java.time.LocalDate;

public class BuilderSysAlert {
    private SystemAlert alert;

    public BuilderSysAlert() {
        alert = new SystemAlert();
    }

    public void setBasicParams(AlertSeverity severity, String message){
        alert.setSeverity(severity);
        alert.setMessage(message);
    }

    public void setTechParams(int executionCode, LocalDate timestamp){
        alert.setExecutionCode(executionCode);
        alert.setTimestamp(timestamp);
    }

    public void setProcessParam(String process){
        alert.setProcess(process);
    }

    public SystemAlert build(){
        return alert;
    }
}
