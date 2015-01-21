/*-
 * Copyright (C) 2008 Erik Larsson
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.catacombae.hfsexplorer.types.resff;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import org.catacombae.csjc.DynamicStruct;
import org.catacombae.csjc.PrintableStruct;
import org.catacombae.util.Util;
import org.catacombae.io.SynchronizedReadableRandomAccess;

/** This class was generated by CStructToJavaClass. */
public class ResourceName implements DynamicStruct, PrintableStruct {
    /*
     * struct ResourceName
     * size: minimum 1 bytes
     * description:
     *
     * BP  Size  Type              Identifier  Description
     * ---------------------------------------------------
     * 0   1     UInt8             nameLength
     * 1   1*?   Char[nameLength]  name
     */

    private final byte nameLength;
    private final byte[] name;

    public ResourceName(SynchronizedReadableRandomAccess stream, final long offset) {

        byte[] nameLengthArray = new byte[1];
        stream.readFullyFrom(offset, nameLengthArray);
        nameLength = nameLengthArray[0];

        name = new byte[Util.unsign(nameLength)];
        stream.readFullyFrom(offset+1, name);
    }

    /**  */
    public short getNameLength() { return Util.unsign(getRawNameLength()); }
    /**  */
    public byte[] getName() { return Util.readByteArrayBE(name); }

    public byte getRawNameLength() { return nameLength; }

    public void printFields(PrintStream ps, String prefix) {
        ps.println(prefix + " nameLength: " + getNameLength());
        try {
            ps.println(prefix + " name: " + new String(getName(), "MacRoman"));
        } catch(UnsupportedEncodingException ex) {
            ps.println(prefix + " name: 0x" + Util.byteArrayToHexString(getName()) + " (non-decodable)");
        }
    }

    public void print(PrintStream ps, String prefix) {
        ps.println(prefix + "ResourceName:");
        printFields(ps, prefix);
    }

    public byte[] getBytes() {
        byte[] result = new byte[occupiedSize()];
        int offset = 0;
        result[offset] = this.nameLength;
        offset += 1;
        System.arraycopy(this.name, 0, result, offset, this.name.length);
        offset += this.name.length;
        return result;
    }

    public int maxSize() {
        return 255;
    }

    public int occupiedSize() {
        return 1+name.length;
    }
}
