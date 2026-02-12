
inherit dnf-bridge

PN = "umockdev"
PE = "0"
PV = "0.18.3"
PR = "2.el10"
PACKAGES = "umockdev umockdev-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/umockdev-0.18.3-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_umockdev = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/umockdev-0.18.3-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_umockdev}"
RDEPENDS:umockdev = " \
 libpcap \
 systemd-libs \
 bash \
 glib2 \
 glibc \
 libselinux \
"

URI_umockdev-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/umockdev-devel-0.18.3-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_umockdev-devel}"
RDEPENDS:umockdev-devel = " \
 umockdev \
 glib2-devel \
 pkgconf-pkg-config \
"
