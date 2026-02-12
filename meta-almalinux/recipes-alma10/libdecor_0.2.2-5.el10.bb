
inherit dnf-bridge

PN = "libdecor"
PE = "0"
PV = "0.2.2"
PR = "5.el10"
PACKAGES = "libdecor libdecor-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libdecor-0.2.2-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libdecor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdecor-0.2.2-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdecor}"
RDEPENDS:libdecor = " \
 libwayland-client \
 libwayland-cursor \
 pango \
 cairo \
 gtk3 \
 glib2 \
 glibc \
 dbus-libs \
"

URI_libdecor-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdecor-devel-0.2.2-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdecor-devel}"
RDEPENDS:libdecor-devel = " \
 wayland-devel \
 libdecor \
 pkgconf-pkg-config \
"
