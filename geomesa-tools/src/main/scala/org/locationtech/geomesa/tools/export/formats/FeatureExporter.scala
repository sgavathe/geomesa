/***********************************************************************
* Copyright (c) 2013-2016 Commonwealth Computer Research, Inc.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Apache License, Version 2.0
* which accompanies this distribution and is available at
* http://www.opensource.org/licenses/apache2.0.php.
*************************************************************************/

package org.locationtech.geomesa.tools.export.formats

import java.io.{Closeable, Flushable}

import org.geotools.data.simple.SimpleFeatureCollection

trait FeatureExporter extends Closeable with Flushable {
  def export(featureCollection: SimpleFeatureCollection): Option[Long]
}
