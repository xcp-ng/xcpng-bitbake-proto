
inherit dnf-bridge

PN = "dlm"
PE = "0"
PV = "4.3.0"
PR = "1.el10"
PACKAGES = "dlm dlm-devel dlm-lib"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/dlm-4.3.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dlm = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dlm-4.3.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dlm}"
RDEPENDS:dlm = " \
 libuuid \
 systemd \
 systemd-libs \
 corosynclib \
 bash \
 glibc \
 dlm-lib \
"

URI_dlm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dlm-devel-4.3.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dlm-devel}"
RDEPENDS:dlm-devel = " \
 pkgconf-pkg-config \
 dlm-lib \
"

URI_dlm-lib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dlm-lib-4.3.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dlm-lib}"
RDEPENDS:dlm-lib = " \
 glibc \
"
