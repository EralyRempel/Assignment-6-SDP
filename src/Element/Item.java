package Element;

import Visitor.ItemVisitor;

public interface Item {
    void accept(ItemVisitor visitor);
}
