
inherit dnf-bridge

PN = "plexus-pom"
PE = "0"
PV = "16"
PR = "4.el10"
PACKAGES = "plexus-pom"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/plexus-pom-16-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_plexus-pom = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-pom-16-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-pom}"
RDEPENDS:plexus-pom = " \
 javapackages-filesystem \
"
