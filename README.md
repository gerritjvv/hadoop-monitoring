hadoop-monitoring
=================

libraries for hadoop monitoring and alerting


JobTrackerScrape
=================

```scala

   val doc = JobTrackerScrape.parse(new File("http://localhost:50030"))
   JobTrackerScrape.heapSize(doc) //returns (Float, Float) => (used, total)
   JobTrackerScrape.blacklisted(doc)  //returns Int i.e the blacklisted nodes
  
```

NamenodeScrape
================

```scala

   val doc = NamenodeScrape.parse(new File("test/resources/dfshealth.jsp"))
   NamenodeScrape.heapSize(doc) // returns (Float, Float) => (used, total)
   NamenodeScrape.statusMap(doc) /* returns Map[String, Float) e.g 
   								Map(number-of-under-replicated-blocks -> 0.0, 
   								     dead-nodes -> 0.0, 
   								     non-dfs-used -> 1.85, 
   								     dfs-used-per -> 0.0, 
   								     dfs-remaining-per -> 46.73, 
   								     decommissioning-nodes -> 0.0, 
   								     live-nodes -> 1.0, 
   								     dfs-remaining -> 1.63, 
   								     configured-capacity -> 3.48, 
   								     dfs-used -> 48.0) */

```  