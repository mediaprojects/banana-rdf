package org.w3.banana.jena

import org.w3.banana._
import com.hp.hpl.jena.sparql.core._

class JenaQueryOnStoreTest() extends SparqlQueryOnStoreTest(
  JenaOperations,
  JenaDiesel,
  JenaStore(DatasetGraphFactory.createMem()),
  JenaGraphIsomorphism,
  JenaQueryBuilder,
  JenaStoreQuery)
