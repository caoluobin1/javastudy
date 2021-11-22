package org.clb.util.backcolor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class RgbNode {
    int x;
    int y;

    public RgbNode(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
