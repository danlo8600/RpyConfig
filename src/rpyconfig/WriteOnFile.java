/*
* Copyright (C) <2012>  <Marchegiano Danilo>
*
* This file is part of RpyConfig.
*
* RpyConfig is free software: you can redistribute it and/or modify
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
* along with this program.  If not, see <http://www.gnu.org/licenses/>
*/

package rpyconfig;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author d4n1x
 */
public class WriteOnFile {

    private arrayMaker arrayObj;
    private ArrayList<String> array;
    FileWriter file;
    
    
    public WriteOnFile(arrayMaker mkArray) throws IOException {
        arrayObj = mkArray;
        array = arrayObj.getArray();
        //arrayObj.printArray();
        file = new FileWriter("/config.txt");
        write();
    }
    
    private void write() throws IOException{
        for(String item : array){
            file.write(item+"\n");
        }
        file.close();
    }
    
}