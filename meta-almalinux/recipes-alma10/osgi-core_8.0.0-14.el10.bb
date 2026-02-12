
inherit dnf-bridge

PN = "osgi-core"
PE = "0"
PV = "8.0.0"
PR = "14.el10"
PACKAGES = "osgi-core osgi-core-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/osgi-core-8.0.0-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_osgi-core = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/osgi-core-8.0.0-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_osgi-core}"
RDEPENDS:osgi-core = " \
 javapackages-filesystem \
"

URI_osgi-core-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/osgi-core-javadoc-8.0.0-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_osgi-core-javadoc}"
RDEPENDS:osgi-core-javadoc = " \
 javapackages-filesystem \
"
