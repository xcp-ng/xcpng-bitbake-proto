
inherit dnf-bridge

PN = "libgudev"
PE = "0"
PV = "238"
PR = "7.el10"
PACKAGES = "libgudev libgudev-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libgudev-238-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libgudev = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgudev-238-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libgudev}"
RDEPENDS:libgudev = " \
 glibc \
 libgcc \
 glib2 \
 systemd-libs \
"

URI_libgudev-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgudev-devel-238-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libgudev-devel}"
RDEPENDS:libgudev-devel = " \
 libgudev \
 systemd-devel \
 glib2-devel \
 pkgconf-pkg-config \
"
