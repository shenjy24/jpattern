package com.jonas.structural.composite.component;

/**
 * <p>
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-24
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}
