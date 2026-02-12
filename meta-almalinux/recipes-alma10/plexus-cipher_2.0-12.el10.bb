
inherit dnf-bridge

PN = "plexus-cipher"
PE = "0"
PV = "2.0"
PR = "12.el10"
PACKAGES = "plexus-cipher plexus-cipher-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/plexus-cipher-2.0-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_plexus-cipher = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plexus-cipher-2.0-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-cipher}"
RDEPENDS:plexus-cipher = " \
 atinject \
 javapackages-filesystem \
"

URI_plexus-cipher-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-cipher-javadoc-2.0-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-cipher-javadoc}"
RDEPENDS:plexus-cipher-javadoc = " \
 javapackages-filesystem \
"
