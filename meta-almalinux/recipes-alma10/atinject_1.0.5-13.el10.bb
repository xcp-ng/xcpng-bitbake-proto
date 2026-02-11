
PN = "atinject"
PE = "0"
PV = "1.0.5"
PR = "13.el10"
PACKAGES = "atinject atinject-javadoc"


URI_atinject = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/atinject-1.0.5-13.el10.noarch.rpm;unpack=0"
RDEPENDS:atinject = "
 javapackages-filesystem
"

URI_atinject-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/atinject-javadoc-1.0.5-13.el10.noarch.rpm;unpack=0"
RDEPENDS:atinject-javadoc = "
 javapackages-filesystem
"
