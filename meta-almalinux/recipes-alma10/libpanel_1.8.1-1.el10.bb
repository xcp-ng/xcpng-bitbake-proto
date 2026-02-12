
inherit dnf-bridge

PN = "libpanel"
PE = "0"
PV = "1.8.1"
PR = "1.el10"
PACKAGES = "libpanel libpanel-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libpanel-1.8.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libpanel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpanel-1.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpanel}"
RDEPENDS:libpanel = " \
 cairo \
 glib2 \
 graphene \
 glibc \
 gtk4 \
 hicolor-icon-theme \
 libadwaita \
"

URI_libpanel-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpanel-devel-1.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpanel-devel}"
RDEPENDS:libpanel-devel = " \
 glib2-devel \
 libpanel \
 pkgconf-pkg-config \
 libadwaita-devel \
 gtk4-devel \
"
