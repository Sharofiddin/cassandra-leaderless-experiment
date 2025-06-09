CREATE KEYSPACE social_network 
WITH REPLICATION = {
  'class': 'NetworkTopologyStrategy',
	'dc1':2,
	'dc2':2
	};
