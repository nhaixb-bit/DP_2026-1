package hw.ch16;

public interface Colleague {
    // Mediator를 설정한다 
    public abstract void setMediator(Mediator mediator);

    // Mediator에서 활성/비활성을 지시한다a
    public abstract void setColleagueEnabled(boolean enabled);
}
