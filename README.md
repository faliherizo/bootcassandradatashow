# bootcassandradatashow Big data project

This project use :Spring boots (design patern MVC), apache kafka, sprak streaming, spark engine, cassandra Nosql database

To start in this part : 

1) Install cassandra (Installation in MAC OS)


sudo chown -R $(whoami) /Users/your_user_name/Library/Caches/Homebrew/

brew install cassandra 

brew install python

pip install cql


2) In order to check the installation used
brew info cassandra

3) Starting Cassandra
   
 In order to launch the Cassandra server use:
 
launchctl load /usr/local/opt/cassandra/homebrew.mxcl.cassandra.plist 



4) Execute and create Table votes:
cqlsh



CREATE KEYSPACE voting
    WITH REPLICATION = {
        'class' : 'SimpleStrategy',
        'replication_factor' : 1
    };
 
USE voting;
 
CREATE TABLE votes (name text PRIMARY KEY, votes int);

