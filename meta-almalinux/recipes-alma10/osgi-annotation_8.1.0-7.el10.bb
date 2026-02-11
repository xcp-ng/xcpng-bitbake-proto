
PN = "osgi-annotation"
PE = "0"
PV = "8.1.0"
PR = "7.el10"
PACKAGES = "osgi-annotation osgi-annotation-javadoc"


URI_osgi-annotation = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/osgi-annotation-8.1.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:osgi-annotation = "
 javapackages-filesystem
"

URI_osgi-annotation-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/osgi-annotation-javadoc-8.1.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:osgi-annotation-javadoc = "
 javapackages-filesystem
"
