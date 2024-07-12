package com.uenp.demo.Models.Entity;

public class MABCtest{



    private Integer RotatePinsPrefHandTime; //segundos
    private Integer RotatePinsNonPrefHandTime; //segundos
    private Integer TriangleNutsAndBoltsTime; //segundos
    private Integer TrailDrawingMistake;//erros

    private Integer catPrefHandHits;//acertos
    private Integer catNonPrefHandHits;//acertos
    private Integer playTargetOnWallHits;//acertos

    private Integer balanceBoardsTime;//tempo
    private Integer walkHeelToToeHits;//acertos
    private Integer ZigZagPrefLegHits ;//acertos
    private Integer ZigZagNonPrefLegHits;//acertos


    public MABCtest(Integer rotatePinsPrefHandTime, Integer rotatePinsNonPrefHandTime, Integer triangleNutsAndBoltsTime, Integer trailDrawingMistake, Integer catPrefHandHits, Integer catNonPrefHandHits, Integer playTargetOnWallHits, Integer balanceBoardsTime, Integer walkHeelToToeHits, Integer zigZagPrefLegHits, Integer zigZagNonPrefLegHits) {
        RotatePinsPrefHandTime = rotatePinsPrefHandTime;
        RotatePinsNonPrefHandTime = rotatePinsNonPrefHandTime;
        TriangleNutsAndBoltsTime = triangleNutsAndBoltsTime;
        TrailDrawingMistake = trailDrawingMistake;
        this.catPrefHandHits = catPrefHandHits;
        this.catNonPrefHandHits = catNonPrefHandHits;
        this.playTargetOnWallHits = playTargetOnWallHits;
        this.balanceBoardsTime = balanceBoardsTime;
        this.walkHeelToToeHits = walkHeelToToeHits;
        ZigZagPrefLegHits = zigZagPrefLegHits;
        ZigZagNonPrefLegHits = zigZagNonPrefLegHits;
    }

    public Integer getRotatePinsPrefHandTime() {
        return RotatePinsPrefHandTime;
    }

    public void setRotatePinsPrefHandTime(Integer rotatePinsPrefHandTime) {
        RotatePinsPrefHandTime = rotatePinsPrefHandTime;
    }

    public Integer getRotatePinsNonPrefHandTime() {
        return RotatePinsNonPrefHandTime;
    }

    public void setRotatePinsNonPrefHandTime(Integer rotatePinsNonPrefHandTime) {
        RotatePinsNonPrefHandTime = rotatePinsNonPrefHandTime;
    }

    public Integer getTriangleNutsAndBoltsTime() {
        return TriangleNutsAndBoltsTime;
    }

    public void setTriangleNutsAndBoltsTime(Integer triangleNutsAndBoltsTime) {
        TriangleNutsAndBoltsTime = triangleNutsAndBoltsTime;
    }

    public Integer getTrailDrawingMistake() {
        return TrailDrawingMistake;
    }

    public void setTrailDrawingMistake(Integer trailDrawingMistake) {
        TrailDrawingMistake = trailDrawingMistake;
    }

    public Integer getCatPrefHandHits() {
        return catPrefHandHits;
    }

    public void setCatPrefHandHits(Integer catPrefHandHits) {
        this.catPrefHandHits = catPrefHandHits;
    }

    public Integer getCatNonPrefHandHits() {
        return catNonPrefHandHits;
    }

    public void setCatNonPrefHandHits(Integer catNonPrefHandHits) {
        this.catNonPrefHandHits = catNonPrefHandHits;
    }

    public Integer getPlayTargetOnWallHits() {
        return playTargetOnWallHits;
    }

    public void setPlayTargetOnWallHits(Integer playTargetOnWallHits) {
        this.playTargetOnWallHits = playTargetOnWallHits;
    }

    public Integer getBalanceBoardsTime() {
        return balanceBoardsTime;
    }

    public void setBalanceBoardsTime(Integer balanceBoardsTime) {
        this.balanceBoardsTime = balanceBoardsTime;
    }

    public Integer getWalkHeelToToeHits() {
        return walkHeelToToeHits;
    }

    public void setWalkHeelToToeHits(Integer walkHeelToToeHits) {
        this.walkHeelToToeHits = walkHeelToToeHits;
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
