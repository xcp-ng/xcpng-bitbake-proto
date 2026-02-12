
inherit dnf-bridge

PN = "libfprint"
PE = "0"
PV = "1.94.9"
PR = "1.el10_0"
PACKAGES = "libfprint libfprint-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libfprint-1.94.9-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libfprint = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libfprint-1.94.9-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libfprint}"
RDEPENDS:libfprint = " \
 openssl-libs \
 libgcc \
 libgudev \
 libgusb \
 glib2 \
 glibc \
 pixman \
"

URI_libfprint-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfprint-devel-1.94.9-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libfprint-devel}"
RDEPENDS:libfprint-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 libfprint \
"
