
inherit dnf-bridge

PN = "gsound"
PE = "0"
PV = "1.0.3"
PR = "10.el10"
PACKAGES = "gsound gsound-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gsound-1.0.3-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gsound = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gsound-1.0.3-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gsound}"
RDEPENDS:gsound = " \
 glibc \
 glib2 \
 libcanberra \
"

URI_gsound-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gsound-devel-1.0.3-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gsound-devel}"
RDEPENDS:gsound-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 gsound \
 libcanberra-devel \
"
