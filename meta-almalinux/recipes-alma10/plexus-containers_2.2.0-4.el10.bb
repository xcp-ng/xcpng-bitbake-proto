
inherit dnf-bridge

PN = "plexus-containers"
PE = "0"
PV = "2.2.0"
PR = "4.el10"
PACKAGES = "plexus-containers-component-annotations plexus-containers-component-metadata plexus-containers-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/plexus-containers-2.2.0-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_plexus-containers-component-annotations = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plexus-containers-component-annotations-2.2.0-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-containers-component-annotations}"
RDEPENDS:plexus-containers-component-annotations = " \
 javapackages-filesystem \
"

URI_plexus-containers-component-metadata = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-containers-component-metadata-2.2.0-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-containers-component-metadata}"
RDEPENDS:plexus-containers-component-metadata = " \
 jdom2 \
 objectweb-asm \
 plexus-containers-component-annotations \
 plexus-utils \
 javapackages-filesystem \
 qdox \
"

URI_plexus-containers-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-containers-javadoc-2.2.0-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-containers-javadoc}"
RDEPENDS:plexus-containers-javadoc = " \
 javapackages-filesystem \
"
