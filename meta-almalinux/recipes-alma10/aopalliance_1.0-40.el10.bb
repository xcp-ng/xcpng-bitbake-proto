
inherit dnf-bridge

PN = "aopalliance"
PE = "0"
PV = "1.0"
PR = "40.el10"
PACKAGES = "aopalliance aopalliance-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/aopalliance-1.0-40.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_aopalliance = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aopalliance-1.0-40.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_aopalliance}"
RDEPENDS:aopalliance = " \
 javapackages-filesystem \
"

URI_aopalliance-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/aopalliance-javadoc-1.0-40.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_aopalliance-javadoc}"
RDEPENDS:aopalliance-javadoc = " \
 javapackages-filesystem \
"
