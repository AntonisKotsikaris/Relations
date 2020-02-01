/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relations;

/**
 *
 * @author antoniskotsikaris
 */
public class Human {
    private Head head;
    private Body body;
    private Foot foot;
    private Hand hand;

    public Human() {
        System.out.println("i am a human with:");
        this.head = new Head();
        this.body = new Body();
        this.hand = new Hand();
        this.foot = new Foot();
    }

    public Human(Head head, Body body, Foot foot, Hand hand) {
        this.head = head;
        this.body = body;
        this.foot = foot;
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Foot getFoot() {
        return foot;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
    
}
