
inherit dnf-bridge

PN = "jzlib"
PE = "0"
PV = "1.1.3"
PR = "30.el10"
PACKAGES = "jzlib jzlib-demo jzlib-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/jzlib-1.1.3-30.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jzlib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jzlib-1.1.3-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jzlib}"
RDEPENDS:jzlib = " \
 javapackages-filesystem \
"

URI_jzlib-demo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jzlib-demo-1.1.3-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jzlib-demo}"
RDEPENDS:jzlib-demo = " \
 jzlib \
"

URI_jzlib-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jzlib-javadoc-1.1.3-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jzlib-javadoc}"
RDEPENDS:jzlib-javadoc = " \
 javapackages-filesystem \
"
