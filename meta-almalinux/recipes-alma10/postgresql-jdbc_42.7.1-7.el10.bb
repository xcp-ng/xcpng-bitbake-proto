
PN = "postgresql-jdbc"
PE = "0"
PV = "42.7.1"
PR = "7.el10"
PACKAGES = "postgresql-jdbc postgresql-jdbc-javadoc"


URI_postgresql-jdbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-jdbc-42.7.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:postgresql-jdbc = "
 ongres-scram-client
 javapackages-filesystem
"

URI_postgresql-jdbc-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/postgresql-jdbc-javadoc-42.7.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:postgresql-jdbc-javadoc = "
 javapackages-filesystem
"
