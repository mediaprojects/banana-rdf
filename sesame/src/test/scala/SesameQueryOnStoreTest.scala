package org.w3.banana.sesame

import org.w3.banana._
import org.openrdf.sail.memory.MemoryStore
import org.openrdf.repository.Repository
import org.openrdf.repository.sail.SailRepository

class SesameQueryOnStoreTest() extends SparqlQueryOnStoreTest(
  SesameOperations,
  SesameDiesel,
  SesameStore {
    val repo = new SailRepository(new MemoryStore)
    repo.initialize()
    repo
  },
  SesameGraphIsomorphism,
  SesameQueryBuilder,
  SesameStoreQuery) {

}
