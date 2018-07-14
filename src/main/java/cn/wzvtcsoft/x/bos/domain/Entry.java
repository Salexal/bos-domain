package cn.wzvtcsoft.x.bos.domain;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

/**
 * Created by liutim on 2017/11/25.
 */


@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class Entry extends CoreObject implements IEntry {

    //@Transient
    private ICoreObject parent;

    public void setParent(ICoreObject parent) {
        this.parent = parent;
    }

    protected ICoreObject getInnerParent() {
        return parent;
    }
}
