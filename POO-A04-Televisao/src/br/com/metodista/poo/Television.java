package br.com.metodista.poo;

/**
 * @title Projeto Orientado à Objetos - Aula 03 (Televisor)
 * @since 2014-08-27
 * @author Leandro Melão Medeiros - R.A. 250544
 */
public class Television {
    private int channel   = 1;
    private int volume    = 0;
    private boolean state = false;
    
    public void setChannel(int newChannel) {
        if (this.isOn()) {
            if (newChannel > 16)       this.channel = 16;
            else if (newChannel < 1)   this.channel = 1;
            else                       this.channel = newChannel;
        }
    }
    
    public int getChannel() {
        return this.channel;
    }
    
    public void channelUp() {
        this.setChannel(this.channel + 1);
    }
    
    public void channelDown() {
        this.setChannel(this.channel - 1);
    }
    
    public void setVolume(int newVolume) {
        if (this.isOn()) {
            if (newVolume > 10)       this.volume = 10;
            else if (newVolume < 0)   this.volume = 0;
            else                      this.volume = newVolume;
        }
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    public void volumeUp() {
        this.setVolume(this.volume + 1);
    }
    
    public void volumeDown() {
        this.setVolume(this.volume - 1);
    }
    
    public void switchState() {
        this.state = !this.state;
    }
    
    public boolean isOn() {
        return this.state;
    }
}