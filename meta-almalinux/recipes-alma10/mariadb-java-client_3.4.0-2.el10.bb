
inherit dnf-bridge

PN = "mariadb-java-client"
PE = "0"
PV = "3.4.0"
PR = "2.el10"
PACKAGES = "mariadb-java-client mariadb-java-client-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mariadb-java-client-3.4.0-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mariadb-java-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-java-client-3.4.0-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mariadb-java-client}"
RDEPENDS:mariadb-java-client = " \
 jna \
 jna-contrib \
 javapackages-filesystem \
 slf4j \
"

URI_mariadb-java-client-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mariadb-java-client-javadoc-3.4.0-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mariadb-java-client-javadoc}"
RDEPENDS:mariadb-java-client-javadoc = " \
 javapackages-filesystem \
"
