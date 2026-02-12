
inherit dnf-bridge

PN = "accel-config"
PE = "0"
PV = "4.1.8"
PR = "2.el10"
PACKAGES = "accel-config accel-config-libs accel-config-devel accel-config-test"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/accel-config-4.1.8-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_accel-config = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/accel-config-4.1.8-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_accel-config}"
RDEPENDS:accel-config = " \
 glibc \
 json-c \
 accel-config-libs \
"

URI_accel-config-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/accel-config-libs-4.1.8-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_accel-config-libs}"
RDEPENDS:accel-config-libs = " \
 glibc \
 libuuid \
 accel-config \
"

URI_accel-config-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/accel-config-devel-4.1.8-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_accel-config-devel}"
RDEPENDS:accel-config-devel = " \
 accel-config-libs \
 pkgconf-pkg-config \
"

URI_accel-config-test = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/accel-config-test-4.1.8-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_accel-config-test}"
RDEPENDS:accel-config-test = " \
 zlib-ng-compat \
 openssl-libs \
 accel-config-libs \
 bash \
 glibc \
"
