
PN = "javapackages-bootstrap"
PE = "0"
PV = "1.17.0"
PR = "2.el10"
PACKAGES = "javapackages-bootstrap"


URI_javapackages-bootstrap = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/javapackages-bootstrap-1.17.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:javapackages-bootstrap = "
 javapackages-common
 java-21-openjdk-devel
 bash
 procps-ng
 coreutils
 lujavrite
"
