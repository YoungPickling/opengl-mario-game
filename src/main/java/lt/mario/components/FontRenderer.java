package lt.mario.components;

import lt.mario.jade.Component;

public class FontRenderer extends Component {
//    private boolean firstTime;


    @Override
    public void start() {
        if(gameObject.getComponent(SpriteRenderer.class) != null) {
            System.out.println("Found Font Renderer!");
        }
    }

    @Override
    public void update(float dt) {
//        if(!firstTime) {
//            System.out.println("I am updating");
//            firstTime = true;
//        }
    }
}
