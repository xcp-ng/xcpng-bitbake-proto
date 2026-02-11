
PN = "apache-commons-beanutils"
PE = "0"
PV = "1.9.4"
PR = "21.el10_0"
PACKAGES = "apache-commons-beanutils apache-commons-beanutils-javadoc"


URI_apache-commons-beanutils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-beanutils-1.9.4-21.el10_0.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-beanutils = "
 apache-commons-collections
 javapackages-filesystem
 apache-commons-logging
"

URI_apache-commons-beanutils-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-beanutils-javadoc-1.9.4-21.el10_0.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-beanutils-javadoc = "
 javapackages-filesystem
"
