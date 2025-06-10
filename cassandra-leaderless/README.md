# cassandra-leaderless

In cassandra token ranges printed when running 
`nodetool ring`
 means upper boundary of the range
 
 for example

 ```
    172.18.0.3       rack2       Up     Normal  226.53 KiB      35.80%              7824467802211071017
 ```
 it means keys to 7824467802211071017 has been mapped for node running in `172.18.0.3` and lower boundary can be found from this output by sorting and finding the biggest number which lower from 7824467802211071017.