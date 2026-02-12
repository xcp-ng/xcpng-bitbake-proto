
inherit dnf-bridge

PN = "plexus-build-api0"
PE = "0"
PV = "0.0.7"
PR = "46.el10"
PACKAGES = "plexus-build-api0 plexus-build-api0-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/plexus-build-api0-0.0.7-46.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_plexus-build-api0 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-build-api0-0.0.7-46.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-build-api0}"
RDEPENDS:plexus-build-api0 = " \
 plexus-utils \
 javapackages-filesystem \
"

URI_plexus-build-api0-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-build-api0-javadoc-0.0.7-46.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-build-api0-javadoc}"
RDEPENDS:plexus-build-api0-javadoc = " \
 javapackages-filesystem \
"
