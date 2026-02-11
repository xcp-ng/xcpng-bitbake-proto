
PN = "apiguardian"
PE = "0"
PV = "1.1.2"
PR = "13.el10"
PACKAGES = "apiguardian apiguardian-javadoc"


URI_apiguardian = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apiguardian-1.1.2-13.el10.noarch.rpm;unpack=0"
RDEPENDS:apiguardian = "
 javapackages-filesystem
"

URI_apiguardian-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apiguardian-javadoc-1.1.2-13.el10.noarch.rpm;unpack=0"
RDEPENDS:apiguardian-javadoc = "
 javapackages-filesystem
"
