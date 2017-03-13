# twelvemonkeys on OSGi

Prerequisites: Java 8 and Maven 3.0.5

Download Apache Karaf 4.0.8, extract and startup

https://karaf.apache.org/download.html

Build this project root with mvn:install producing a Karaf Archive file (kar-1.0.0.kar)

Drop this file into the deploy folder found under the Karaf main folder to install all needed bundles at once.
The Karaf console will output the following:

#####Default registered image readers:
[image/vnd.wap.wbmp, image/png, image/x-png, image/jpeg, image/bmp, image/gif]

#####Default registered image writers:
[image/png, image/vnd.wap.wbmp, image/x-png, image/jpeg, image/bmp, image/gif]

#####Spi Fly / twelvemonkeys registered image readers:
[image/cursor, image/vnd.wap.wbmp, image/vnd.adobe.photoshop, image/x-dcx, image/jpeg, image/x-targa, image/pict, image/x-cursor, image/bmp, image/x-icon, image/x-thumbs-db, image/gif, image/x-photoshop, image/tga, image/x-pcx, image/x-tga, image/x-portable-arbitrarymap, image/x-sgi, image/iff, image/png, application/octet-stream, image/pcx, application/x-photoshop, application/vnd.adobe.photoshop, image/x-psd, image/x-bmp, image/vnd.microsoft.cursor, image/dcx, image/x-iff, image/x-png, image/x-portable-pixmap, image/tiff, image/x-tiff, image/ico, image/sgi, image/targa, image/x-portable-anymap, image/x-pict, image/vnd.microsoft.icon, image/vnd.radiance]
#####Spi Fly / twelvemonkeys registered image writers:
[image/png, image/iff, image/vnd.wap.wbmp, image/jpeg, image/pict, image/bmp, image/gif, image/x-png, image/x-iff, image/x-portable-pixmap, image/tiff, image/x-tiff, image/x-portable-anymap, image/x-pict, image/x-portable-arbitrarymap]

To display the standard ImageIO setup uninstall the publisher and Spi-Fly bundle and a restart of Karaf.

###twelvemonkeys-osgi License

Copyright (C) 2016 Maurice Betzel
 
 Licensed either under the Apache License, Version 2.0, or (at your option)
 under the terms of the GNU General Public License as published by
 the Free Software Foundation (subject to the "Classpath" exception),
 either version 2, or any later version (collectively, the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
      http://www.apache.org/licenses/LICENSE-2.0
      http://www.gnu.org/licenses/
      http://www.gnu.org/software/classpath/license.html
 
 or as provided in the LICENSE.txt file that accompanied this code.
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.

###twelvemonkeys:

https://github.com/haraldk/TwelveMonkeys/tree/twelvemonkeys-3.3.2