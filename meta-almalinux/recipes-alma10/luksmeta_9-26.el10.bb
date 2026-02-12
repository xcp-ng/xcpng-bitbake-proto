
inherit dnf-bridge

PN = "luksmeta"
PE = "0"
PV = "9"
PR = "26.el10"
PACKAGES = "libluksmeta luksmeta libluksmeta-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/luksmeta-9-26.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libluksmeta = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libluksmeta-9-26.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libluksmeta}"
RDEPENDS:libluksmeta = " \
 glibc \
 cryptsetup-libs \
"

URI_luksmeta = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/luksmeta-9-26.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_luksmeta}"
RDEPENDS:luksmeta = " \
 glibc \
 libluksmeta \
 cryptsetup-libs \
"

URI_libluksmeta-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libluksmeta-devel-9-26.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libluksmeta-devel}"
RDEPENDS:libluksmeta-devel = " \
 libluksmeta \
 cryptsetup-devel \
 pkgconf-pkg-config \
"
