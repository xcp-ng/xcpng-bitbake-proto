
inherit dnf-bridge

PN = "openssl"
PE = "1"
PV = "3.2.2"
PR = "16.el10_0.4.alma.1"
PACKAGES = "openssl openssl-libs openssl-devel openssl-perl"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/openssl-3.2.2-16.el10_0.4.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_openssl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openssl-3.2.2-16.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openssl}"
RDEPENDS:openssl = " \
 glibc \
 coreutils \
 openssl-libs \
 bash \
"

URI_openssl-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openssl-libs-3.2.2-16.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openssl-libs}"
RDEPENDS:openssl-libs = " \
 glibc \
 crypto-policies \
 zlib-ng-compat \
 ca-certificates \
"

URI_openssl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openssl-devel-3.2.2-16.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openssl-devel}"
RDEPENDS:openssl-devel = " \
 openssl-devel \
 openssl-libs \
 pkgconf-pkg-config \
"

URI_openssl-perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openssl-perl-3.2.2-16.el10_0.4.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openssl-perl}"
RDEPENDS:openssl-perl = " \
 openssl \
 perl-interpreter \
"
