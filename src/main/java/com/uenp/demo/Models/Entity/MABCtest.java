package com.uenp.demo.Models.Entity;

public class MABCtest{

    private Integer turningPegsPrefHandTime; //segundos
    private Integer turningPegsNonPrefHandTime; //segundos
    private Integer triangleNutsAndBoltsTime; //segundos
    private Integer drawingTrailMistake;//erros

    private Integer cathingPrefHandHits;//acertos
    private Integer cathingOtherHandHits;//acertos
    private Integer throwingWallTargetHits;//acertos

    private Integer twoBoardBalanceTime;//tempo
    private Integer walkingHeelToToeHits;//acertos
    private Integer ZigZagPrefLegHits ;//acertos
    private Integer ZigZagNonPrefLegHits;//acertos


    public MABCtest(Integer turningPegsPrefHandTime, Integer turningPegsNonPrefHandTime, Integer triangleNutsAndBoltsTime, Integer drawingTrailMistake, Integer cathingPrefHandHits, Integer cathingOtherHandHits, Integer throwingWallTargetHits, Integer twoBoardBalanceTime, Integer walkingHeelToToeHits, Integer zigZagPrefLegHits, Integer zigZagNonPrefLegHits) {
        this.turningPegsPrefHandTime = turningPegsPrefHandTime;
        this.turningPegsNonPrefHandTime = turningPegsNonPrefHandTime;
        this.triangleNutsAndBoltsTime = triangleNutsAndBoltsTime;
        this.drawingTrailMistake = drawingTrailMistake;
        this.cathingPrefHandHits = cathingPrefHandHits;
        this.cathingOtherHandHits = cathingOtherHandHits;
        this.throwingWallTargetHits = throwingWallTargetHits;
        this.twoBoardBalanceTime = twoBoardBalanceTime;
        this.walkingHeelToToeHits = walkingHeelToToeHits;
        ZigZagPrefLegHits = zigZagPrefLegHits;
        ZigZagNonPrefLegHits = zigZagNonPrefLegHits;
    }


    public MABCtest() {
    }

    public Integer getTurningPegsPrefHandTime() {
        return turningPegsPrefHandTime;
    }

    public void setTurningPegsPrefHandTime(Integer turningPegsPrefHandTime) {
        this.turningPegsPrefHandTime = turningPegsPrefHandTime;
    }

    public Integer getTurningPegsNonPrefHandTime() {
        return turningPegsNonPrefHandTime;
    }

    public void setTurningPegsNonPrefHandTime(Integer turningPegsNonPrefHandTime) {
        this.turningPegsNonPrefHandTime = turningPegsNonPrefHandTime;
    }

    public Integer getTriangleNutsAndBoltsTime() {
        return triangleNutsAndBoltsTime;
    }

    public void setTriangleNutsAndBoltsTime(Integer triangleNutsAndBoltsTime) {
        this.triangleNutsAndBoltsTime = triangleNutsAndBoltsTime;
    }

    public Integer getDrawingTrailMistake() {
        return drawingTrailMistake;
    }

    public void setDrawingTrailMistake(Integer drawingTrailMistake) {
        this.drawingTrailMistake = drawingTrailMistake;
    }

    public Integer getCathingPrefHandHits() {
        return cathingPrefHandHits;
    }

    public void setCathingPrefHandHits(Integer cathingPrefHandHits) {
        this.cathingPrefHandHits = cathingPrefHandHits;
    }

    public Integer getCathingOtherHandHits() {
        return cathingOtherHandHits;
    }

    public void setCathingOtherHandHits(Integer cathingOtherHandHits) {
        this.cathingOtherHandHits = cathingOtherHandHits;
    }

    public Integer getThrowingWallTargetHits() {
        return throwingWallTargetHits;
    }

    public void setThrowingWallTargetHits(Integer throwingWallTargetHits) {
        this.throwingWallTargetHits = throwingWallTargetHits;
    }

    public Integer getTwoBoardBalanceTime() {
        return twoBoardBalanceTime;
    }

    public void setTwoBoardBalanceTime(Integer twoBoardBalanceTime) {
        this.twoBoardBalanceTime = twoBoardBalanceTime;
    }

    public Integer getWalkingHeelToToeHits() {
        return walkingHeelToToeHits;
    }

    public void setWalkingHeelToToeHits(Integer walkingHeelToToeHits) {
        this.walkingHeelToToeHits = walkingHeelToToeHits;
    }

    public Integer getZigZagPrefLegHits() {
        return ZigZagPrefLegHits;
    }

    public void setZigZagPrefLegHits(Integer zigZagPrefLegHits) {
        ZigZagPrefLegHits = zigZagPrefLegHits;
    }

    public Integer getZigZagNonPrefLegHits() {
        return ZigZagNonPrefLegHits;
    }

    public void setZigZagNonPrefLegHits(Integer zigZagNonPrefLegHits) {
        ZigZagNonPrefLegHits = zigZagNonPrefLegHits;
    }
}
