CREATE KEYSPACE social_network 
WITH REPLICATION = {
  'class': 'NetworkTopologyStrategy',
	'dc1':3,
	'dc2':3
	};
