
inherit dnf-bridge

PN = "ndctl"
PE = "0"
PV = "80"
PR = "3.el10"
PACKAGES = "cxl-libs daxctl-libs ndctl ndctl-libs cxl-cli daxctl daxctl-devel ndctl-devel cxl-devel"


URI_cxl-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cxl-libs-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cxl-libs = " \
 libuuid \
 systemd-libs \
 kmod-libs \
 daxctl-libs \
 glibc \
"

URI_daxctl-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/daxctl-libs-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:daxctl-libs = " \
 glibc \
 libuuid \
 kmod-libs \
"

URI_ndctl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ndctl-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ndctl = " \
 libuuid \
 keyutils-libs \
 json-c \
 cxl-libs \
 bash \
 daxctl-libs \
 iniparser \
 ndctl-libs \
 glibc \
"

URI_ndctl-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ndctl-libs-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ndctl-libs = " \
 libuuid \
 systemd-libs \
 kmod-libs \
 daxctl-libs \
 glibc \
"

URI_cxl-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cxl-cli-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cxl-cli = " \
 libuuid \
 json-c \
 cxl-libs \
 daxctl-libs \
 glibc \
 libtraceevent \
 libtracefs \
"

URI_daxctl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/daxctl-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:daxctl = " \
 libuuid \
 json-c \
 daxctl-libs \
 ndctl-libs \
 iniparser \
 glibc \
"

URI_daxctl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/daxctl-devel-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:daxctl-devel = " \
 daxctl-libs \
 pkgconf-pkg-config \
"

URI_ndctl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ndctl-devel-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ndctl-devel = " \
 pkgconf-pkg-config \
 ndctl-libs \
"

URI_cxl-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cxl-devel-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cxl-devel = " \
 pkgconf-pkg-config \
 cxl-libs \
"
