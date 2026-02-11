
inherit dnf-bridge

PN = "opensc"
PE = "0"
PV = "0.26.1"
PR = "1.el10"
PACKAGES = "opensc opensc-libs"


URI_opensc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opensc-0.26.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensc = " \
 opensc-libs \
 zlib-ng-compat \
 openssl-libs \
 readline \
 pcsc-lite \
 glibc \
"

URI_opensc-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opensc-libs-0.26.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensc-libs = " \
 glibc \
 pcsc-lite-libs \
 openssl-libs \
 zlib-ng-compat \
"
