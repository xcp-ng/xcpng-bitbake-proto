
inherit dnf-bridge

PN = "opensc"
PE = "0"
PV = "0.26.1"
PR = "1.el10"
PACKAGES = "opensc opensc-libs"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/opensc-0.26.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_opensc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opensc-0.26.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_opensc}"
RDEPENDS:opensc = " \
 opensc-libs \
 zlib-ng-compat \
 openssl-libs \
 readline \
 pcsc-lite \
 glibc \
"

URI_opensc-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opensc-libs-0.26.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_opensc-libs}"
RDEPENDS:opensc-libs = " \
 glibc \
 pcsc-lite-libs \
 openssl-libs \
 zlib-ng-compat \
"
